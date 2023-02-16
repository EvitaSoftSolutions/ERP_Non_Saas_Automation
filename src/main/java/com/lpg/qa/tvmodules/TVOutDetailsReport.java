package com.lpg.qa.tvmodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class TVOutDetailsReport{
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[9]/a") private WebElement tvoutdeatailsreport; 
			@FindBy (xpath="//input[@id='FromDate']") private WebElement pleaseselectfromdate;
			@FindBy (xpath="//input[@id='ToDate']") private WebElement pleaseselecttodate;
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div/div") private WebElement tvregboxbody;
			@FindBy (xpath="//input[@id='txtConsumerNo']") private WebElement gmtvregconsumernum;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement tvoreggetdatabtn;
		
	
			
			// initialization
			public TVOutDetailsReport(WebDriver driver) {
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
				public void VerifyMyerpTVModuleTVoutdetailsReport() {
					 Assert.assertTrue(tvoutdeatailsreport.isEnabled(),"tvoutdeatailsreport field is enabled");		 
					 Reporter.log("verifyMyerptvoutdeatailsreport", true);
					 tvoutdeatailsreport.click(); 
				}
				public void VerifyMyerpGRTVRPlaseSelectFromDate() {
					 Assert.assertTrue(pleaseselectfromdate.isEnabled(),"pleaseselectfromdate field is enabled");		 
					 Reporter.log("verifyMyerppleaseselectfromdate", true);
					 pleaseselectfromdate.clear();
					 pleaseselectfromdate.click(); 
					 pleaseselectfromdate.sendKeys("5/01/2023");
				}
				public void VerifyMyerpGRTVoRegTVRPlaseSelectToDate() {
					 Assert.assertTrue(pleaseselecttodate.isEnabled(),"pleaseselecttodate field is enabled");		 
					 Reporter.log("verifyMyerppleaseselecttodate", true);
					 pleaseselecttodate.clear();
					 pleaseselecttodate.sendKeys("5/01/2023");
					
				}
				public void VerifyandClickonMyerpTVOUTRegBoxbody() {
					 Assert.assertTrue(tvregboxbody.isEnabled(),"tvregboxbody field is enabled");
					 Reporter.log(" verifyMyerptvregboxbody", true);
					 tvregboxbody.click();
				}
				
				
				public void VerifyMyerpGRTVoRegConsumerNumber() {
					 Assert.assertTrue(gmtvregconsumernum.isEnabled(),"gmtvregconsumernum field is enabled");		 
					 Reporter.log("verifyMyerpgmtvregconsumernum", true);
					 gmtvregconsumernum.click(); 
					 gmtvregconsumernum.sendKeys("89435349");
				}
				public void VerifyandClickonMyerpTVOUTRegGetDataBtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(tvoreggetdatabtn.isEnabled(),"tvoreggetdatabtn is enabled");
					 Reporter.log(" verifyMyerptvoreggetdatabtn", true);
					 tvoreggetdatabtn.click();
					
				}
				public void VerifyandClickonMyerpTVOUTReg1Boxbody() {
					 Assert.assertTrue(tvregboxbody.isEnabled(),"tvregboxbody field is enabled");
					 Reporter.log(" verifyMyerptvregboxbody", true);
					 tvregboxbody.click();
				}
				
				
				}

			