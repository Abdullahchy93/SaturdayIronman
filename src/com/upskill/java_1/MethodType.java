package com.upskill.java_1;

public class MethodType {
     /* Types of Method 
	 1.Void Method 
	 2.Static Method
	 3.Return Method
	 */
	public static int hourlyIncome = 64000;

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.myAnnualIncome();
		System.out.println("I feel :-} " + obj.howAmI());
		System.out.println("My mounthlincome is: " + obj.myMounthlyIncome());
		myWeeklyIncome();
		myDailyIncome();
		mySecondIncome();
		

	}
	//void method
	public void myAnnualIncome(){
		int calculateAnnualIncome = hourlyIncome * 200/2;
		System.out.println("My annual income is: " + calculateAnnualIncome);
	}
	//return type method
	public int myMounthlyIncome(){
		int calculateMounthlyIncome = hourlyIncome * 80-50000;
		return calculateMounthlyIncome;
		
	}
	public String howAmI(){
		String satisfactionIncome = "Cool";
		return satisfactionIncome;
		
	}
	//static method
	public static void myWeeklyIncome(){
	int calculateWeeklyIncome = hourlyIncome * 10;
	System.out.println("My weekly income is: " + calculateWeeklyIncome);
	}
		
	public static void myDailyIncome(){
		float calculatedailyIncome = (float) (hourlyIncome * 0.5);
		System.out.println("My daily income is: " + calculatedailyIncome);
		}
	
	public static void mySecondIncome(){
		float calculateSecondIncome = (float) (hourlyIncome * 000.005);
		System.out.println("My second income is: " + calculateSecondIncome);
		}
	
}
