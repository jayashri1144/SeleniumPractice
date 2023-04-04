package collection;
import java.util.ArrayList;
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		System.out.println(a1);
		System.out.println("element status: "+a1.isEmpty());
		a1.add("Ravi");
		a1.add("Anvi");
		a1.add("Preksha");
		System.out.println(a1);
		System.out.println(a1.size());
		
		a1.add(1,"sunny");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("Sonoo");
		a2.add("lucky");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		ArrayList a3=new ArrayList();
		a3.add("Jonh");
		a3.add("rahul");
		System.out.println(a3);
		a2.addAll(1,a3);
		System.out.println(a2);
		a1.addAll(a3);
		System.out.println(a1);
	}

}
