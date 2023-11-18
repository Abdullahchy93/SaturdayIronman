package com.upskill.java_4;

public class Encapsulation {
	// Encapsulation used to hide the data using the setter set(void method parameterize) and getter get(return type) methods
	
	private String brandName = "Toyoto";
	private float brandRate;
	private int ssn;
	private String name = "Ab";
	
	public void setbrandRating(float value){
		brandRate = value;	
		System.out.println("This car is a : " + brandRate);
	}
	
	public String getbrandName(){
		return brandName;
	
	}

	public void setssn(int value){
		ssn = value;	
		System.out.println("My ssn is : " + ssn);
	}
	
	public String getname(){
		return name;
	}
	
	public static void main(String[] args) {
	Encapsulation obj = new Encapsulation();
	obj.setbrandRating(7);
	System.out.println("My car brand name is: " + obj.getbrandName());
	obj.setssn(7869087);
	System.out.println("My name is: " + obj.getname());
}

}
