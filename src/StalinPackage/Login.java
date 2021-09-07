package StalinPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\geckodriver-v0.29.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		Gmail(driver);
		}
	
	public static void Gmail(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		String URL = "https://www.google.com/";
		driver.get(URL);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a")));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Create an account')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("StalinS");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("SundarS");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("hasinisuganbaby");
		Thread.sleep(1000);
		driver.findElement(By.name("Passwd")).sendKeys("stalinTest@1234");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("stalinTest@1234");
		Thread.sleep(3000);
		
		String UnameMessage = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/div[1]")).getText();
		System.out.println("SSS :"+UnameMessage);
		
		if(!UnameMessage.contains("You can use letters, numbers & periods"))
		{

			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("hasinisuganbaby");
		}	
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("phoneNumberId")).sendKeys("9788834166");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		
		
		Thread.sleep(60000);
		driver.findElement(By.xpath("//button/span[contains(text(), 'Verify')]")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.name("recoveryEmail")).sendKeys("stalinssp@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("stalinssp@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("day")).sendKeys("15");
		Thread.sleep(3000);
		Select Month = new Select(driver.findElement(By.id("month")));
		Month.selectByVisibleText("February");
		Thread.sleep(3000);
		driver.findElement(By.name("year")).sendKeys("1968");
		Thread.sleep(3000);
		Select Gender = new Select(driver.findElement(By.id("gender")));
		Gender.selectByVisibleText("Male");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'Skip')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'I agree')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("stalinTest@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		
	}

}