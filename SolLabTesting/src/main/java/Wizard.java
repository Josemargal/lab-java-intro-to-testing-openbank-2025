public class Wizard extends Player {
    private String spell;
    private SpellLibrary spellLibrary;

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public Wizard(int health, int strength, int lives, String spell, SpellLibrary spellLibrary) {
        this(health, strength, lives, spell);
        this.spellLibrary = spellLibrary;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public void setSpellLibrary(SpellLibrary spellLibrary) {
        this.spellLibrary = spellLibrary;
    }

    /**
     * Converts this Wizard to an Elf, maintaining the wizard's properties.
     *
     * @return a new Elf instance
     */
    public Elf convertToElf() {
        Elf elf = new Elf(this.getHealth(), this.getStrength(), this.getLives(), 8);
        return elf;
    }

    /**
     * Casts a random spell from the spell library.
     *
     * @return a string representing the spell being cast
     */
    public String castRandomSpell() {
        if (spellLibrary == null) {
            throw new IllegalStateException("SpellLibrary not set");
        }
        return "Casting " + spellLibrary.getRandomSpell();
    }
}
