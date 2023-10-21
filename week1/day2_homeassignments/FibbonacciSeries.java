package week1.day2_homeassignments;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int range = 8; //input variable
		int firstNum = 0;
		int secondNum = 1;
		System.out.print("Fibonacci Series: " + firstNum);
		for(int i=1;i<range;i++) {
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(" " + firstNum);
		}

	}

}
