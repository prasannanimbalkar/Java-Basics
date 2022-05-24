public class Car {

	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;

	
	//overriding default toString Method
	public String toString() {

		return make + "\n" + model + "\n" + color + "\n" + year;

	}
}