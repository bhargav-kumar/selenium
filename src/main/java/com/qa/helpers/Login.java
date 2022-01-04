package com.qa.helpers;

import com.qa.baseSetup.TestBase;
import com.qa.locators.LoginLocators;

public class Login extends TestBase implements LoginLocators{

	LoginLocators loginLocators;
	
	public void enterUserName(String userName) {
		driver.findElement(LoginLocators.userName).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(LoginLocators.password).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(LoginLocators.loginButton).click();
	}

}
