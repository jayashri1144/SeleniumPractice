package Encapsulations;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt=9;
		double myDouble= myInt;
		double d=(double)myInt; //explicit widening
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(d);
		
		double salary=23456.67856856898989d;
		int sal=(int)salary; //narrowing ,explicit
		long f=(long)salary; //narrowing, explicit
		float f1=(float)salary; //narrowing, explicit
		short b=(short)salary;
		System.out.println("Actual salary: "+sal);
		System.out.println("Int salary: "+f);
		System.out.println("long salary: "+f1);
		System.out.println(b);

	}
}
