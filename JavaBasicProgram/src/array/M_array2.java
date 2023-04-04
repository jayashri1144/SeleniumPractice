package array;

import java.util.Arrays;

public class M_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {33,3,4,5};
		System.out.println("Printing orogonal array:");
		for(int i:array) {
			System.out.println(i+" ");
		}
		
		System.out.println("print clone array:");
		int cloneArray[]=array.clone();
		for(int i:cloneArray) {
			System.out.println(i+" ");
		}
		
		System.out.println("\nare both equal arr & carr ?");
		System.out.println("array & cloneArray content validation :"
				+ Arrays.equals(array, cloneArray));
		
		System.out.println();
		int newCopiedArray[]=Arrays.copyOf(array, array.length);
		for(int i:newCopiedArray) {
			System.out.println(i);
		}
		System.out.println("\n******************************");
		int newCopiedRangeArray[]=Arrays.copyOfRange(array, 1, 2);
		for (int i : newCopiedRangeArray){
			System.out.print(i+ " ");
		}
		System.out.println("\nComparing newCopiedRangeArray & newCopiedArray : "
				+Arrays.equals(newCopiedArray, newCopiedRangeArray));	
System.out.println("**************************");
Arrays.sort(array);//sort the array elements in ascending order and stores the sorted element in the same array
System.out.println("After sorting original array:");
for (int i : array) {
System.out.print(i+ " ");
}
		
	}
}
