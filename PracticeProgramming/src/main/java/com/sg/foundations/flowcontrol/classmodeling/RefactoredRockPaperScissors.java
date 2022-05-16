
package com.sg.foundations.flowcontrol.classmodeling;

import java.util.Scanner;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class RefactoredRockPaperScissors {
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.playGame();
    
    }
}


class RockPaperScissors {  
    public void playGame() {          
        Scanner scanner = new Scanner(System.in);
        String response = "Yes";
        
        while(response.equals("Yes")) {        
        System.out.println("How many rounds of rock, paper, scissors would you like to play? ");
        int rounds = scanner.nextInt();
        int tieCounter = 0;
        int userWins = 0;
        int computerWins = 0;
        if(rounds < 1 || rounds > 10) {
            System.out.println("Must pick between 1-10 rounds");
            System.exit(0);
        }
        for(int i = 0; i < rounds; i++) {
            int computerChoice = (int)Math.floor(Math.random()*(3-1+1)+1);
            System.out.println("What would you like to play?");
            System.out.println("1. Rock ");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            int answer = scanner.nextInt();
            if(answer == computerChoice) {
                System.out.println("It's a tie!");
                tieCounter++;                
            } else if(computerChoice == 1 && answer == 3) {
                System.out.println("Computer wins");
                computerWins++;
            } else if(computerChoice == 2 && answer == 1) {
                System.out.println("Computer wins");
                computerWins++;
            } else if(computerChoice == 3 && answer == 2) {
                System.out.println("Computer wins");
                computerWins++;
            } else {
                System.out.println("User wins");
                userWins++;
            }        
        }
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + tieCounter + "\n");
        System.out.println("Would you like to play again? Yes or No");
        response = scanner.next();
        if (response == "No") {
            System.exit(0);
        }
        }
        }                                
    }
}
