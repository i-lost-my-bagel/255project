public class Guardian extends Player
{
  public Guardian(String name, Boolean isAlive, int daysSurvived, int mana){
		super(name, isAlive, daysSurvived, mana);
	}
	public double getHealth()
	{
		return super.getHealth() + 100
	}
	
}
