/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount joe = new BankAccount("Joe");
		joe.InitialDeposit(1000);
		joe.AccounttoString();
		BankAccount bob = new BankAccount();
		bob.InitialDeposit(500);
		bob.AccounttoString();
		BankAccount poole = new BankAccount("Poole");
		poole.InitialDeposit(10000);
		poole.AccounttoString();
		BankAccount sam = new BankAccount("Sam", 123.54);
		sam.AccounttoString();

		
	}
}
