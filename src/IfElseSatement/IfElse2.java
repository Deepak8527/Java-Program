package IfElseSatement;
import java.util.Scanner;
public class IfElse2 {
 
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Welcome to voter id portal for eligible of your age");
		System.out.print("Enter the age: ");
		int age = input.nextInt();
		// these are uses in Relational Operators
		if(age>18) {
			System.out.println("You are eligible to vote");		
		}
		else {
		   System.out.println("You are not eligible to vote");
		}
	}
}
