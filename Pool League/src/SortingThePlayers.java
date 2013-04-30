
import java.util.*;

public class SortingThePlayers {
	
	ArrayList<Player> playersList = new ArrayList<Player>();
	
	public void intialisePlayersList() {
		playersList.add(new Player(42, 3, 1, "Blue"));
		playersList.add(new Player(36, 4, 2, "Green"));
		playersList.add(new Player(33, 7, 3, "Orange"));
		playersList.add(new Player(33, 14, 4, "Yellow"));
		playersList.add(new Player(29, 17, 5, "Red"));
	}
	
	public void printArray() {
		for (int i = 0; i < playersList.size(); i++) {
			System.out.println(playersList.get(i));
		}
	}
	
	public void sortArray() {
		Collections.sort(playersList);
		Collections.sort(playersList, Players_Losses);
	}
	
	public void playGame() {
		
	}
	
	// Enter the winner and loser of the game and returns as a String array
	private String[] winnerOrLoser(String winner, String loser) {
		String[] winOrLose = {winner, loser};
		return winOrLose;
	}
	
	// searches the arrayList for players whose name is equal to the name given as a parameter. If no match is found it will throw PlayerNotFoundException
	private int findPlayerRank(String name) throws PlayerNotFoundException {
		for (Player p : playersList) {
			if (p.getName().equals(name)) {
				return p.getRank();
			}
		}
		throw new PlayerNotFoundException();
	}
	
	private void swapRanks() {
		//ofajoiegfjoijgfo
	}
	
	final static Comparator<Player> Players_Losses = new Comparator<Player>() {
		public int compare(Player a, Player b) {
			if (a.getLosses() > b.getLosses()) {
				return 1;
			}
			else if (a.getLosses() == b.getLosses()) {
				return 0;
			}
			else  {
				return -1;
			}
		}
	};

}
