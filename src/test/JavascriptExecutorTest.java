package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/"); // https://www.facebook.com/login
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		WebElement element = driver.findElement(By.linkText("A/B Testing"));

		// Click
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
//
//		// Scroll Element
		WebElement editorElement = driver.findElement(By.linkText("WYSIWYG Editor"));
		js.executeScript("arguments[0].scrollIntoView(true);", editorElement);

//		// ScrollBy Pixels
		js.executeScript("window.scrollBy(0,250);", "");

//		// TODO: Scroll by document height
		js.executeScript("window.scrollTo(0, document.scrollTo(0, document.body.scrollHeight())");

//		// To print title
		String title = js.executeScript("return document.title;").toString();
		System.out.println("title : " + title);

		String text = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("intter text : " + text);

//		Assignment: 1. Enter text into text box. 2. Get Attribute value
//		WebElement facebookEmail = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].value='automation'", facebookEmail);  

		Thread.sleep(2000);
//		//To reload/refresh the web page
		js.executeScript("location.reload();");

	}

}
