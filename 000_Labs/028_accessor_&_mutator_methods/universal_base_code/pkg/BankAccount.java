/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	double balance;
	boolean Activity;

	// -------CONSTRUCTORS-------
	public BankAccount() {
		owner = "No Owner";
		balance = 0;
	}
	public BankAccount(String o) {
		owner = o;
		balance = 0;
	}
	public BankAccount(String o, double b) {
		owner = o;
		balance = b;
	}
	// -------METHODS-------
	public boolean getActivity(){
		return Activity;
	}
	public boolean closeAccount(){
		return Activity = false;
	}
	public String getOwner(){
		return owner;
	}
	public String setOwner(String o){
		owner = o;
		return owner;
	}
	public double getBalance(){
		return balance;
	}
	public void checkBalance(){
		System.out.println("The account balance of " + owner + "'s account is " + balance);
		return;
	}
	public double setBalance(double b){
		balance = b;
		return balance;
	}
	public void displayAccountInfo(){
		System.out.println("Owner: " + owner);
		System.out.println("Balance: " + balance);
		System.out.println("Account Active: " + Activity);
		return;
	}
	public double withdraw(double w){
		if(Activity == true){
			if(w <= balance){
				balance -= w;
				System.out.println("Withdrawal of " + w + " was successful.");
				return balance;
			}
			else{
				System.out.println("Withdrawal of " + w + " was unsuccessful. Insufficient funds.");
				return balance;
			}
		}
		else{
			System.out.println("Withdrawal of " + w + " was unsuccessful. Account is closed.");
			return balance;
		}
	}
	public double deposit(double d){
		if(Activity == true){
			balance += d;
			System.out.println("Deposit of " + d + " was successful.");
			return balance;
		}
		else{
			if(Activity == false){
				System.out.println("Deposit of " + d + " was unsuccessful. Account is closed.");
				return balance;
			}
			}
			return balance;
		}
}