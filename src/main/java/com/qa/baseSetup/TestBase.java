package com.qa.baseSetup;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	static Properties properties;

	public TestBase() {
		try {
			properties = new Properties();
			FileInputStream file = new FileInputStream("D:\\Projects\\Java\\new\\Selenium-Maven-Framework\\src\\main\\java\\com\\qa\\config\\config.properties");
			properties.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver driver;

	public static void intialization() {

//		String browser = "chrome";

		System.out.println("System.getProperty(\"browser\") : "+ properties.getProperty("browser"));
		if (properties.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (properties.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/chbha/Downloads/chromedriver_win32/gecko.exe");
			driver = new FirefoxDriver();

		} else if (properties.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/chbha/Downloads/chromedriver_win32/edge.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(properties.getProperty("url"));
	}

}
