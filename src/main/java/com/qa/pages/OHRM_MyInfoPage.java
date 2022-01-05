package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.baseSetup.TestBase;
import com.qa.helpers.DriverActions;
import com.qa.locators.MyInfoLocators;

public class OHRM_MyInfoPage extends TestBase implements MyInfoLocators {

	DriverActions driverActions = new DriverActions();

	public void enterFullName(String fullName) {
		WebElement firstName = driver.findElement(MyInfoLocators.FIRSTNAME_TEXTBOX);
		firstName.clear();
		firstName.sendKeys(fullName);
	}

	public void enterLastName(String lastName) {
		driverActions.enterTextIntoTextBox(MyInfoLocators.LASTNAME_TEXTBOX, lastName);
	}

	public void enterEmployeeId(String empId) {
		driverActions.enterTextIntoTextBox(MyInfoLocators.EMP_ID_TEXTBOX, empId);
	}

	public void selectGender() {
		driverActions.clickElement(MyInfoLocators.GENDER_RADIOBUTTON);
	}

	public void selectMaritalStatus(String status) {
		driverActions.selectByVisibleText(MyInfoLocators.MARITAL_STATUS_DROPDOWN, status);
	}

	public void selectNationality() {
		Select nationality = new Select(driver.findElement(MyInfoLocators.NATIOANLITY_DROPDOWN));
		nationality.selectByVisibleText("Albanian");
	}

	public void enterDateOfBirth() {
		driverActions.clickElement(MyInfoLocators.DOB_DATEPICKER);

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
	}

	public void clickEditButton() {
		driverActions.clickElement(MyInfoLocators.EDIT_BUTTON);
	}

	public void clickSaveButton() {
		driver.findElement(By.id("btnSave")).click();
	}

	public boolean verifyPersonalDetailsLabel() {
		return driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed();
	}

	public void updateMyInfo(String fName, String lName, String eid, String status) {
		Assert.assertEquals(this.verifyPersonalDetailsLabel(), true);

		this.clickEditButton();
		this.enterFullName(fName);
		this.enterLastName(lName);
		this.enterEmployeeId(eid);
		this.selectGender();
		this.selectMaritalStatus(status);
		this.selectNationality();
		this.enterDateOfBirth();
		this.clickSaveButton();
	}

}
