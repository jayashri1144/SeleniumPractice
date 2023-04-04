package wrapperclass;

public class BoxingOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double doubleObj= 25.2566;
		System.out.println(doubleObj);
		
		double salary=doubleObj.doubleValue();
		System.out.println(salary);
		System.out.println(doubleObj==salary);
		
		Boolean b=true;
		boolean b1=b.booleanValue();
		
		System.out.println(b1);
		
		Character c=new Character('a');
		char c2=c.charValue();
		System.out.println(c2);
		
		Integer i=25;
		double d=i.intValue();
		System.out.println(d);
	}

}
