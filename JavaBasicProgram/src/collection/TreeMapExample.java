package collection;
import java.util.SortedMap;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap m1=new TreeMap();
		m1.put("key1", "admin");
		m1.put("key2", "admin");
		
		System.out.println(m1);
		System.out.println(m1.size());
		SortedMap m2=m1.subMap("key0", "key3");
		System.out.println(m2);
		System.out.println(m2.size());
	}

}
