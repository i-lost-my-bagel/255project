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
    public static void main(String args[ ])
    {
	Random rand = new Random();
	int min = 1;
        int max = 4;
	int randomNumber = rand.nextInt(max - min) + min;
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter name: ");
        
        Guardian testplayer = new Guardian(scanner.nextLine(), true, 0, 100, 200); 
        
        System.out.println("Name: " + testplayer.getName());
        System.out.println("Health: " + testplayer.getHealth());
        System.out.println("Mana: " + testplayer.getMana());

    }
}
