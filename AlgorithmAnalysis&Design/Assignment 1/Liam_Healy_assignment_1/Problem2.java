//Liam Healy
//09-04-2018
//CMPT 435_111
public class Problem2 {

	
	
	public static boolean majority(int[] A)
	{
		/*
		Input: an array A of n integers (positive, negative, or 0), elements sorted in ascending order.
		Output: if there exists a majority element.
		An element is a majority if it appears more than n/2 times. For example, if the input list is: 
		{0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7}
		The output should be true, as 0 appears 6 times (>n/2 = 11/2 times).
		However, if the input list is:
		{0, 0, 0, 1, 1, 2, 3, 10, 10}
		The majority element does not exist.
		Design an algorithm that solves this problem.
		*/
		
		// Complete this method
		
		//The absolute maximum majority
		int maximum = 0;
		
		int n = A.length;
		
		for(int i = 0; i < n; i++) {
			
			//currentCount is used to test each value within the array
			int currentCount = 0;
			
			for(int x = 0; x < n; x++) {
				
				//Compares each value in the array with every other value
				if(A[i] == A[x]) {
					//Increment the current value
					currentCount++;
				}
				
				//Test currentCount to see if the majority was found yet
				if(currentCount > n / 2) {
					//Set the value of maximum to the current majority
					maximum = currentCount;
				}
			}
			if(maximum > n / 2) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your majority method
		
		int[] testarray1 = {0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7};
		
		int[] testarray2 = {0, 0, 0, 1, 1, 2, 3, 10, 10};
		
		
		System.out.println("Does there exist a majoirty element in testarray1? "+ majority(testarray1));
		System.out.println("Does there exist a majoirty element in testarray2? "+ majority(testarray2));
		
	}

}
