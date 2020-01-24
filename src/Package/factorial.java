package Package;

public class factorial {
	public static void main(String[] args) {
		System.out.println("N" + fact(5));
	}
	
	static int fact(int n) {
		
		int i;
		int k = 1;
		
		if(n == 0)
		{
			
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		for(i = 1 ; i <= n ; i++) {
			System.out.print("n" + n);
		System.out.print("i" + i);
//		int	k = 0;
			k =  k*i;
		}
		
		return k;
		
	}

}
