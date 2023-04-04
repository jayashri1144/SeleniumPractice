package FinalKeyword;

public class FinalKeyword2 {
	final int id;
	public FinalKeyword2(int i) {
		id=i;
	}

	public static void main(String[] args) {
		
		FinalKeyword2 f1=new FinalKeyword2(24);
		System.out.println(f1.id);

	}

}
/**
 * Local variable can be declared as final and initialize later based on requirement
 * for final Global variables, its mandatory to declared and initialize both at the same time
 * 		but for non-static final global variable you are allowed to initialize its value using constructor/non-block
 *		but for static final global variable you are allowed to initialize its value using static block
 */ 
