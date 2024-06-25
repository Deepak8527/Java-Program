package UserInput;
import java.util.Scanner;
public class Myself {

	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me about your self");
		String name = input.nextLine();
		System.out.println("about your Schooling education");
		String education = input.nextLine();
		System.out.println("And your age");
		int age = input.nextInt();
		System.out.println("where are you address");
		String address = input.next();
	
		
	}
}
