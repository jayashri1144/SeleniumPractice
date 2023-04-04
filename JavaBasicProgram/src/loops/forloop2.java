package loops;

public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * for(initialization; condition; incre/decre )
		 * {
		 * }
		 * execution flow 
		 * 
		 * 1.Initialization
		 * 2.condition
		 * 3.executes body
	`	 * 4.incre/decre
		 * 5.repeat from step 2 till condition gets fails
		 */
		
//		for(int i=0;i<15;i++)
	//	{
			//System.out.println("welcome to office...");
	//	}
		
//		for(int i=4;i>0;i--)
//		{
//			for(int j=0;j<i;j++)
//				{
//					System.out.print("*");
//				}
//			System.out.println();
//		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+ "");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+ "");
			}
			System.out.println();
		}
	}

}
