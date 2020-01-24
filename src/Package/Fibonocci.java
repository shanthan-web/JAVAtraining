package Package;

public class Fibonocci {
	public static void main(String[] args) {
	System.out.println("fib" + fib(3));	
	}

	public static int fib(int a)
	{
        if(a == 0) {
        	return 0;
        }
        else if(a == 1) {
        	return 1;
        }
        return (fib(a-1) + fib(a-2));
	}
}
