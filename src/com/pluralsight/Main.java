package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class Main {

/*
https://programmingbydoing.com/

Three card monte - Assignment #47
 */

    public static void main(String[] args) {
	// write your code here

        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        int x = 1 + r.nextInt(3);

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash." +
                " He glances at you out of the corner of his eye and starts shuffling. " +
                "He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println("      ##  ##  ##");
        System.out.println("      ##  ##  ##");
        System.out.println("      1   2   3 ");

        int userChoice = keyboard.nextInt();

        if (userChoice == x) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling");
        }
        else{
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + x);
        }

        if (x == 1){
            System.out.println("      AA  ##  ##");
            System.out.println("      AA  ##  ##");
            System.out.println("      1   2   3 ");
        }
        else if (x ==2) {
            System.out.println("      ##  AA  ##");
            System.out.println("      ##  AA  ##");
            System.out.println("      1   2   3 ");
        }
        else {
            System.out.println("      ##  ##  AA");
            System.out.println("      ##  ##  AA");
            System.out.println("      1   2   3 ");
        }
    }
}
