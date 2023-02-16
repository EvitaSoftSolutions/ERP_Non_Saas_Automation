package com.lpg.qa.PurchasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class PurchaseServiceListForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Purchase']")private WebElement purchasemodule;
	@FindBy(xpath="//a[text()=' Purchase Service List']")private WebElement purchaseservicelist;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//a[text()='Edit']")private WebElement editbtn;
	@FindBy(xpath="//button[@id='btnDelete']")private WebElement deletebtn;
	
	//initialization
		public PurchaseServiceListForm(WebDriver driver) {
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
		public void verifyMyerpPurchaseModule() {
			Assert.assertTrue(purchasemodule.isEnabled(),"PurchaseModule is enable");
			Reporter.log("verifyMyerppurchasemodule",true);
			purchasemodule.click();
		}
		public void verifyMyerpPurchaseServiceList() {
			Assert.assertTrue(purchaseservicelist.isEnabled(),"PurchaseServiceList is enable");
			Reporter.log("verifyMyerppurchaseservicelist",true);
			purchaseservicelist.click();
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}
		public void verifyMyerpEditbtn() {
			Assert.assertTrue(editbtn.isEnabled(),"Editbtn is enable");
			Reporter.log("verifyMyerpeditbtn",true);
			editbtn.click();
		}
		public void verifyMyerpDeletebtn() {
			Assert.assertTrue(deletebtn.isEnabled(),"Deletebtn is enable");
			Reporter.log("verifyMyerpdeletebtn",true);
			deletebtn.click();
		}

}
