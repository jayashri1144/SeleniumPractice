package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(10);
		l2.add(2);
		l2.add(45);
		l2.add(18);
		System.out.println(l2.size());
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		Collections.reverse(l2);
		System.out.println(l2);
		
		ListExample2 a=new ListExample2();
		a.display();
		
		List<ListExample2> a1=new ArrayList<ListExample2>();
		a1.add(new ListExample2());
		a1.add(a);
		
		a1.get(0).display();
		a1.get(1).display();
		
	}
	
	void display() {
		System.out.println("Hi, I am display method.");
	}

}
