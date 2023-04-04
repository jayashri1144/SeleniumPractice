package impprogram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Originalstr="Hello, Anvi";
		String reversestr=" ";
		
		for(int i=0;i<Originalstr.length();i++)
		{
			reversestr = Originalstr.charAt(i)+reversestr;
			
		}
		System.out.println(reversestr);
		
	}
}
