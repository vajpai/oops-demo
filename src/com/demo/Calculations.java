package com.demo;

public class Calculations {

	public Calculations() {
		System.out.println("-----Calculations()------");
	}

	int add(int i, int j) {
		System.out.println("--super--add()---");
		return i + j;
	}

	// Overloading
	public void save(String name, String password) {

	}

	public void save(String name, String password, String email) {

	}

	public int add(int i, int j, int z) {
		return i + j + z;
	}
}
