/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();
        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        // This prints out the value given without a new line   
        // This prints out the value given then a new line
        // 2 String parameters: Value, Color of text
        // 2 String parameters: Value, Color of text WITH a new line after
        // 3 String parameters: Value, Color of text, Color of background
        // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.

        // Feel free to comment out the test code above when you start your assignment
        boolean lose = false;
        int maxstrings = 1;
        String[] TXT = new String[8];
        TXT[0] = "BLACK";
        TXT[1] = "RED";
        TXT[2] = "GREEN";
        TXT[3] = "YELLOW";
        TXT[4] = "BLUE";
        TXT[5] = "PURPLE";
        TXT[6] = "CYAN";
        TXT[7] = "WHITE";
        String[] ans = new String[5];
        String pans;
        if(diff==1){
           while(lose==false){
            Colors.println("-----------------------------");
           for(int i = 0; i < Math.min(5,maxstrings); i++){
            
           int rand = (int)(Math.random()*8);
           Colors.println(TXT[rand]);
           ans[i] = TXT[rand];
            
           }
           Colors.println("-----------------------------");
            Colors.println("Memorize the phrase above!");
           delay(5);
           for(int i = 0; i <250; i++){
            Colors.println();
           }
           Colors.println("Please enter the words that you saw on separate lines!");
           for(int i = 0; i < (Math.min(5,maxstrings)); i++){
            pans = sc.nextLine();
            if(!pans.equalsIgnoreCase(ans[i])){
                Colors.println("You got it wrong! Try again!");
                Colors.print("WORDS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans[b]+" ");
                        }
                lose = true;
                break;
                    }
                }
                if(lose==false){
                Colors.println("You got it! Onto the next level!");
                }
                maxstrings++;
           }
        }
        String[] ans2 = new String[5];
        if(diff == 2){
            while(lose==false){
            Colors.println("-----------------------------");
           for(int i = 0; i < Math.min(5,maxstrings); i++){
            
           int rand = (int)(Math.random()*8);
           int rand2 = (int)(Math.random()*8);
           Colors.println(TXT[rand],TXT[rand2]);
           ans[i] = TXT[rand];
           ans2[i] = TXT[rand2];
            
           }
           Colors.println("-----------------------------");
            Colors.println("Memorize the phrase above!");
           int Q = (int)(Math.random()*2+1);
           delay(5);
           for(int i = 0; i <250; i++){
            Colors.println();
           }
           if(Q==1){
           Colors.println("Please enter the words that you saw on separate lines!");
           for(int i = 0; i < (Math.min(5,maxstrings)); i++){
            pans = sc.nextLine();
            if(!pans.equalsIgnoreCase(ans[i])){
                Colors.println("You got it wrong! Try again!");
                Colors.print("WORDS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans[b]+" ");
                        }
                Colors.println();
                Colors.print("TEXT COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans2[b]+" ");
                }
                lose = true;
                break;
                    }
                }
                if(lose==false){
                Colors.println("You got it! Onto the next level!");
                }
                maxstrings++;
           }
           if(Q == 2){
            Colors.println("Please enter the TEXT COLORS that you saw on separate lines!");
           for(int i = 0; i < (Math.min(5,maxstrings)); i++){
            pans = sc.nextLine();
            if(!pans.equalsIgnoreCase(ans2[i])){
                Colors.println("You got it wrong! Try again!");
                Colors.print("WORDS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans[b]+" ");
                        }
                    Colors.println();
                    Colors.print("TEXT COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans2[b]+" ");
                }
                lose = true;
                break;
                    }
                }
                if(lose==false){
                Colors.println("You got it! Onto the next level!");
                }
                maxstrings++;
           }
           }


        }
        String[] ans3 = new String[5];
        if(diff == 3){
            while(lose==false){
            Colors.println("-----------------------------");
           for(int i = 0; i < Math.min(5,maxstrings); i++){
            
           int rand = (int)(Math.random()*8);
           int rand2 = (int)(Math.random()*8);
           int rand3 = (int)(Math.random()*8);
           Colors.println(TXT[rand],TXT[rand2],TXT[rand3]);
           ans[i] = TXT[rand];
           ans2[i] = TXT[rand2];
           ans3[i] = TXT[rand3];
            
           }
           Colors.println("-----------------------------");
            Colors.println("Memorize the phrase above!");
           int Q = (int)(Math.random()*3+1);
           delay(5);
           for(int i = 0; i <250; i++){
            Colors.println();
           }
           if(Q==1){
           Colors.println("Please enter the words that you saw on separate lines!");
           for(int i = 0; i < (Math.min(5,maxstrings)); i++){
            pans = sc.nextLine();
            if(!pans.equalsIgnoreCase(ans[i])){
                Colors.println("You got it wrong! Try again!");
                Colors.print("WORDS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans[b]+" ");
                        }
                Colors.println();
                Colors.print("TEXT COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans2[b]+" ");
                }
                    Colors.println();
                    Colors.print("BACKGROUND COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans3[b]+" ");
                }
                lose = true;
                break;
                    }
                }
                if(lose==false){
                Colors.println("You got it! Onto the next level!");
                }
                maxstrings++;
           }
           if(Q == 2){
            Colors.println("Please enter the TEXT COLORS that you saw on separate lines!");
           for(int i = 0; i < (Math.min(5,maxstrings)); i++){
            pans = sc.nextLine();
            if(!pans.equalsIgnoreCase(ans2[i])){
                Colors.println("You got it wrong! Try again!");
                Colors.print("WORDS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans[b]+" ");
                        }
                    Colors.println();
                    Colors.print("TEXT COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans2[b]+" ");
                }
                    Colors.println();
                    Colors.print("BACKGROUND COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans3[b]+" ");
                }
                lose = true;
                break;
                    }
                }
                if(lose==false){
                Colors.println("You got it! Onto the next level!");
                }
                maxstrings++;
           }
           if(Q == 3){
            Colors.println("Please enter the BACKGROUND COLORS that you saw on separate lines!");
           for(int i = 0; i < (Math.min(5,maxstrings)); i++){
            pans = sc.nextLine();
            if(!pans.equalsIgnoreCase(ans3[i])){
                Colors.println("You got it wrong! Try again!");
                Colors.print("WORDS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans[b]+" ");
                        }
                    Colors.println();
                    Colors.print("TEXT COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans2[b]+" ");
                }
                    Colors.println();
                    Colors.print("BACKGROUND COLORS: ");
                for(int b = 0; b < maxstrings; b++){
                    Colors.print(ans3[b]+" ");
                }
                lose = true;
                break;
                    }
                }
                if(lose==false){
                Colors.println("You got it! Onto the next level!");
                }
                maxstrings++;
           }
        

        }
        if((diff != 1)&&(diff != 2)&&(diff != 3)) {
            System.out.println("Wrong number, try again.");
        }
    }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
