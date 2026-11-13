/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*10+1);
		}
		int targetnum = (int)(Math.random()*10+1);
		int duplicates = 0;
		System.out.println("The random number to look for is: " + targetnum);
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == targetnum){
				duplicates++;
				System.out.println("Duplicate found at index: " + i);
			}
		}
		System.out.println("Total number of duplicates for " + targetnum + " is: " + duplicates);
		System.out.println("------------------------------------------------------");
		System.out.println("Looking for 2 in a row");
		int IR2 = 0;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				IR2 = arr[i];
				System.out.println("2 in a row found at indexes " + i + " and " + (i+1)+". The number is: " + IR2);
			}
		}
	}
}
