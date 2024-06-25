package Challenges;
import java.util.Scanner;
public class Challenge11 {
    public static void main(String[]args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Area of triangle\n");
    	System.out.print("Enter the number of triangle of Base: ");
    	double Base = input.nextDouble();
        System.out.print("Enter the number of triangle of height: ");
        double Height = input.nextDouble();
        
        double area = 0.5 * Base * Height;
        System.out.println("Area of triangle is: " + area);
        
    }

}
