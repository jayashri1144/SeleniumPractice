package operators;

public class Logicalop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 30 , num2 = 30;
		boolean bool1 = (num1 == num2); //t
		boolean bool2 = (num1 > num2); //f
		
		//logical AND
		System.out.println("bool1 && bool2 = " + (bool1 && bool2)); //f
		
		//logical OR
		System.out.println("bool1 || bool2 = " + (bool1 || bool2)); //t
		
		//logical NOT
		System.out.println("bool1 && bool2 = " + !(bool1 && bool2)); //t

	}

}
