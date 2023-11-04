package week3.day2_homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] input = { 3, 2, 11, 4, 6, 7 };
		// Adding array elements to a list
		List<Integer> listInput = new ArrayList<>();
		for (Integer eachInput : input) {
			listInput.add(eachInput);
		}
		Collections.sort(listInput);
		int listSize = listInput.size();
		//After sorting the list, second largest number can be found in ListSize-2 position
		System.out.println("Second largest number is : " + listInput.get(listSize-2));
		

	}

}
