package ClassesAndObject;

public class Driver {

	public static void main(String []args)
	{
		Car myCar = new Car();
	    myCar.addCurrentfuel(6);
		myCar.drive();
		System.out.println(myCar.currentFuelInLiter);
	}
}
