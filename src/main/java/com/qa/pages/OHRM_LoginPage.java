package com.qa.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.baseSetup.TestBase;
import com.qa.locators.LoginLocators;

public class OHRM_LoginPage extends TestBase {

	public void enterUserName(String userName) {
		driver.findElement(LoginLocators.USERNAME_TEXTBOX).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(LoginLocators.PASSWORD_TEXTBOX).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(LoginLocators.LOGIN_BUTTON).click();
	}
	
	public boolean homePageLogo() {
		return driver.findElement(By.xpath("//div[@id='branding']/a/img")).isDisplayed();
	}
	
	public void logIntoApplication() {
		this.enterUserName("Admin");
		this.enterPassword("admin123");
		this.clickOnLoginButton();
		
		
		Assert.assertEquals(this.homePageLogo(), true, "Orange HRM logo is not displayed on home page");
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}

}
