package Encapsulations;


public class example {

	//private data members
	private long acc_no;
	private float amount;
	
	public long getAccountno() { //getter method
		return acc_no;
	}
	
	public void setAcc_no(long acc_no) { //setter method
		this.acc_no = acc_no;
	}
	
	public float getAmount() { //getter method
		return amount;
	}
	
	public void setAmount(float amount) { //setter method
		this.amount= amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example obj=new example();
		System.out.println("Accessing private data member outside the class using getter concept- acc_no:"+ obj.getAccountno());
		System.out.println("Accessing private data member outside the class using getter concept- amount: "+obj.getAmount());
		obj.setAcc_no(34);		
		obj.setAmount(340000);
		System.out.println("Accessing private data member outside the class using getter concept- new acc_no: "+obj.getAccountno());
		System.out.println("Accessing private data member outside the class using getter concept- new amount: "+obj.getAmount());
	}

}
