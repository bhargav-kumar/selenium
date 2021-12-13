package testngTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestngParametersTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Parameters({"GoogleSearchInput", "url"})
	@Test(priority = 1, alwaysRun = true, groups = { "Google" }, invocationCount = 1)
	public void googleTest(String text, String url) {
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(text);
	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
}
