package com.demo;

public class PercentageCalculation extends Calculations {
	
	public PercentageCalculation() {
		System.out.println("----PercentageCalculation()-------");
	}

	@Override
	//Cannot reduce the visibility of the inherited method from Calculation
	// private, default , protected, public
	//Cannot override the final method from Calculations
	public int add(int i, int j) {
		System.out.println("--sub--add()---");
		return 10 + i + j;
	}
	
	public void calculatgePercentage(){
		
	}
}
