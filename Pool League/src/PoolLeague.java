import java.io.IOException;
import java.util.Observer;


public interface PoolLeague {
	
	public void informObserver(Player winner, Player loser);
	
	public boolean hasChanged(Player p);
	
	public int getSizeOfPlayersList();
	
	public Player getPlayerFromPlayersList(int position);
	
	public String addPlayer(String name, String email) throws IOException;
	
	public void addPlayer(int wins, int losses, int rank, String name, String email) throws IOException;
	
	public void removePlayer(String name) throws IOException, PlayerNotFoundException;
	
	public String[] printArrayLeague();
	
	public String[] printArrayByWins();
	
	public String[] printArrayByLoses();
	
	public void playGame() throws IOException, PlayerNotFoundException;
	
	public Player findPlayerByName(String name) throws PlayerNotFoundException;
	
	public void initialiseForTesting() throws IOException;
	
	public void sortArray();

	public void addObserver(Observer observer);
	
	public void playGameCommandLine(String winner, String loser) throws PlayerNotFoundException, IOException;
}
