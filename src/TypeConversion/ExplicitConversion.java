package TypeConversion;

public class ExplicitConversion {

	public static void main(String[]args) {
		
		// Explicit conversion is narrowing type and also is type casting like Example
		
        // this is a type casting which is int value is small but right hand side value is float so we float are store in int type
		int myint = (int)45f;
		System.out.println(myint);
		float myFloat = (float)345L;
		System.out.println(myFloat);
		
	}
}
