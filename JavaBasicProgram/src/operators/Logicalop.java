package operators;

public class Logicalop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1 = false , bool2 = true;
		
		//logical AND
		System.out.println("bool1 && bool2 = " + (bool1 && bool2)); //false
		
		//Logical OR
		System.out.println("bool1 || bool2 = " + (bool1 || bool2)); //true
		
		//Logical NOT
		System.out.println("bool1 && bool2 = " + !(bool1 && bool2)); //true

	}

}
