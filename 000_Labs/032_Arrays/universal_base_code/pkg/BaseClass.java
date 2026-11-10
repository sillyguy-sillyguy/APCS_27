/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int ind;
	int[] x = new int[10];

	public BaseClass() {
		ind = 1;
		x[0] = 9;
		x[1] = 8;
		x[2] = 7;
		x[3] = 6;
		x[4] = 5;
		x[5] = 4;
		x[6] = 3;
		x[7] = 2;
		x[8] = 1;
		x[9] = 0;
	}

	public void printAllX(){
		while(ind < 10){
			System.out.println(x[ind]);
			ind++;
		}
	}
}

