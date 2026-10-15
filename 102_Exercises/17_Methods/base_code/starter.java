/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void printer(String b){
		System.out.println(b);
		return;
	}
	public static boolean isLeapYear(int a){
		int hardboiledegg = a%4;
		int sunnysideupegg = a%100;
		int omeletteegg = a%400;
		if((hardboiledegg==0)&&((sunnysideupegg!=0)||(omeletteegg==0))){
			return true;
		} else{
			return false;
		}
	}
	public static int getDigitSum(int c){
		int s = c%10;
		int s10 = (c/10)%10;
		int s100 = (c/100)%10;
		int s1000 = (c/1000)%10;
		int s10000 = (c/10000);
		c = s+s10+s100+s1000+s10000;
		return c;
	}

	public static boolean printIfConsecutive(int d, int e, int f){
		d = d+1;
		f = f-1;
		if((d==e)&&(e==f)){
			return true;
		} else{
			return false;
		}
		
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		if(printIfConsecutive(num1, num2, num3)==true){
			printer("The numbers are consecutive!!!");
		} else{
			printer("The numbers are not consecutive!!!");
		}
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
