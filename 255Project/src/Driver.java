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
        
        Player testplayer = new Player(scanner.nextLine(), true, 0, 100, 100); 
        

    }
}
