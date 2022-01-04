package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.baseSetup.TestBase;
import com.qa.pages.OHRM_LoginPage;

public class GoogleTest extends TestBase{

	OHRM_LoginPage ohrmLogin = new OHRM_LoginPage();
	
	@BeforeTest
	public void setup() {
		TestBase.intialization();
	}

	@Test
	public void testMethod() {
		ohrmLogin.logIntoApplication();
	}

	@AfterTest
	public void tearDown() {
		TestBase.driver.quit();
	}

}
