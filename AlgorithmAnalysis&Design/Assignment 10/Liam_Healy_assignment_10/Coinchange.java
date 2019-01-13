import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Coinchange {

	public static int greedycoinchange(int givenvalue, int[] givencoins)
	{
		
		// Complete the code here to make change of givenvalue using coins in the array givencoins
		// Minimize the number of coins used
		// Input: Coin denominations in array givencoins are already sorted in descending order
		// Output: The number of coins used to make change of givenvalue		
		int a = 0, b = 0, c = 0, d = 0;
		int currentCoin = 0;
		int i = givenvalue;
		
		while(i >= givencoins[currentCoin]) {
			i = i - givencoins[currentCoin];
			a++;
		}
		currentCoin++;
		while(i >= givencoins[currentCoin]) {
			i = i - givencoins[currentCoin];
			b++;
		}
		currentCoin++;
		while(i >= givencoins[currentCoin]) {
			i = i - givencoins[currentCoin];
			c++;
		}
		currentCoin++;
		while(i >= givencoins[currentCoin]) {
			i = i - givencoins[currentCoin];
			d++;
		}
		
		return a + b + c + d;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0; // n cents
		
		Scanner reader = new Scanner(System.in);  
		
		System.out.println("Please enter the value you want to make change: ");
		
		n = reader.nextInt();
		
		int[] coins = {25, 10, 5, 1};
		
		
		System.out.println("used "+ greedycoinchange(n, coins)+" coins for "+ n + " cents");
		
		
		
	}

}
