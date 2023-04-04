package modifierPack1;

public class ProtectedModifier {
	protected int accNum=23456;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedModifier p1=new ProtectedModifier();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AccessProtectedMembers {

	public static void main(String[] args) {
		
		ProtectedModifier p1=new ProtectedModifier();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
 * protected members are accessible with in package 
 * but can be access these member from outside the package using inheritance
 */