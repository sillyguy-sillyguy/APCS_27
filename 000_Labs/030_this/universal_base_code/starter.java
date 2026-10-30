/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int match = 0;
		int rage = (int)(Math.random()*100+1);
		PooleDwarf test = new PooleDwarf();
		PooleDwarf PD1 = new PooleDwarf(randName(),rage);
		PooleDwarf PD2 = new PooleDwarf(randName(),rage);
		PooleDwarf PD3 = new PooleDwarf(randName(),rage);
		PooleDwarf PD4 = new PooleDwarf(randName(),rage);
		PooleDwarf PD5 = new PooleDwarf(randName(),rage);
		PooleDwarf PD6 = new PooleDwarf(randName(),rage);
		PooleDwarf PD7 = new PooleDwarf(randName(),rage);
		if(PD1.isSameName(PD2.getName())){
			match = match+1;
		}
		if(PD1.isSameName(PD3.getName())){
			match = match+1;
		}
		if(PD1.isSameName(PD4.getName())){
			match = match+1;
		}
		if(PD1.isSameName(PD5.getName())){
			match = match+1;
		}
		if(PD1.isSameName(PD6.getName())){
			match = match+1;
		}
		if(PD1.isSameName(PD7.getName())){
			match = match+1;
		}
		System.out.println(PD1.getName()+" was the name with "+match+" matches!");
		
	}
}
