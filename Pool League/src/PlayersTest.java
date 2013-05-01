
import java.io.IOException;
import java.util.*;

public class PlayersTest {
	public static void main(String[] args) throws PlayerNotFoundException {
		League myLeague = new League();
		Scanner sc = new Scanner(System.in);

		boolean running = true;
		
		try {
			myLeague.initialiseForTesting();
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
					System.out.println("There is somethign wrong with the file");
				}
			}
			else if (temp == 2) {  // print
				// present options for which type of printing to perform at this level
				// of the menu code and call individual methods within the league class
				// 
				
				myLeague.printArray();
				
			}
			else if (temp == 3) {  // add
				String tempName = null;
				int tempRank = 0;
				
				// TODO simplify menu code after re-writing addPlayer method
				
				Player addPlayer;
				
				System.out.print("Enter the name of the player ");
				tempName = sc.next();
				
				if (myLeague.playersList.size() != 0) {
					myLeague.sortArray();
					Player tempPlayer = myLeague.playersList.get(myLeague.playersList.size() - 1);
					tempRank = tempPlayer.getRank() + 1;
					
					addPlayer = new Player(0, 0, tempRank, tempName);
				}
				else {
					addPlayer = new Player(0, 0, 1, tempName);
				}
				try {
					myLeague.addPlayer(addPlayer);
				}
				catch (IOException e) {
					System.out.println("There is a problem with the files");
				}
			}
			else if (temp == 4) {   // remove a player
				String tempName = null;
				
				System.out.print("Enter the name of the player ");
				tempName = sc.next();
				
				
				// TODO get name of player from user.
				// pass into removePlayer method
				
				
				Player removePlayer = new Player(myLeague.findPlayerByName(tempName));
				
				try {
					myLeague.removePlayer(removePlayer);
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
}
