package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipeWindows {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow : "+ parentWindow);
		
		Set<String> childWindow = driver.getWindowHandles();
		
		for(String windows : childWindow) {
			if(!windows.equals(parentWindow)) {
				driver.switchTo().window(windows);
				break;
			}
		}
		String childWindowTitle = driver.getTitle();
		System.out.println("childWindowTitle : "+childWindowTitle);
		driver.close();
		driver.switchTo().window(parentWindow);
		String parentWindowTitle = driver.getTitle();
		System.out.println("parentWindowTitle : "+parentWindowTitle);
		driver.quit();
	}

}
