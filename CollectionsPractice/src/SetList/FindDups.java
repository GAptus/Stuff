package SetList;

import java.util.*;

public class FindDups {
	public static void main(String[] args) {
		Set<String> unique = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		
		for (String a : args) {
			if (!unique.add(a)) {
				dups.add(a);
			}
			unique.removeAll(dups);
		}	
		System.out.println("Unique words: " + unique);
		System.out.println("Duplicate words: " + dups);
	}
}
