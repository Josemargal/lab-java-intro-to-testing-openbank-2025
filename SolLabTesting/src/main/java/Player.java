public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private final int initialHealth;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.initialHealth = health;
    }

    // Getters and setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    /**
     * Decrements the player's lives by 1 and restores health to its original value.
     * If lives <= 0, prints "Este personaje está muerto".
     */
    public void decrementLive() {
        lives--;
        if (lives <= 0) {
            System.out.println("Este personaje está muerto");
        } else {
            health = initialHealth;
        }
    }

    /**
     * Attacks another player, reducing their health by this player's strength.
     *
     * @param playerToAttack the player to attack
     */
    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
        playerToAttack.checkHealth();
    }

    /**
     * Checks if the player's health is <= 0, and decrements their lives if so.
     */
    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}
