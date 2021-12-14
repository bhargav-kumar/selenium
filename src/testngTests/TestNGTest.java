package testngTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNGListeners.TestNGListeners;

@Listeners(TestNGListeners.class)
public class TestNGTest {

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1, alwaysRun = true, groups = { "Google" }, invocationCount = 1)
	public void googleTest() {
		driver.get("https://www.google.com/");
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Google1234");
	}

	@Test(priority = 2, dependsOnMethods = { "googleTest" })
	public void googleEmailNavigation() {
		driver.findElement(By.linkText("Gmail")).click();
	}

//	@Test(priority = 3, alwaysRun = false, groups = {"Facebook", "Signup"}, invocationCount=1)
//	public void facebookTest() {
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("Selenium");
//	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
