package testngTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsRemainingTopics {
WebDriver driver;
	
	@BeforeTest
	public void intialization() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority=1, enabled=true, timeOut=100000, description="This is Yahoo Test")
	public void yahooTest() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.id("yschsp")).sendKeys("Selenium");
	}
	
	@Test(priority=2, enabled=true, timeOut=100000, description="This is Facebook Test")
	public void facebookTest() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Selenium");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
