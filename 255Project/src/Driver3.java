/**
 *
 * @author shrutiatitkar
 */
package javaapplication14;

import java.util.Random;
import java.util.Scanner;

public class Driver3 {

    // prints stats at each end of day
    public static void printEndOfDayStats(Guardian guardian, Berserker berserker, Healer healer, Mage mage, Boss boss, int shieldedPlayers, int healedPlayers, int stuns) {
        System.out.println("\nEnd of Day Statistics:");

        // Guardian stats
        System.out.println("\nGuardian Stats");
        System.out.println("Name: " + guardian.getName());
        System.out.println("Health: " + guardian.getHealth());
        System.out.println("Damage Dealt: " + guardian.getDamage());
        System.out.println("Players Shielded: " + shieldedPlayers);

        // Berserker stats
        System.out.println("\nBerserker Stats");
        System.out.println("Name: " + berserker.getName());
        System.out.println("Health: " + berserker.getHealth());
        System.out.println("Damage Dealt: " + berserker.getDamage());

        // Healer stats
        System.out.println("\nHealer Stats");
        System.out.println("Name: " + healer.getName());
        System.out.println("Health: " + healer.getHealth());
        System.out.println("Damage Dealt: " + healer.getDamage());
        System.out.println("Players Healed: " + healedPlayers);

        // Mage stats
        System.out.println("\nMage Stats");
        System.out.println("Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Damage Dealt: " + mage.getDamage());
        System.out.println("Stuns: " + stuns);

        // Boss stats
        System.out.println("\nBoss Stats");
        System.out.println("Name: " + boss.getName());
        System.out.println("Health: " + boss.getHealth());
    }

    public static void main(String args[]) {
        // Makes player objects; sets important variables defined in subclasses
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Guardian Name: ");
        Guardian guardian = new Guardian(scanner.nextLine(), true, 0, 100, 200, 0, false);

        System.out.print("Enter Berserker Name: ");
        Berserker berserker = new Berserker(scanner.nextLine(), true, 0, 100, 100, 0, false);

        System.out.print("Enter Healer Name: ");
        Healer healer = new Healer(scanner.nextLine(), true, 0, 100, 100, 0, false);

        System.out.print("Enter Mage Name: ");
        Mage mage = new Mage(scanner.nextLine(), true, 0, 100, 100, 0, false);

        // Create boss
        Boss boss = new Boss("Boss", true, 500, 100);

        // Initialize variables
        Boolean play = true;
        Boolean stun = false;
        int stuns = 0;
        int healedPlayers = 0;
        int shieldedPlayers = 0;

        int day = 1; // Start from day 1

        while (day <= 3) { // Continue until day reaches 3
            switch (day) { // Boss' health increase each day
                case 1:
                    break;
                case 2:
                    boss.setHealth(boss.getHealth() + 100);
                    break;
                case 3:
                    boss.setHealth(boss.getHealth() + 100);
                    break;
            }
            for (int moves = 0; moves <= 2; moves++) { // For each move
                Random rand = new Random();
                int min = 1;
                int max = 4;
                int randomNumber = rand.nextInt(max - min) + min;

                System.out.println("\nDAY " + day); // Print day num + who is being played
                switch (randomNumber) {
                    case 1:
                        System.out.println("Guardian is Being Played");
                        break;
                    case 2:
                        System.out.println("Berserker is Being Played");
                        break;
                    case 3:
                        System.out.println("Healer is Being Played");
                        break;
                    case 4:
                        System.out.println("Mage is Being Played");
                        break;
                }

                // Choose action - switch case refers to each action
                System.out.println("Choose Player Action");
                System.out.println("1. Do Damage");
                System.out.println("2. Special Ability");
                System.out.println("3. Eat Food");
                System.out.println("4. Quit Game");

                System.out.print("Action Number: ");
                Scanner scan = new Scanner(System.in);
                String askPlayer = scan.nextLine();

                switch (Integer.parseInt(askPlayer)) {
                    case 1: // Do damage
                        int damageAmount = 0;
                        switch (randomNumber) {
                            case 1:
                                damageAmount = 50;
                                guardian.setDamage(guardian.getDamage() + damageAmount);
                                break;
                            case 2:
                                damageAmount = 50;
                                berserker.setDamage(berserker.getDamage() + damageAmount);
                                break;
                            case 3:
                                damageAmount = 20;
                                healer.setDamage(healer.getDamage() + damageAmount);
                                break;
                            case 4:
                                damageAmount = 30;
                                mage.setDamage(mage.getDamage() + damageAmount);
                                break;
                        }
                        boss.setHealth(boss.getHealth() - damageAmount);
                        break;
                    case 2: // Special ability
                        switch (randomNumber) {
                            case 1: // Guardian
                                if (guardian.getMana() == 100) {
                                    System.out.println("Choose player to shield for 1 turn: ");
                                    int playerChoice = Integer.parseInt(scan.nextLine());
                                    switch (playerChoice) {
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
                                } else {
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
                            case 3: // Healer
                                if (healer.getMana() == 100) {
                                    System.out.println("Choose player to heal: ");
                                    System.out.println("1. Guardian");
                                    System.out.println("2. Berserker");
                                    System.out.println("3. Healer");
                                    System.out.println("4. Mage");
                                    System.out.print("Player Number: ");
                                    Scanner healPlayer = new Scanner(System.in);
                                    int playerNumber = Integer.parseInt(healPlayer.nextLine());

                                    switch (playerNumber) {
                                        case 1:
                                            guardian.setHealth(guardian.getHealth() + 15);
                                            break;
                                        case 2:
                                            berserker.setHealth(berserker.getHealth() + 15);
                                            break;
                                        case 3:
                                            healer.setHealth(healer.getHealth() + 15);
                                            break;
                                        case 4:
                                            mage.setHealth(mage.getHealth() + 15);
                                            break;
                                        default:
                                            System.out.println("Invalid Player Selection!");
                                            break;
                                    }
                                    healedPlayers++;
                                    healer.setMana(0);
                                } else {
                                    System.out.println("Not enough mana!");
                                }
                                break;
                            case 4: //Mage
                                if (mage.getMana()==100){
                                    stun = true;
                                    stuns++;
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
                    case 3: // Eat food
                        int foodAmount = 10;
                        switch (randomNumber) {
                            case 1:
                                guardian.setHealth(guardian.getHealth() + foodAmount);
                                break;
                            case 2:
                                berserker.setHealth(berserker.getHealth() + foodAmount);
                                break;
                            case 3:
                                healer.setHealth(healer.getHealth() + foodAmount);
                                break;
                            case 4:
                                mage.setHealth(mage.getHealth() + foodAmount);
                                break;
                        }
                        break;
                    case 4: // Quit game
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Action! Game will show end of Day 1 statistics and begin again.");
                        day = 1;
                        moves = 0;
                        break;
                } // End of switch
            } // End of moves
            printEndOfDayStats(guardian, berserker, healer, mage, boss, shieldedPlayers, healedPlayers, stuns);
            day++; // Move to the next day
        } // End of while loop
            System.out.println("You Win!");
        }
       
    }
