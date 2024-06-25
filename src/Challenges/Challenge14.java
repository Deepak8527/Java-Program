package Challenges;
import java.util.Scanner;
public class Challenge14 {
    
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Convert farenheit to celsius");
		System.out.print("Enter the farenheit is: ");
		float F = input.nextFloat();
		float C  = (F - 32) * 5/9;
		System.out.println("celsius is: " + C);

	}
}
