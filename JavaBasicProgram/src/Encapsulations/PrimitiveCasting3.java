package Encapsulations;

public class PrimitiveCasting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit widening casting
		 byte b=9;
		 short s=b;
		 int i=b;
		 long l=b;
		 float f=b;
		 double d=b;
		 
		 System.out.println("byte: "+b);//byte
		 System.out.println("short: "+s);//byte to short
		 System.out.println("integer: "+i);//byte to int
		 System.out.println("long: "+l); //byte to long
		 System.out.println("float: "+f);//byte to float
		 System.out.println("double: "+d);//byte to double
	
	}

}
