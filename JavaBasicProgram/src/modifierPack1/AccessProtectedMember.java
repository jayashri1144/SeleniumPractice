package modifierPack1;

public class AccessProtectedMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedModifier p1=new ProtectedModifier();
		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
