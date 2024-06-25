package UserInput;

import java.util.Scanner;

public class Sum {
   
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to calculator" );
		System.out.print("Enter your first number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter your second number: ");
		int secondNum = input.nextInt();
		
		int sum = firstNum + secondNum;
		System.out.println("Sum of your numbers: " + sum);
		
		
	}
}
