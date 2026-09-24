/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with three hints!");
		System.out.println();
		System.out.println();
		int RNG = (int)(Math.random()*3);
		if(RNG==0){
			System.out.println("It is a roblox game!");
				String answer = sc.nextLine();
			if(answer.equals("Nullscape")){
				System.out.println("You got it! Woo!");
			} else{
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println("It has the item Subspace Tripmine as its thumbnail");
				answer = sc.nextLine();
				if(answer.equals("Nullscape")){
					System.out.println("You got it! Woo!");
				} else{
					System.out.println("You sadly didnt get it, here's the last hint!");
					System.out.println("The game is about collecting gifts in a void");
					answer = sc.nextLine();
					if(answer.equals("Nullscape")){
						System.out.println("You got it! Woo!");
					} else{
						System.out.println("The answer was Nullscape, better luck next time!");
					}

				}
			}
		}
		if(RNG==1){
			System.out.println("It is a class!");
				String answer = sc.nextLine();
				if(answer.equals("AP Computer Science")){
				System.out.println("You got it! Woo!");
			} else{
				System.out.println("You sadly didnt get it, here's another hint!");
				System.out.println("The class is an elective!");
				answer = sc.nextLine();
				if(answer.equals("AP Computer Science")){
					System.out.println("You got it! Woo!");
				} else{
					System.out.println("You sadly didnt get it, here's the last hint!");
					System.out.println("The class is about coding!");
					answer=sc.nextLine();
					if(answer.equals("AP Computer Science")){
						System.out.println("You got it! Woo!");
					} else{
						System.out.println("The answer was AP Computer Science, better luck next time!");
					}
				}
			}
		}
		if(RNG==2){
			System.out.println("It is a lake!");
				String answer = sc.nextLine();
				if(answer.equals("Lake Chargoggagoggmanchauggagoggchaubunagungamaugg")){
					System.out.println("You got it! Woo!");
				} else{
					System.out.println("You sadly didnt get it, here's another hint!");
					System.out.println("The name is hard to pronounce!");
					answer = sc.nextLine();
						if(answer.equals("Lake Chargoggagoggmanchauggagoggchaubunagungamaugg")){
						System.out.println("You got it! Woo!");
					} else{
						System.out.println("You sadly didnt get it, here's the last hint!");
						System.out.println("It has the longest lake name in the world!");
						answer=sc.nextLine();
							if(answer.equals("Lake Chargoggagoggmanchauggagoggchaubunagungamaugg")){
							System.out.println("You got it! Woo!");
						} else{
							System.out.println("The answer was Lake Chargoggagoggmanchauggagoggchaubunagungamaugg, better luck next time!");
							}
						}
					}
			}
		

	}
}
