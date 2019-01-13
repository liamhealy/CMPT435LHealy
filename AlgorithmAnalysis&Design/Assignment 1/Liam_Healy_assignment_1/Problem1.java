//Liam Healy
//09-04-2018
//CMPT 435_111
public class Problem1 {
	


	public static void rearrange(int[] A)
	{
		/*
		Input: an array, A, of n sorted integers (positive, negative, or 0) that 
		A[0] <= A[1] <= A[2] <=…A[n-2] <= A[n-1]
	
		Output: re-arrange elements in A such that: 
		Element at even position (i.e., A[0], A[2]) are less than or equal to both of its neighbors
		Element at odd position (i.e., A[1], A[3]) are greater than or equal to both of its neighbors
	
		A[0] <= A[1] >= A[2] <= A[3] >= A[4] <= A[5]…
	
		Design an algorithm that solves this problem.
		 */
		
		//Complete this method
		
		
		int n = A.length;
		
		//initial begins at first element in array
		int initial = A[0];
		
		//outer loop and inner loop represent neighbor elements
		for(int x = 0; x < n; x = x + 2) {
			
			for(int y = 1; y < n; y = y + 2) {
				
				//Compare the elements that neighbor each other
				if(A[x] > A[y]) {
					
					//Swap the elements to ensure that even positions
					//are <= odd positions
					initial = A[x];
					A[x] = A[y];
					A[y] = initial;
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your rearrange method
		
		int[] A = {13, 20, 45, 69, 78, 100, 127, 155};
		
		System.out.println("Before:");
		
		for(int i=0; i < A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		rearrange(A);
		
		System.out.println("\nAfter:");
		
		for(int i=0; i < A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		
		
	}



}
