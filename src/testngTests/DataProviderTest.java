package testngTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ReadExcelData;

public class DataProviderTest {
	ReadExcelData excelData;
	WebDriver driver;
	

	@BeforeTest
	public void intialization() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		excelData = new ReadExcelData();
	}

	@DataProvider
	public Object[][] getTestDataFormExcel() {
		Object data[][] = ReadExcelData.getData();
		System.out.println("data : "+data);
		return data;
	}

	@Test(dataProvider="getTestDataFormExcel")
	public void yahooTest(String emailId, String password) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("txtUsername")).sendKeys("test");
		driver.findElement(By.id("txtPassword")).sendKeys("test");
	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
