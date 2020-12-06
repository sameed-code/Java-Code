package project6;

import java.util.Scanner;

class Student{

	/*This Method get the input from the 
	user and then get 20% of that grade.*/
	public int labAvg() {
		System.out.println("\nPlease Enter Your Lab Scores! ");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Your First Lab Score: ");
		double num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter Your Second Lab Score: ");
		double num2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter Your Third Lab Score: ");
		double num3 = scan3.nextInt();	
		
		//Storing all three "lab" score and getting the 20% of that in "result" variable.
		double result = (((num1 + num2 + num3)/3)*0.2);
		
		System.out.println("\n20% of the scores you enterd! ");
		
		//Formatting to get the 2 numbers only after the decimal.
		System.out.println(String.format("%,.2f", result));
		
		if (result > 15) {
			System.out.println("Woww! you are doing well in class! ");
			
		}
		
		else {
			System.out.println("Not Bad, but you better start study to maintain a good grades! ");
		}
		
		return 0;
	}
	
	/*This Method get the input from the user and then 
	get 20% of that grade.*/
	public int quizAvg() {
		System.out.println("\nPlease Enter your Quizz Scores! ");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Your First Quiz Score: ");
		double num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter Your First Quiz Score: ");
		double num2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter Your First Quiz Score: ");
		double num3 = scan3.nextInt();
		
		//Storing all three "quizzes" score and getting the 20% of that in "result" variable.
		double result = (((num1 + num2 + num3)/3)*0.2);
		
		System.out.println("\n20% of the scores you enterd! ");
		
		//Formatting to get the 2 numbers only after the decimal.
		System.out.println(String.format("%,.2f", result));
		
		if (result > 15) {
			System.out.println("Woww! you are doing well in class! ");
			
		}
		
		else {
			System.out.println("Not Bad, but you better start study to maintain a good grades! ");
		}
		return 0;
	}
	
	/*This Method get the input from the user and 
	then get 60% of that grade.*/
	public int examAvg() {
		System.out.println("\nPlease Enter Your Exams Scores! ");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your First exam score: ");
		int num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter your Second exam score: ");
		int num2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter your Third exam score: ");
		int num3 = scan3.nextInt();
		
		
		//Storing all three "exams" score and getting the 20% of that in "result" variable.
		double result = ((num1 + num2 + num3) / 3)*0.6;
				
		System.out.println("\n60% of the scores you enterd! ");
		
		//Formatting to get the 2 numbers only after the decimal.
		System.out.println(String.format("%,.2f", result));
		
		if (result > 50) {
			System.out.println("Woww! you are doing well in class! ");
			
		}
		
		else {
			System.out.println("Not Bad, but you better start study to maintain a good grades! ");
		}
		
		return 0;
		
	}
		
	
	
	public static void main(String[] args) {
	
		//Using "Scanner" class to get the input from a user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a student name: ");
		String name = scan.nextLine();
		System.out.println("\nStudent Name: " + name.toUpperCase());

		//Creating an object for "student" class.
		Student myObj = new Student();
		double result = myObj.labAvg();	
		myObj.quizAvg();	//Calling method with the help of created object
		myObj.examAvg();	//Calling method with the help of created object

				
		System.out.println("End of the Program, Thanks for Using "
				+ "Our Website! ");
	}
	
}
