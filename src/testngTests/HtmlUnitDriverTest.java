package testngTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {
	WebDriver driver;

	@BeforeTest
	public void intialization() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new HtmlUnitDriver();

		// Faster execution - excution time decreases
		// Disadvatage: Actions class may not - DragAndDrop, MoveToElement, DoubleClick
	}

	@Test(priority = 1)
	public void yahooTest() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.id("yschsp")).sendKeys("Selenium");
		System.out.println("yahooTest passed");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
