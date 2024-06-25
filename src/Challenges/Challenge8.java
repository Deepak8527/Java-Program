package Challenges;

import java.util.Scanner;

public class Challenge8 {

     public static void main(String []args) {
    	 
    	 Scanner input = new Scanner(System.in);
    	 System.out.print("Enter first number: ");
    	 int firstNum = input.nextInt();
    	 System.out.print("Enter second number: ");
    	 int secondNum = input.nextInt();
    	 int a = firstNum + secondNum;
    	 int b = firstNum - secondNum;
    	 int c = firstNum * secondNum;
    	 int d = firstNum / secondNum;
    	 int e = firstNum % secondNum;
    	 System.out.print("Click Option 1: ");
    	 int add = input.nextInt();
    	 System.out.println("Additon is: " +a);
    	 System.out.print("Click Option 2: ");
    	 int sub = input.nextInt();
    	 System.out.println("Subtraction is: " +b);
    	 System.out.print("Click Option 3: ");
    	 int mul = input.nextInt();
    	 System.out.println("Multiplication is: " +c);
    	 System.out.print("Click Option 4: ");
    	 int div = input.nextInt();
    	 System.out.println("Division is: " +d);
    	 System.out.print("Click Option 5: ");
    	 int mod = input.nextInt();
    	 System.out.println("Modulus is: " +e);
     	 
     	 
     }
}
