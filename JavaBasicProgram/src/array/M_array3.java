package array;

import java.util.Arrays;

public class M_array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyFrom = {'a','b','c','d'};
		
		char[] copyArray = copyFrom.clone();
		System.out.println(copyArray);
		
		//sorting copyFrom in ascending order
		Arrays.sort(copyArray);
		
		boolean result =Arrays.equals(copyFrom, copyArray);
		System.out.println(result);
	}
}