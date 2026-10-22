/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011,"Pam","Beesly",2250.0);
		pam.employeeToString();
		Employee jacob = new Employee(2013,"Jacob","Poole",5000);
		jacob.employeeToString();
		System.out.println("Sales went up by 900% This year! Everybody gets a raise!");
		System.out.println();
		jacob.raiseSalary(150);
		pam.raiseSalary(200);
		jim.raiseSalary(100);
		dwight.raiseSalary(100);
		michael.raiseSalary(125);
		System.out.println("Michaels new annual salary is: $"+michael.getAnnualSalary());
		System.out.println();
		System.out.println("Dwights new annual salary is: $"+dwight.getAnnualSalary());
		System.out.println();
		System.out.println("Jims new annual salary is: $"+jim.getAnnualSalary());
		System.out.println();
		System.out.println("Pams new annual salary is: $"+pam.getAnnualSalary());
		System.out.println();
		System.out.println("Pooles new annual salary is: $"+jacob.getAnnualSalary());
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		jacob.employeeToString();
	}
}
