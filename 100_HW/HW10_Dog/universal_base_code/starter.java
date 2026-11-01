/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		Dog silly = new Dog(sc.nextLine());
		System.out.println("What age should "+silly.getName()+" be?");
		silly.setAge(sc.nextInt());
		Dog egg = new Dog("egg", "golden");
		boolean sillysleep = silly.isSleeping();
		boolean eggsleep = egg.isSleeping();
		String sillyname = silly.getName();
		String eggname = egg.getName();
		if(sillysleep == true){
			System.out.println(sillyname+" is sleeping! Don't wake "+sillyname+" up!");
		} else{
			silly.bark();
		}
		if((eggsleep == true)&&(sillysleep == true)){
			System.out.println(eggname+" is sleeping too!");
		} else{
			if((eggsleep == true)&&(sillysleep == false)){
				System.out.println(eggname+" hears "+sillyname+"!");
				egg.bark();
			} else if((eggsleep == false)&&(sillysleep == true)){
				egg.bark();
				System.out.println(sillyname+" hears "+eggname+"!");
				silly.bark();
			} else{
				egg.bark();
			}
		}




	}
}
