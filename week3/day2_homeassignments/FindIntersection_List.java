package week3.day2_homeassignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection_List {

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		// Adding array elements to a list
		List<Integer> listA = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);
		}
		List<Integer> listB = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			listB.add(b[i]);
		}
		System.out.print("Intersection elements are : ");
		for (int i = 0; i < listA.size(); i++) {
			for (int j = 0; j < listB.size(); j++) {
				if (listA.get(i) == listB.get(j)) {
					System.out.print(listA.get(i) + " ");
					break;
				}
			}
		}

	}

}
