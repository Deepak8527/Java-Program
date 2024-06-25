package Challenges;
import java.util.Scanner;
public class Challenge20 {

	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("categorized person to diffrent age");
		System.out.print("Enter the age is: ");
		int age = input.nextInt();
		if(age <= 13) {
			System.out.println("You are child ");
		}
		else if(age <= 20) {
			System.out.println("You are a teen ");
		}
		else if(age <= 60) {
			System.out.println(" You are a adult ");
		}
		else {
			System.out.println("You are a senior");
		}
		}
}
