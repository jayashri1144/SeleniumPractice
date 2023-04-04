package operators;

public class Relatiop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables definition and initialization
		int num1 = -5, num2 = -4;
		System.out.println("num1: " + num1 + "------>num2: " + num2);
		
		//is equal to
		boolean res = (num1 == num2);
		System.out.println("num1 == num2 " + res); //F
		
		//or
		System.out.println("num1 == num2 " + (num1 == num2)); //false
		
		// is not equal to
		System.out.println("num1 != num2 " + (num1 != num2)); //true
		
		//greater than
		System.out.println("num1 > num2 " + (num1 > num2)); //false
		
		//greater than equal to
		System.out.println("num1 >= num2 " + (num1 >= num2)); //false
		
		//less than 
		System.out.println("num1 < num2 " + (num1 < num2)); // true
		
		// less than equal to
		System.out.println("num1 <= num2 " + (num1 <= num2)); //true
		
		

	}

}
