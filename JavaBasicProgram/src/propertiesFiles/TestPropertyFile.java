package propertiesFiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class TestPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String currentDir=System.getProperty("user.dir");
		FileInputStream f1s1=new FileInputStream(currentDir + "\\PropertiesFiles\\\\AppData.properties");
		//or
		
		FileInputStream f1s2=new FileInputStream("D:\\eclipse-workspace\\JavaBasicProgram\\PropertiesFiles\\AppData.properties");
	    //or
		FileInputStream f1s3=new FileInputStream(".\\PropertiesFiles\\\\AppData.properties");
		
		Properties pros=new Properties();
		pros.load(f1s3);
		String url=pros.getProperty("applicationUrl");
		System.out.println("applicationUrl: "+url);
		//or
		System.out.println("username: "+pros.getProperty("username"));
		
		System.out.println("password: "+pros.getProperty("password"));
		
		System.out.println("emailId: "+pros.getProperty("emailId"));
		
		System.out.println("phoneNumber: "+pros.getProperty("phoneNumber"));
		
		
	}

}
