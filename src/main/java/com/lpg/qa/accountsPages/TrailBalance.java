package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class TrailBalance {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//span[text()='Accounts Report']") private WebElement accountreport;
			@FindBy (xpath="//a[text()=' Accounting Reports']") private WebElement accountingreport;
			@FindBy (xpath="//*[@id=\"tblGeneralMasters_paginate\"]/ul/li[3]/a") private WebElement pagenav;
			@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[6]/td[2]/a") private WebElement trailbalance;
			@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp;
			@FindBy (xpath="//input[@id='FromDate']") private WebElement fromdate;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;
			
			// initialization
			public TrailBalance(WebDriver driver) {
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
				public void VerifyandClickonMyerpAccountingReport() {
					 Assert.assertTrue(accountingreport.isEnabled(),"accountingreport is enabled");
					 Reporter.log("verifyMyerpaccountingreport", true);
					 accountingreport.click();
				}
				public void VerifyandClickonMyerpPageNavigation() {
					 Assert.assertTrue(pagenav.isEnabled(),"pagenav is enabled");
					 Reporter.log("verifyMyerppagenav", true);
					 pagenav.click();
				}
				
				public void VerifyandClickonMyerpTrailBalanceReport() throws InterruptedException {
					Thread.sleep(600);
					 Assert.assertTrue(trailbalance.isEnabled(),"trailbalance is enabled");
					 Reporter.log("verifyMyerptrailbalance", true);
					 trailbalance.click();
					 
				}
				public void verifyMyerpSelectCompany() throws InterruptedException {
					Select su = new Select(selectcomp);
					Thread.sleep(1000);
					Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
					Assert.assertFalse(selectcomp.isSelected());
					su.selectByVisibleText("ANITA GAS SERVICES");
				
				}
				
				public void VerifyMyerpFromDate() {
					 Assert.assertTrue(fromdate.isEnabled(),"fromdate field is enabled");		 
					 Reporter.log("verifyMyerpfromdate", true);
					 fromdate.click(); 
					 fromdate.clear();
					 fromdate.sendKeys("1/01/2023");
				}

				public void VerifyandClickonMyerpGetdataBtn() {
					 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
					 Reporter.log(" verifyMyerpgetdatabtn", true);
					 getdatabtn.click();
				
				}
}                   
