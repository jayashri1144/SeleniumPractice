package Polymorphism;

class Vehicle{
	void run() {
		System.out.println("method run() from vehicle");
	}
}

class Car extends Vehicle{
	void run() {
		System.out.println("method run() from car class");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car();
		c1.run();
		
		Vehicle v1=new Vehicle();
		v1.run();

	}

}
