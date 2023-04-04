package exceptionHanding;

public class FinalizeExample1 {

	public void finalize() throws Throwable{
		try {
			System.out.println("Inside finalize method");
		}catch(Throwable e) {
			throw e;
		}finally {
			System.out.println("calling Finalize method of the object class");
			super.finalize();
		}
	}
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		// finalize - just before destroying any object, garbage collector always calls finalize() to perform clean-up
		// activities on that object
				
		FinalizeExample1 f1=new FinalizeExample1();
		f1.finalize();
		System.out.println("Program ends");
	}

}
