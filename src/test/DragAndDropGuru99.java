package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropGuru99 {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		WebElement source = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement target = driver.findElement(By.id("amt8"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(source).pause(Duration.ofSeconds(3)).moveToElement(target).pause(Duration.ofSeconds(3)).release().build().perform();
//		action.dragAndDrop(source, target).build().perform();
		
	}

}
