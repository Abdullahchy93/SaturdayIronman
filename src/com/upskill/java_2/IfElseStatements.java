package com.upskill.java_2;

public class IfElseStatements {

	public static void main(String[] args) {
		int age = 60;
		
		if(age <= 0){
			System.out.println("Input valid age");
		}
		else if(age <= 4){
			System.out.println("You are a baby");
		}
		
		else if(age <= 13){
			System.out.println("You are a child");
		} 
		
		/*make a nested if else here*/
		else if(age >= 25 && age == 35){
		
		if(age <= 17){
		System.out.println("You are a teenager");
		}
		
		else {
		System.out.println("You are an adult");
		}
		
		}
		
		else if(age == 65 && age <= 75){
			System.out.println("You are a senior");
		} 
		
		else if(age == 90 || age >= 95 && age != 80){
			System.out.println("You are a Hero");
		} 
		
		else {
			System.out.println("You are a legend");
		}
			

	

	}

}
