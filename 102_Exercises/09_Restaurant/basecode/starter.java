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
		double I1tot = (I1price*I1quant);
		System.out.println("Added "+I1quant+"x "+I1Name+" to your order! ($"+I1tot+")");
		System.out.println();
		System.out.println("--- Item #2 ---");
		Scanner bc = new Scanner(System.in);
		//I have made this new scanner because sc would skip over "String I2Name = sc.nextLine();" if used
		System.out.print("Item Name: ");
		String I2Name = bc.nextLine();
		System.out.print("Price of "+I2Name+" ($):");
		double I2price = bc.nextDouble();
		System.out.println("How many "+I2Name+" would you like?");
		double I2quant = bc.nextDouble();
		double I2tot = (I2price*I2quant);
		System.out.println("Added "+I2quant+"x "+I2Name+" to your order! ($"+I2tot+")");
		System.out.println();
		System.out.println("--- Item #3 ---");
		Scanner dc = new Scanner(System.in);
		//Created because of the same problem as last time
		System.out.print("Item Name: ");
		String I3Name = dc.nextLine();
		System.out.print("Price of "+I3Name+" ($):");
		double I3price = dc.nextDouble();
		System.out.println("How many "+I3Name+" would you like?");
		double I3quant = dc.nextDouble();
		double I3tot = (I3price*I3quant);
		System.out.println("Added "+I3quant+"x "+I3Name+" to your order! ($"+I3tot+")");
		System.out.print("Nice choices! What tip percentage would you like to leave?(ex: 15, 18, 20): ");
		double Tip = dc.nextDouble();
		System.out.println();
		System.out.println("============================================");
		System.out.println("	    "+RSTName+ " - Menu For Today");
		System.out.println("============================================");
		System.out.println("Owner: "+IRLName);
		System.out.println("--------------------------------------------");
		System.out.println("Item		Qty 	Price");
		System.out.println("--------------------------------------------");
		System.out.println(I1Name+" 		"+I1quant+"	  "+I1tot);
		System.out.println(I2Name+" 		"+I2quant+"	  "+I2tot);
		System.out.println(I3Name+" 		"+I3quant+"	  "+I3tot);
		double Totalnotip = (I3tot+I2tot+I1tot);
		System.out.println("--------------------------------------------");
		double Tax = 9.75;
		double Taxp = Tax/100;
		double TotalWtax = (Totalnotip*Taxp);
		double Tipx = Tip/100;
		double Totaltip = (Totalnotip*Tipx);
		System.out.println("Subtotal:			"+Totalnotip);
		System.out.println("Tax ("+Tax+"%):			"+TotalWtax);
		System.out.println("Tip:				"+Tip);
		System.out.println("Tip Amount:			"+Totaltip);
		double TRUETOTAL = (TotalWtax+Totaltip+Totalnotip);
		System.out.println("============================================");
		System.out.println("TOTAL:			$"+TRUETOTAL);
		System.out.println("============================================");
		System.out.println();
		System.out.println("Thanks for eating at "+RSTName+"!");
		System.out.println("Come back soon -- we'll always have a byte for you!");
		




	}
}
