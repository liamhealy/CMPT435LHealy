public class Problem1 {
	
	public static String charArrayToString(char[] array, int startIndex, int lastIndex) {
	    return new String(array, startIndex, lastIndex - startIndex + 1);
		// This method converts elements at index from startIndex to lastIndex in a char array into a string
	}
	
	public static int lastIndex = -1;
	
	public static void where(char[] A, String s, int index)
	{
		// Complete this method to find the rightmost occurence of a string in an array
		// Feel free to add more parameters to this method
		// A recursive methd is expected. A non-recursive method will be scored out of 10 points.
		if (A.length == 0) {
			index = -1;
		}
		if (index > A.length) {
			return;
		}
		if (charArrayToString(A, 0, 5) == s) {
			index = 0;
		}
		if (A[index] == s.charAt(0) && A.length > index + 5) {
			/*for (int i = 0; i < s.length(); i++) {
				index = index + 1;
				if (A[index] == s.charAt(i)) {
					
				}
			}*/
			if (A[index + 1] == 'a' && A[index + 2] == 'r' && A[index + 3] == 'i' && A[index + 4] == 's' && A[index + 5] == 't') {
				lastIndex = index;
				where(A, s, index + 5);
			}
		}
		if (A[index] != s.charAt(0) && A.length > index + 5) {
			where(A, s, index + 1);
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		char[] givenarray = {'a', 'm', 'a', 'r', 'i', 's', 't', 'm', 'a', 'r', 'i', 's', 't', 'v', 'h', 'e'};	
		int startOfWord = 0;
		where(givenarray, "marist", startOfWord);
		
		// Test your method
		System.out.print("The rightmost occurence of 'marist' in the given array is at index ");
		System.out.print(lastIndex);
		// Your method should return 7
		
	}
}