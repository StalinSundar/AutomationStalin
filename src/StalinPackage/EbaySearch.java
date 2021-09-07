package StalinPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Ebay(driver);
	}
	
	public static void Ebay(WebDriver driver) throws InterruptedException
	{
		driver.manage().window().maximize();
		String URL = "https://www.ebay.com/";
		driver.get(URL);
		WebElement SearchItem = driver.findElement(By.id("gh-ac"));
		SearchItem.sendKeys("electric guitar");
		SearchItem.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Squier Fender Electric Guitar w/Case untested")).click();
		
	}

}
