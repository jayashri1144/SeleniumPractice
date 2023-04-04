package modifierPack1;

public class PublicModifier {
	public int accNum=123;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicModifier p1=new PublicModifier();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AccessPublicMembers {

	public static void main(String[] args) {
		
		PublicModifier p1=new PublicModifier();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
	
	/**
	public members are accessible from any where like-
		with in same class
		from outside the class
		from outside the package but that class should be declared as public
	*/