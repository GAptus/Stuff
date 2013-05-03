
import java.util.*;

public class VolcanicAshCloud extends Observable{
	// current number of days
	private int numberOfDaysDelay;
	
	/*	used to notify passengers of the delay
	 * 	positive value for increased delay
	 *	negative value for improved conditions
	 */
	public void addDelay(int days) {
		this.numberOfDaysDelay += days;
		this.setChanged();
		// sends  a message to all of its observers with the change
		this.notifyObservers(new Integer(days));
	}
	
	
}
