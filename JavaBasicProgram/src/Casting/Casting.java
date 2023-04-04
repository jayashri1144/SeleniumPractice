package Casting;
class parent{
	void home() {
		System.out.println("parent home");
	}
}
class child extends parent{
	void car() {
		System.out.println("child car");
	}
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.car();
		c.home();
		
		parent p=new parent();
		p.home();
		
		System.out.println("++++++++++++++using upcasting+++++++++++++++++");
		//using casting concept
		
		child c1=new child();
		c1.car();
		c1.home();
		
		parent p1=c1; //implicit /auto casting-----------> parent p1= new child();
		p1.home();
		
		parent p2=new child();//implicit/auto casting
		parent p3=(parent)new child();//explicit up-casting
		parent p4=(parent)p3; //explicit up-casting
		p3.home();
		
				
		
	}

}
