package LABS;

public class StudentApp {

	public static void main(String[] args) {
	
		student std1 = new student("shanthan", "123456");
        std1.setPersonal("5877076990", "Calgary", "Alberta");		
        
	}

}

class student{
	
	private String name;
	private String SSN;
	private String emailid;
	private static int ID = 1000;
	private String userID ; // staticID + random 4-digit between 1000 and 9000 +4 SSN
    private String phone;
    private String city;
    private String state; 
// constructor 
    public student(String name , String SSN){
        this.name = name;
    	this.SSN = SSN;
    	ID++;
    	userid();
    	emailid();
    }
    private void emailid() {
    	emailid = name.toLowerCase()+"." + ID + "@cbit.com";
    System.out.println("emailid of the student" + emailid);
    }
    
    private void userid() {
    	int random = (int) (Math.random() * (9000- 1000) + 1000);
    	userID = ID + random + SSN.substring(0,5);
    	System.out.println("USERID" + userID);
    }
    public void enrol() {
    	
    }
	public void pay() {
		
	}
public void checkBalance() {
		
	}
@Override
public String toString() {
	return "hi";
}

public void showCourses() {
	
}
public void setPersonal(String phone , String city , String state) {
	this.phone = phone;
	this.city = city;
	this.state = state;
}
public String getPersonal() {
	return phone + city + state;
	
}
}