/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman unknown = new Spiderman();
		unknown.setActor("Poole");
		unknown.setAge(29);
		unknown.setVillain("Mysterio");
		Spiderman tobey = new Spiderman("Tobey Maguire",48);
		tobey.setVillain("Green Goblin");
		Spiderman andrew = new Spiderman("Andrew Garfield", "Electro");
		andrew.setAge(40);
		Spiderman tom = new Spiderman(27, "Vulture");
		tom.setActor("Tom Holland");

		
	}
}
