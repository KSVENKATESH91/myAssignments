package week3.day2_breakoutassignments;

import java.util.Arrays;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 2, 5, 7, 7, 5, 9, 2, 3 };
		int length = n.length;
		// Arrays.sort(n);
		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (n[i] == n[j]) {
					System.out.println("This is a duplicate element found in the array: " + n[i]);
					break;
				}

			}
		}
	}

}
