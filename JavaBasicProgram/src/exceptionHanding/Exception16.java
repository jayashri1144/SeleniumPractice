package exceptionHanding;

public class Exception16 {

	static void setSleep(long time) {
		try {
			Thread.sleep(time);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	static void checkNumber(int num) {
		if(num<0) {
			try {
				throw new UserDefinedException("Number less than exception");
			}catch(UserDefinedException e) {
				e.printStackTrace();
			}
		}else
			{
				System.out.println("NUmber is:"+num);
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start");
		setSleep(2000);
		checkNumber(-1);
		System.out.println("hello geeks");
	}
	/**
	try-catch--> to handle the exception
	throw------> to throw the exception from a method body, this needs to handled by using throws 
	throws------> use to handle exception throws by a method while calling or use to declare a exception on method level
	*/
}
