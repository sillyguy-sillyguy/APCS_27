/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] x = new int[2];
		int[] y = new int[2];
		int[] arr = new int[1000];
		int[] arr2 = new int[1000];
		x[0] = 0;
		y[0] = 3;
		while(x[0] < 1000){
			y[0] = y[0]+3;
			arr[x[0]] = y[0];
			System.out.print(arr[x[0]]+", ");
			x[0]++;
		}
		System.out.println("---------------------");
		x[1]=0;
		y[1]=1000;
		while(x[1]<1000){
			y[1]=y[1]-1;
			arr2[x[1]]=y[1];
			System.out.print(arr2[x[1]]+", ");
			x[1]++;
		}
	}
}
