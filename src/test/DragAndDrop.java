package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Drag and Drop")).click();
		
		WebElement element1 = driver.findElement(By.id("column-a"));
		WebElement element2 = driver.findElement(By.id("column-b"));
		Actions a = new Actions(driver);
		
//		a.clickAndHold(element1).dragAndDrop(element1, element2).build().perform();
		a.dragAndDrop(element1, element2).clickAndHold(element2).build().perform();
		

	}

}
