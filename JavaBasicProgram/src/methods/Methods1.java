package methods;

public class Methods1 {

	//static global variable
			static int age;
			static double salary;
			 /**
			 * Methods type: static
			 * Access Modifier: public 
			 * non-access Modifier: non-static
			 * return type: int
			 * method name: test1
			 * argument: NA
			 * return value: 421041

			 */
			public static int test1() {
				System.out.println("I am test1 methods");
				//logic
				int pin=421041;
				return pin;
				//return 421041
			}

			 /**
			 * Methods type: static
			 * Access Modifier: static
			 * non-access Modifier: non-static
			 * return type: void 
			 * method name: test2()
			 * argument: NA
			 * return value: I am jayshri

			 */
			static void test2() {
				System.out.println("I am jayshri");
				// return: this will be written by java compiler at compile. 
			}

			 /**
			 * Methods type: static
			 * Access Modifier: static
			 * non-access Modifier: non-static
			 * return type: double
			 * method name: test3
			 * argument: NA
			 * return value: space & 15.36

			 */
			static double test3(boolean b1) {
				System.out.println("");
				return 15.36;
				
			}
			
			 /**
			 * Methods type: static
			 * Access Modifier: private
			 * non-access Modifier: non-static
			 * return type: void
			 * method name: test4
			 * argument: f
			 * return value: space

			 */
			static private void test4(float f) {
				System.out.println("");
			}
	
	public static void main(String[] args) {

	}

}
