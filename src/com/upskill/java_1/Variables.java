package com.upskill.java_1;

public class Variables {
	// Variables in Java
	
	//Instance or Global variable: variables declared in the class level
	public String country = "USA";
	
	//static variable: variables belong to class and do not require creating object
	public static String region = "North America";

	public static void main(String[] args) {
		Variables obj = new Variables();
		System.out.println(obj.country);
		System.out.println(region);
		
		//Local variable: variables declared in method
		String city = "New York";
		String police = "NYPD";
		System.out.println(city);
		System.out.println(police);
		nj("essex");
		pa("Bensal");	
	}	
	public static void nj(String county){
		String city = "Bloomfield";
		String police = "BPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
	}
	
	public static void pa(String county){
		String city = "Phill";
		String police = "PPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
	}
	

}
