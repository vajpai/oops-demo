package com.demo;

/**
 * 
 * 1. Polymorphism -- perform a single action in different ways
 * 2. compile-time polymorphism(overloading) and runtime polymorphism(Overriding)
 * 3. Perform polymorphism in java by method overloading and method overriding
 * 4. Cannot reduce the visibility of the inherited method from Calculation
   5. private, default , protected, public
   6. Cannot override the final method from Calculations
 * 
 * 
 * @author Vajpai
 * 
 * 
 * interfaces, abstaction
 * 
 * String, StringBuffer, string builder
 * 
 * Exception Handling
 * 
 * Thread
 * 
 * Collections  --->
 * 
 * 
 * Servlets, JSP  
 * 
 * Spring concepts
 * 
 * 
 *
 */





public class PolyTest {

	public static void main(String[] args) {
		
		Calculations percentageCalculation = new PercentageCalculation();//upcast
		PercentageCalculation per = (PercentageCalculation)percentageCalculation;
		per.calculatgePercentage();//downcast
		
		
		percentageCalculation.add(10, 20);
		
		//Calculations calculations = new Calculations();
		//calculations.add(10, 20);
		System.out.println("Addtion="+percentageCalculation.add(10, 20));
		

	}

}
