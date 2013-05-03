
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class PlayersTest implements Observer  {

	static League myLeague = new League();
	
	public static void main(String[] args) throws PlayerNotFoundException {
		
		
		
		Scanner sc = new Scanner(System.in);

		boolean running = true;
		
		try {
			myLeague.initialiseForTesting();
			
			myLeague.addObserver(new PlayersTest());
			
			
			
		}
		catch (IOException e) {
			System.out.println("File Missing");
			System.exit(0);
		}
		
		while(running) {
			int temp = 0;
			System.out.print("Enter 1 to play a game, 2 to print the league table, 3 to add a player, 4 to remove a player or 5 to exit");
			temp = sc.nextInt();
			
			if (temp == 1) { //play a game
				try {
					myLeague.playGame();
				}
				catch (PlayerNotFoundException e) {
					System.out.println("One or more of your players cannot be found");
				}
				catch (IOException e) {
					System.out.println("There is something wrong with the file");
				}
			}
			else if (temp == 2) {  // print

				int response = 0;
				
				System.out.println("Enter 1 to see the league table, 2 to see who has most wins or 3 to see who has most loses");
				
				response = sc.nextInt();
				
				if (response == 1) {
					for (String s : myLeague.printArrayLeague()) {
						System.out.println(s);
					}
				}
				else if (response == 2) {
					for (String s : myLeague.printArrayByWins()) {
						System.out.println(s);
					}
				}
				else if (response == 3) {
					for (String s : myLeague.printArrayByLoses()) {
						System.out.println(s);
					}
				}
				else {
					
				}
				
			}
			else if (temp == 3) {  // add				

				System.out.print("Enter the name of the player ");
				String tempName = sc.next();
				
				System.out.println("Enter the email you wish your notifications to be sent to");
				String tempEmail = sc.next();
				
				try {
					myLeague.addPlayer(tempName, tempEmail);
				}
				catch (IOException e) {
					System.out.println("There is a problem with the files");
				}
			}
			else if (temp == 4) {   // remove a player
				String tempName = null;
				
				System.out.print("Enter the name of the player ");
				tempName = sc.next();
				
				try {
					myLeague.removePlayer(tempName);
				}
				catch (IOException e) {
					System.out.println("There is a problem with the files");
				}
			}
			else if (temp == 5) {  // exit
				System.exit(0);
			}
			else {
				System.out.println("Please enter a valid value");
			}
		}
		sc.close();
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		
		System.out.println("You are here");
		
		String[] loserWinner = new String[2];
		
		if (arg instanceof String) {
			String s = (String) arg;
			loserWinner = s.split(",");
			
			for (int i = 0; i < 2; i++) {
				System.out.println(loserWinner[i]);
			}
		
			try {
				Player winner = myLeague.findPlayerByName(loserWinner[1]);

				Player loser = myLeague.findPlayerByName(loserWinner[0]);

				String body;
				
				
				body = " You beat " + loser.getName() + "\n You have moved up to first place";
				ObservedEmail.sentEmail(body, winner.getEmail());
				
				body = " You lost to " + winner.getName() + "\n You have moved down to second place";
				ObservedEmail.sentEmail(body, loser.getEmail());
				
			}
			catch (PlayerNotFoundException e) {
				System.out.println("Player doesn't exist");
			}
			catch (UnsupportedEncodingException e) {
				
			}
		}
		
	}
}











































