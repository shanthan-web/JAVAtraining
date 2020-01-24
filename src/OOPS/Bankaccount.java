package OOPS;

// this is the blueprint for the banking app
public class Bankaccount implements iRate {

	String accountNumber;
	static String RoutingNumber = "134234"; // this static saying that this variable belongs to the class not particular object/method
	private String name; // for encapsulation we don't want our clients to define the variables
	String SSN;
	double balance;
	
	// construction definition: these are unique methods
	   //1. use to define/setup initialize properties of an object
	   //2.they implicitly called upon instantiation
	   //3.the same name as the class itself
	   // 4. constructors have no return type 
	  //5. constructor in turn is a method as well
	
	Bankaccount(){
		System.out.println("new account as created");
	}
	// overloading: same method name with different arguments
	
	Bankaccount(String name){
		System.out.println("name" + name);
	}
	Bankaccount(String accounttype, double initdeposit){
		System.out.println("New Account" + accounttype);
		System.out.println("Initial Deposit" + initdeposit);
		String Error = "Error: minimum deposit is atleast 1000";
		if(initdeposit < 1000) {
			System.out.println(Error);
			
		}
	}
	
	
	// getters and setters
	// we allow user to define the name
	public void setName(String name) {
		this.name = name; //this stands for this variable belongs to the class
	}
	public String getName() {
		return name;
	}
	
	// interface methods
	
	public void setRate() {
		
	}
	public void increaserate() {
		
	}
	
	// define methods
	void deposite(double amount) {
		balance = balance + amount;
        showactivity("deposite");
}
	
	void withdrawl(double amount) {
		balance = balance - amount;
		showactivity("withdraw");
	}
	private void showactivity(String activity) {
		System.out.println("show recent activity");
		System.out.println("newbalnce" + "after" + activity + balance);
	}
	
	void checkbalance() {
		
	}
}