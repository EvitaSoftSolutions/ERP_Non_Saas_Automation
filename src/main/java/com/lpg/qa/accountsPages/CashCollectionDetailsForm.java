package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CashCollectionDetailsForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Cash Collection Details']")private WebElement cashcolldet;
	@FindBy(xpath="//input[@id='Cashdate']")private WebElement cashdate;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement getdata;
	
	//initialization
	public CashCollectionDetailsForm(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

//usage
	
	public void verifyMyerpagancycode() {
		Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
		Reporter.log("verifyMyerpagancycode",true);
		agancycode.sendKeys("ERP_00001");
		
	}
	public void verifyMyerpusrname() {
		Assert.assertTrue(userid.isEnabled(),"username find is enable");
		Reporter.log("verifyMyerpUserid",true);
		userid.sendKeys("admin");
	}
	public void verifyMyerppassword() {
		Assert.assertTrue(password.isEnabled(),"password find is enable");
		Reporter.log("verifyMyerppassword",true);
		password.sendKeys("admin@123");
	}
	public void verifyMyerploginbtn() {
		Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
		Reporter.log("verifyMyerplogin",true);
		login.click();
	}
	public void verifyMyerpAccounts() {
		Assert.assertTrue(accounts.isEnabled(),"Accounts is enable");
		Reporter.log("verifyMyerpaccounts",true);
		accounts.click();
	}
	public void verifyMyerpCashcolldet() {
		Assert.assertTrue(cashcolldet.isEnabled(),"Cashcolldet is enable");
		Reporter.log("verifyMyerpcashcolldet",true);
		cashcolldet.click();
	}
	public void verifyMyerpCashdate() {
		Assert.assertTrue(cashdate.isEnabled(),"Cashdate is enable");
		Reporter.log("verifyMyerpcashdate",true);
		cashdate.clear();
		cashdate.sendKeys("01/12/2022");
	}
	public void verifyMyerpGetdata() {
		Assert.assertTrue(getdata.isEnabled(),"Getdata is enable");
		Reporter.log("verifyMyerpgetdata",true);
		getdata.click();
	}

}
