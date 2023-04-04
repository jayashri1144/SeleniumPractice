package methods;

class DisplayOverloading{
	public void disp(int num,char c)
	{
		System.out.println(num+" "+c);
	}
	public void disp(char c,int num)
	{
		System.out.println(c+ " " +num);
	}
}
public class MethodOverloading4 {

	public static void main(String[] args) {
		
		DisplayOverloading obj=new DisplayOverloading();
		obj.disp(25, 'x');
		obj.disp('j',35);
		
		MethodOverloading4 m1=new MethodOverloading4();
		m1.call();
	}
	
	public void call() {
		System.out.println("calling");
	}

}
