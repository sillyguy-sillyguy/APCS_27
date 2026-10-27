package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	Spiderman(){
		actor = "Unknown";
		age = 0;
		villain = "Unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	Spiderman(String a){
		actor = a;
		age = 0;
		villain = "Unknown";
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	Spiderman(int a){
		actor = "Unknown";
		age = a;
		villain = "Unknown";
	}
	// String Actor, int Age constructor! 	Villain Unknown
	Spiderman(String a, int b){
		actor = a;
		age = b;
		villain = "Unknown";
	}
	// String Actor, int Age, String Villain constructor!	
	Spiderman(String a, int b, String c){
		actor = a;
		age = b;
		villain = c;
	}	
	
	// ---------------------------------------
	getActor(){
		return actor;
	}
	setActor(String a){
		actor = a;
	}
	getAge(){
		return age;
	}
	setAge(int a){
		age = a;
	}
	getVillain(){
		return villain;
	}
	setVillain(String a){
		villain = a;
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
