package modifierPack1;

public class AccessDefaultMembers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultModifier p1=new DefaultModifier();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
