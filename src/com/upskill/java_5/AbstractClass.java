package com.upskill.java_5;

public abstract class AbstractClass {
	//Abstract class has both abstract method and regular method
	
	public abstract void iPetName();
	
	public abstract String iPetType();
	
	public abstract int iPetAge();
	
	public abstract float iPetCounts();
	
	public abstract void iPetLevel();
	
	public abstract void iPerformTrick();
	
	public void pet(){
		//String pet = "Toothless";
		System.out.println("What is your pet name? My pet name is Toothless");
	}
	public String pet2(){
		//String pet2 = "Momo";
		System.out.println("What is your pet name? My pet name is Momo");
		return pet2();
	}
	

}
