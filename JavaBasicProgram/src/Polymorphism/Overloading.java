package Polymorphism;

class shape{
	public void area() {
		System.out.println("find area");
	}
	public void area(int l,int b)
	{
		System.out.println("rectangle area: "+ l*b);
	}
	public void area(int r) {
		System.out.println("area of circle: "+ 3.14*r*r);
	}
	public void area(double h,double b) {
		System.out.println("area of triangle:"+ 0.5*h*b);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape obj=new shape();
		obj.area();
		obj.area(5);
		obj.area(5, 7);
		obj.area();
	}
}
