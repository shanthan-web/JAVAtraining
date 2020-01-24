package OOPS;

// class is a blueprint of attributes
class person {    
	String name;
	String email;
	String phone;
  // to make them a method we use void
	 void name()
	 {
		 System.out.println("name of the person" + name);
	 }
	 void email() {
		 System.out.println("EMail of the person" + email);
	 }
	 void phone() {
		 System.out.println("Phone of the person" + phone);
	 }
}

public class OOPS {
	
   public static void main(String[] args) {
	// instantiation of an object nothing but redirecting to the class
	// new is creating the space for the new object
	  person person1 = new person();
	   person1.name = "shanthan";
	   person1.email = "shanthan@gmail.com";
	   person1.phone = "5877076990";
	   
	   //abstraction this is what we give it to the end user
	   person1.name();
	   person1.email();
	   person1.phone();
	   
   }   

}
