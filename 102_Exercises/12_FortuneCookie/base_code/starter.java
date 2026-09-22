/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println();
		System.out.print("Password: ");
		String pass = sc.nextLine();
		if(pass.equals("Nullscape is real")){
			System.out.println("Password correct!");
			System.out.println();
			System.out.println("...");
			System.out.println("How long have you been guessing for?");
			System.out.println("Also Mr.Poole, if you looked at the code, you shouldve done it the correct way.");
		
		
		}
		if(!pass.equals("Nullscape is real")){
			System.out.println("Password Incorrect.");
			System.out.println();
			System.out.println();
			int forture = (int)(Math.random()*20);
			if(forture == 1){
				System.out.println("Knock on your walls, one might be hollow :)");
			}
			if(forture == 0){
				System.out.println("Life will get better, soon enough.");
			}
			if(forture == 2){
				System.out.println("The success will be amazing");
			}
			if(forture == 3){
				System.out.println("Find Your Flame");
			}
			if(forture == 4){
				System.out.println("It Doesn't End Here");
			}
			if(forture == 5){
				System.out.println("Is it real?");
			}
			if(forture == 6){
				System.out.println("Youtube has answers");
				System.out.println("Search for captilization");
				System.out.println("A title will surely come to mind");
				System.out.println("What was it made for?");
				System.out.println("Ask yourself, is it real?");
			}
			if(forture == 7){
				System.out.println("Success is closer than you think.");
			}
			if(forture == 8){
				System.out.println("You shine bright, help others do the same.");
			}
			if(forture == 9){
				System.out.println("You should pull your money outta those stocks or something idk.");

			}
			if(forture==10){
				System.out.println("Your world will brighten.");
			}
			if(forture==11){
				System.out.println("gg bro ur cooked");
			}
			if(forture==12){
				System.out.println("Chicken.");
			}
			if(forture==13){
				System.out.println("Maybe do ur homework instead.");
			}
			if(forture==14){
				System.out.println("Something is coming in 3 days.");
			}
			if(forture==15){
				System.out.println("A bird spreads their wings, do the same with your love.");
			}
			if(forture==16){
				System.out.println("People will understand you one day.");
			}
			if(forture==17){
				System.out.println("We were right there🥀");
			}
			if(forture==18){
				System.out.println("There is light at the end of the tunnel. (no its not a truck)");
				
			}
			if(forture==19){
				System.out.println("Your day will brighten someday.");
			}
		}
		
		
	}
}
