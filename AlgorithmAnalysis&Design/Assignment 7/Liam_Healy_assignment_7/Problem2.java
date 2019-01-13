import java.util.Arrays;

public class Problem2 {



	public static void recursivearray(int i, int A[], int B[])
	{
		// Complete this method to create a new array B[]
		// B[0] = A[0]
		// B[1] = A[0] * A[1]
		// B[2] = A[0] * A[1] * A[2]
		// ...
		// B[i] = A[0] * A[1] *...* A[i]
		// Feel free to add more parameters to this method
		// A recursive method is expected
		// A non-recursive method will be scored out of 10 points
		if (i == 0) {
			B[0] = A[0];
			i++;
			recursivearray(i, A, B);
		}
		if (i == A.length) {
			return;
		}
		if (i != 0) {
			B[i] = B[i - 1] * A[i];
			i++;
			recursivearray(i, A, B);
		}
		
	}








	public static void main(String[] args) {
		// TODO Auto-generated method
		int[] givenarray = {1, 2, 3, 4, 5, 6};	
		int[] outputarray = new int[givenarray.length];
		int i = 0;
		
		// Add statements here to invoke the recursivearray method
		recursivearray(i, givenarray, outputarray);
		
		// Test your method
		System.out.println("B "+ Arrays.toString(outputarray));
		// Your method should return {1, 2, 6, 24, 120, 720}
		
		
		
	}
}