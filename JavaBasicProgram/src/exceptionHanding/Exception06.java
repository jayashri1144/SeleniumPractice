package exceptionHanding;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start program");
		try {
			int data=25/0;
			System.out.println(data);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handed");
		}
		finally {
			System.out.println("Finally block is always excecuted");
		}
		System.out.println("rest of the code");
	}

}
