package Challenges;
import java.util.Scanner;
public class Challenge19 {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate the grades based on marks");
		System.out.print("Enter the percentage of marks is: ");
		int percentage = input.nextInt();
		if(percentage >= 90) {
			System.out.println("Your percentage is excellent so grade is'A'");
		}
		else if(percentage >= 75) {
			System.out.println("Your percentage is very good so grade is'B'");
		}
		else if(percentage >= 60) {
			System.out.println("Your percentage is good so grade is'C'");
		}
		else if(percentage >= 30) {
			System.out.println("You need a hard work ");
		}
		else {
			System.out.println("you are fail");
		}
	}
}
