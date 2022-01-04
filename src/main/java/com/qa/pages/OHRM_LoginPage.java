package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.baseSetup.TestBase;
import com.qa.helpers.Login;

public class OHRM_LoginPage extends TestBase {

	Login login = new Login();

	public void logIntoApplication() {

		login.enterUserName("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();

		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}

}
