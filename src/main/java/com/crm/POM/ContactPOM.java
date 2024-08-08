package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.JavaUtility.date;


	public class ContactPOM {
		
		public ContactPOM(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		private @FindBy(xpath = "//a[text()='Contacts']")
		WebElement contactButton ;
		
		private @FindBy(xpath = "//img[@title='Create Contact...']")
		WebElement newcontact;
		
		private @FindBy(xpath = "//input[@name='lastname']")
		WebElement contactName;
		
		private @FindBy(name = "support_start_date")
		WebElement startdate;
		
		private @FindBy(name = "support_end_date")
		WebElement enddate;
		
		private @FindBy(xpath = "//input[@accesskey='S']")
		WebElement saveButton;
		
		

		public WebElement getContactButton() {
			contactButton.click();
			return contactButton;
		}

		public WebElement getNewcontact() {
			newcontact.click();
			return newcontact;
		}


		public WebElement getContactName() {
			contactName.sendKeys("vaibhav");
			return contactName;
		}


		public WebElement getSaveButton() {
			saveButton.click();
			return saveButton;
		}


		public WebElement getStartdate() {
			startdate.sendKeys(date.startdate());
			return startdate;
		}

		public WebElement getEnddate() {
			enddate.sendKeys(date.enddate());
			return enddate;
		}
		
	}



