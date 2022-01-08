package com.qa.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.qa.baseSetup.TestBase;
import com.qa.locators.LoginLocators;

public class OHRM_LoginPage extends TestBase {

	Logger log = Logger.getLogger(OHRM_LoginPage.class);
	
	public void enterUserName(String userName) {
		driver.findElement(LoginLocators.USERNAME_TEXTBOX).sendKeys(userName);
		log.info("Entered username - "+ userName);
	}

	public void enterPassword(String password) {
		driver.findElement(LoginLocators.PASSWORD_TEXTBOX).sendKeys(password);
		log.info("Entered password - "+ password);
	}

	public void clickOnLoginButton() {
		driver.findElement(LoginLocators.LOGIN_BUTTON).click();
		log.info("Login button clicked");
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
