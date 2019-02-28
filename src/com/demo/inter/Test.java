package com.demo.inter;

public class Test {

	public static void main(String[] args) {
		FourImpl four = new FourImpl();
		four.four();
		ServiceImpl serviceImpl = new ServiceImpl();
		serviceImpl.two();
	}

}
