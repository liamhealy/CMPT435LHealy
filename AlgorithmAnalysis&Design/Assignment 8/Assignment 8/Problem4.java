public class Problem4 {
	
	
	
	
	public static boolean checksum(double[] s1, double[] s2, double x)
	{
		// complete the checksum() method to find out
		// if there exists a number from s1, and a number from s2, both s1 and s2 are sorted already,
		// such that, their sum is exactly x
		// algorithm O(n) expected
		// algorithm O(nlogn) or slower will be scored out of 10 points
		
		int i = 0;
		int i2 = s2.length - 1;
        	int n = s1.length;
        
        	while (i < n && i2 >= 0) {
        	//move left to right in s1, right to left in s2
        	
            		if(s1[i] + s2[i2] == x) {
                		return true;
            		}
            		else if(s1[i] + s2[i2] < x) {
                		i++; 
                		//move to the next element in s1
                
            		}
            		else {
            			i2--;
            			//move to the next element in s2
            	
            		}
        	}
        
        	return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your checksum() method here
		double[] testarray1 = {1, 10, 45};
		double[] testarray2 = {-8, 4, 6};
		double target1 = 16;
		double target2 = 70;
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target1 + "?");
		System.out.println(checksum(testarray1,testarray2, target1));
		// should print true
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target2 + "?");
		System.out.println(checksum(testarray1,testarray2, target2));
		// should print false
		
	}

}
