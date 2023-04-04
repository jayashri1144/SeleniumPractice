package Casting;

class JD{
	public void Printme1() {
		System.out.println("JD print method");
	}
	
	void disp() {
		System.out.println("jd disp method");
	}
}

class java extends JD{
	public void Printme2() {
		System.out.println("java print method");
	}
	void disp() {
		System.out.println("java disp method");
	}
}

class android extends java{
	public void Printme3() {
		System.out.println("android print method");
		
	}
	void disp() {
		System.out.println("android disp method");
	}
}
public class DerivedClass3 {

	public static void main(String[] args) {
		JD j1=new android();
		j1.Printme1();
		j1.disp();
		System.out.println("===================================================");
		
		java j2=(java)j1;
		j2.Printme2();
		j2.Printme1();
		j2.disp();
		System.out.println("===================================================");
		
		android j3=(android)j2;
		j3.Printme1();
		j3.Printme2();
		j3.Printme3();
		j3.disp();
	}
}
