package week1.day2_homeassignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 7; // input variable

		if (n <= 1) {
			System.out.println(n + " is not a prime number");
			return;
		}

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = 1;
				break;
			}
		}

		if (count == 0) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

}
