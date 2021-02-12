package mypackages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReversedArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ostrich");
		al.add("Iguana");
		al.add("Boa");
		al.add("Crocodile");
		al.add("Zebra");
		al.add("Jackle");
		al.add("Anaconda");
		al.add("Tapir");
	
		Collections.sort(al, Collections.reverseOrder());
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}



Output:
Zebra
Tapir
Ostrich
Jackle
Iguana
Crocodile
Boa
Anaconda
