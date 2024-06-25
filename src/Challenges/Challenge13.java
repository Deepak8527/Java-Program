package Challenges;
import java.util.Scanner;
public class Challenge13 {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate compound interest");
		System.out.print("Enter the no. of principle amount Rs: ");
		int P = input.nextInt();
		System.out.print("Enter the amount of  Months/years: ");
		float T = input.nextFloat();
		System.out.print("Enter the rate of interest: ");
		float R = input.nextFloat();
		double CompInt = Math.pow(T, R)*P*(1 + R/100);
		System.out.println("Compound intrest is: " + CompInt );
	}
}
