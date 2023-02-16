package com.lpg.qa.accountsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class VoucherReferencing{
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[10]/a") private WebElement voucherrefrencingform; 
			@FindBy (xpath="//select[@id='ddlType']") private WebElement vrselecttype;
			@FindBy (xpath="//select[@id='ddlReftype']") private WebElement vrselectvrreftype;
			@FindBy (xpath="//input[@id='txtaccount']") private WebElement accountheadtextbox;
			@FindBy (xpath="//select[@id='ddlDocID']") private WebElement vrselectdocid;
			@FindBy (xpath="//input[@id='FrmInvoicedate']") private WebElement vrdocdate;
			@FindBy (xpath="//input[@id='ToInvoicedate']") private WebElement vrrefdate;
			@FindBy (xpath="//input[@id='txtAmtToAdj']") private WebElement vramounttoadjust;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement vrsavebtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement vrclearbtn;
			
			
			
			
			// initialization
			
			
				public VoucherReferencing(WebDriver driver) {
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
					public void VerifyandClickonMyerpVoucherReferencingForm () { 
						 Assert.assertTrue(voucherrefrencingform.isEnabled(),"voucherrefrencing form is enabled");
						 Reporter.log("voucherrefrencingform", true);
						 voucherrefrencingform.click();

	                 }  
					public void VerifyandClickonMyerpVRSelectDOCType () throws InterruptedException {
						Thread.sleep(1000);
			               Select jscb = new Select(vrselecttype);
							Assert.assertFalse(vrselecttype.isDisplayed(),"jvselecttypeis displayed");
							Assert.assertFalse(vrselecttype.isSelected());
							jscb.selectByVisibleText("Receipt");

	                } 
					public void VerifyandClickonMyerpVRSelectRefType () throws InterruptedException { 
						Thread.sleep(1000);
			               Select jscb = new Select(vrselectvrreftype);
							Assert.assertFalse(vrselectvrreftype.isDisplayed(),"vrselectvrreftype is displayed");
							Assert.assertFalse(vrselectvrreftype.isSelected());
							jscb.selectByVisibleText("Bill");

	                } 
					public void VerifyandClickonVRAccountHeadTextBox() throws InterruptedException { 
						Thread.sleep(500);
						 Assert.assertTrue(accountheadtextbox.isEnabled(),"accountheadtextbox form is enabled");
						 Reporter.log("accountheadtextbox", true);
						 accountheadtextbox.click();
						 accountheadtextbox.sendKeys("MUMBAI FRESH : 2200048");
				  }
					public void VerifyandClickonMyerpVRSelectDOCID() throws InterruptedException { 
						Thread.sleep(1000);
			            Select jscb = new Select(vrselectdocid);
						Assert.assertFalse(vrselectdocid.isDisplayed(),"vrselectdocid is displayed");
						Assert.assertFalse(vrselectdocid.isSelected());
						jscb.selectByVisibleText("2200048****18/11/2022****106936****MUMBAI FRESH");

	                } 
					public void VerifyandClickonMyerpVRSelectDocDate() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vrdocdate.isEnabled(),"vrdocdate is enabled");
						Reporter.log("vrdocdate", true);
						vrdocdate.click();

	                } 
					public void VerifyandClickonMyerpVRSelectRefDate() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vrrefdate.isEnabled(),"vrrefdate form is enabled");
						Reporter.log("vrrefdate", true);
						vrrefdate.click();

	                } 
					public void VerifyandClickonMyerpVRAmountToAdjust() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vramounttoadjust.isEnabled(),"vramounttoadjust form is enabled");
						Reporter.log("vramounttoadjust", true);
						vramounttoadjust.click();
						vramounttoadjust.sendKeys("100");
	                } 
					public void VerifyandClickonMyerpVRClearBtn() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vrclearbtn.isEnabled(),"vrclearbtn form is enabled");
						Reporter.log("vrclearbtn", true);
						vrclearbtn.click();
						
	                } 
					public void VerifyandClickonMyerpVRSaveBtn() throws InterruptedException {
						Thread.sleep(1000);
						Assert.assertTrue(vrsavebtn.isEnabled(),"vrsavebtn form is enabled");
						Reporter.log("vrsavebtn", true);
						vrsavebtn.click();
						
	                } 
					
					
					
					
					
					
					
					
					
					
					
}