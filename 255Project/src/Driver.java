/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lily
 */

import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void printStats(Guardian guardian, Berserker berserker, Mage mage)
    {
        System.out.println("Guardian Stats\n");
        System.out.println("Name: " + guardian.getName());
        System.out.println("Health: " + guardian.getHealth());
        System.out.println("Mana: " + guardian.getMana());
        
        System.out.println("Berserker Stats\n");
        System.out.println("Name: " + berserker.getName());
        System.out.println("Health: " + berserker.getHealth());
        System.out.println("Mana: " + berserker.getMana());
        
        System.out.println("Mage Stats\n");
        System.out.println("Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Mana: " + mage.getMana());
    }
    
    public static void main(String args[ ])
    {
	Random rand = new Random();
	int min = 1;
        int max = 4;
	int randomNumber = rand.nextInt(max - min) + min;
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter Guardian Name: ");
        Guardian guardian = new Guardian(scanner.nextLine(), true, 0, 100, 200); 
        
        System.out.print("Enter Berserker Name: ");
        Berserker berserker = new Berserker(scanner.nextLine(), true, 0, 100, 100); 
        
        System.out.print("Enter Mage Name: ");
        Mage mage = new Mage(scanner.nextLine(), true, 0, 100, 100); 
        
        printStats(guardian, berserker, mage);

    }
}
