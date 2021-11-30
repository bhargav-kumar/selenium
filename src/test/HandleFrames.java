package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(driver.findElement(By.id("comment-editor")));
		driver.findElement(By.id("commentBodyField")).sendKeys("Selenium");
		driver.switchTo().defaultContent(); //driver.switchTo().parentFrame();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//b[text()='Facebook']")).click();
		//To close entire browser
		driver.quit(); //driver.close(); - To close a current window
	}

}
