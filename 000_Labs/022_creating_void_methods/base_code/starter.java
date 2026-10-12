/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString(String a){
		 System.out.println(a);
		return;
	}
	public static void CombinedtoString(String b, String c){
		System.out.println(b+" "+c);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		toString("Write a sentence!");
		String egg1 = sc.nextLine();
		toString("Write a sentence!");
		String egg2 = sc.nextLine();
		toString("This is using the methods!");
		toString(egg1);
		CombinedtoString(egg1,egg2);


		
	}
}
