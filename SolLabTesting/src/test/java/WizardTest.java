import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WizardTest {

    @Test
    public void testWizardProperties() {
        // Arrange & Act
        Wizard wizard = new Wizard(80, 25, 2, "Fireball");

        // Assert
        assertEquals(80, wizard.getHealth());
        assertEquals(25, wizard.getStrength());
        assertEquals(2, wizard.getLives());
        assertEquals("Fireball", wizard.getSpell());
    }

    @Test
    public void testConvertToElf() {
        // Arrange
        Wizard wizard = new Wizard(80, 25, 2, "Fireball");

        // Act
        Elf elf = wizard.convertToElf();

        // Assert
        assertEquals(80, elf.getHealth());
        assertEquals(25, elf.getStrength());
        assertEquals(2, elf.getLives());
        assertEquals(8, elf.getSpeed()); // Default speed for converted wizards
    }

    @Test
    public void testCastRandomSpell() {
        // Arrange
        SpellLibrary mockSpellLibrary = mock(SpellLibrary.class);
        when(mockSpellLibrary.getRandomSpell()).thenReturn("Fireball");

        Wizard wizard = new Wizard(80, 25, 2, "Lightning", mockSpellLibrary);

        // Act
        String result = wizard.castRandomSpell();

        // Assert
        assertEquals("Casting Fireball", result);
        verify(mockSpellLibrary, times(1)).getRandomSpell(); // Verify the method was called exactly once
    }

    @Test
    public void testCastRandomSpell_WithoutSpellLibrary() {
        // Arrange
        Wizard wizard = new Wizard(80, 25, 2, "Lightning");

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> {
            wizard.castRandomSpell();
        });
    }
}
