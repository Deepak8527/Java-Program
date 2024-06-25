package Challenges;
import java.util.Scanner;
public class Challenge15 {
    
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("To check whether the positive , negative and zero");
		System.out.print("Enter the number is: ");
		int num = input.nextInt();
		if(num>0) {
			System.out.println("this value is positive");
		}
	    else if(num == 0) {
			
	    	System.out.println("print the value is Zero ");
		}
	    else {
	    	System.out.println("otherwise print number is Negative");
	    }
	}
}
