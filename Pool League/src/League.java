
import java.util.*;


public class League {
	
	ArrayList<Player> playersList = new ArrayList<Player>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addPlayer(Player p) {
		playersList.add(p);
	}
	
	public void addPlayer(int wins, int losses, int rank, String name) {
		Player p = new Player(wins, losses, rank, name);
		playersList.add(p);
	}
	
	public void removePlayer(Player p) throws PlayerNotFoundException {
		int tempRank = p.getRank();
		playersList.remove(p);
		
		for (Player r : playersList) {
			if (r.getRank() > tempRank) {
				r.moveUpRank();
			}				
		}
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
	
	public void playGame() throws PlayerNotFoundException {
		String winner, loser;
		System.out.print("Enter the winner: ");
		winner = sc.next();
		Player winnerPlayer = findPlayerByName(winner);
		
		System.out.print("\n" + "Enter the loser: ");
		loser = sc.next();
		Player loserPlayer = findPlayerByName(loser);
		
		swapPlayerRanks(winnerPlayer, loserPlayer);
	}
	
	private void swapPlayerRanks(Player winner, Player loser) throws PlayerNotFoundException {
		
		if (winner.getRank() > loser.getRank()) {
			if (winner.getRank() - 1 == loser.getRank()) {
				
				winner.moveUpRank();
				winner.AddToWins();
				
				loser.moveDownRank();
				loser.AddToLosses();
			}
			else if (winner.getRank() - 2 == loser.getRank()) {
				Player tempSwitch = findPlayerByRank(winner.getRank() - 1);
				
				loser.moveDownRank();
				loser.AddToLosses();
				tempSwitch.moveUpRank();
				
				winner.moveUpRank();
				winner.AddToWins();
				loser.moveDownRank();
			}
			else {
				Player tempSwitchWinner = findPlayerByRank(winner.getRank() - 1);
				Player tempSwitchLoser = findPlayerByRank(loser.getRank() + 1);
				
				winner.moveUpRank();
				winner.AddToWins();
				tempSwitchWinner.moveDownRank();
				
				loser.moveDownRank();
				loser.AddToLosses();
				tempSwitchLoser.moveUpRank();
			}
		}
		else {
			winner.AddToWins();
			loser.AddToLosses();
		}
		
	}
	
	// searches the arrayList for players whose name is equal to the name given as a parameter. If no match is found it will throw PlayerNotFoundException
	public Player findPlayerByName(String name) throws PlayerNotFoundException {
		for (Player p : playersList) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		throw new PlayerNotFoundException();
	}
	
	private Player findPlayerByRank(int rank) throws PlayerNotFoundException {
		for (Player p : playersList) {
			if (p.getRank() == rank) {
				return p;
			}
		}
		throw new PlayerNotFoundException();
	}
	
	public void initialiseForTesting() {
		for (int i = 0; i < 6; i++) {
			int wins = (int)(Math.random() * 60);
			int loses = (int)(Math.random() * 60);
			int rank = i + 1;
			String name = UUID.randomUUID().toString();
			
			playersList.add(new Player(wins, loses, rank, name));
		}
	}
	
	
	
	final static Comparator<Player> Players_Losses = new Comparator<Player>() {
		public int compare(Player a, Player b) {
			if (a.getRank() > b.getRank()) {
				return 1;
			}
			else if (a.getRank() == b.getRank()) {
				return 0;
			}
			else  {
				return -1;
			}
		}
	};

}
