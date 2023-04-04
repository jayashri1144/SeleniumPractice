package Inheritance;
class testing1{
	void callingFromVoda() {
		System.out.println("Vodaphone network busy..");
	}
}

class testing2{
	void callingFromAirtel() {
		System.out.println("Airtel network busy");
	}
}

class testing3{
	void callingFromAny() {
		System.out.println("try everything");
	}
}
public class Example1 {
	void calling() {
		System.out.println("I am calling....");
	}
	
	
	public static void main(String[] args) {
		Example1 obj=new Example1();
		obj.calling();
		testing1 t1=new testing1();
		t1.callingFromVoda();
		testing2 t2=new testing2();
		t2.callingFromAirtel();
		testing3 t3=new testing3();
		t3.callingFromAny();

	}

}
