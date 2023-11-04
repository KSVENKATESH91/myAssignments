package week3.day2_homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement_List {

	public static void main(String[] args) {
		int[] input = { 1, 4, 3, 2, 8, 6, 7 };
		// Adding array elements to a list
		List<Integer> listInput = new ArrayList<>();
		for (Integer eachInput : input) {
			listInput.add(eachInput);
		}
		Collections.sort(listInput);
		for (int i = 0; i < listInput.size(); i++) {
			if ((i + 1) != listInput.get(i)) {
				System.out.println((i + 1) + " is missing");
				break;
			}
		}

	}

}
