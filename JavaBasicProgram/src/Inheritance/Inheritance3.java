package Inheritance;
//parent class
class vehicle{
	public void wheels() {
		System.out.println("I'm wheels");
	}
}
//car first sub class/child class of vehicle class- super class/base class/parent class
class ca2r extends vehicle{
	public void carVehicle() {
		System.out.println("i'm the car & vehicle");
	}
}

//car1 second sub class/child class of vehicle class super class/base class/parent class
class car1 extends vehicle{
	public void car1Vehicle() {
		System.out.println("I'm the car1 & vehicle");
	}
}

// scooter third sub class of vehicle class super class/base class
class scooter extends vehicle
{
	public void scooterVehicle() {
		System.out.println("I'm the scooter & vehicle class");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		
		ca2r c=new ca2r();
		c.carVehicle();
		c.wheels();
		
		car1 c1=new car1();
		c1.car1Vehicle();
		c1.wheels();
		
		scooter s=new scooter();
		s.scooterVehicle();
		s.wheels();
	}
}
