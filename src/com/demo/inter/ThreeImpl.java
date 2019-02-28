package com.demo.inter;

public abstract class ThreeImpl extends TwoImpl{
	// For constructor, only public, protected & private are permitted
	
	public int count = 30;
	public final static int max_value = 40;
	 public ThreeImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void four() {
		System.out.println("-----four()-----------");
		
	}
	
	//public abstract void sub();
	 void sub(){
		
	}
	public void add(){
		
	}

}
