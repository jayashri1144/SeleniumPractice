package practiceProgram;

public class swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20, num2=30, temp;
		temp= num1;
		num1=num2;
		num2= temp;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		int n1= 25,n2= 35;
		n1=n1+n2; //n1=25+35=60 now n1=60
		n2=n1-n2; //n2=60-35=25 now n2=25
		n1=n1-n2; //n1=60-25=35 now n1=25
		
		System.out.println("n1 " +n1);
		System.out.println("n2 " +n2);
		

	}

}
