package project8;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.*;

public class studentInformation {
	
	String name, Ethnicity;
	int age, idNumber;
	
	//Constructor
	studentInformation(String name, int idNumber, int age, String Ethnicity){
		this.name = name;
		this.idNumber = idNumber;
		this.age = age;
		this.Ethnicity = Ethnicity;		
	}
	
	//Method
	public String getName() {
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEthnicity() {
		return Ethnicity;
	}
	
	public String sam() {
		System.out.println("Details for the Student: ");
		return("\nName of the Student: " + getName() + "\nId number: " + getIdNumber() 
		+ "\nAge: " + getAge() +"\nEthnicity: " + getEthnicity());
		}
	
	public static void main(String[] args) {
		
		studentInformation myObj = new studentInformation("Sameed", 540, 26, "Asian");
		System.out.println(myObj.sam());

		
		
			
		
		}
	}
	