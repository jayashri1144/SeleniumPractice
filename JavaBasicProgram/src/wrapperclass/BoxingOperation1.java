package wrapperclass;

public class BoxingOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='A';
		Character charObj1=new Character(c1);
		System.out.println(c1==charObj1);
		Character charObj2=new Character('D');
		
		Character charObj='H';
		
		System.out.println(c1);
		System.out.println(charObj1);
		System.out.println(charObj2);
		System.out.println(charObj);
		
		boolean b=true;
		Boolean bob=new Boolean(b);
		System.out.println(bob==b);
	}
}
