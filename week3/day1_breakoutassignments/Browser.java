package week3.day1_breakoutassignments;

// THIS IS PARENT OR BASE CLASS
public class Browser {

	public void openURL(String browserName, float browserVersion) {
		System.out.println(
				"Parent Class Browser: Open Browser - " + browserName + " and naviagte to https://www.facebook.com");
		System.out.println("Parent class Browser: Browser version is : " + browserVersion);

	}

	public void closeBrowser() {
		System.out.println("Parent Class Browser : Close Browser");

	}

	public void navigateBack() {
		System.out.println("Parent Class Browser: Click Back button");

	}

	public static void main(String[] args) {
		String browserName = "FireFox";
		Float browserVersion = 118.01f;
		Browser parentBrowser = new Browser();
		parentBrowser.openURL(browserName, browserVersion);

	}

}
