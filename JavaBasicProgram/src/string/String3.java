package string;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pune"+12345;
		System.out.println(str);
		System.out.println("======================");
		String s1="Mumbai"+null;
		System.out.println(s1);
		System.out.println("=======================");
		String s2=str.concat("Bhadgaon");
		System.out.println(s2);
		System.out.println("==========================");
		String s3=str.concat(null);
		System.out.println(s3);//Null Pointer Exception
	}

}
