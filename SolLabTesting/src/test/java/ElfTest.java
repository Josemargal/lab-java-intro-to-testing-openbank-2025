import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElfTest {

    @Test
    public void testElfProperties() {
        // Arrange & Act
        Elf elf = new Elf(90, 30, 2, 15);

        // Assert
        assertEquals(90, elf.getHealth());
        assertEquals(30, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(15, elf.getSpeed());
    }
}
