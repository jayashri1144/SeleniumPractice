package exceptionHanding;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start program");
	//	1. abnormal statements
		int i=10;
		int j=i/0; //Arithmetic Exception
		System.out.println("res: "+j);
		
		//2. abnormal statement
		int[] empIds=new int[3];
		empIds[3]=101; //ArrayIndexOutOfBoundsException
		
		//3. abnormal statements
		String str=null;
		System.out.println(str.length());//NullPointerException
		
		//4. abnormal statement
		String s="abc";
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println("num: "+num);
		System.out.println("end program");
		
		
	}

}
