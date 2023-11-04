package week3.day1_breakoutassignments;

// This a Derived class from the Parent class 'Browser'
public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Class: Chrome - Open Incognito");

	}
	
	public void clearCache() {
		System.out.println("Class: Chrome - Clear cache");

	}
	
	public static void main(String[] args) {
		Chrome childChrome = new Chrome();
		childChrome.openURL("Chrome", 14.0f);
		childChrome.openIncognito();
		childChrome.clearCache();
		childChrome.navigateBack();
	}

}
