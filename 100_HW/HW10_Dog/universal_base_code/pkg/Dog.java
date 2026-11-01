package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;

	public Dog() {
		name = "";
		age = 1;
		breed = "dog";
	}
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String a, int b){
		name= a;
		age = b;
		breed = "dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog";
	}


	public void setName(String a){
		name = a;
		return;
	}
	public void setAge(int a){
		age = a;
		return;
	}
	public void setBreed(String a){
		breed = a;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int x = rand.nextInt(2);
		if(x == 0){
			return true;
		} else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name+" says woof!");
		return;
	}
}
