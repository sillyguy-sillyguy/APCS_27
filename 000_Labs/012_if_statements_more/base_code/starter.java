/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int x = sc.nextInt();
		System.out.print("Please input your second number: ");
		int y = sc.nextInt();
		if(x==y){
			System.out.println("Your numbers are the same!");
		}
		if(x!=y){
			System.out.println("Your numbers are different!");
		}

	}
}
