package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class VoucherDereferencing{
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[11]/a") private WebElement voucherderefrencingform;
			@FindBy (xpath="//select[@id='ddlType']") private WebElement vdrselecttype;
			@FindBy (xpath="//input[@id='txtToDocNo']") private WebElement vdrdocnumber;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement vdrclearbtn;
			@FindBy (xpath="//button[@id='btnGet']") private WebElement vdrgetdatabtn;
			@FindBy (xpath="//button[@id='btnDelete']") private WebElement vdrdereferencebtn;
			
			
			// initialization
			
			
				public VoucherDereferencing(WebDriver driver) {
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
					public void VerifyandClickonMyerpAccountsModule () {
						 Assert.assertTrue(acconutsmodule.isEnabled(),"acconutsmodule is enabled");
						 Reporter.log(" verifyMyerpacconutsmodule", true);
						 acconutsmodule.click();
					}
					public void VerifyandClickonMyerpVoucherDeReferencingForm () { 
						 Assert.assertTrue(voucherderefrencingform.isEnabled(),"voucherderefrencingform form is enabled");
						 Reporter.log("voucherderefrencingform", true);
						 voucherderefrencingform.click();

	                 }  
					public void VerifyandClickonMyerpVRSelectType () throws InterruptedException {
						Thread.sleep(1000);
			               Select vdrst = new Select(vdrselecttype);
							Assert.assertFalse(vdrselecttype.isDisplayed(),"jvselecttypeis displayed");
							Assert.assertFalse(vdrselecttype.isSelected());
							vdrst.selectByVisibleText("Receipt");

	                } 
					
					public void VerifyandClickonMyerpVDRDocNumber() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vdrdocnumber.isEnabled(),"vdrdocnumber is enabled");
						Reporter.log("vdrdocnumber", true);
						vdrdocnumber.click();
						vdrdocnumber.sendKeys("2200039");
						
	                } 
					
					public void VerifyandClickonMyerpVDRCleareBtn() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vdrclearbtn.isEnabled(),"vdrclearbtn form is enabled");
						Reporter.log("vdrclearbtn", true);
						vdrclearbtn.click();
						
	                } 
					public void VerifyandClickonMyerpVRGetDataBtn() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vdrgetdatabtn.isEnabled(),"vdrgetdatabtn is enabled");
						Reporter.log("vdrgetdatabtn", true);
						vdrgetdatabtn.click();
						
	                } 
					
					
					public void VerifyandClickonMyerpVDRDeRefrenceBtn() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vdrdereferencebtn.isEnabled(),"vdrdereferencebtn is enabled");
						Reporter.log("vdrdereferencebtn", true);
						vdrdereferencebtn.click();
						
	                } 
					
					
					
					
					
					
					
					
					
					
					
}