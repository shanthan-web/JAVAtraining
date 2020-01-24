package OOPS;
// inherit the object class we need to extend it
//we can one extend and multiple implements
public class CDAaccont extends Bankaccount implements iRate {

	String interestrate;
	
	void compound() {
		System.out.println("compounding interest");
	}
}
