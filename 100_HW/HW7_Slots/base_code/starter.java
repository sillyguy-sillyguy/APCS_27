/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. if three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		int money = 100;
		while(true){
			if(money==0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
		String YES = sc.nextLine();
		if(YES.equalsIgnoreCase("No")||YES.equalsIgnoreCase("N")){
			System.out.println("Sad to see you go! You still have "+money+" left. Come again soon! Thanks!");
			break;
			}
			while(!(YES.equalsIgnoreCase("Yes")||YES.equalsIgnoreCase("Y"))){
				System.out.println("That wasnt quite the correct answer. Try again.");
				System.out.println("-------------------------------------------------------------");
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
				YES = sc.nextLine();
				if(YES.equalsIgnoreCase("No")||YES.equalsIgnoreCase("N")){
			System.out.println("Sad to see you go! You still have $"+money+" left. Come again soon! Thanks!");
			break;
				}
			}
			if(YES.equalsIgnoreCase("No")||YES.equalsIgnoreCase("N")){
				break;
			}
			if(YES.equalsIgnoreCase("Yes")||YES.equalsIgnoreCase("Y")){
				System.out.print("You have $"+money+". How much would you like to wager? ");
				int wager = sc.nextInt();
				sc.nextLine();

				while(wager>money){
					System.out.print("You only have $"+money+"! Please enter a smaller number: ");
					wager = sc.nextInt();
					sc.nextLine();
				}
				money -= wager;
				System.out.println();
				int slot1 = (int)(Math.random()*10+1);
				int slot2 = (int)(Math.random()*10+1);
				int slot3 = (int)(Math.random()*10+1);
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("-----------------------");
				System.out.println("| "+slot1+" | "+slot2+" | "+slot3+" |");
				System.out.println("-----------------------");
				if(slot1==slot2||slot1==slot3||slot2==slot3){
					System.out.println("You won! You're wager has now been doubled!");
					money += wager*2;
					System.out.println("You now have $"+money+".");
					System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
				} else{
					if(slot1==slot2&&slot1==slot3){
						System.out.println("JACKPOT!!! Your wager has been tripled!");
						money += wager*3;
						System.out.println("You now have $"+money+".");
						System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
					} else{
						System.out.println("Didn't win this time, better luck next time!");
						System.out.println("You now have $"+money+".");
						System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
					}
				}
				
			}
		}
	}
}
