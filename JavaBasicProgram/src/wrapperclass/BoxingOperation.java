package wrapperclass;

public class BoxingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		System.out.println(age);
		
		Integer obj=45;
		System.out.println(obj);
		
		Integer intObj=new Integer(age);
		System.out.println(intObj);
		
		System.out.println(age==intObj);
		Integer intObj2=new Integer(50);
		System.out.println(intObj2);
		Integer intObj3=30;
		System.out.println(intObj3);
		
		char c2='z';
		Character xyz=c2;
		Character cobj=new Character(c2);
		System.out.println(c2);
		System.out.println(xyz);
		System.out.println(cobj);
		
		
	}

}
