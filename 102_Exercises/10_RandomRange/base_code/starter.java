/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int Min = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int Max = sc.nextInt();
		int output1 = (int)(Math.random()*(Max-Min)+Min);
		int output2 = (int)(Math.random()*(Max-Min)+Min);
		int output3 = (int)(Math.random()*(Max-Min)+Min);
		int output4 = (int)(Math.random()*(Max-Min)+Min);
		int output5 = (int)(Math.random()*(Max-Min)+Min);
		System.out.println();
		System.out.println();
		System.out.println("Your range is "+Min+"-"+Max);
		System.out.println("here are 5 numbers generated in that range.");
		System.out.println(output1+", "+output2+", "+output3+", "+output4+", "+output5);
	}
}
