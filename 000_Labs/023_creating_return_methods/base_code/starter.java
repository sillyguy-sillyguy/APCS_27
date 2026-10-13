/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void printer(String arp){
		System.out.println(arp);
		return;
	}
	public static int pow(int a, int b){
		int c = a;
		int d = a;
		while(b>1){
			c = c*d;
			b = b-1;
		}
		return c;

	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		printer("What is your base number?");
		int x = sc.nextInt();
		printer("What is your exponent number?");
		int y = sc.nextInt();
		int z = pow(x,y);
		printer("Your answer is "+ z);
		
	}
}
