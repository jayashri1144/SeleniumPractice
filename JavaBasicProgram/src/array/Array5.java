package array;

class ArrayMinMax{
		
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	
	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	static int[] getArray() {
		
		int num[]=new int[3];
		num[0]=10;
		num[1]=13;
		num[2]=15;
		return num; //or
	//return new int[] { 10, 30, 50, 90, 60 };
	}
}


public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,45, 4,12, 90,6};
		ArrayMinMax.max(arr);
		ArrayMinMax.min(arr);
		
		int[] arr1= ArrayMinMax.getArray();
		for(int j=1;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		
		for(int i=0;i<=numbers.length;i++) {//exception as arrayIndexOutOfBound
			System.out.println(numbers[i]);
	}
}
}
