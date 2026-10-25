/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
class starter {
    public static String RPSCPU(){
        int random = (int)(Math.random()*3);
        if(random == 0){
            return "Rock";
    } else if(random == 1){
            return "Paper";
    } else {
            return "Scissors";
    }
    }
    public static boolean AccInput(String a){
        if(a.equalsIgnoreCase("rock")||a.equalsIgnoreCase("paper")||a.equalsIgnoreCase("scissors")){
            return true;
        } else {
            return false;
        }
    }  
     public static void println(String a){
        System.out.println(a);
        return;
     }
     public static void print(String a){
        System.out.print(a);
        return;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = new String("yes");
        while(!ans.equalsIgnoreCase("done")){
             println("Would you like to play the computer? (yes/no/done)");
            ans = sc.nextLine();
            if(ans.equalsIgnoreCase("yes")){
                println("-----------------------------------------");
                println("Please enter rock/paper/scissors");
                String player = sc.nextLine();
                boolean valid = AccInput(player);
                while(valid == false){
                    println("Invalid input, please enter rock/paper/scissors");
                    player = sc.nextLine();
                    valid = AccInput(player);
                }
                String cpuChoice = RPSCPU();
                if(player.equalsIgnoreCase(cpuChoice)){
                    println("You tied!");
                } else if(player.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("scissors")){
                    println("You won!!!");
                } else if(player.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("rock")){
                    println("You won!!!");
                } else if(player.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("paper")){
                    println("You won!!!");
                } else {
                    println("You lost! :(");
                }
                println("------------------------------------------");
            } else if(ans.equalsIgnoreCase("no")){
                println("How many times would you like the computer to play itself?");
                int times = sc.nextInt();
                int P1wins = 0;
                int P2wins = 0;
                int ties = 0;
                while(times > 0){
                    String C1 = RPSCPU();
                    String C2 = RPSCPU();
                    times = times - 1;
                    if(C1.equalsIgnoreCase(C2)){
                        ties = ties + 1;
                    } else if(C1.equalsIgnoreCase("rock") && C2.equalsIgnoreCase("scissors")){
                        P1wins = P1wins + 1;
                    } else if(C1.equalsIgnoreCase("paper") && C2.equalsIgnoreCase("rock")){
                        P1wins = P1wins + 1;
                    } else if(C1.equalsIgnoreCase("scissors") && C2.equalsIgnoreCase("paper")){
                        P1wins = P1wins + 1;
                    } else {
                        P2wins = P2wins + 1;
                    }
            }
            println("Player 1 wins: " + P1wins);
            println("Player 2 wins: " + P2wins);
            println("Ties: " + ties);
            println("-----------------------------------------");
            String dump = sc.nextLine();
            } else if(ans.equalsIgnoreCase("done")){
                println("-----------------------------------------");
                println("Thanks for playing!");
                break;
            } else{
                println("-----------------------------------------");
                println("You typed an invalid input!");
            }
    }
}
}