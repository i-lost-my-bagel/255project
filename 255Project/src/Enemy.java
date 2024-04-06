/**
 *
 * @author shrutiatitkar
 */
public class Enemy {
    private Boolean isAlive;
    private int health;
    private String name;
    private int mana;
    
    public Enemy(String name, Boolean isAlive, int health, int mana){
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
        this.mana = mana;
        
    }

    /**
     * @return the isAlive
     */
    public Boolean getIsAlive() {
        return isAlive;
    }

    /**
     * @param isAlive the isAlive to set
     */
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   
    
    public int getMana(){
        return mana;
    }
    
    
    public void setMana(int mana){
        this.mana = mana;
    }
   
     // Methods
    public void doDamage() {
        health -= 50;
    }

    
}
