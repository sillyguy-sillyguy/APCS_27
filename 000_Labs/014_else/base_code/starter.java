/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int RNG1K = (int)(Math.random()*1000+1);
		System.out.print("Pick a number between 1 - 1000: ");
		int ans = sc.nextInt();
		if(ans==RNG1K){
			System.out.println("No way! You got it! Good pick!");
		} else{
			System.out.println("Your number wasn't the random number. The number was "+RNG1K+".");
		}
	}
}
