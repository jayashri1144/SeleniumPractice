package practiceProgram;
class SuperExample{
	 public  void a() {
		System.out.println("a");
	}
}
class Example extends SuperExample {
	static int i=12;
	private void vehicle() {
		System.out.println("calling vehicle");
	}
	public  void a() {
		System.out.println("b");
	}
	public static void main(String[] args) {
	
		//Example.vehicle();
		Example e=new Example();
		e.vehicle();
	}
}
