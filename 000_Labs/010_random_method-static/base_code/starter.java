/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random()*10);
		System.out.println("A number between 0-9: "+x);
		int y = (int)(Math.random()*11);
		System.out.println("A number between 0-10: "+y);
		double z = (Math.random()+2.5);
		System.out.println("A number between 2.5-3.5: "+z);
		double egg = (Math.random()*575+14);
		System.out.println("A number between 14-589: "+egg);
	}
}
