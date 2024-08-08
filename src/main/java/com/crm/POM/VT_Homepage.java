package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VT_Homepage {
	public VT_Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//a[text() = 'Organizations']")
	WebElement organization ;
	public void signOut() {
		signOut();
	}

}
