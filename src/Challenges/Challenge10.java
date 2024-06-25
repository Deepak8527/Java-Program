package Challenges;
import java.util.Scanner;
public class Challenge10 {
	 
	public static void  main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Perimeter of Rectangle\n");
		System.out.print("Enter the number of length: ");
		double length = input.nextDouble();
		System.out.print("Enter the number of width: ");
		double width = input.nextDouble();
		
		double perimeter = 2 * (length+width);
		System.out.println("Perimeter of rectangle is: " + perimeter);
		double area = length * width;
		System.out.println("Area of rectangle is: " + area );
	}

}
