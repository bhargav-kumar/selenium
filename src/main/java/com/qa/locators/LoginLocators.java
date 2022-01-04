package com.qa.locators;

import org.openqa.selenium.By;

public interface LoginLocators {

	By userName = By.id("txtUsername");

	By password = By.id("txtPassword");
	By loginButton = By.id("btnLogin");
}
