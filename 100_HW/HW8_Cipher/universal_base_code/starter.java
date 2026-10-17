/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static String encode(String a){
		Cipher c = new Cipher();
		String result = c.encode(a);
		return result;
	}
	public static String keyedEncode(String a, int b){
		Cipher c = new Cipher();
		String result = c.keyedEncode(a,b);
		return result;
	}
	public static String println(String a){
		System.out.println(a);
		return a;
	}
	public static void guesskeyedEncode(String a){
		Cipher c = new Cipher();
		int b = 36;
		println("------------------------------------------------------");
		while(b>0){
			String ans = c.keyedEncode(a,b);
			System.out.println("Key: "+b+" Result: "+ans);
			System.out.println();
			b--;
		}
		println("------------------------------------------------------");
		return;

	}
	public static void main(String args[]) {
		println("Code 1");
		println(encode("6v lvp u5vuy5 y1z5 qpsqy5r"));
		println("Code 2");
		println(encode("sv8vq17r 1r q25 85rq"));
		println("Code 3");
		println(encode("q25 z5l qv wpx85s f 1r gg"));
		println("Code 4");
		println(keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz",33));
		println("Code 5");
		println(encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d"));
		println("Code 6");
		println(keyedEncode("a8 1oy 92 1kx rxdj in 4",8));
		println("Code 7");
		String ab = keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8",13);
		println(keyedEncode(ab,29));
		println("Code 8");
		println(encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw"));
		println("");
		println("Section 2 - Codes With No Key");
		println("Code 1");
		guesskeyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y");
		println("The key to Code 1 is 27");
		println("");
		println("Code 2");
		guesskeyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct");
		println("The key to Code 2 is 16");
		println("");
		println("Section 3 - User Input Encoder");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence to encode:");
		String userInput = sc.nextLine();
		System.out.println("Please enter a key to encode your sentence:");
		int userKey = sc.nextInt();
		String userGenCode = keyedEncode(userInput,userKey);
		System.out.println("Your encoded sentence is: "+userGenCode);
		println("Would you like to double encode your sentence? (y/n)");
		String clear = sc.nextLine();
		String opt = sc.nextLine();
		if(opt.equals("y")){
			System.out.println("Please enter another key to double encode your sentence:");
			int userKey2 = sc.nextInt();
			String userGenCode2 = keyedEncode(userGenCode,userKey2);
			System.out.println("Your double encoded sentence is: "+userGenCode2);
	}
	println("Section 4 - Decode Quest");
	println("Attempt to decode the following sentence: 120rwp lqnn1n r1 73vvn01 (Hint: It is double encoded & both keys are more than 10)");
	}
}
