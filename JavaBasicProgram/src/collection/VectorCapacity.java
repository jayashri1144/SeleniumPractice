package collection;
import java.util.Vector;
public class VectorCapacity {
	public static void main(String[] args) {
		Vector<String> vcTr=new Vector<String>();
		System.out.println(vcTr);
		System.out.println(vcTr.size());
		vcTr.setSize(2);
		System.out.println(vcTr.size());
		System.out.println(vcTr);
		vcTr.addElement("Sunday");
		vcTr.addElement("Monday");
		System.out.println(vcTr);
		System.out.println(vcTr.size());
		vcTr.addElement("Tuesday");
		System.out.println(vcTr.size());
		System.out.println(vcTr.capacity());
	}

}
