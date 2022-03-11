package com.skilldistillery.jets;

public class PassengerJet extends Jet implements Cargo{

	@Override
	public void loadCargo() {
		System.out.println("The passengers are seated and secured.");
		
	}

}
