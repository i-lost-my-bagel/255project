// Player Class
Public Player (String name, Boolean isAlive, int daysSurvived, int Health, int Mana)
{
//instances
private String name;
Private boolean isAlive;
Private int daysSurvived = 0;
Private int health = 200;
Private int mana = 100;
}

//getters and setters - Names will be the names of the classes
Public String getName(){
	Return name;
}
Public void setName(String name){
	this.name = name;
}

Public boolean isAlive(){
Return this.active;
}

Public void set isAlive(Boolean isAlive){
this.isAlive = isAlive;
}

public int doDamage(){
	health = health - 50;
}
}

public int eatFood(){
	health = health + 20;
}
public int drinkWater(){
	health = health + 10;
}


Public int runAway(){
	health = health - 5;

}

}

-------------------------------------------
Public class Berserker extends Player{
Public Berserker(String name, Boolean isAlive, int daysSurvived, int mana){
		super(name, isAlive, daysSurvived, mana);
	}
	Public double getHealth()
	{
		Return super.getHealth() + 50;
	}

}

