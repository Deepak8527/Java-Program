package Challenges;
import java.util.Scanner;
public class Challenge18 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcom to leep year calculation");
		System.out.print("Enter the year is: ");
		int year = input.nextInt();
		
		if(year % 4 == 0 ) {
			System.out.println("this year is leep year");
		}
		else if(year % 100 != 0) {
			System.out.println("this is not leep year");
		}
	    else {
		System.out.println("happy new year");
	}
	}
}
