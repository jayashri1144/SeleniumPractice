package array;

public class M_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5},{7,8,9,4}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		char[] charArr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
		for(int i=0;i<charArr.length;i++) {
			for(int j=0;j<charArr[i].length;j++) {
				System.out.println(charArr[i][j]+ " ");
			}
			
		}
	}
}
