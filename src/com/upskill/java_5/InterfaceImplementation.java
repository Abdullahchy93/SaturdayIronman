package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iPetName() {
		System.out.println("My pet name is Toothless");
	}

	@Override
	public String iPetType() {
		System.out.println("My pet is a Dragon");
		return "Dragon";
	}

	@Override
	public int iPetAge() {
		System.out.println("Toothless is 12 year old");
		return 12;
	}

	@Override
	public float iPetCounts() {
		System.out.println("I have 2 pets");
		return 2.0f;
	}

	@Override
	public void iPetLevel() {
		System.out.println("Toothless overall level is 1000");
		
	}

	@Override
	public void iPerformTrick() {
		System.out.println("My pet can make fire ball and breayth blue flame");
		
	}



}
