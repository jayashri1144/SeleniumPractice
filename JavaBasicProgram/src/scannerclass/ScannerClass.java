package scannerclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scnRef= new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;
		/* Initialization of variable using Scanner class */
		
		System.out.println("Enter age value from console:");
		age=scnRef.nextInt();
		System.out.println(age);
		
		System.out.println("enter salary from console:");
		salary= scnRef.nextDouble();
		System.out.println(salary);
		
		System.out.println("enter name from console:");
		name=scnRef.next();
		System.out.println(name);
		
		System.out.println("enter true/false from console:");
		valid=scnRef.nextBoolean();
		System.out.println(valid);
		
		int num1,num2;
		System.out.println("enter num1:");
		num1=scnRef.nextInt();
		System.out.println("enter num2:");
		num2=scnRef.nextInt();
		
		char op;
		System.out.println("enter operator:");
		op=scnRef.next().charAt(0);
		
		System.out.println("addition of two number: "+ addNumber(op, num1, num2));
	}

	static int addNumber(char op, int num1, int num2) {
		if(op=='+') {
			return num1 + num2;
		}
		else
		{
			return 0;
		}
	}
}
