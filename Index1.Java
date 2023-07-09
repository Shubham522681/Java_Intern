package Shubha;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		  String[] options = {"rock", "paper", "scissors"};

	        // Create a random number generator
	        Random random = new Random();

	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Let's play Rock, Paper, Scissors!");

	        while (true) {
	            // Generate a random index to choose computer's move
	            int computerMoveIndex = random.nextInt(options.length);

	            // Prompt the user for their move
	            System.out.print("Enter your move (rock, paper, or scissors): ");
	            String userMove = scanner.nextLine().toLowerCase();

	            // Check if the user wants to quit
	            if (userMove.equals("quit")) {
	                System.out.println("Thanks for playing!");
	                break;
	            }

	            // Check if the user's move is valid
	            if (!isValidMove(userMove)) {
	                System.out.println("Invalid move! Please try again.");
	                continue;
	            }

	            // Get the computer's move from the options array
	            String computerMove = options[computerMoveIndex];

	            System.out.println("Computer's move: " + computerMove);

	            // Determine the winner
	            String result = determineWinner(userMove, computerMove);

	            // Display the result
	            System.out.println(result);
	            System.out.println();
	        }

	        // Close the scanner
	        scanner.close();

	

}
	 public static boolean isValidMove(String move) {
	        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
	    }

	    // Helper method to determine the winner
	    public static String determineWinner(String userMove, String computerMove) {
	        if (userMove.equals(computerMove)) {
	            return "It's a tie!";
	        } else if (userMove.equals("rock") && computerMove.equals("scissors") ||
	                   userMove.equals("paper") && computerMove.equals("rock") ||
	                   userMove.equals("scissors") && computerMove.equals("paper")) {
	            return "Congratulations! You win!";
	        } else {
	            return "Oops! Computer wins!";
	        }
	    }
	}
