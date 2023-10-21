package week1.day2_homeassignments;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		int n = 1234321; // input variable
		int num = n;
		int revNumber = 0;

		for (int i = num; i != 0; i = i / 10) {
			int digit = i % 10;
			revNumber = (revNumber * 10) + digit;
			i = i + 1;
		}

		if (n == revNumber) {
			System.out.println(n + " is a palindrome number");
		} else {

			System.out.println(n + " is not a palindrome number");
		}

	}

}
