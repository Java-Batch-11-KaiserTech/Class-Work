/*
Iteration through keys and values using Iterator and Enhanced for loop
*/ 


package map.demo;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIteratorDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Anaconda");
		hmap.put(2, "Beautifule");
		hmap.put(3, "Cinematic");
		hmap.put(4, "Drammatic");
		hmap.put(5, "Erratic");
		hmap.put(6, "Futile");

// printing the HashMap:
		System.out.println(hmap);

// Iterating through values using Iterator:
		Iterator<String> it = hmap.values().iterator();
		while (it.hasNext()) {
			Object value = it.next();
			System.out.println(value);
		}

		// Iterating through keys using Iterator:
		Iterator<Integer> iti = hmap.keySet().iterator();
		while (iti.hasNext()) {
			Object key = iti.next();
			System.out.println(key);
		}

// iterating through keys using enhanced for loop:
		for (Integer key : hmap.keySet()) {
			System.out.print(key + " ");
		}
// iterating through values using enhanced for loop:
		for (String value : hmap.values()) {
			System.out.print(value + " ");
		}
	}
}


Output:
{1=Anaconda, 2=Beautifule, 3=Cinematic, 4=Drammatic, 5=Erratic, 6=Futile}
Anaconda
Beautifule
Cinematic
Drammatic
Erratic
Futile
1
2
3
4
5
6
1 2 3 4 5 6 Anaconda Beautifule Cinematic Drammatic Erratic Futile 
