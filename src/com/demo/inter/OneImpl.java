package com.demo.inter;

/**
 * Abstract class Cannot be instantiate
 * @author Vajpai
 *
 */
public abstract class OneImpl implements InterfaceOne {

	@Override
	public void one() {
		System.out.println("-------one()----------");
	}
}
