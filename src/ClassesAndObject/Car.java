package ClassesAndObject;

public class Car {

	int noOfwheels;
	String colour;
	float speedOfCar;
	float currentFuelInLiter;
	float getCurrentfuelInLiter;
	int noOfseat;
    public void drive()
    {
    	if(currentFuelInLiter == 0) {
    		System.out.println("Car is out of fuel");
    	}
    	else if(currentFuelInLiter < 5) {
    		System.out.println("Please car is drive but reserve mode you warn");
    		currentFuelInLiter--;
    	}
    	else {
    	System.out.println("Car is driving");
    	currentFuelInLiter--;
    	}
    }
    public void addCurrentfuel(float fuel)
    {
      currentFuelInLiter +=	 fuel;
    }
    public float getCurrentfuelInLiter() {
    	return currentFuelInLiter;
    }
}