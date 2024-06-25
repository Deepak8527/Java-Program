package Challenges;
import java.util.Scanner;

public class Challenges7 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to swapping\n \n");
		System.out.println("Enter number A: ");
		int a = input.nextInt();
		System.out.println("Enter number B: ");
		int b = input.nextInt();
		
		int c =a;
		a=b;
		b=c;
		
		System.out.println("Swapping is done....");
		System.out.println("Value of A is :"+ a);
		System.out.println("Value of B is :"+ b);
		
		
	}

}
