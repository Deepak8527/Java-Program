package UserInput;

import java.util.Scanner;

public class Welcom {
  
     public static void main(String[]args) {
    	 
    	 System.out.print("Enter your name: ");
    	 Scanner input = new Scanner(System.in);
    	 String name = input.nextLine();
         System.out.println("Welcome "+ name + " to College.");	 
     }
}
