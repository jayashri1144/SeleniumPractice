package Inheritance;

//parent class
class forewheeler
{
	public void wheel() {
		System.out.println("I'm wheels");
	}
}

class car extends forewheeler
{
	//super()
	public void type() {
		System.out.println("I am type method");
	}
}

class maruti extends car {
	//super()
	public void company() {
		System.out.println("I'm maruti");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		maruti m1=new maruti();  //object of child class
		m1.company();
		m1.type();
		m1.wheel();
	}
}
