package com.lpg.qa.tvmodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TVOutInvoiceDetailsReport {
		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
		@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[10]/a") private WebElement tvoutinvoicedeatailsreport; 
		@FindBy (xpath="//input[@id='txtTVOUTId']") private WebElement gmtvoinvoicedocnum;
		@FindBy (xpath="//button[@id='btnGetdata']") private WebElement tvoinvoiceoreportgetdatabtn;
		
	
			
			// initialization
			public TVOutInvoiceDetailsReport(WebDriver driver) {
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
				public void VerifyMyerpTVOUTInvoiceDetailReport() {
					 Assert.assertTrue(tvoutinvoicedeatailsreport.isEnabled(),"tvoutinvoicedeatailsreport field is enabled");		 
					 Reporter.log("verifyMyerptvoutinvoicedeatailsreport", true);
					 tvoutinvoicedeatailsreport.click(); 
				}
				
				public void VerifyMyerpTVoutinvoicedetailsReportDocnum() {
					 Assert.assertTrue(gmtvoinvoicedocnum.isEnabled(),"gmtvoinvoicedocnum field is enabled");		 
					 Reporter.log("verifyMyerpgmtvoinvoicedocnum", true);
					 gmtvoinvoicedocnum.click();
					 gmtvoinvoicedocnum.sendKeys("2200002");
					 
				}
				
				public void VerifyMyerpGRTVoInvoiveDetailsReportGetDataBtn() {
					 Assert.assertTrue(tvoinvoiceoreportgetdatabtn.isEnabled(),"tvoinvoiceoreportgetdatabtn field is enabled");		 
					 Reporter.log("verifyMyerptvoinvoiceoreportgetdatabtn", true);
					 tvoinvoiceoreportgetdatabtn.click(); 
					 tvoinvoiceoreportgetdatabtn.sendKeys("89435349");
				}
}

			