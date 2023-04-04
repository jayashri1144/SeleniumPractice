package operators;

public class Logicalop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = -5, num2 = 0;
		boolean bool1 = (num1 == num2); //f
		boolean bool2 = (num1 > num2); //f
		
		//logical and
		System.out.println("num1 && num2 = " + (( num1 == num2 )&& (num1 > num2)));
												//((-5 == 0)&&(-5>0))
												//f && f = f
		
		//logical or
		System.out.println("num1 || num2 = " + ((num1 == num2) || (num1 > num2)));
												//((-5 == 0) || (-5 >0))
												//f || f=f
		
		//logical not
		System.out.println("num1 && num2 = " + !((num1 == num2) && (num1 > num2)));
											//!((-5 == 0) && (-5 > 0))
											//!(f && f) =!(f)=t
	}

}
