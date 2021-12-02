package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
	

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.linkText("Hovers")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"))).build().perform();
		
		driver.findElement(By.xpath("//h5[text()='name: user1']/following-sibling::a")).click();
		
		
	}

}
