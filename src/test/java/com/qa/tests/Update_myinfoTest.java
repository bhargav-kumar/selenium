package com.qa.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseSetup.TestBase;
import com.qa.listeners.TestNGListeners;
import com.qa.pages.OHRM_LoginPage;
import com.qa.pages.OHRM_MyInfoPage;
import com.qa.util.ReadDataFromExcel;

@Listeners(TestNGListeners.class)
public class Update_myinfoTest extends TestBase {

	OHRM_LoginPage ohrmLogin = new OHRM_LoginPage();
	OHRM_MyInfoPage myInfoPage = new OHRM_MyInfoPage();
	ReadDataFromExcel readData = new ReadDataFromExcel();

	@BeforeTest
	public void setup() {
		TestBase.intialization();
	}

	@DataProvider
	public Object[][] getTestDataFormExcel() {
		Object data[][] = ReadDataFromExcel.getData("myInfo");
		System.out.println("data : "+data);
		return data;
	}

	@Test(dataProvider="getTestDataFormExcel")
	public void testMethod(String fName, String lName, String eid, String status) {
		ohrmLogin.logIntoApplication();
		// Edit details
		myInfoPage.updateMyInfo(fName, lName, eid, status);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
