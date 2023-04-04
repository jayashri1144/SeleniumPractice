package array;

import java.util.Arrays;

public class M_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyFrom= {'d', 'e','c','t','f','f','e', 'i', 'n', 'a', 't', 'e', 'd'};
		System.out.println("element count in copyFtom array:" +copyFrom.length);
		
		char[] copyTo= Arrays.copyOf(copyFrom, copyFrom.length);
		System.out.println("element count in copyto array: "+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.println(copyTo[i]+ " ");
		}
		
		System.out.println("\n************Copy using range****************");
		char[] copyWithRange=Arrays.copyOfRange(copyFrom, 3, copyFrom.length);
		for(int i=0;i<copyWithRange.length;i++) {
			System.out.print(copyWithRange[i]+" ");
		}
		System.out.println("\n****************After Sorting********************");
		Arrays.sort(copyWithRange);
		for(char c: copyWithRange) {
			System.out.print(c +" ");
		}
	}

}
