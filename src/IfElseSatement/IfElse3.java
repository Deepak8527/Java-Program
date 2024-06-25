package IfElseSatement;
import java.util.Scanner;
public class IfElse3 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to Driving license portal");
		System.out.print("Enter the age: ");
		int age = input.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to drive ");
		}
		else if(age<18) {
			
			System.out.println("you are not eligible to drive");
		}
	    else {
	    	
	    	System.out.println("You are a child now drive bycycle");	    	
	}
	}
}

