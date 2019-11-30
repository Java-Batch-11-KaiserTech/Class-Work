/*
Sum of integer array elements using Enhanced for loop:
*/

package array.demo;

public class SumOfIntegerArrayElements {

	public static void main(String args[]) {

		int[] myNumberArray = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		int sum = 0;

		for (int num : myNumberArray) {
			sum += num;
		}
		System.out.println("Sum of the Integer Array elements is : " + sum);
	}
}



Output: Sum of the Integer Array elements is : 275
