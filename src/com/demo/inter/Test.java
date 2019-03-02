package com.demo.inter;

public class Test {

	public static void main(String[] args) {
		//The {@code String} class represents character strings.
		String str = "welcome" + "" + " ";
		str = "Welcom";
		String str1 ="welcome"; 
		String str2 = new String("welcome");
		
		if(str == str2){
			
		}


		//Compares this string to the specified object.
		if(str.equals(str1)){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("-----Uppercase--" + str.toUpperCase());
		
		String name = "Durga Soft,Hyderabad,ammetpet";
		String[] split = name.split(",");
		for (int i = 0; i < split.length; i++) {
			
			//System.out.println(split[i]);
		}
		
		
		
	}

}
