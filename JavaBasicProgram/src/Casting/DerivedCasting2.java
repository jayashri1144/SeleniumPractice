package Casting;

class member{
	long phone;
	void chat() {
		System.out.println("print admin calling method"+phone);
	}
}

class admin extends member{
	void addNumber() {
		System.out.println("addNumber from admin class");
	}
}

public class DerivedCasting2 {

	public static void main(String[] args) {
		// Creating an object Ad
				member mem = new admin();//implicit up casting
				mem.phone = 9876543210l;
				// Calling function
				mem.chat();		
				System.out.println("********** After downcasting ********");
				admin ad = (admin) mem; // Downcast to access specific property of subclass
				ad.addNumber();
				ad.chat();
				System.out.println(ad.phone);		
				//Admin a1=new Member();//direct downcasting, invalid or not possible
		

	}

}
