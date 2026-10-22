/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	double moners;
	String name;
	boolean isActive;
	int accountNumber;
	static int NextAccountNumber = (int)(Math.random()*951+50);



	// -------CONSTRUCTORS-------
	public BankAccount(){
	accountNumber = NextAccountNumber;
	NextAccountNumber = NextAccountNumber + 1;
	isActive = true;
	name = "unknown";
	moners = 0.0;
	}
	public BankAccount(String a){
		accountNumber = NextAccountNumber;
		NextAccountNumber = NextAccountNumber + 1;
		name = a;
		isActive = true;
		moners = 0.0;
	} public BankAccount(String a,double b){
		accountNumber = NextAccountNumber;
		NextAccountNumber = NextAccountNumber + 1;
		name = a;
		isActive = true;
		moners = b;
	}
	

	// -------METHODS-------
	public String AccounttoString(){
		System.out.println("------------------------------");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Name: " + name);
		System.out.println("Account Balance: $" + moners);
		System.out.println("Account Active: " + isActive);
		System.out.println("------------------------------");
		return "";
	}
	public double InitialDeposit(int a){
		moners = a;
		return moners;
	}
	public double Deposit(int a){
		moners = moners + a;
		return moners;
	}
}