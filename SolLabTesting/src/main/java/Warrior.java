public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Converts this Warrior to an Elf, maintaining the warrior's properties.
     *
     * @return a new Elf instance
     */
    public Elf convertToElf() {
        Elf elf = new Elf(this.getHealth(), this.getStrength(), this.getLives(), 10);
        return elf;
    }
}
