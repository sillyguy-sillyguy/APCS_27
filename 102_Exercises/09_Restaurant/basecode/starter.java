/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================================");
		System.out.println("	   WELCOME RESTAURANT OWNER!		   ");
		System.out.println("===============================================");
		System.out.println();
		System.out.println();
		System.out.println("What's your restaurant name?");
		String RSTName = sc.nextLine();
		System.out.println();
		System.out.println("What is your name?");
		String IRLName = sc.nextLine();
		System.out.println("Great to see you, " +IRLName+"!"+" Lets set up a menu for "+RSTName+"!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();
		System.out.println("--- Item #1 ---");
		System.out.print("Item Name: ");
		String I1Name = sc.nextLine();
		System.out.print("Price of "+I1Name+" ($): ");
		double I1price = sc.nextDouble();
		System.out.println("How many "+I1Name+" would you like?");
		double I1quant = sc.nextDouble();
		System.out.println("Added "+I1quant+"x "+I1Name+" to your order! ($"+(I1price*I1quant)+")");
		System.out.println();
		System.out.println("--- Item #2 ---");
		Scanner bc = new Scanner(System.in);
		//I have made this new scanner because sc would skip over "String I2Name = sc.nextLine();" if used
		System.out.print("Item Name: ");
		String I2Name = bc.nextLine();
		System.out.print("Price of "+I2Name+" ($):");
		double I2price = bc.nextDouble();
		System.out.println("How many "+I2Name+" would you like?")
		double I2quant = bc.nextDouble();
		

	}
}
