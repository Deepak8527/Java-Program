package PracticeJavaProgram;

public class RightHalfPyramid {

	public static void main(String[]args) {
		//outer loop
		for(int i = 1; i < 5; i++) {
			// inner loop for space print 
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
