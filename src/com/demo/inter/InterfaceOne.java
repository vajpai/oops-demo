package com.demo.inter;
/**
 * 
 * 
 * 
 * @author Vajpai
 *
 */
public interface InterfaceOne {
	
	/* $ javap InterfaceOne
	Warning: Binary file InterfaceOne contains com.demo.inter.InterfaceOne
	Compiled from "InterfaceOne.java"
	public interface com.demo.inter.InterfaceOne {
	  public abstract void one(); 
	  public abstract void two();
	  public abstract void three();
	  public abstract void four();
	} */
	
	//static void five();// implemented static method are allowed
	// interface support only public instance methods.
	
	int MAX_MARKS = 100; // public static final int maxValue;
	
	static void five() {
		
	}
	default void six(){
		
	}
	void one();
	
	void two();
	
	void three();
	
	void four();

}
