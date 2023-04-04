package systemclass;
class traning{
	traning() {
		// TODO Auto-generated constructor stub
		System.out.println("Training class const.");
	}
	void manualTraning() {
		System.out.println("I am from manual testing");
	}
	void automationTraning() {
		System.out.println("I am from antomation testing");
	}
}

public class SystemClass2 {
	static traning t1=new traning();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemClass2.t1.manualTraning();
		SystemClass2.t1.automationTraning();
		
		traning t2=new traning();
		t2.manualTraning();
		t2.automationTraning();
		
		System.err.println("I am error, From SystemDemo2 class");
	}

}
