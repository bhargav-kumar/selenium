package testngTests;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeBrowserCapabilities {

	WebDriver driver; //Shortcut to import packages -> Ctrl+Shift+O
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars", "start-maximized", "--incognito", "headless"); //Disabled in Chrome 75 version onwards
		
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
		//Set Download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\Projects\\Java\\new\\selenium-automation\\Output\\");
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities dCapabilities = new DesiredCapabilities(options);
		dCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		dCapabilities.merge(options);
		driver = new ChromeDriver(options);
	}
	
	@Test
	public void testMethod() {
		driver.get("http://the-internet.herokuapp.com/");
//		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.linkText("chromedriver.exe")).click();
		
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Äfter method");
	}
	
}
