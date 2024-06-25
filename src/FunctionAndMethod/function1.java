package FunctionAndMethod;

public class function1 {

	public static void main(String[]args) {
		//firstpattern();
		secondpattern();
	}
//	public static void firstpattern() {
//		
//		int row = 0;
//		while(row < 20) {
//			System.out.print("*");
//			int i = 0;
//			while(i < row) {
//				System.out.print(" *");
//				i++;
//			}
//			System.out.println();
//			row++;
		
	
		public static void secondpattern() {
			int row1 = 0;
			while(row1 < 5) {
				System.out.print("*");
			int i = 0;
			while(row1 < i) {
				System.out.print("*");
				i--;
			}
			System.out.println();
				row1--;
					
			}
		}
}
