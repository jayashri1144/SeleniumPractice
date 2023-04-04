package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		Integer k=new Integer(a);
		Integer l=new Integer(20);
		Integer j=a;
		System.out.println(a);
		System.out.println(k);
		System.out.println(l);
		System.out.println(j);
		
		Integer a1=new Integer(25);
		int i1=a1.intValue();
		System.out.println(i1);
		System.out.println(a1);
		
		System.out.println(a1==i1);
		System.out.println(a1.equals(i1));
		
	}

}
/**
 * Wrapper class is a predefined class in java belongs to java.lang package
 * its used to convert primitive type to object type 
 * 			-----> boxing operation ---> implicitly or auto-boxing
 * converting back the boxed object into primitive type is known as 
 * 			-----> un-boxing operation ---> 
 * 
 * in wrapper class toString() & equals & '==' are overrided
 */ 
