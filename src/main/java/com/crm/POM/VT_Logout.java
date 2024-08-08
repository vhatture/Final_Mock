package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VT_Logout {
	public VT_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "(//td[@class='small'])[2]")
	WebElement account ;
	private @FindBy(xpath = "//a[text()='Sign Out']")
	WebElement signout ;
	
	public void signout() {
		account.click();
		signout.click();
	}

}
