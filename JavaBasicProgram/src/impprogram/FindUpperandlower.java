package impprogram;

public class FindUpperandlower {
	public static void main(String[] args) {
		String k="JaYashriMoRe";
		int uppercase=0;
		int lowercase=0;
	    for (int i=0;i<k.length();i++)
	    {
	        if (Character.isUpperCase(k.charAt(i)))
	        {
	        	uppercase=uppercase+1;
	        }
	        else
	        {
	        	lowercase=lowercase+1;
	        }
	        
	        
		}
      System.out.println("total uppercase characters are "+uppercase);
      System.out.println("total lowercase characters are "+lowercase);
   }
}
