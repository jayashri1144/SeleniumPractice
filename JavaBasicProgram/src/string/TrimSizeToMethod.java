package string;

public class TrimSizeToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		s1.append("JavaBasics");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		s1.trimToSize();
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		String s2="JavaBasics";
		String[] strArray=s2.split("B");
		for(String s:strArray) {
			System.out.println(s);
		}
		
		String s3=strArray[0];
		String s4=strArray[1];
		System.out.println(s3);
		System.out.println(s4);
	}

}
