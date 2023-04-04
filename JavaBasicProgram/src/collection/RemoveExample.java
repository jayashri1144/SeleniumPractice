package collection;
import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class RemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<Integer>();
		num.add(56);
		num.add(23);
		num.add(2);
		num.add(90);
		System.out.println(num);
		System.out.println(num.size());
		num.removeIf(n -> (n%2==0));
		System.out.println(num);
	}

}
