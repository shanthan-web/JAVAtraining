package Package;

public class calc {
	public static void main(String[] args) {
		printname();
		int a = 10;
		int b = 20;
		addnumbers(a, b);
	System.out.println("multiply " + multiplynumbers(a,b));
		
	}
	// void means we don't return anything
	static void	printname() {
		System.out.println("hi here I am ");
		
	}	
		
	static void addnumbers(int a , int b) {
		int sum = a + b;
		System.out.println("sum:" + a + "number" + b + "is" + sum);
		
	}
		
	static int multiplynumbers(int a , int b) {
		int multiply = a*b;
		addnumbers(multiply, multiply);
		return multiply;
	}

}
