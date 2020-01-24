package Package;

public class minmaxavg {
  public static void main(String[] args) {
	  
	  int[] numbers = {1,2,3,4,5};
	  System.out.println(max(numbers));
	  System.out.println(min(numbers));
  }
  
  public static int max(int[] arr) {
	  int max = arr[0];
	  for(int i= 0; i < arr.length ; i++)
	  {
		  if(arr[i] > max)
		  {
			max = arr[i];
		  }
	  }
	  
	  return max;
  }
  public static int min(int[] arr) {
	  int min = arr[0];
	  for(int i= 0; i < arr.length ; i++)
	  {
		  if(arr[i] < min)
		  {
			min = arr[i];
		  }
	  }
	  
	  return min;
  }

  }

