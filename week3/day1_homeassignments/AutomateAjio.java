package week3.day1_homeassignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAjio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-genderfilter facet-linkname-Men')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		Thread.sleep(2000);
		// To Print the count of the items found
		System.out.println(driver.findElement(By.className("length")).getText());

		// To Get the list of brand of the products displayed in the page and print the list
		List<WebElement> brandNames = driver.findElements(By.xpath("//strong"));
		int totalBrands = brandNames.size();
		List<String> brandList = new ArrayList<>();
		for (int i = 0; i < totalBrands; i++) {
			brandList.add(brandNames.get(i).getText());
		}
		System.out.println("Full list of brands with duplicate entires: " + brandList);
		Set<String> uniqueBrands = new LinkedHashSet<>(brandList);
		System.out.println("There are " + uniqueBrands.size() + " unique brands displayed");
		System.out.println("Unique list of Brands: " + uniqueBrands);

		// To Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		System.out.println("There are " + bagNames.size() + " bags found in this page");
		List<String> bagList = new ArrayList<>();
		for (WebElement eachBag : bagNames) {
			bagList.add(eachBag.getText());
		}
		System.out.println("List of Bags displayed: " + bagList);
		driver.close();
	}

}
