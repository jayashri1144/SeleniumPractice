package conditions;

public class ifcondition5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	int i=100;
		if(i<15)
		{
			System.out.println("i is smaller");
		}
		else
		{
			System.out.println("i is greater");
		}*/
		
		int year=2021;
		if((year % 4==0)&& (year % 100 !=0)|| (year % 400==0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("commom year");
		}
	}

}
