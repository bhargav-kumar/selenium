package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-left")));
		String leftText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println("leftText : "+leftText);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		String middleText = driver.findElement(By.id("content")).getText();
		System.out.println("middleText : "+middleText);
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
