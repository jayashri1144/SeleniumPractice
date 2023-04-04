package modifierPack1;

public class AccessPublicMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicModifier p1=new PublicModifier();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
