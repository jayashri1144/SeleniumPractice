package conditions;

public class ifcondition7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=45, num2=30;
		if(num1!=num2)  //if(!(num1==num2))
		{
			System.out.println("num1 is greter than num2");
		}
		else
		{
			System.out.println("num1 is smaller than num2");
		}
		if(num1>num2)
		{
			System.out.println("num1 greater than num2");
		}
		else
		{
			System.out.println("num1 is smaller than num2");
		}
		if(num1<=num2)
		{
			System.out.println("either equal to or grater than");
		}
		else
		{
			System.out.println("num1 is smaller than num2");
		}
		if(num1==num2 || num1>num2)
		{
			System.out.println("either equal to or grater than");
		}
		else
		{
			System.out.println("num1 is smaller than num2");
		}
		if(num1>=num2 && num1>num2)
		{
			System.out.println("either equal to or grater than");
		}
		else
		{
			System.out.println("num1 is smaller than num2");
		}
		System.out.println("******************if-else-ladder**********");
		if(num1==num2)
		{
			System.out.println("num1 is equal num2");
		}
		else if(num1>num2)
		{
			System.out.println("num1 is greater than num2");
		}
		else
		{
			System.out.println("num1 is smaller than num2");
		}
		int sub1=50,sub2=30;
		if(sub1>35 && sub2>35)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
