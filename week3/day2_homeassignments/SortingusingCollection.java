package week3.day2_homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollection {

	public static void main(String[] args) {
		String[] companies = { "HCL", "Wipro", "Aspire", "Systems", "CTS" };
		// Adding array elements to a list
		List<String> listCompanies = new ArrayList<>();
		for (String eachCompany : companies) {
			listCompanies.add(eachCompany);
		}

		// Sorted in alphabetical order
		Collections.sort(listCompanies);
		// Reversing the sorted order
		List<String> listCompanies_rev = new ArrayList<>();
		for (int i = listCompanies.size() - 1; i >= 0; i--) {
			listCompanies_rev.add(listCompanies.get(i));
		}
		System.out.print("Companies list in a reverse sorted order: ");
		System.out.println(listCompanies_rev);
	}

}
