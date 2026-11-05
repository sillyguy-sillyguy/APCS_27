/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int v=1;
		int n;
		while(a>v){
			if(a%v==0 && v!=1 && v!=a){
				return false;
			}
			v+=1;
		}
		return true;
	}
	public static void printPrimes(int a){
		int x=2;
		while(x<=a){
			if(checkPrime(x)==true){
				System.out.println(x);
			}
			x+=1;
		}
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num = sc.nextInt();
		printPrimes(num);
		}
	}
