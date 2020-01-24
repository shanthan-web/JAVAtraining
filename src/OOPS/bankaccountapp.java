package OOPS;

public class bankaccountapp {

	public static void main(String[] args) {
		//think instantiating a new class create an object from a class which is a method in
		Bankaccount acc1 = new Bankaccount();
		acc1.deposite(5000);
		acc1.withdrawl(3000);
//with encpasulation: public API methods
	    acc1.setName("roger hue");
	    System.out.println("getname" + acc1.getName());
		Bankaccount acc2 = new Bankaccount("shanthan");
		
		Bankaccount acc3 = new Bankaccount("saving" , 5000);
		
		
		//Demo for inheritance
		CDAaccont cd1 = new CDAaccont();
		cd1.balance = 3000;
		
		
		
}
	
}