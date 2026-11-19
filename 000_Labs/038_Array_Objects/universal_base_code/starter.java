/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wizards = new Wizard[100];
		Warrior[] warriors = new Warrior[100];
		for(int i = 0; i < 100; i++){
			wizards[i] = new Wizard();
			warriors[i] = new Warrior();
		}
		int deadWizards = 0;
		int deadWarriors = 0;
		int wizardIndex = 0;
		int warriorIndex = 0;
		while(warriorIndex < 100 && wizardIndex < 100){	
			if(!wizards[wizardIndex].isDead() && !warriors[warriorIndex].isDead()){
				wizards[wizardIndex].attack(warriors[warriorIndex]);
				}
			if(warriors[warriorIndex].isDead()){
				deadWarriors++;
				warriorIndex++;
				if(warriorIndex>=100){
					break;
				}
				warriors[warriorIndex].attack(wizards[wizardIndex]);
			}
				warriors[warriorIndex].attack(wizards[wizardIndex]);
				if(wizards[wizardIndex].isDead()){
				deadWizards++;
				wizardIndex++;
				if(wizardIndex>=100){
					break;
				}
				wizards[wizardIndex].attack(warriors[warriorIndex]);
			}
		}
		int remainingWizards = 0;
		int remainingWarriors = 0;
		for(int i = 0; i < 100; i++){
			if(!wizards[i].isDead()){
				remainingWizards++;
			}
			if(!warriors[i].isDead()){
				remainingWarriors++;
			}
		}
		if(deadWizards == 100){
			System.out.println("Warriors won with " + remainingWarriors + " remaining.");
		}
		else{
			System.out.println("Wizards won with " + remainingWizards + " remaining.");
		}
	}
}
