package Inheritance;
class A{
	static int a=1;
	int b=12;
	float c=23.5f;
}

class B{
	static int p=23;
	int q=34;
	double r=12.5;
}

class C{
	static int x=90;
	int y=8;
	double z=45.5;
}

public class Inheritance {

	public static void main(String[] args) {
	
		System.out.println("class A static variable:" +A.a);
		System.out.println("class B static variable:" +B.p);
		System.out.println("class C static variable:" +C.x);
		
		A a1=new A();
		System.out.println("class A non-static variable:" +a1.b);
		System.out.println("class A non-static variable:" +a1.c);
		
		B b1=new B();
		System.out.println("class B non-static variable:" +b1.q);
		System.out.println("class B non-static variable:" +b1.r);
		
		C c1=new C();
		System.out.println("class C non-static variable:" +c1.y);
		System.out.println("class C non-static variable:" +c1.z);
		

	}

}
