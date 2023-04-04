package collection;
import java.util.ArrayList;
public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("aa");
		a1.add("bb");
		a1.add("cc");
		a1.add("dd");
		a1.add("ee");
		a1.add("ff");
		a1.add("gg");
		System.out.println(a1);
		System.out.println(a1.remove("dd"));
		System.out.println(a1);
		System.out.println(a1.remove(3));
		System.out.println(a1);
		System.out.println();
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("a");
		a2.add("ll");
		a1.addAll(a2);
		System.out.println(a1);
		
//		if(a1.contains("a")) {
//			a1.remove("a");
//			System.out.println(a1);
//		}
		//OR
		System.out.println();
		System.out.println(a1);
		a1.removeIf(str -> str.contains("a"));
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1);
	}

}
