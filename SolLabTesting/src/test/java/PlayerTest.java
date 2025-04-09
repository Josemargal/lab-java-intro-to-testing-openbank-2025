import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlayerTest {

    @Test
    public void testDecrement_WithPositiveLives() {
        // Arrange
        TestPlayer player = new TestPlayer(100, 50, 3);

        // Act
        player.setHealth(20); // Reduce health
        player.decrementLive();

        // Assert
        assertEquals(2, player.getLives());
        assertEquals(100, player.getHealth()); // Health should be restored
    }

    @Test
    public void testDecrement_WithZeroLives() {
        // Arrange
        TestPlayer player = new TestPlayer(100, 50, 1);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        player.decrementLive();

        // Assert
        assertEquals(0, player.getLives());
        assertTrue(outContent.toString().contains("Este personaje está muerto"));

        // Restore system output
        System.setOut(System.out);
    }

    @Test
    public void testAttack() {
        // Arrange
        TestPlayer attacker = new TestPlayer(100, 30, 3);
        TestPlayer defender = new TestPlayer(80, 20, 2);

        // Act
        attacker.attack(defender);

        // Assert
        assertEquals(50, defender.getHealth()); // 80 - 30 = 50
    }

    @Test
    public void testAttack_ReducingHealthToZero() {
        // Arrange
        TestPlayer attacker = new TestPlayer(100, 80, 3);
        TestPlayer defender = new TestPlayer(80, 20, 2);

        // Act
        attacker.attack(defender);

        // Assert
        assertEquals(1, defender.getLives()); // A life should be lost
        assertEquals(80, defender.getHealth()); // Health should be restored to initial value
    }

    @Test
    public void testCheckHealth_WithPositiveHealth() {
        // Arrange
        TestPlayer player = new TestPlayer(100, 50, 3);

        // Act
        player.checkHealth();

        // Assert
        assertEquals(3, player.getLives()); // Lives should not change
    }

    @Test
    public void testCheckHealth_WithZeroHealth() {
        // Arrange
        TestPlayer player = new TestPlayer(100, 50, 3);
        player.setHealth(0);

        // Act
        player.checkHealth();

        // Assert
        assertEquals(2, player.getLives()); // Lives should decrease
        assertEquals(100, player.getHealth()); // Health should be restored
    }

    // Concrete implementation of Player for testing
    private static class TestPlayer extends Player {
        public TestPlayer(int health, int strength, int lives) {
            super(health, strength, lives);
        }
    }
}
