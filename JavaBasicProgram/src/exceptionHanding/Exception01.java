package exceptionHanding;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. abnormal statement
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 1st num");
		i=scn.nextInt();
		System.out.println("enter 2nd num");
		j=scn.nextInt();
		k=i/j;
		System.out.println("res:"+k);
	}

}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/