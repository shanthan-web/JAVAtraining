package ARRAY;
import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		
		int[] array1 = {12,2,43,21,45,65,43,29};
		int[] array2 = new int[8];
		
		
		for(int i = 0; i < array1.length;i++) {
			array2[i] = array1[i];
		}
		System.out.println("new array2:" + Arrays.toString(array2));
	}

	
}

