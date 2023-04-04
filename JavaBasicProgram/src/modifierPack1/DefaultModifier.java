package modifierPack1;

public class DefaultModifier {
	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultModifier p1=new DefaultModifier();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AccessDefaultMembers {

	public static void main(String[] args) {
		
		DefaultModifier p1=new DefaultModifier();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}