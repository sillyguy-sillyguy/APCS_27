/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String dd = sc.nextLine();
		if(dd.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		if(dd.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		if(dd.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}else{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely");
		int sp = 20;
		System.out.println();
		System.out.print("Strength (1-10): ");
		int strgh = sc.nextInt();
		if(strgh>10){
			System.out.println("Please input a smaller number: ");
			System.out.print("Strength (1-10): ");
			strgh = sc.nextInt();
		}
		sp = Math.max(0,sp - strgh);
		System.out.println("You have "+sp+" left to spend.");
		System.out.print("Dexterity (1-10): ");
		int dext = sc.nextInt();
		if(dext>10){
			System.out.println("Please input a smaller number: ");
			System.out.print("Dexterity (1-10): ");
			dext = sc.nextInt();
		}
		sp = Math.max(0,sp - dext);
		System.out.println("You have "+sp+" left to spend.");
		System.out.print("Intelligence (1-10): ");
		int intel = sc.nextInt();
		if(intel>10){
			System.out.println("Please input a smaller number: ");
			System.out.print("Intelligence (1-10): ");
			intel = sc.nextInt();
		}
		sp = Math.max(0,sp - intel);
		System.out.println("You have "+sp+" left to spend.");
	}
}
