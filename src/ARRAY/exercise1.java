package ARRAY;
import java.util.Arrays;
public class exercise1 {

	public static void main(String[] args) {
		
		int[] my_array1 = {12,13,21,243,43};
		// sorting an array
		
	    System.out.println("Arrays before sorting" + Arrays.toString(my_array1));
	    Arrays.sort(my_array1);
	    System.out.println("Arrays after sorting" + Arrays.toString(my_array1));
	      
	    // sum of arrays and average values in arrays
	    int count = 0;
	    double avg = 0;
	    int found = 21;
	    for(int i = 0; i < my_array1.length; i++) {
	    	count = count + my_array1[i];
	    	avg = count/ my_array1.length;
	    	if(my_array1[i] == found) {
                	    		
	    		 System.out.println("we found:" + "   " + found + "at" + i + "  " + "index postion");

	    	}
	    	 
	    }
	     System.out.println("sum of the list in array" + count);
	     System.out.println("average of the list in array" + avg);
	   
	    
	    
	
	}

}
