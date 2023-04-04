package array;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {12, 34,-56, 5, 23, 3, 9, 7,-90};
		
		System.out.println(numbers[0]);
		double sum=0;
		double avg;
		
		for(int num : numbers) {
			//sum=sum+num;
						//or
			
			sum += num;
			System.out.println(sum);
		}
		
		int arraylength= numbers.length;
		System.out.println(arraylength);
		
		avg=sum/arraylength;
		System.out.println(avg);
		

	}

}
