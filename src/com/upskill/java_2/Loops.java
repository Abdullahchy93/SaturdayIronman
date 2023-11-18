package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		
		//forLoop();
		//whileLoop();
		//doWhileLoop();
		//infiniteLoop();
		//nestedLoop();
		practiceNestedLoop();
		
	}
		
		public static void forLoop(){                             //For Loop - do again and again unto upper limit                         
		float i;                                                  //initialize the variables
		for(i= 0; i<=10.1; i++){                                  //Setting lower limit, upper limit, Increment or Decrement
			System.out.println("For loop number is: " + i);       //Action do
		}
		
		};
		
		public static void whileLoop(){                           //while loop - do again and again upto upper condition filled
		int n = 0;                                                //initialize the variables - setting starting point of condition
		while(n <= 10){                                           //setting condition
			System.out.println("While loop number is: " + n);     //Action do
			n++;                                                  //Increment or Decrement
		}
		
		};
		public static void doWhileLoop(){                            //do while loop - Do action first and then match the condition
			int i = 2;                                               //initialize the variable - setting starting point of condition
			do{                                                      
				System.out.println("Do While loop number is: " + i); //Action do
				i++;                                                 //Increment or Decrement
				}while(i<=20);                                       //checking condition
			
			};	
		public static void infiniteLoop(){                            //infinite loop - loops that never ends
			int n = 1;                                                //initialize the variables
			while(true){
				System.out.println("Infinite loop number is: " + n);  //Action do
				n++;                                                  //Increment or Decrement
			}
			
			};
		public static void nestedLoop(){                                 //Nested loop - loop inside of another loop
			int i = 2;                                                   //initialize the variables = i
			int j = 1;                                                   //initialize the variables = j
			for(i=1; i<=10; i++){                                        // loops for i
				for(j=2; j<=10; j++){                                    // loops  for j
					int result = i * j;                                  // Action do 1
					System.out.println("For loop number is: " + result); //Action do i & j
				}
				
			}
			
			};
			
			public static void practiceNestedLoop(){                     //Nested loop - loop inside of another loop
				int i;                                                   //initialize the variables = i
				int j;                                                   //initialize the variables = j
				for(i=1; i<=10; i++){                                        // loops for i
					for(j=1; j<=10; j++){                                    // loops  for j
						int multipicationTable = i * j;                 // Action do 1
						System.out.print(multipicationTable + " ");  
					}
					System.out.println(" :|[; ");                             ////Action do 2
				}
				
				};
	
	
	}


