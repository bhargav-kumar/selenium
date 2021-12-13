package testngTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	WebDriver driver;
	String title;

	@BeforeSuite
	public void browserSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("@BeforeSuite annoatation");
	}

	@BeforeClass
	public void beforeClassTest() {
		System.out.println("@BeforeClass Annotation");
	}

	@BeforeTest
	public void beforeTestAnnotation() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		String title = driver.getTitle();
		System.out.println("title : " + title);
		System.out.println("@BeforeTest annoations");
	}

	@BeforeMethod
	public void beforeMethodTest() {
		driver.findElement(By.id("yschsp")).sendKeys("Selenium");
		System.out.println("@BeforeMethod annoation");
	}

	@Test(priority = 1)
	public void yahooTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//b[text()='selenium'])[1]")).click();
		System.out.println("@Test annoatation");
	}

	@AfterMethod
	public void afterMethodTest() {
		title = driver.getTitle();
		System.out.println("Title after search : " + title);
		System.out.println("@AfterMethod annotation");
	}

	@AfterTest
	public void afterTestAnnotation() {
		System.out.println(title);
		System.out.println("@AfterTest annoatation");
		Assert.assertEquals(title, "selenium - Yahoo India Search Results"); //Validation
	}

	@AfterClass
	public void afterClassTest() {
		System.out.println("@AfterClass Annotation");
	}

	@AfterSuite
	public void closeExecuion() {
		System.out.println("@AfterSuite annotation");
		driver.quit();
	}

}

/*
 * @BeforeSuite
 * 
 * @AfterSuite
 * 
 * @BeforeTest
 * 
 * @AfterTest
 * 
 * @BeforeGroups
 * 
 * @AfterGroups
 * 
 * @BeforeClass
 * 
 * @AfterClass
 * 
 * @BeforeMethod
 * 
 * @AfterMethod
 */