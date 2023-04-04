package Interfaces;
interface i1{
	//variable ---> by default ----> public static final
		//method ---> by default ----> public abstract
		//no complete methods/non-abstract
		//no constructor
}
//interface declaration: by first user
interface Drawable{
	int salary=25000;//by default---> public static final int salary=25000;
	void draw();//by default---->public abstract void draw();
}
//Implementation: by second user

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class circle implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
//Using interface: by third user

public class Interfacedemo {

	public static void main(String[] args) {
		System.out.println("Interface variable salary: "+Drawable.salary);
		Rectangle r=new Rectangle();//drawing rectangle
		r.draw();
		
		circle c=new circle();//Drawing Circle
		c.draw();
		//Circle class object is created and refereed by Interface Drawable
		Drawable d=new circle();//Drawing Circle
		d.draw();
		
		Drawable d1=new Rectangle();//drawing rectangle
		d1.draw();
	}

}
/**
 * Interface--> used to achieve abstraction in java
 * 			--> as we know java doesn't support mutliple inheritance using classes to overcome this 
 * 				java provides interface to support this 
 * 			--> its 100% abstract, no non-abstract method
 * 			--> inside interface will have-(no constractor)
 * 					- variable ---> by default--->public static final
 * 					- methods  ---> by default--->public abstract
 * 			--> wheneven a sub class inherits the interface they use implements keyword
 * 				class childclass implements interfacename{
 * 
 * 				}
 * 			--> As we are not allowed to create an instance of abstract class simillarly we are not allowed to create
 * 				instance of interface(because its also incomplete)
 * 			--> when a interface is getting inherited by a sub class, dn there will a contract between these classes thats
 *  			subclass needs to override all the abstract method of interface otherwise subclass becomes abstract class
 * 			--> between 
 * 					1. two classes we use 'extends'
 * 					2. two interface we use 'extends' 
 * 					3. class and interface use 'implements' 
 */
