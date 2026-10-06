/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int RNG1K = (int)(Math.random()*1001);
		System.out.println("Welcome to the guessing game!");
		while(true){
			System.out.print("Please guess a number:");
			int guess = sc.nextInt();
			if(RNG1K>guess){
				System.out.println("The number is higher.");
			}
			if(RNG1K<guess){
				System.out.println("The number is lower.");
			}
			if(RNG1K==guess){
				System.out.println("You got the number!");
				break;
			}
		}



		
	}
}
