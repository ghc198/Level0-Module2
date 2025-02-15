//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)

		switch (randomNumber) {
			case 0:
				System.out.println("You look great today!");
				break;
			case 1:
				System.out.println("Nice shirt!");
				break;
			case 2:
				System.out.println("You're the best!");
				break;
			case 3:
				System.out.println("You are very kind!");
				break;
			case 4:
				System.out.println("You are very smart!");
				break;
		}
	}
}
