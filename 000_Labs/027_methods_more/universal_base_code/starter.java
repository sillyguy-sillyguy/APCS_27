/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Silly ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int choice = sc.nextInt();
		if(choice == 1){
			BankAccount person = new BankAccount();
			person.AccounttoString();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String answer = sc.next();
			if(answer.equals("yes")){
				person.checkBalance();
				System.out.println("Thank you for coming the Silly ATM!");
			} else { if(answer.equals("no")){
				System.out.println("Thank you for coming the Silly ATM!");
		} else {
			System.out.println("You dont like to listen to instructions :P");
			System.out.println("Thank you for coming the Silly ATM!");
		}
		}
		}else 
			if(choice == 2){
				System.out.println("What is the name of the owner of this bank account?");
				String name = sc.next();
				BankAccount person = new BankAccount(name);
				person.AccounttoString();
				System.out.println("Would you like to check your balance of this account? (yes/no)");
				String answer = sc.next();
				if(answer.equals("yes")){
					person.checkBalance();
					System.out.println("Thank you for coming the Silly ATM!");
			} 		else { if(answer.equals("no")){
						System.out.println("Thank you for coming the Silly ATM!");
					} else {
						System.out.println("You dont like to listen to instructions :P");
					System.out.println("Thank you for coming the Silly ATM!");
					}
			} 
				}else 
				if(choice == 3){
					System.out.println("What is the name of the owner of this bank account?");
					String name = sc.next();
					System.out.println("How much are you initially depositing into this account?");
					double deposit = sc.nextDouble();
					BankAccount person = new BankAccount(name,deposit);
					person.AccounttoString();
					System.out.println("Would you like to check your balance of this account? (yes/no)");
					String answer = sc.next();
					if(answer.equals("yes")){
						person.checkBalance();
						System.out.println("Thank you for coming the Silly ATM!");
				} 		else {
						if(answer.equals("no")){
							System.out.println("Thank you for coming the Silly ATM!");
						} else {
							System.out.println("You dont like to listen to instructions :P");
						System.out.println("Thank you for coming the Silly ATM!");
						}
				}
				}else{
					System.out.println("Account unsuccessfully created!");
				}
				
	}
}