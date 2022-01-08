package com.qa.tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
import org.apache.log4j.Logger;

import com.qa.baseSetup.TestBase;
import com.qa.pages.OHRM_LoginPage;

public class OHRM_LoginTest extends TestBase{

	Logger log = Logger.getLogger(OHRM_LoginTest.class);
	OHRM_LoginPage ohrmLogin = new OHRM_LoginPage();
	
	@BeforeTest
	public void setup() {
		TestBase.intialization();
		log.info("Launched application");
	}

	@Test
	public void testMethod() {
		ohrmLogin.logIntoApplication();
		log.info("User logged into the application");
	}

	@AfterTest
	public void tearDown() {
		TestBase.driver.quit();
	}

}
