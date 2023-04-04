package string;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="CoreJavaBasics";
		//or
	//	String s2=new String("CoreJavaBasics");
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2,5));
		
		System.out.println(s1.substring(4,8));
		
		String s2="core";
		String s3="JavaBasic";
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3.concat(s2));
		System.out.println(s2);
		
		String p1="Pune";
		String p2="Mumbai";
		String x1=p1.concat(p2);
		String x2=s2.concat(s3);
		String x3=x1.concat(x2);
		System.out.println(x3);
		
		String x4=p1+23;
		System.out.println(x4);
		// Returns the index within the string
        // of the first occurrence of the specified string.
        String s5 = "Learn Share Learn Share";
        System.out.println("s5 size: "+s5.length());
        System.out.println("Index of 'Share' starts from: " + s5.indexOf("Share"));//6
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s5.indexOf('a',3));//next occurrence(index) of 'a' after index 3
        System.out.println("Index of e = " + s5.indexOf('e',11));//next occurrence(index) of 'e' after index 11
        
        System.out.println("last Index of 'Learn'  = " + s5.lastIndexOf("Learn",18));//occurrence of 'Learn' before index 18
        System.out.println("last Index of e = " + s5.lastIndexOf('e',11));//occurrence of 'e' before index 11
            		
     // Converting cases
        String word1 = "CoreJava";
        System.out.println("Changing to lower Case " +word1.toLowerCase());//corejava
  
        // Converting cases
        String word2 = "CoreJava";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase());//COREJAVA
  
        // Trimming the word
        String word4 = "    Learn Share Learn    ";
        System.out.println("Actual String: "+word4);//    Learn Share Learn    
        System.out.println("Actaul lenght is: "+word4.length());
        System.out.println("After trim String: "+word4.trim());//Learn Share Learn
        System.out.println("After trim lenght is:" + word4.trim().length());//Learn Share Learn
  
        // Replacing characters
        String str1 = "CoreJavaBasic";
        System.out.println("Original String: " + str1);//CoreJavaBasic
        String str2 = str1.replace('a' ,'x') ;
        System.out.println("Replaced a with x -> " + str2);//CoreJxvxBxsic
                       		
        String str3=str1.replace("Java", "Net");
        System.out.println("Replaced 'Java' with 'Net' -> " + str3);//CoreNetBasic
        
        String str4=str1.replaceFirst("a", "W");
        System.out.println("Replaced first 'a' with 'W' -> " + str4);//CoreJWvaBasic
        String str5=" ";
        System.out.println("str5 is empty or not: "+str5.isEmpty());
        
        String str6=new String();
        System.out.println("str6 is empty or not: "+str6.isEmpty()); 
		
		
		
		
		
	}

}
