import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Problem1 {


		
			   
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("AccessLog.txt");
		Scanner sc = new Scanner(file);
		String gIP = "66.249.65.12";
		//Count the number of times "66.249.65.12" occurs in the AccessLog
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		//create new hashmap
		hm.put(gIP, 0);
		
		while (sc.hasNextLine()) //Read AccessLog line by line
		{
			String[] parts = sc.nextLine().split("\\s+");
			//Read a line from the AccessLog, and split the line by space or tab, and save the results into array parts
			String key = parts[0];
			//parts[0] represents the IP address in the current line
			//Complete the method from here 
			//Count the number of times the given IP gIP occurs in AccessLog.txt
			//Your method must use hashmap
			if(hm.containsKey(key)){
			//Compare the key to each IP in AccessLog.txt
				hm.put(gIP, hm.get(gIP) + 1);
				//Increment the count once per occurrence
			}
		}
		 
		System.out.println(gIP + "occurs " + hm.get(gIP));
		//Output should be 32

	}

}