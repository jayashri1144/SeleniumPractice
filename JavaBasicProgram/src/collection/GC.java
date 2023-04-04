package collection;

public class GC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GC g=new GC();
		System.out.println("Object representation of gc:"+g);
		System.out.println("address of GC"+g.hashCode());
		g=null;
		System.gc();
		
	}
	protected void finalize() {
		System.out.println("Hi, I am finalize method...");
	}

}
/**
why finalize: release system resources before the garbage collector runs for specific object
*/