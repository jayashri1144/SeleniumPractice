package modifierPack1;

public class Modifier1 {
	private int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier1 p1=new Modifier1();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}

/**
 * private member are accessible with in class only
 */
