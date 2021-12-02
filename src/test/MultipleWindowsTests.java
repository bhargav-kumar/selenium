package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTests {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.findElement(By.linkText("Multiple Windows")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow : " + parentWindow);
		String parentWindowTitle = driver.getTitle();
		System.out.println("parentWindowTitle : " + parentWindowTitle);

		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows= driver.getWindowHandles();
		for(String childWindow: windows) {
			if(childWindow.equals(parentWindow) == false) {
				driver.switchTo().window(childWindow);
			}
		}
		
		String childWindowTitle = driver.getTitle();
		System.out.println("childWindowTitle : " + childWindowTitle);
		
		driver.close();
		driver.switchTo().defaultContent();
		
	}

}
