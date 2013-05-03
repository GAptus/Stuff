
/**	@author giacomo
 * @version 1.4
 *  Player Class represents player <p>
 * Stores information for a player
 */
public class Player implements Comparable<Player> {
	
	private Integer wins;
	private int losses;
	private int rank;
	private String name;
	private int played;
	private String email;
	
	/**	Player constructor
	 * 
	 * @param wins wins
	 * @param losses Stores loses
	 * @param rank Stores current rank
	 * @param name Stores name
	 * @param email stores email
	 * 
	 * Accepts parameters to set wins, loses, rank, name and email
	 * <p>
	 *	sets played variable based on wins + losses
	 */
	Player(int wins, int losses, int rank, String name, String email) {
		this.wins = wins;
		this.losses = losses;
		this.rank = rank;
		this.name = name;
		played = wins + losses;
		this.email = email;
	}
	/** Player constructor
	 * 
	 * @param s Stores a array of Strings
	 * 
	 * Sets values for Player variables based on each part of the String, using Integer.parseInt to change from String to int when needed
	 */
	Player(String[] s) {
		wins = Integer.parseInt(s[0]);
		losses = Integer.parseInt(s[1]);
		rank = Integer.parseInt(s[2]);
		name = s[3];
		played = wins + losses;
		email = s[4];
	}
	/**	Method getEmail
	 * 
	 * @return email of player
	 */
	public String getEmail() {
		return email;
	}
	/**	Method addToWins
	 * Increments wins by 1
	 */
	public void addToWins() {
		wins++;
	}
	/**	Method addToLosses
	 * Decrements losses by 1
	 */
	public void addToLosses() {
		losses++;
	}
	/**	Method moveDownRank
	 * Increments rank by 1 
	 */
	public void moveDownRank() {
		rank++;
	}
	/**	Method moveUpRank
	 * Decrements rank by 1
	 */
	public void moveUpRank() {
		rank--;
	}
	/**	Method compareTo
	 * @param p Stores a Player object
	 * Compares wins between two Player objects this & another
	 */
	public int compareTo(Player p) {
		return p.wins.compareTo(wins);
	}
	/**	Method getPlayed
	 * 
	 * @return the value of played, stores the number of games played by a player
	 */
	public int getPlayed() {
		return played;
	}
	/**	Method getWins
	 * 
	 * @return the value of wins, stores the number of wins by a player
	 */
	public int getWins() {
		return wins;
	}
	/**	Method getLosses
	 * 
	 * @return the value of losses, stores the number of loses by a player
	 */
	public int getLosses() {
		return losses;
	}
	/**	Method getName
	 * 
	 * @return the value of name, stores the name of a player
	 */
	public String getName() {
		return name;
	}
	/**	Method getRank
	 * 
	 * @return the value of rank, stores the current rank of a player
	 */
	public int getRank() {
		return rank;
	}
	/**	Method toString
	 * 
	 * @return a string, this string holds the raw format of the player data which gets stored in a .txt file
	 */
	public String toString() {
		return wins + "," + losses + "," + rank + "," + name + "," + email;
	}
}
