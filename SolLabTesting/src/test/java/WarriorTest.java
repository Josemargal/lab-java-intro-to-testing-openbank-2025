import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    public void testWarriorProperties() {
        // Arrange & Act
        Warrior warrior = new Warrior(120, 40, 3, 25);

        // Assert
        assertEquals(120, warrior.getHealth());
        assertEquals(40, warrior.getStrength());
        assertEquals(3, warrior.getLives());
        assertEquals(25, warrior.getForce());
    }

    @Test
    public void testConvertToElf() {
        // Arrange
        Warrior warrior = new Warrior(120, 40, 3, 25);

        // Act
        Elf elf = warrior.convertToElf();

        // Assert
        assertEquals(120, elf.getHealth());
        assertEquals(40, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(10, elf.getSpeed()); // Default speed for converted warriors
    }
}