package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userImput = 9;
		
		do {
			printMenu();
			
			userImput = sc.nextInt();
			
			toggleMenu(userImput);
		} while (userImput != 9);

	}

	public static void toggleMenu(int userImput) {
		
//		Try Catch
//		try {
//			int userSelection = Integer.parseInt(userImput);;
//		}
//		catch (Exception e){
//			System.out.println("Please press 1 through 9");;
//		}
			if (userImput == 1) {
				
			} else if (userImput == 2) {
				
			} else if (userImput == 3) {
				
			} else if (userImput == 4) {
				
			} else if (userImput == 5) {
				
			} else if (userImput == 6) {
				
			} else if (userImput == 7) {
				
			} else if (userImput == 8) {
				
			} else {
				System.out.println("Goodbye");
			}
			
	}

	public static void printMenu() {
		System.out.println("Choose an Option");
		System.out.println("");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all jet");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to the fleet");
		System.out.println("8. Remove a jet from the fleet");
		System.out.println("9. Quit");
		
		
	}

}
