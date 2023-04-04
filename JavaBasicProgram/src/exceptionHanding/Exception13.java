package exceptionHanding;

public class Exception13 {

	public static void main(String[] args)throws InterruptedException, UserDefinedException
	{
		// TODO Auto-generated method stub
		System.out.println("start program");
		setSleep(2000);
		System.out.println(-1);
		System.out.println("hello geeks");
	}
	static void setSleep(long time) throws InterruptedException{
		Thread.sleep(time);
	}
	static void checkNumber(int num) throws UserDefinedException{
		if(num<0) {
			throw new UserDefinedException("NUmber less than zero");
		}
		else
		{
			System.out.println("Number is" +num);
		}
	}

}
/**
try-catch--> to handle the exception
throw------> to throw the exception from a method body, this needs to handled by using throws 
throws------> use to handle exception throws by a method while calling or use to declare a exception on method level
*/