package Inheritance;

class Grandfather{
	Grandfather(){
		System.out.println("I am grandfather constructor");
	}
	void myHome(){
		System.out.println("I am home of Grandfather");
	}
}

class Father extends Grandfather{
	Father(double d){
		System.out.println("I am father constructor");
	}
	void myCar() {
		System.out.println("I am car of father");
	}
}

class Child1 extends Father{
	Child1(int i){
		super(20.1);
		System.out.println("I am child1 constructor");
	}
	void myBike() {
		System.out.println("I am bike of child");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		Child1 c2=new Child1(21);
		c2.myHome();
		c2.myCar();
		c2.myBike();
		System.out.println("_____________________________________");
		Father f=new Father(23.43);
		f.myHome();
		f.myCar();
		System.out.println("_____________________________________");
		Grandfather g=c2;
		g.myHome();
		System.out.println("_____________________________________");
		Grandfather g1=new Father(23.98);
		g1.myHome();

	}

}
