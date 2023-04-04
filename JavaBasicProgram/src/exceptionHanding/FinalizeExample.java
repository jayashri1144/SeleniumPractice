package exceptionHanding;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeExample f1=new FinalizeExample();
		System.out.println(f1.hashCode());
		
		f1=null;
		Object obj;
		System.gc();
		
		System.out.println("Program ends");
	}
	public void Finalize() {
		System.out.println("hi, I am your finalize method");
	}

}
