package collection;
import java.util.Vector;
public class VectorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>();
		System.out.println(vec.capacity());
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Cat");
		vec.add("Elephant");
		System.out.println(vec);
		System.out.println(vec.clone());
		System.out.println(vec.size());
		vec.add("Monkey");
		System.out.println(vec);
		
		for(String str : vec) {
			System.out.println(str);
		}
	}

}
