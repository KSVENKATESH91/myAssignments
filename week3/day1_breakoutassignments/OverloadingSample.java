package week3.day1_breakoutassignments;

public class OverloadingSample {

	private static final boolean TRUE = false;

	public void reportStep(String msg, String status) {
		System.out.println("This reportStep method can accept 2 args:");
		System.out.println("Method 1 Message : " + msg);
		System.out.println("Method 1 Status : " + status);

	}

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("This reportStep method can accept 3 args:");
		System.out.println("Mehtod 2 Message : " + msg);
		System.out.println("Method 2 Status : " + status);
		System.out.println("Method 2 containsSnapshot : " + snap);

	}

	public static void main(String[] args) {

		OverloadingSample test = new OverloadingSample();
		test.reportStep("FIRST METHOD", "Passed");
		test.reportStep("SECOND OVERLOADED METHOD", "Passed", TRUE);

	}

}
