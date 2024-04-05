public class Player {
    // Member variables
    private String name;
    private boolean isAlive;
    private int daysSurvived;
    private int health;
    private int mana;

    // Constructor
    public Player(String name, boolean isAlive, int daysSurvived, int health, int mana) {
        this.name = name;
        this.isAlive = isAlive;
        this.daysSurvived = daysSurvived;
        this.health = 200;
        this.mana = 100;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getDaysSurvived() {
        return daysSurvived;
    }

    public void setDaysSurvived(int daysSurvived) {
        this.daysSurvived = daysSurvived;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    // Methods
    public void doDamage() {
        health -= 50;
    }

    public void eatFood() {
        health += 20;
    }

    public void drinkWater() {
        health += 10;
    }

    public void runAway() {
        health -= 5;
    }
}
