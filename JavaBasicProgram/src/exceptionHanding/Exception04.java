package exceptionHanding;

public class Exception04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a=new int[5];
			a[5]=30/0;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array out of boc exception occours");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception occous");
		}
		catch(Exception e) {
			System.out.println("parent exception occours" +e);
		}
		try {
			int a[]=new int[5];
			a[5] = 30/2;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array out of boc exception occours");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception occous");
		}
		catch(Exception e) {
			System.out.println("parent exception occours" +e);
		}
	}

}
