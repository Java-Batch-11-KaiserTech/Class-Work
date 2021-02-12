Sum of all the elements of an integer array:

package oops.demo;

public class SumOfIntArrayElements {

	public static void main(String args[]) {

		int[] myNumberArray = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		int sum = 0;
		for (int i = 0; i < myNumberArray.length; i++) {
			sum = sum + myNumberArray[i];
		}
		System.out.println("Sum of the Integer Array elements is : " + sum);
	}
}



Output: Sum of the Integer Array elements is : 275
