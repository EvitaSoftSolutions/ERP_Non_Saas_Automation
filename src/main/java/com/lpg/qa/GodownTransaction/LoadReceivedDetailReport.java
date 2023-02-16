package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoadReceivedDetailReport{
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
		@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[17]/a") private WebElement loadreceiveddetailreg;
		@FindBy (xpath="//input[@id='FromDate']") private WebElement fromdate;
		@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;   
		@FindBy (xpath="//Button[@id='btnGetdata']") private WebElement getdatabtn;
		
		// initialization
					public LoadReceivedDetailReport(WebDriver driver) {
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
							 Reporter.log(" verifyMyerpPassword", true);
							 password.sendKeys("admin@123");
						}
						
						public void VerifyandClickonMyerpLoginBtn() {
							 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
							 Reporter.log("verifyMyerplogin", true);
							login.click();
						}
						
						public void VerifyMyerpGenralReportModule() {
							 Assert.assertTrue(genralreport.isEnabled(),"genralreport field is enabled");		 
							 Reporter.log("verifyMyerpgenralreport", true);
							 genralreport.click(); 
						}

						public void VerifyMyerpLoadReceivedDetailRegister() {
							 Assert.assertTrue(loadreceiveddetailreg.isEnabled(),"loadreceiveddetailreg field is enabled");		 
							 Reporter.log("verifyMyerploadreceiveddetailreg", true);
							 loadreceiveddetailreg.click(); 
						}

						public void VerifyMyerpFromDate() {
							 Assert.assertTrue(fromdate.isEnabled(),"fromdate field is enabled");		 
							 Reporter.log("verifyMyerpfromdate", true);
							 fromdate.click(); 
							 fromdate.clear();
							 fromdate.sendKeys("1/01/2023");
						}

						public void VerifyMyerpTodate() {
							 Assert.assertTrue(todate.isEnabled(),"todate field is enabled");		 
							 Reporter.log("verifyMyerptodate", true);
							 todate.click(); 
							 todate.clear();
							 todate.sendKeys("16/01/2023");
						}
					
						public void VerifyandClickonMyerpGetDataBtn() {
							 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
							 Reporter.log("verifyMyerpgetdatabtn", true);
							 getdatabtn.click();
						}

}
