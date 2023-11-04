package week3.day2_breakoutassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMobilePriceList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus",Keys.ENTER);
		List<WebElement> allPrices= driver.findElements(By.className("a-price-whole"));
		
        //to find the size of list
        //System.out.println("The total no: of links in this page is :"+allPrices.size());
        //System.out.println(allPrices);
       
        //Create a List
        List<String> list = new ArrayList<>();

         for (int i = 0; i < allPrices.size(); i++) {
			String text=allPrices.get(i).getText();
			if(text!="") {
				list.add(text);
			}
			
		}
        
        Collections.sort(list);
        System.out.println(list);
        driver.close();
        
        //String firstElement = list.get(0);
        //System.out.println("FirstElement is : "+firstElement);
	}

}
