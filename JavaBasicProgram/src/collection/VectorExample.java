package collection;
import java.util.Vector;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Element");
		
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		System.out.println("Element are: "+vec);
		System.out.println(vec.size());
		for(String str: vec) {
			System.out.println(str);
		}
	}

}
/**
Synchronized --> Thread Safe ----> slow
default capacity-->10 --> increases capacity by 100%
Vector comes from JDK 1.0 ---> also known as legacy class
*/
