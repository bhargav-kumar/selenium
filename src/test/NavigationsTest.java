package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationsTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); //3.11, 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		Thread.sleep(3000);
		//Refresh the page
		driver.navigate().refresh();

//		TODO: Assignment
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.F5).build().perform();
//		action.sendKeys(Keys.F5).build().perform();
		
		driver.findElement(By.linkText("A/B Testing")).click();
		Thread.sleep(2000);
		
		//Navigate Back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Navigate Forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().to("http://the-internet.herokuapp.com/broken_images");
		
	}

}
