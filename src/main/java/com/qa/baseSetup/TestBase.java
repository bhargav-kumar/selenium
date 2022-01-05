package com.qa.baseSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	Properties properties;

	public TestBase() {
//		try {
//			properties = new Properties();
//			File f = new File(
//					"D:\\Projects\\Java\\new\\Selenium-Maven-Framework\\src\\main\\java\\com\\qa\\config\\config.properties");
//			FileInputStream file = new FileInputStream(f);
//			properties.load(file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public static WebDriver driver;

	public static void intialization() {

		String browser = "chrome";

//		System.out.println("System.getProperty(\"browser\") : "+ System.getProperty("browser"));
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/chbha/Downloads/chromedriver_win32/gecko.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/chbha/Downloads/chromedriver_win32/edge.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
