
import java.util.Scanner;

public class Game {
	
	public static Scanner answer = new Scanner(System.in);
	
	public static void main(String[] args) {
		Rules();
		boolean Status = false;
		int userScore = 0;
		int computerScore = 0;
		int numGames = 0;
		
		
		do {
			String userMove = userMove();
			String computerMove = computerMove();
			String Winner = determineWinner(userMove, computerMove);
			
			announceWinner(Winner);
			
			// updating result into main storage
			int[] result = result(Winner);
			userScore += result[0];
			computerScore += result[1];
			numGames += result[2];
			
			System.out.println("Play again? Type Y to keep playing, type N to stop.");
			String userKeepPlaying = answer.nextLine();
			
			if (userKeepPlaying.toLowerCase().equals("y")) {
				System.out.println("User score: " + userScore + " || Computer Score: " + computerScore + " || Total matches played: " + numGames);
				Status = true;
			} else {
				System.out.println("Sure, here is the data from last match" + ", User score: " + userScore + " || Computer Score: " + computerScore + " || Total matches played: " + numGames);
				System.out.println("Bye Bye :(");
				Status = false;
			}
		} while (Status);
	}

	
	
//==========[Rules of the game]==========\\
	public static void Rules () {
		System.out.println("Welcome to Baggebo!");
		System.out.println("In this game, you will play against computer.");
		System.out.println("Pick 1 move out of 5 include Revskar, Vittsjo, Oxberg, Kloven and Tvaro");
		System.out.println("Rules are simple:");
		System.out.println("Revskar beats Vittsjo, Kloven \nVittsjo beats Oxberg, Tvaro \nOxberg beats Revskar, Kloven \nKloven Beats Tvaro, Vittsjo \nTvaro beats Revskar, Oxberg");		
	}

	
	
//==========[Read and check user input(move)]==========\\
	public static String userMove () {
		System.out.println("It's your turn to pick a move (Revskar, Vittsjo, Oxberg, Kloven and Tvaro)");
		String user_Move = answer.nextLine();
		boolean echo = false;
		
		// Handling invalid user move input by loop
		while (!(user_Move.toLowerCase().equals("revskar") || user_Move.toLowerCase().equals("vittsjo") || user_Move.toLowerCase().equals("oxberg") || user_Move.toLowerCase().equals("kloven") || user_Move.toLowerCase().equals("tvaro"))) {
			System.out.println("Check your input and try again! Revskar, Vittsjo, Oxberg, Kloven and Tvaro are only valid inputs.");
			user_Move = answer.nextLine();
		}
		
		// Echo back to user to confirm it's the last choice
		while (echo != true) {
			System.out.println("Are you sure that you chose " + user_Move + "? Please answer yes or no");
			String confirm = answer.nextLine();
			if (confirm.toLowerCase().equals("yes")) {
				echo = true;
			} else if (confirm.toLowerCase().equals("no")) {
				System.out.println("Type again");
				user_Move = answer.nextLine();
				
				// A loop again to make sure user can't input invalid value here, if it pass then it also pass the bigger while loop
				while (!(user_Move.toLowerCase().equals("revskar") || user_Move.toLowerCase().equals("vittsjo") || user_Move.toLowerCase().equals("oxberg") || user_Move.toLowerCase().equals("kloven") || user_Move.toLowerCase().equals("tvaro"))) {
					System.out.println("Check your input and try again! Revskar, Vittsjo, Oxberg, Kloven and Tvaro are only valid inputs.");
					user_Move = answer.nextLine();
				}
				echo = true;
			} else {
				System.out.println("Invalid input");
			}
		}
		System.out.println("User has chosen " + user_Move.toLowerCase());
		return user_Move.toLowerCase();
	}

	
	
//==========[Generate computer's move]==========\\
	public static String computerMove () {
		System.out.println("Now it's computer's turn!");
		
		//Random position in string array for computer move
		String[] allMoves = new String[] {"revskar","vittsjo","oxberg","kloven","tvaro"};
		int x = (int) (Math.random() * 4);
		
		//Make computer wait a bit to make it more interesting
		try {
			System.out.println("Computer is making choice...");
			Thread.sleep(3000);
			System.out.println("Computer has chosen " + allMoves[x]);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return allMoves[x];
	}
	
	
	
//==========[Determine the winner of the match]==========\\	
	public static String determineWinner (String userMove, String computerMove) {
		if (userMove.equals("revskar") && (computerMove.equals("vittsjo") || computerMove.equals("kloven"))) {
			return "user";
		} else if (userMove.equals("vittsjo") && (computerMove.equals("oxberg") || computerMove.equals("tvaro"))) {
			return "user";
		} else if (userMove.equals("oxberg") && (computerMove.equals("revskar") || computerMove.equals("kloven"))) {
			return "user";
		} else if (userMove.equals("kloven") && (computerMove.equals("vittsjo") || computerMove.equals("tvaro"))) {
			return "user";
		} else if (userMove.equals("tvaro") && (computerMove.equals("revskar") || computerMove.equals("oxberg"))) {
			return "user";
		}
		return "computer";
	}
	
	
	
//==========[Announce the winner of the match]==========\\	
	public static void announceWinner (String Winner) {
		System.out.println("The winner of this match is " + Winner);
	}
	
	
	
//==========[Gathering and return result after last match]==========\\
	public static int[] result(String Winner) {
		int userScore = 0;
		int computerScore = 0;
		int numGames = 0;
		
		if (Winner.equals("user")) {
			userScore += 1;
		} else {
			computerScore += 1;
		}
		numGames += 1;
		
		//Returning result by array
		int[] data = {userScore, computerScore, numGames};
		return data;
	}

}
