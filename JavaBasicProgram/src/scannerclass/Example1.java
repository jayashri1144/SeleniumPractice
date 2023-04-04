package scannerclass;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empId=new int[5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<empId.length;i++)
		{
			System.out.println("insert your array element in index:"+i);
			empId[i]=in.nextInt();
			
		}
		int i=0;
		for(int num:empId) {
			System.out.println("Index"+i+":"+num);
			i++;
		}
	}
}
