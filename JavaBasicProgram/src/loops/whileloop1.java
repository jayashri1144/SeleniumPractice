package loops;

public class whileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		while(i>=0)
		{
			System.out.println("hello " +i);
			i--;
		}
		//o/p: hello 4
		//	   hello 3
		//     hello 2
		//     hello 1
		//     hello 0
		
		char a='a';
		while(a<='z')
		{
			System.out.println(a +"");
			a++;
		}
		System.out.println("");
		
		//o/p: a b,c....................z
		
		char b='z';
		while(b>='a')
		{
			System.out.println(b + "");
			b--;
		}
		
		//o/p: z y x................a
		
		System.out.println();
		int num=1;
		while(num<=50)
		{ 
		//	if(!(num%2==0)) odd number will be print.
			if(num%2==0)
			{
				System.out.println("even  number is: "+num);
			}
			num++;
		}
	}
	
	

}
