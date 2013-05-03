import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		VolcanicAshCloud v = new VolcanicAshCloud();
		// create 3 passengers and register them with the Volcanic Ash update
		List<Passenger> pList = new ArrayList<Passenger>();
		for (int i = 0; i < 3; i++) {
			pList.add(new Passenger());
			v.addObserver(pList.get(i));
		}
		
		//delayed
		v.addDelay(3);
		
		System.out.println();
		
		//more delays
		v.addDelay(4);
		
		System.out.println();
		
		v.addDelay(-5);
		
		System.out.println();
	}
}
