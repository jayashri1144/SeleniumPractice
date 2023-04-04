package Encapsulations;

class sample
{
    void test(double d)
	{
		System.out.println("value of d:"+d);
	}
    void test(int i)
    {
    	System.out.println("value of i:"+i);
    }
    
    double test1() {
    	return 13; //auto/ implicit widening
    }
}

public class PrimitiveCasting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s=new sample();
		s.test(56);
		s.test(6);
		
		int myInt=(int)s.test1();  //Explicit narrowing
		System.out.println(myInt);
	}

}
