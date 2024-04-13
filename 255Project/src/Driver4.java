import java.util.Random;
import java.util.Scanner;

public class Driver4 {
    public static void main(String args[ ])
    {
        //player enter names, create new players
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter Guardian Name: ");
        Guardian guardian = new Guardian(scanner.nextLine(), true, 0, 100, 200, 0, false); 
        
        System.out.print("Enter Berserker Name: ");
        Berserker berserker = new Berserker(scanner.nextLine(), true, 0, 100, 100, 0, false);
        
        System.out.print("Enter healer Name: ");
        Healer healer = new Healer(scanner.nextLine(), true, 0, 100, 100, 0, false);
        
        System.out.print("Enter Mage Name: ");
        Mage mage = new Mage(scanner.nextLine(), true, 0, 100, 100, 0, false);
        
        //create boss
        Boss boss = new Boss("Boss", true, 500, 1);
        
        //inits
        Boolean play = true;
        Boolean stun = false;
        int Stuns = 0;
        int healedPlayers = 0;
        int shieldedPlayers = 0;
        
        while (play){ //while playing game is true
        for (int day = 1; day <=3; day++){ //for each day
            switch(day){ //boss' health increase each day
                case 1:
                    break;
                case 2:
                   boss.setHealth(boss.getHealth() + 100);
                   break;
                case 3:
                   boss.setHealth(boss.getHealth() + 100);
                   break;
            }
            for(int moves = 0; moves <=2; moves++ ){ //for each move [NOTE!!!!!!] I believe we should implement a while loop along the lines of while boss health > 0, instead of having a maximum number of moves since it may take more than two moves and players will win as soon as the boss dies instead of potentially a turn after
                Random rand = new Random();
                int min = 1;
                int max = 4;
                int randomNumber = rand.nextInt(max - min) + min;
               
                System.out.println("\nDAY" + day); //print day num + who is being played
                if(randomNumber == 1){
                    System.out.println("Guardian is Being Played");
                }
                if(randomNumber == 2){
                    System.out.println("Berserker is Being Played");
                }
                if(randomNumber == 3){
                    System.out.println("Healer is Being Played");
                }
                if(randomNumber == 4){
                    System.out.println("Mage is Being Played");
                }
              
                //choose action
                System.out.println("Choose Player Action");
                System.out.println("1. Do Damage");
                System.out.println("2. Special Ability");
                System.out.println("3. Eat Food");
                System.out.println("4. Quit Game");
               
                System.out.print("Action Number: ");
                Scanner scan = new Scanner(System.in);
                String askPlayer = scan.nextLine();
               
                switch (Integer.parseInt(askPlayer)) {
                    case 1: //do damage
                        switch (randomNumber) {
                            case 1:
                               boss.setHealth(boss.getHealth() - 50);
                               guardian.setDamage(guardian.getDamage()+50);
                               break;
                            case 2:
                               boss.setHealth(boss.getHealth() - 50);
                               berserker.setDamage(berserker.getDamage()+50);
                               break;
                            case 3:
                               boss.setHealth(boss.getHealth() - 20);
                               healer.setDamage(healer.getDamage()+20);
                               break;
                            case 4:
                               boss.setHealth(boss.getHealth() - 30);
                               mage.setDamage(mage.getDamage()+30);
                               break;
                            default:
                               break;
                        }
                    case 2: //special ability
                        switch (randomNumber) {
                            case 1: //guardian
                                if (guardian.getMana()==100){
                                System.out.println("Choose player to shield for 1 turn: ");
                                switch (Integer.parseInt(askPlayer)){
                                    case 1:
                                       guardian.setShielded(true);
                                       System.out.println("Guardian is Shielded!");
                                       break;
                                    case 2:
                                       berserker.setShielded(true);
                                       System.out.println("Berserker is Shielded!");
                                       break;
                                    case 3:
                                       healer.setShielded(true);
                                       System.out.println("Healer is Shielded!");
                                       break;
                                    case 4:
                                       mage.setShielded(true);
                                       System.out.println("Mage is Shielded!");
                                       break;
                                    default:
                                       System.out.println("Invalid Player Selection!");  
                                       break;
                                    }
                                shieldedPlayers++;
                                guardian.setMana(0);
                                }
                                else {
                                    System.out.println("Not enough mana!");
                                }
                                break;
                            case 2: //Beserker
                                if (berserker.getMana()==100){
                                boss.setHealth(boss.getHealth() - 100);
                                berserker.setDamage(berserker.getDamage()+100);
                                berserker.setMana(0);
                                }
                                else {
                                    System.out.println("Not enough mana!");
                                }
                                break;
                            case 3: //Healer
                                if (healer.getMana()==100){
                                    System.out.println("Choose player to heal: ");
                                    switch (Integer.parseInt(askPlayer)){
                                        case 1:
                                            guardian.setHealth(guardian.getHealth()+15);
                                            break;
                                    case 2:
                                        berserker.setHealth(berserker.getHealth()+15);
                                        break;
                                    case 3:
                                        healer.setHealth(healer.getHealth()+15);
                                        break;
                                    case 4:
                                        mage.setHealth(mage.getHealth()+15);
                                        break;
                                    default:
                                        System.out.println("Invalid Player Selection!"); 
                                        break;
                                }
                                healedPlayers++;
                                healer.setMana(0);
                                }
                                else {
                                    System.out.println("Not enough mana!");
                                }
                                break;
                            case 4: //Mage
                                if (mage.getMana()==100){
                                    stun = true;
                                    Stuns++;
                                    System.out.println("Boss is stunned for 1 turn!");
                                    mage.setMana(0);
                                }
                                else {
                                    System.out.println("Not enough mana!");
                                }
                                break;
                            default:
                                break;
                    
                        }
                        break;
                    case 3: //eat food
                        switch (randomNumber) {
                            case 1:
                                guardian.setHealth(guardian.getHealth()+10);
                                break;
                            case 2:
                                berserker.setHealth(berserker.getHealth()+10);
                                break;
                            case 3:
                                healer.setHealth(healer.getHealth()+10);
                                break;
                            case 4:
                                mage.setHealth(mage.getHealth()+10);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4: //quit game
                        System. exit(0);
                        break;
                    default:
                        System.out.println("Invalid Action! Game will show end of Day 1 statistics and begin again.");
                        day = 1;
                        moves = 0;
                        break;
                } //end of moves
                if(boss.getHealth() <= 0){
                    System.out.println("You win!");
                    day = 1;
                }
               
            }
       //end of day stats
        System.out.println("\nEnd of Day " + day + " Statistics:");
        System.out.println("Guardian Stats");
        System.out.println("Name: " + guardian.getName());
        System.out.println("Health: " + guardian.getHealth());
        System.out.println("Damage Dealt: " + guardian.getDamage());
        System.out.println("Players Shielded: " + shieldedPlayers);
 
        System.out.println("\nBerserker Stats");
        System.out.println("Name: " + berserker.getName());
        System.out.println("Health: " + berserker.getHealth());
        System.out.println("Damage Dealt: " + berserker.getDamage());
 
        System.out.println("\nHealer Stats");
        System.out.println("Name: " + healer.getName());
        System.out.println("Health: " + healer.getHealth());
        System.out.println("Damage Dealt: " + healer.getDamage());
        System.out.println("Players Healed: " + healedPlayers);
 
        System.out.println("\nMage Stats");
        System.out.println("Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Damage Dealt: " + mage.getDamage());
        System.out.println("Stuns: " + Stuns);     
        }
       
    }
    }
}
