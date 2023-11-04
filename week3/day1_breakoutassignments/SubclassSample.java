package week3.day1_breakoutassignments;
//This sub class is created to perform Over-riding of the Superclass method
public class SubclassSample extends SuperClassSample{

	public void printOutput() {
		System.out.println("This is the output from the Sub class (Over-rided)");

	}
	public static void main(String[] args) {
		SubclassSample test = new SubclassSample();
		test.printOutput();
		SuperClassSample test2 = new SuperClassSample();
		test2.printOutput();

	}

}
