package Encapsulations;

public class Encap2 {

	public static void main(String[] args) {
		encap1 obj=new encap1();
		System.out.println("get acc_no: "+ obj.getAcc());
		System.out.println("get amount: "+ obj.getAmount());
		obj.setAcc(23456);
		obj.setAmount(23000);
		System.out.println("new get acc_no: "+obj.getAcc());
		System.out.println("new amount: "+ obj.getAmount());

	}

}
