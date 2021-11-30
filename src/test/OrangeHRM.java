package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	
	//Add personal details
	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Users/chbha/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

		// Edit details
		driver.findElement(By.id("btnSave")).click();

		WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
		firstName.clear();
		firstName.sendKeys("John");

		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Peter");
		driver.findElement(By.id("personal_txtEmployeeId")).sendKeys("123456");
		driver.findElement(By.id("personal_optGender_1")).click();

		Select status = new Select(driver.findElement(By.id("personal_cmbMarital")));
		status.selectByVisibleText("Single");

		Select nationality = new Select(driver.findElement(By.id("personal_cmbNation")));
		nationality.selectByVisibleText("Albanian");

//		Handle DOB Calendar
		// 1975-10-15
		driver.findElement(By.xpath("//input[@id='personal_DOB']/following-sibling::img")).click();

		Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Jan");
		
		Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByVisibleText("1980");
		
		List<WebElement> dobList = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));
		System.out.println("dobList : " + dobList.size());
		for (int i = 0; i < dobList.size(); i++) {
			String dateText = dobList.get(i).getText();
			if (dateText.equalsIgnoreCase("24")) {
				dobList.get(i).click();
			}
		}

		// Save customer details
		driver.findElement(By.id("btnSave")).click();

	}

}
