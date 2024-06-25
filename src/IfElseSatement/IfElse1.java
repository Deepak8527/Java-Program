package IfElseSatement;

public class IfElse1 {

	public static void main(String[]args) {
		
	
	boolean isadoctors = false;
	boolean isaingineer = true;
	String name = "Vishal";
	
	if(isadoctors) {
		System.out.println("You are a doctors " + name);
	}
	else if(isaingineer) {
		System.out.println("You are a Ingineer " + name );
	}
	else {
	    System.out.println("nothing");
	}
}
}
