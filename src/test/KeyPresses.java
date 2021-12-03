package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPresses {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Key Presses")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("target"));
		element.sendKeys("Automation");

//		Option 1
//		element.sendKeys(Keys.ENTER);
		
//		Option 2
		//Actions class
		Actions action = new Actions(driver);
		action.keyDown(element, Keys.ENTER).release().build().perform();

	}

}
