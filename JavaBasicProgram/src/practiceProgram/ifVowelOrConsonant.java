package practiceProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class ifVowelOrConsonant {
	

	public static void main(String[] args) {
		//String str=null;
		char str='0';
	//	InputStreamReader is=new InputStreamReader(System.in);
		//BufferedReader bhr=new BufferedReader(is);
//		try {
//			 str=bhr.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		if((str=='a') || (str=='e') || (str=='i') || (str=='o') || (str=='u'))
		{ 
			System.out.println("alphabet is vowels");
		}
		else
		{
			System.out.println("alplabet is consonant");
		}

	}

}
