package Package;

public class cities {

	public static void main(String[] args) {
		// Declare & Define an array
		String[] cities = {"newyork", "calgary", "toronto"};
		System.out.println(cities[0]);
		
		// Declare an array
		String[] states = new String[5];
		states[0] = "shanthan";
		states[1] = "shanthan1";
		states[2] = "shanthan2";
		states[3] = "shanthan3";
		states[4] = "shanthan4";
		int n = 0;
		System.out.println("printing with DO loop");
		do {
			System.out.println("states" + states[n]);
			n = n + 1;
		}while(n<5);
		System.out.println("printing with WHILE loop");
//		int i = 0;
//		while(i < 5);{
//			System.out.println("inside while loop");
//		System.out.println("states" + states[i]);
//		i++;	
//	}
	System.out.println("printing with for loop");
	int  k;
	for(k = 0 ; k< 4; k++);{
	System.out.println("states" + states[k]);
	}
	}
	
} 