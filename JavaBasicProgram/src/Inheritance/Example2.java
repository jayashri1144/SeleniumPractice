package Inheritance;
class testing10{
	//Default constructor
	void callingFromVoda() {
		System.out.println("Vodaphone network busy..");
	}
}

class testing20 extends testing10{
	//default constructor with default super()
	void callingFromAirtel() {
		System.out.println("Airtel network busy");
	}
}

class testing30 extends testing20{
	//default constructor with default super()
	void callingFromAny() {
		System.out.println("try everything");
	}
}

public class Example2 extends testing30 {
	//default constructor with default super()
	void calling() {
		System.out.println("I am calling....");
	}
	
	
	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.calling();
		testing1 t1=new testing1();
		t1.callingFromVoda();
		testing2 t2=new testing2();
		t2.callingFromAirtel();
		testing3 t3=new testing3();
		t3.callingFromAny();
	}
}
