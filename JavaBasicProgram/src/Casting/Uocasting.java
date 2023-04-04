package Casting;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class Uocasting extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uocasting up=new Uocasting();
		
		Mumbai m1=new Uocasting();//auto/implicit upcasting
		Mumbai m2=up;//auto/implicit upcasting
		Pune p1=new Uocasting();//auto/implicit upcasting
		Pune p2=up;//auto/implicit upcasting
		
		Mumbai m3=(Mumbai)new Uocasting();//explicit upcasting
		Mumbai m4=(Mumbai)up;//explicit upcasting
		Pune p3=(Pune) new Uocasting();//explicit upcasting
		Pune p4=(Pune)up;//explicit upcasting
		
		Pune p5=new Mumbai();//implicit upcasting
		Pune p6=(Pune)new Mumbai();//explicit upcasting
	}
}
