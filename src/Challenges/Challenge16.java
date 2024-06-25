package Challenges;
import java.util.Scanner;
public class Challenge16 {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Write whether to check number even or odd");
		System.out.print("Enter the number is: ");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("your number is even");
		}
		else {
			System.out.println("your number is odd");
		}
	}
}
