package exceptionHanding;

public class Exception07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside the try block");
			int data= 25/5;
			System.out.println(data);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am inside finally block");
			int k=10/0;
			System.out.println("finally block is always exceuted.");
		}
		System.out.println("rest of the code...");
	}

}
