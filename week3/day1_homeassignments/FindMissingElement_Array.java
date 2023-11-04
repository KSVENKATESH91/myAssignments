package week3.day1_homeassignments;

import java.util.Arrays;

public class FindMissingElement_Array {

	public static void main(String[] args) {
		int[] input = { 1, 4, 3, 2, 8, 6, 7 };
		int length = input.length;
		Arrays.sort(input);
		for (int i = 0; i < length; i++) {
			if ((i + 1) != input[i]) {
				System.out.println((i + 1) + " is missing");
				break;
			}
		}
	}
}
