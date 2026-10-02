/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */
import java.util.Scanner;


public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You need to guess three numbers in a row!");
        System.out.println("It gets harder every guess!");
        System.out.println("But don't worry, you get a hint!");
        System.out.println("Good luck!");
       int rng1 = (int)(Math.random()*11.0);
       System.out.println("Level 1, 0-10");
       if(rng1>5){
            System.out.println("The number is between 5 and 10!");
       }else{
                System.out.println("The number is between 0 and 5!");
       }
       int guess1 = sc.nextInt();
       if(guess1==rng1){
            System.out.println("Good job!");
            System.out.println("Level 2, 0-100");
            int rng2 = (int)(Math.random()*101);
            if(rng2>50){
                System.out.println("The number is between 50 and 100!");
            } else{
                System.out.println("The number is between 0 and 50!");
            }
            int guess2 = sc.nextInt();
            if(rng2==guess2){
                System.out.println("Good job!");
                System.out.println("Level 3, 0-1000");
                int rng3 = (int)(Math.random()*1001);
                if(rng3>500){
                    System.out.println("The number is between 500 and 1000!");
                } else{
                    System.out.println("The number is between 0 and 500!");
                }
                int guess3 = sc.nextInt();
                if(guess3==rng3){
                    System.out.println("Congratulations!!!!!");
                    System.out.println("You beat the game!");
                } else{
                    System.out.println("The number was "+rng3+"!");
                    System.out.println("Better luck next time!");
                }
            } else{
                System.out.println("The number was "+rng2+"!");
                System.out.println("Better luck next time!");
            }
       } else {
        System.out.println("The number was "+rng1+"!");
        System.out.println("Better luck next time!");
       }
       

    }
}
