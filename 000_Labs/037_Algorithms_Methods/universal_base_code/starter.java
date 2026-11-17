/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static double getArrayAverage(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return(double)sum / arr.length;
	}
	public static int getArrayMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		toStringArray(arr);
		System.out.println("The average of "+arr.length+" random numbers is: " + getArrayAverage(arr));
		System.out.println("The maximum of "+arr.length+" random numbers is: " + getArrayMax(arr));
		System.out.println("The minimum of "+arr.length+" random numbers is: " + getArrayMin(arr));

		
	}
}
