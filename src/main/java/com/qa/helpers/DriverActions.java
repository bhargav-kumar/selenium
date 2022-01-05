package com.qa.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.baseSetup.TestBase;

public class DriverActions extends TestBase {

	public void clickElement(By element) {
		driver.findElement(element).click();
	}
	
	public void enterTextIntoTextBox(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}

	public void getText(By element) {
		driver.findElement(element).getText();
	}

	public void selectByVisibleText(By element, String text) {
		Select select = new Select(driver.findElement(element));
		select.selectByVisibleText(text);
	}

	public void selectByValue(By element) {

	}

	public void selectByIndex(By element) {

	}

	public void switchToParentWidow(By element) {

	}

	public void switchToChildWidow(By element) {

	}

	public void getWebElement(By element) {

	}

	public void getWebElements(By element) {

	}

}
