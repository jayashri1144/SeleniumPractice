package exceptionHanding;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. abnormal statement
		int i,j,k;
		Scanner scn= new Scanner(System.in);
		System.out.println("1st number");
		i=scn.nextInt();
		System.out.println("2nd number");
		j=scn.nextInt();
		try {
			System.out.println("you are in try block");
			k=i/j;
			System.out.println(k);
			System.out.println("no exception found");
		}
		catch(ArithmeticException obj) {
			System.out.println("exception"+obj);//java.lang.ArithmeticException: / by zero
			obj.printStackTrace();
		}
	}

}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/