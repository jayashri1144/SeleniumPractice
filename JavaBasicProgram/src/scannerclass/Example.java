package scannerclass;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello, This is BasicJava.";
		// Create scanner Object and pass string in it
		/**
		 * As Scanner class inherits Iterator interface, which as following methods
		 * 1. hasNext()---> check weather it has data or not and return true if it has
		 * 2. next()------> it returns the data present in Scanner object 
		 * 3. remove()----> to remove data
		 */
		Scanner scan =new Scanner(s);
		System.out.println("Boolean result: "+scan.hasNext());
		//Print the string 
		System.out.println("string :" +scan.nextLine());
		scan.close();
		
		System.out.println("=================================");
		Scanner in =new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=in.next();
		System.out.println(name);
		System.out.println("enter your age");
		int i=in.nextInt();
		System.out.println(i);
		System.out.println("enter your salary");
		double d=in.nextDouble();
		System.out.println(d);
		in.close();
	}
}
