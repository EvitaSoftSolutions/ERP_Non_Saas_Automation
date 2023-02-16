package com.lpg.qa.accpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class DayBookDetails {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//span[text()='Accounts Report']") private WebElement accountreport;
			@FindBy (xpath="//a[text()=' Day Book Details']") private WebElement daybookdetail;
			@FindBy (xpath="//input[@id='FromDate']") private WebElement fromdate;
			@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
			
			// initialization
			public DayBookDetails(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

				// usage
				public void VerifyandClickonMyerpLoginwithoutBtn1() {
					 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
					 Assert.assertEquals("please enter valid agancycode","please enter valid userid","please enter valid password");
					 Reporter.log(" verifyMyerplogin",true);
					login.click();
				}
				
				public void verifyMyerpagancycode() {
					 Assert.assertTrue(agancycode.isEnabled(),"agancycode field is enabled");
					 Reporter.log("verifyMyerpagancycode", true);
					 agancycode.sendKeys("ERP_00001");
				}
				public void verifyMyerpUserid() {
					 Assert.assertTrue(userid.isEnabled(),"uerid field is enabled");
					 Reporter.log("verifyMyerpUserid", true);
					 userid.sendKeys("admin");
				}
				public void verifyMyerpPassword() {
					 Assert.assertTrue(password.isEnabled(),"passwordfield is enabled");
					 Reporter.log("verifyMyerpPassword", true);
					 password.sendKeys("admin@123");
				}
				
				public void VerifyandClickonMyerpLoginBtn() {
					 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
					 Reporter.log("verifyMyerplogin", true);
					login.click();
				}
				public void VerifyandClickonMyerpAccountReport() {
					 Assert.assertTrue(accountreport.isEnabled(),"accountreport is enabled");
					 Reporter.log("verifyMyerpaccountreport", true);
					 accountreport.click();
				}
				
				public void VerifyandClickonMyerpDayBookdetailReport() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue( daybookdetail.isEnabled()," daybookdetailis enabled");
					 Reporter.log("verifyMyerpdaybookdetail", true);
					 daybookdetail.click();
					 
				}
				public void VerifyMyerpFromDate() {
					 Assert.assertTrue(fromdate.isEnabled(),"fromdate field is enabled");		 
					 Reporter.log("verifyMyerpfromdate", true);
					 fromdate.click(); 
					 fromdate.clear();
					 fromdate.sendKeys("8/01/2023");
				}

				public void VerifyMyerpTodate() {
					 Assert.assertTrue(todate.isEnabled(),"todate field is enabled");		 
					 Reporter.log("verifyMyerptodate", true);
					 todate.click(); 
					 todate.clear();
					 todate.sendKeys("17/01/2023");
				}
				public void VerifyandClickonMyerpGetdataBtn() {
					 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
					 Reporter.log(" verifyMyerpgetdatabtn", true);
					 getdatabtn.click();
				
				}
}                   
