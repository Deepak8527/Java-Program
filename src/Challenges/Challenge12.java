package Challenges;
import java.util.Scanner;
public class Challenge12 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate simple interest\n");
		System.out.print("Enter the no. of principle amount Rs: ");
		int P = input.nextInt();
		System.out.print("Enter the amount of  Months/years: ");
		float T = input.nextFloat();
		System.out.print("Enter the rate of interst: ");
		float R = input.nextFloat();
		
		float SI = (P * R *T)/100;
		System.out.println("Simple intrest is: " + SI);
		float totalAmount = P + SI;
		System.out.println("Total amount is: " + totalAmount);
	}
}


