package FinalKeyword;

public class FinalKeywords {

	//static final int id;
	
	static final int id=101;
	public static void main(String[] args) {
//		final int age;
//		age=25;
//		//you cann't initialize final global variable after declaration
//		id=25;

		final int age;
		age=25;
		System.out.println(age);
		System.out.println(id);
		//id=101;//you cann't modify final variable value
		
	}

}
/**
 * Local variable can be declared as final and initialize later based on requirement
 * for final Global variables, its mandatory to declared and initialize both at the same time
 */ 
