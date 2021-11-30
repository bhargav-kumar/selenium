package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Selenium");

		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.id(""));
	}
}
