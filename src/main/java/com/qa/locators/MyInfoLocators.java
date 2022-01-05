package com.qa.locators;

import org.openqa.selenium.By;

public interface MyInfoLocators {

	By USERNAME_TEXTBOX = By.id("txtUsername");
	By FIRSTNAME_TEXTBOX = 	By.id("personal_txtEmpFirstName");
	
	By LASTNAME_TEXTBOX = 	By.id("personal_txtEmpLastName");
	By EMP_ID_TEXTBOX = 	By.id("personal_txtEmployeeId");
	By GENDER_RADIOBUTTON = 	By.id("personal_optGender_1");
	By MARITAL_STATUS_DROPDOWN = 	By.id("personal_cmbMarital");
	By NATIOANLITY_DROPDOWN = 	By.id("personal_cmbNation");

	By DOB_DATEPICKER = 	By.xpath("//input[@id='personal_DOB']/following-sibling::img");
	
	By EDIT_BUTTON = By.id("btnSave");
	
	
}
