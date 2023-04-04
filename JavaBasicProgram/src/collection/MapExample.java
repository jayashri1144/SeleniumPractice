package collection;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put("key1","admin");
		m1.put("key2","admin");
		m1.put(null,"admin123");
		System.out.println(m1);
		System.out.println(m1.size());
		m1.put("key2","manager");
		m1.put(234,"manager");
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.get("key2"));
		System.out.println(m1.keySet());
		System.out.println(m1.values());
	}

}
/**
 * to add any element in Map we need use put(key,value) 
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from Map use values()
 * if you want get a particular Key value dn use get(key)
 */ 