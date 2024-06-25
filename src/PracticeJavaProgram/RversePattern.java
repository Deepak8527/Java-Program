package PracticeJavaProgram;

public class RversePattern {

	public static void main(String[]args) {
		// outr loop 
		for(int i = 0; i < 10; i++) {
			// inner loop
			for(int j = 10; j > i; j-- ) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
