package collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> a1=new TreeSet<String>();
		a1.add("ravi");
		a1.add("ram");
		a1.add("seeta");
		a1.add("anvi");
		System.out.println(a1.size());
		System.out.println(a1);
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		Iterator i=a1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(23);
		set.add(34);
		set.add(11);
		set.add(15);
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println(set2.descendingSet());
		System.out.println(set2.headSet("C"));
		System.out.println("Head Set: " + set2.headSet("C", true));//abc
		
		System.out.println("SubSet: " + set2.subSet("A", "E"));//abcd
		
System.out.println("SubSet: " + set2.subSet("A", false, "E", true));//bcde
		
		System.out.println("TailSet: " + set2.tailSet("C"));//cde		
		System.out.println("TailSet: " + set2.tailSet("C", false));//de
	
	}

}
