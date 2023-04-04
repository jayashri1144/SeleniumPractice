package exceptionHanding;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Program start");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end program");
	}

}
