package com.lpg.qa.deliverycashcollection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class DomesticCashCollectionReport {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement gerneralreport;
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[15]/a") private WebElement domesticdeliveryreport;
			@FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div/div") private WebElement body;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
			
			// initialization
			public DomesticCashCollectionReport(WebDriver driver) {
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
					 Reporter.log(" verifyMyerplogin", true);
					login.click();
				}
				public void VerifyandClickonMyerpGeneralReport() {
					 Assert.assertTrue(gerneralreport.isEnabled(),"gerneralreport is enabled");
					 Reporter.log(" verifyMyerpgerneralreport", true);
					 gerneralreport.click();
				}
				
				public void VerifyandClickonMyerpGRDomesticDeliveryReport() {
					 Assert.assertTrue(domesticdeliveryreport.isEnabled(),"domesticdeliveryreport is enabled");
					 Reporter.log(" verifyMyerpdomesticdeliveryreport", true);
					 domesticdeliveryreport.click();
				}
				
				public void VerifyandClickonMyerpPlaseSelectDate() {
					 Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
					 Reporter.log(" verifyMyerpselectdate", true);
					 selectdate.click();
					 selectdate.clear();
					 selectdate.sendKeys("5/01/2022");
					 body.click();
				}
				public void VerifyandClickonMyerpGetdataBtn() {
					 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
					 Reporter.log(" verifyMyerpgetdatabtn", true);
					 getdatabtn.click();
				}
}                   
