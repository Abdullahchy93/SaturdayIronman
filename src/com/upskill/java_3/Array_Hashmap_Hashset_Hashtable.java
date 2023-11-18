package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		
		int age = 30;											//regular initialize variable
		int[] ageIronMan = new int[]{19, 21, 23, 24, 25, 26, 27, 29, 32, 35 ,40};
		//Array Index                [0] [1] [2] [3] [4] [5] [6] [7] [8] [9] [10]
		
		System.out.println("You are : " + ageIronMan[0]);
		System.out.println("Total Students : " + ageIronMan.length);
		
		String code;
		String[] armySecretCode = new String[]{"Alpha", "Bravo", "Charlie", "Delta"};
		System.out.println("Go for : " + armySecretCode[0]);
		System.out.println("Target : " + armySecretCode.length);
		
		
		String name;
		String[][] nestedIronMan = {{"Abdullah", "Fayez", "Sayed", "Rasel", "Christian"}, // [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
			                       {"Madan", "Fahim", "Sayful", "Hossain", "Luis", "Sumaiya"}}; // [1][0] [1][1] [1][2] [1][3] [1][4] [1][5]                       
		System.out.println("You are : " + nestedIronMan[0][1]);
		System.out.println("Total Students : " + nestedIronMan.length);

// HashMap store multiple data using key value pair, Implementation of Map Interface
		HashMap<String, Integer> cricketScore = new HashMap <String, Integer>();
			
			cricketScore.put("Australia", 129);
			cricketScore.put("England", 124);
			cricketScore.put("Bangaladesh", 100);
			cricketScore.put("WestIndies", 120);
			cricketScore.put("Pakistan", 130);
			
			System.out.println("My favourite team,s toatal score : " + cricketScore.get("Australia"));			
			
	HashMap<String, String> favPetNmae = new HashMap <String, String>();
			
	        favPetNmae.put("Cat", "Fluffy");
	        favPetNmae.put("Parrot", "Moe");
	        favPetNmae.put("Wolf", "Crimson");
	        favPetNmae.put("Crow", "Night");
	        favPetNmae.put("Dragon", "Toothless");
			
			System.out.println("My fabourite pet name : " + favPetNmae.get("Dragon"));
			
			
//HashSet unordered collection contain unique value, Implementation of set interface
	HashSet<String> FavMovie = new HashSet <String>();
			
	        FavMovie.add("How to Train Your Dragon");
	        FavMovie.add("John Wick");
	        FavMovie.add("ForestGump");
	        FavMovie.add("Infinity War");
	        FavMovie.add("Deadpool");
			
			System.out.println("My fabourite movie : " + FavMovie);
			
// Hashtable store multiple data using key value pair, 
// No duplicates, also is synchronized (only one thread can be modified)
Hashtable<Integer, String> CarSpeed = new Hashtable <Integer, String>();
			
			CarSpeed.put(300, "Lambo");
			CarSpeed.put(400, "Tesla");
			CarSpeed.put(150, "Mercedes");
			CarSpeed.put(210, "BMW");
			CarSpeed.put(250, "Bugathi");
			
			System.out.println("My fabourite speedstar car : " + CarSpeed.get(400));
			
		
	}

}
