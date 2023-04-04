package array;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {12,34,23,1,69,56,45,34,80,40};
		
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		System.out.println();
		//int n=1; //first index array rotation
		int n=3; //3rd index array rotation
		//logic to rotate array elements
		for(int i=0;i<n;i++) {
			
			int first=age[0],j;
			for(j=0;j<age.length-1;j++) {
				age[j]=age[j+1];
			}
			age[j]=first;
			
		}
		System.out.println();
		for(int i=0;i<age.length;i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();

	}

}
