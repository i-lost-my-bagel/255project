/**
 *
 * @author shrutiatitkar
 */
import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String args[ ])
    {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter Guardian Name: ");
        Guardian guardian = new Guardian(scanner.nextLine(), true, 0, 100, 200, 50); 
        
        System.out.print("Enter Berserker Name: ");
        Berserker berserker = new Berserker(scanner.nextLine(), true, 0, 100, 100, 50);
        
        System.out.print("Enter healer Name: ");
        Healer healer = new Healer(scanner.nextLine(), true, 0, 100, 100, 20);
        
    
        Boss boss = new Boss("Boss", true, 100, 100);
        
        
        System.out.println(" ");
        System.out.println("Guardian Stats");
        System.out.println("Name: " + guardian.getName());
        System.out.println("Health: " + guardian.getHealth());
        System.out.println("Damage Strength: " + guardian.getDoDamage());
        System.out.println("Mana: " + guardian.getMana());

        System.out.println("\nBerserker Stats");
        System.out.println("Name: " + berserker.getName());
        System.out.println("Health: " + berserker.getHealth());
        System.out.println("Damage Strength: " + berserker.getDoDamage());
        System.out.println("Mana: " + berserker.getMana());

        System.out.println("\nHealer Stats");
        System.out.println("Name: " + healer.getName());
        System.out.println("Health: " + healer.getHealth());
        System.out.println("Damage Strength: " + healer.getDoDamage());
        System.out.println("Mana: " + healer.getMana());

        System.out.println("\nBoss Stats");
        System.out.println(boss.getName());
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Mana: " + boss.getMana());
        
        Boolean play = true;
        while (play){
        for (int day = 1; day <=3; day++){
            for(int moves = 0; moves <=2; moves++ ){
               Random rand = new Random();
               int min = 1;
               int max = 4;
               int randomNumber = rand.nextInt(max - min) + min;
               
               System.out.println("\nDAY" + day);
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
              
               
               System.out.println("Choose Player Action");
               System.out.println("1. Do Damage");
               System.out.println("2. Eat Food");
               System.out.println("3. Run Away");
               System.out.println("4. Quit Game");
               
               System.out.print("Action Number: ");
               Scanner scan = new Scanner(System.in);
               String askPlayer = scan.nextLine();
               
               switch(Integer.parseInt(askPlayer)){
                   case 1:
                       if(randomNumber == 1){
                           boss.setHealth(boss.getHealth() - 50);
                           break;
                       }
                       else if(randomNumber == 2){
                           boss.setHealth(boss.getHealth() - 50);
                           break;
    
                       }
                       else if(randomNumber == 3){
                           boss.setHealth(boss.getHealth() - 20);
                           break;
                       }
                   case 2:
                       if(randomNumber == 1){                     
                           guardian.setHealth(guardian.getHealth()+10);
                           break;
                       }
                       
                       else if(randomNumber == 2){
                              berserker.setHealth(berserker.getHealth()+10);
                           break;
                       }
                       else if(randomNumber == 3){
                              healer.setHealth(healer.getHealth()+10);
                           break;
    
                       }
                    case 3:
                       if(randomNumber == 1){                     
                           guardian.setHealth(guardian.getHealth()-10);
                           break;
                       }
                       
                       else if(randomNumber == 2){
                              berserker.setHealth(berserker.getHealth()-10);
                           break;
                       }
                       else if(randomNumber == 3){
                              healer.setHealth(healer.getHealth()-10);
                           break;
                       }
                    case 4:
                        System. exit(0);
                        
                   default:
                       System.out.println("Invalid Action! Game will show end of Day 1 statistics and begin again.");
                       day = 1;
                       moves = 0;
                       break;
                       
               }
               if(boss.getHealth() < 0){
                   System.out.println("You win!");
                   day = 1;
               }
               
              
               System.out.println("\nEnd of Day " + day + " Statistics:");
               System.out.println("Guardian Stats");
               System.out.println("Name: " + guardian.getName());
               System.out.println("Health: " + guardian.getHealth());
               System.out.println("Damage Strength: " + guardian.getDoDamage());
               System.out.println("Mana:" + guardian.getMana());

               System.out.println("\nBerserker Stats");
               System.out.println("Name: " + berserker.getName());
               System.out.println("Health: " + berserker.getHealth());
               System.out.println("Damage Strength: " + berserker.getDoDamage());
               System.out.println("Mana: " + berserker.getMana());

               System.out.println("\nHealer Stats");
               System.out.println("Name: " + healer.getName());
               System.out.println("Health: " + healer.getHealth());
               System.out.println("Damage Strength: " + healer.getDoDamage());
               System.out.println("Mana: " + healer.getMana());

               System.out.println("\nBoss Stats");
               System.out.println("Health: " + boss.getHealth());
               System.out.println("Mana: " + boss.getMana());
            
              

              
               }
               
               
             
        }
       
    }
    }
}
