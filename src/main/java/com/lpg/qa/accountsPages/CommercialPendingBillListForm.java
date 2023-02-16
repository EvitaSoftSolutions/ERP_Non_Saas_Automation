package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CommercialPendingBillListForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Accounts']")private WebElement accounts;
	@FindBy(xpath="//a[text()=' Commercial Pending Bill List']")private WebElement compenbillist;
	@FindBy(xpath="//input[@id='Fromdate']")private WebElement fromdate;
	@FindBy(xpath="//input[@id='Todate']")private WebElement todate;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement getdata;
	
	//initialization
			public CommercialPendingBillListForm(WebDriver driver) {
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
			public void verifyMyerpCompenbillist() {
				Assert.assertTrue(compenbillist.isEnabled(),"Compenbillist is enable");
				Reporter.log("verifyMyerpcompenbillist",true);
				compenbillist.click();
			}
			public void verifyMyerpFromdate() {
				Assert.assertTrue(fromdate.isEnabled(),"Fromdate is enable");
				Reporter.log("verifyMyerpfromdate",true);
				fromdate.clear();
				fromdate.sendKeys("01/12/2022");
			}
			public void verifyMyerpTodate() {
				Assert.assertTrue(todate.isEnabled(),"Todate is enable");
				Reporter.log("verifyMyerptodate",true);
				todate.clear();
				todate.sendKeys("20/12/2022");
			}
			public void verifyMyerpGetdata() {
				Assert.assertTrue(getdata.isEnabled(),"Getdata is enable");
				Reporter.log("verifyMyerpgetdata",true);
				getdata.click();
			}

}
