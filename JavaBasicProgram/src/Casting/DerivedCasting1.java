package Casting;
class Grandfather{
	void myHome() {
		System.out.println("Grandfather home");
	}
}

class Parent1 extends Grandfather{
	//Function
	void show() {
		System.out.println("Parent show");
	}
	void callMe() {
		System.out.println("Parent callme");
	}
}
class child1 extends Parent1{
	void readme() {
		System.out.println("child readme");
	}
}
  
public class DerivedCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c=new child1();
		c.callMe();
		c.readme();
		c.show();
		c.myHome();
		
		Parent1 p=new Parent1();
		p.callMe();
		p.show();
		p.myHome();
		
		Grandfather g=new Grandfather();
		g.myHome();
		
		Parent1 p1=c; //auto-up/ implicit up casting
		p1.callMe();
		p1.show();
		p1.myHome();
		//p1.readme();
		
		Grandfather g1=c;
		g1.myHome();
	
		Grandfather g2=p;
		g2.myHome();
	}

}
