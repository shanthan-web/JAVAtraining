package STRINGS;

public class Exercise1 {
	public static void main(String[] args) {
		
		Exercise1 str1 = new Exercise1();
		
		System.out.println("reverse of string" + str1.reverse("shanthan"));
	}

	public String reverse(String input) {
		String rev = "";
		for(int i = input.length() -1 ; i >=0; i--) {
			
			rev = rev + input.charAt(i);
		}
		
		return rev;
		
	}
}
