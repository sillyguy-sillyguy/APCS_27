/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void print(String a){
		System.out.print(a);
		return;
	}
	public static void println(String a){
		System.out.println(a);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		println("Enter your pet peeve.");
		String ans = sc.nextLine();
		println("did you just say \""+ans+"\" is your pet peeve? \n\tWow how dare you. \\\\ Get out of here!");


		
	}
}
