package UserInput;

import java.util.Scanner;

public class UserInput {
public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your name please:");
	String name = input.nextLine();
	System.out.println("Good morning " + name);
	System.out.print(name + ", Tell me your age:");
	int age = input.nextInt();
	System.out.println("Your age is: "+age);
}
}
