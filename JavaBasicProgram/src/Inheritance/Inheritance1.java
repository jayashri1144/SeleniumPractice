package Inheritance;
//parent class/ super class /base class
class fruit{
	fruit(){
		System.out.println("Fruit class cons...");
	}
	public void taste() {
		System.out.println("Fruit are sweet...");
	}
}
//child class/ sub class of fruit
class apple extends fruit {
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		
		apple a1=new apple();
		a1.taste();  //call method of parent class
		a1.shape();  //call method of child class
	}

}
/*
 * super: is a keyword or instance of super class
 * 			use to refer super class non-static members
 * 			mainly used when subclass and super class having common non-static members
 */ 