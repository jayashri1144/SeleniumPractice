package Inheritance;
//super class/ parent class
class A1{
	//java compiler will write default constructor
	static int a=1;
	int b=12;
	float c=23.5f;
}
//subclass / child class, B1 inherits class A1 non-static members
class B1 extends A1{
	//java compiler will write default constructor with default super statement
	static int p=23;
	int q=34;
	double r=12.5;
}
//C1 inherits class B1 non-static members
class C1 extends B1{
	//java compiler will write default constructor with default super statement
	static int x=90;
	int y=8;
	double z=45.5;
}

public class Inheritance4 {

	public static void main(String[] args) {
	
		System.out.println("class A static variable:" +A.a);
		System.out.println("class B static variable:" +B.p);
		System.out.println("class C static variable:" +C.x);
		
		System.out.println("*******************************************");
		
		C1 c1=new C1();//it will have all the non-static members of class A1,B1 & C1--->b,c,y,z,q,r
		System.out.println("class C non-static variable:" +c1.b);
		System.out.println("class C non-static variable:" +c1.c);
		System.out.println("class C non-static variable:" +c1.q);
		System.out.println("class C non-static variable:" +c1.r);
		System.out.println("class C non-static variable:" +c1.y);
		System.out.println("class C non-static variable:" +c1.z);
						
		B1 b1=new B1();//it will have all the non-static members of class A1,B1--->b,c,y,z
		System.out.println("class B non-static variable:" +b1.b);
		System.out.println("class B non-static variable:" +b1.c);
		System.out.println("class B non-static variable:" +b1.q);
		System.out.println("class B non-static variable:" +b1.r);
		
	}
}

/**
 * Inheritance:
 * when a child class inherit the property of its parent class known as Inheritnace
 * representation: 
 * 					class childclassname extends parentclassname{
 * 						
 * 					}
 * Inheritance is achived by using super() statement
 * 			--> used to call parent/super class constructor based on parameter
 * 			--> super() should be the first statement inside the constructor body
 * Note: In inheritance only non-static members involves 
 * 		 super() and this() can't be written together
 */