
public class Player implements Comparable<Player> {
	
	private Integer wins;
	private int losses;
	private int rank;
	private String name;
	
	Player(int wins, int losses, int rank, String name) {
		this.wins = wins;
		this.losses = losses;
		this.rank = rank;
		this.name = name;
	}
	
	public int compareTo(Player p) {
		return p.wins.compareTo(wins);
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
		return "Wins: " + wins + " Losses: " + losses + " Rank: " + rank;
	}
}
