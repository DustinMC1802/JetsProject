package com.skilldistillery.jets;

public class Bomber extends Jet implements Fighter, Cargo{

	@Override
	public void shootMoveCommunicate() {
		System.out.println("Standing by for sortie");
		
	}

	@Override
	public void loadCargo() {
		System.out.println("All munitions are prepped and loaded");
		
	}

}
