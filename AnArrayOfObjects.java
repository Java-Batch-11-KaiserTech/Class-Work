/*
an array of object can hold values of all primitive data types without reservation.
*/

package mypackages;

import java.util.Arrays;

public class AnArrayOfObjects {

	public static void main(String[] args) {

		int x = 5;
		Integer i = new Integer(2);
		double d = 3.1412459;
		char c = 'A';
		String s = new String("New York");
		long l = new Long(987654321L);

		Object[] oa = new Object[5];                  // size / length: 5, max index: 4
		oa[0] = 12;
		oa[1] = x;
		oa[2] = i;          // we can place the value (2) directly instead of i (the object of Integer class) 
		oa[3] = c;
		oa[4] = l;

		System.out.println(Arrays.toString(oa));
	}

}



Output: [12, 5, 2, A, 987654321]
