
import java.util.*;

public class Passenger implements Observer {
	
	private int delay = 0;
	
	
	public Passenger() {
		
	}
	
	// automatically invoked by the observable passing itself as well any
	// argument to this method. Used to notify the passenger
	@Override
	public void update(Observable observable, Object arg) {
		int newDelay = (Integer) arg;
		this.delay += newDelay;
		// If this is executing because of the volcanic ash cloud
		if (observable instanceof VolcanicAshCloud) {
			if (newDelay > 0) {
				System.out.println("The flight has been delayed for another " +
										this.delay + " days");	
			}
			else {
				System.out.println("The flight is only now delayed by " + this.delay + " days");
			}
		} 
	}
}
