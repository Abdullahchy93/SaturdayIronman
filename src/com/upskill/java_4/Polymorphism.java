package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
/* polymorphism is the ability of an object to take on many forms.
 * Method overloading(Compile time/static binding polymorphism) Same method with different signature to overload
 * Method overriding(Runtime polymorphism/Dynamic binding) Same method name from parent class to override
 */	


public static void main(String[] args){
	Polymorphism obj = new Polymorphism();
	obj.myAnnualIncome();
	car();
	//car("red");
	car(true);
	//car(5);
	obj.car("Lighting MaQueen", "red");
	int price = 1240000;
    int fxcost = 2400;
    int gear = 5;
    System.out.println("How much was it, I don't remember, maybe it was $" + obj.car(price));
    System.out.println("The fix cost was $" + fxcost);
    System.out.println("MY lambo can go up to gear " + gear);
}
    public void myAnnualIncome(){
    int calculateAnnualIncome = hourlyIncome * 200/2;
    int stipend = 40000;
    int gift = 4000;
    int bonus = 10000;
    int promIncome = 11000;
    int totalIncome = calculateAnnualIncome + stipend + gift + bonus + promIncome;
    System.out.println("My yearly income is: $" + totalIncome);
    
}
	public static void car(){
	System.out.println("I bought a lambo");
}
/*	public static void car(String color){
	System.out.println("It is a Red Lambo " + color);
}*/
	public static void car(boolean cool){
	System.out.println("Damn! my Lambo is really cool :)" + cool);
}
/*	public static void car(int gear){
	System.out.println("MY lambo can go up to gear " + gear);
}*/

	public void car(String name, String color){
	System.out.println("I think I will call it " + name + ". It is a Red Lambo " + color);
}

	public int car(int price){
    return price;
}

}
