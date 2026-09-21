/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*10);
		System.out.println("The range is from 0 to 10");
		System.out.println("The first variable is: " + x);
		System.out.println("The second variable is: " + y);
		if(x==y){
			System.out.println("The variables are equal");
		}
		if(x!=y){
			System.out.println("The variables are different");
		}
		
	}
}
