package systemclass;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<6;i++) {//define number of lines in pyramid
			for(int j=0;j<=i;j++) {//define pattern
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i = 0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=6;i>=0;i--) {
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		int row=6;
		for (int i = row; i > 0; i--) {// number of lines
			for (int j = 1; j <= i; j++) {// define design
				System.out.print(" ");
			}
			for (int j = i; j <= row; j++) {// define patterns
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
