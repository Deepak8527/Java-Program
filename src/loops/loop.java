package loops;

import java.util.Scanner;

public class loop {
 
	public static void main(String[]args) {
//		int num = 1;// initialization 
//		while(num <= 10) { // condition 
//			System.out.println(num);
//			num = num + 1; //the same write as a num += 1 // updating 
//		}
		//now lets start reverse counting
//		int count = 100;
//		while(count >=90) {
//			System.out.println(count);
//			count = count - 1;
//		}
		Scanner input = new Scanner(System.in);
		int i = 0;
		while(i<5) {
			int number = input.nextInt();
			System.out.println("The number is: " + number);
			i = i+1;// same write as i++;
		}
	}
	
}
