/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Player {
    private String name;
    private boolean isAlive;
    private int daysSurvived;
    private int health;
    private int mana;
    private int damage;
    private boolean isShielded;
    
    public Player(String name, boolean isAlive, int daysSurvived, int health, int mana, int damage, boolean isShielded) {
        this.name = name;
        this.isAlive = isAlive;
        this.daysSurvived = daysSurvived;
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.isShielded = isShielded;
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
    
    public boolean isShielded() {
        return isShielded;
    }

    public void setShielded(boolean isShielded) {
        this.isShielded = isShielded;
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
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    // Methods
    public void doDamage() {
        health -= 0; 
    }

    public void eatFood() {
        health += 20;
    }

    public void runAway() {
        health -= 5;
    }
}
