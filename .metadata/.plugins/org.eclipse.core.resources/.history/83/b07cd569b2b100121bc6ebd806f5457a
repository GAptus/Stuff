

public class Player implements Comparable<Player> {
	
	private Integer wins;
	private int losses;
	private int rank;
	private String name;
	private int played;
	
	Player(int wins, int losses, int rank, String name) {
		this.wins = wins;
		this.losses = losses;
		this.rank = rank;
		this.name = name;
		played = wins + losses;
	}
	
	Player(Player p) {
		this.wins = p.wins;
		this.losses = p.losses;
		this.rank = p.rank;
		this.name = p.name;
		played = wins + losses;
	}
	
	Player(String[] s) {
		wins = Integer.parseInt(s[0]);
		losses = Integer.parseInt(s[1]);
		rank = Integer.parseInt(s[2]);
		name = s[3];
		played = wins + losses;
	}
	
	public void AddToWins() {
		wins++;
	}
	
	public void AddToLosses() {
		losses++;
	}
	
	public void moveDownRank() {
		rank++;
	}
	
	public void moveUpRank() {
		rank--;
	}
	
	public int compareTo(Player p) {
		return p.wins.compareTo(wins);
	}
	
	public int getPlayed() {
		return played;
	}
	
	public int getWins() {
		return wins;
	}
	
	public int getLosses() {
		return losses;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String toString() {
		return wins + "," + losses + "," + rank + "," + name;
	}
}
