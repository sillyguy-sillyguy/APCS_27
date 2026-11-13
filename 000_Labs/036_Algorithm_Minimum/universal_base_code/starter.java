/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int egg = (int)(Math.random() * 150+51);
		int[] arr = new int[egg];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random() * 100)+1);
		}
		int min = arr[0];
		int max = arr[0];
		//minimum
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		//maximum
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);


		
	}
}
