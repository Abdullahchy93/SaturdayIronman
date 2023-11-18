package com.upskill.java_4;

public class Constructor {
    String petName;
    String petType;
    boolean petLikey;
    int petAge;

    // Constructor with parameters
    public Constructor(String name, String type, boolean Q, int age) {
        petName = name;
        petType = type;
        petLikey = Q;
        petAge = age;
    }

    // Constructor with a single parameter
    public Constructor(String type) {
        petType = type;
    }

    // Constructor with a single parameter
    public Constructor(boolean Q) {
        petLikey = Q;
    }

    // Constructor with a single parameter
    public Constructor(int age) {
        petAge = age;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Obi", "cat", true, 5);
        System.out.print("My pet name is: " + obj.petName + ". My pet is a: " + obj.petType + ". I like my pet: " + obj.petLikey + ". My cat is " + obj.petAge + " years old");

        Constructor obj2 = new Constructor("Momo");
        System.out.print("My pet is a: " + obj2.petType);

        Constructor obj3 = new Constructor("bird");
        System.out.print("My pet is a: " + obj3.petType);

        Constructor obj4 = new Constructor(true);
        System.out.print("I like my pet: " + obj4.petLikey);

        Constructor obj5 = new Constructor(3);
        System.out.print("My cat is " + obj5.petAge + " years old");
    }
}
