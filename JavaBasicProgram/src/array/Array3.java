package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {12,4,25,2,5};
		
		System.out.println("accessing element of array");
		System.out.println("1st elememt:" +age[0]);
		System.out.println("2nd element:" +age[1]);
		System.out.println("3rd element:" +age[2]);
		System.out.println("4th element:" +age[3]);
		System.out.println("5th elememt:" +age[4]);
		System.out.println("array size:" +age.length);
		
		for(int i=0;i>age.length;i++)
		{
			System.out.println(i);
			if (age[i] == 25) {
				System.out.println(age[i]);
				break;
			} else {
			System.out.println("age is not 25");
		}
		}
		
		for(int a: age) {
			System.out.println(a);
		}
	}

}
