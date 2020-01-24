package Package;

public class sumofN {
	public static void main(String[] args) {
		System.out.println("N" + sum(5));
	}
	
	public static int sum(int n) {
		
		int i;
		int k = 0;
		
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
			k =  k +i;
		}
		
		return k;
		
	}

}
