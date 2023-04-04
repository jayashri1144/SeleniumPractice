package practiceProgram;

public class TrimProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="  I am Trim   ";
		System.out.println("statement with spaces: "+a);
		System.out.println("remove white space:"+a.trim());
		System.out.println("remove all white spaces in string:"+a.replace(" ", ""));
	}
}
 