package loops;

public class forloop5 {

	public static void main(String[] args) {
		for(int i=0;i<3;++i)
		{
			System.out.println("**************************hello i: " +i);
			
			for(int j=0;j<2;j++)
			{
				System.out.println("********************hi j: " +j);
				
				for(int k=0;k<2;k++)
				{
					System.out.println("bye k: " +k);
				}
			}
		}
		for(int i=1;i<50;i++)
		{
			if(!(i%2==0))
			{
				System.out.println(i);
			}
		}
		for(int i=50;i>0;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	/**	System.out.println("***************infinity loop*****************");
		for(int i=0;i>=0;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		*/

	}

}
