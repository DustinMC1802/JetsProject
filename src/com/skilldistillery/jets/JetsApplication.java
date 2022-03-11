package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		
		JetsApplication jetsApp = new JetsApplication();
		
		Scanner sc = new Scanner(System.in);
		int userImput = 9;
		
		do {
			jetsApp.printMenu();
			
			userImput = sc.nextInt();
			
			jetsApp.toggleMenu(userImput);
		} while (userImput != 9);

		sc.close();
	}

	private void toggleMenu(int userImput) {
		
//		Try Catch
//		try {
//			int userSelection = Integer.parseInt(userImput);;
//		}
//		catch (Exception e){
//			System.out.println("Please press 1 through 9");;
//		}
			// Print the model, speed, range, and price of each jet.
			if (userImput == 1) {
//				System.out.println(List<jets>);
			
			// Call the fly() method on the entire fleet of jets.
			} else if (userImput == 2) {
			
			// The view fastest jet and longest range options both print out all of the information about a jet.
			// Note: these methods must search the collection of jets to find the appropriate jet.
			// View fastest jet	
			} else if (userImput == 3) {
			
			// View longest range	
			} else if (userImput == 4) {
			
			// The user is presented with an option specific to the interfaces you created. 
			// For example, Load all Cargo Jets, above, finds all implementors of the CargoCarrier interface and calls loadCargo() on each. 
			// (Note that the menu text is italicized because your options may be different, depending on your interfaces.)	
			// Load all cargo jets	
			} else if (userImput == 5) {
			
			// Dogfight	
			} else if (userImput == 6) {
			
			// Add a jet	
			} else if (userImput == 7) {
			
			// Remove a jet	
			} else if (userImput == 8) {
			
			// Quit	
			} else {
				System.out.println("Goodbye");
			}
			
	}

	private void printMenu() {
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
