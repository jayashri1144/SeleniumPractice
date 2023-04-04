package Constructors;

public class ConswithParameter {
	
	int x;
	//constructor with a parameter
	public ConswithParameter(int x)
	{
		this.x=x;
	}
	
	//call constructor
	public static void main(String[] args) {
		ConswithParameter c1=new ConswithParameter(5);
		System.out.println("value of x= " + c1.x);

	}

}
