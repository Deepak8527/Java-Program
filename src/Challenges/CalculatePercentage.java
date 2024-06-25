package Challenges;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[]args) {
		// calculate a percentage of five subject
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total subject: ");
		int a  = input.nextInt();
		int b  = input.nextInt();
		int c  = input.nextInt();
		int d  = input.nextInt();
		int e  = input.nextInt();
		
		double tomarks = (a + b + c + d + e);
		double percentage = tomarks * 100 / 500;
		System.out.println("Total marks of subject is: " + tomarks);
		System.out.println("Calaculation of percentage: " + percentage );
		
	}
}
