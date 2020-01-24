package LABS;

public class Bankapp {

	public static void main(String[] args) {
	
		Bankaccount acc1 = new Bankaccount("12345" , 2000);
        acc1.setName("Shanthan");
        acc1.paybill(1000);
        acc1.makedeposite(3000);
        System.out.println(acc1.getName());
        acc1.accrue();
	}

	
}

	class Bankaccount implements Iinterest{
		//properties of bank account 
		private static  int ID = 1001; //internal ID
	    private	String accountNumber; // ID + random 2 digits + first 2 of SSN
		private static String routingNumber = "1015432";
		private String name;
		private String SSN;
		private double balance;
		
		//constructors
		
		public Bankaccount(String SSN , double initdeposit) {
		balance = initdeposit;
		this.SSN = SSN; // instance variable SSN to local variable SSN
	    ID++;	
	    AccountNumber();
		}
		// generating account number internally
		private void AccountNumber() {
			int random = (int) (Math.random()*100);
			accountNumber = ID + ""+ random + " " + SSN.substring(0,2);
			System.out.println("account Number" + accountNumber);
			
		}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void  paybill(double amount) {
		balance = balance - amount;
		System.out.println("newBalance" + balance);
	}
	public void makedeposite(double amount) {
		balance = balance + amount;
		System.out.println("newBalance" + balance);
		
	}
	@Override
	public void accrue() {
	balance = balance *(1+ rate/100);
	
	System.out.println("newBalance" + balance);
	}
	   }
	