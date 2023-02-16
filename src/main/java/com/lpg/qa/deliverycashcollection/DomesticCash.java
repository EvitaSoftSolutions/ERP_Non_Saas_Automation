package com.lpg.qa.deliverycashcollection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class DomesticCash {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"null\"]/a/span[1]") private WebElement dccmodule;
			@FindBy (xpath="//*[@id=\"null\"]/ul/li/a") private WebElement domesticcashform;
			@FindBy (xpath="//input[@id='datepicker']") private WebElement dcccalender;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement dccgetdatabtn;
			@FindBy (xpath="//input[@id='btnEdit']") private WebElement dcddlselectbutton;
			@FindBy (xpath="//input[@id='txtInvoiceNo']") private WebElement dcinvoicenum;
			@FindBy (xpath="//input[@id='txtConusmerNo']") private WebElement dcconsumernum;
			@FindBy (xpath="//input[@id='txtRecivedAmt']") private WebElement  dccashreceivedamount;
			@FindBy (xpath="//button[@id='btnCancel']") private WebElement  dccancelbtn;
			@FindBy (xpath="//button[@id='btnDeleteDetails']") private WebElement dcdeletebtn;
			@FindBy (xpath="//button[@id='btnSaveDetails']") private WebElement dcsavebtn;
			@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement dcexportbtn;

			// initialization
			public DomesticCash(WebDriver driver) {
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
				public void VerifyandClickonMyerpDeliveryCashCollectionModule(){
					 Assert.assertTrue(dccmodule.isEnabled(),"dccmodule is enabled");
					 Reporter.log(" verifyMyerpdccmodule", true);
					 dccmodule.click();
				}
				public void VerifyandClickonMyerpDomesticCashForm(){
					 Assert.assertTrue(domesticcashform.isEnabled(),"domesticcashform is enabled");
					 Reporter.log(" verifyMyerpdomesticcashform", true);
					 domesticcashform.click();
				}
				public void VerifyandClickonMyerpDCCalender(){
					 Assert.assertTrue(dcccalender.isEnabled(),"dcccalender is enabled");
					 Reporter.log(" verifyMyerpdcccalender", true);
					 dcccalender.click();
					 dcccalender.clear();
					 dcccalender.sendKeys("03/12/2022");
				}
				public void VerifyandClickonDCMyerpGetDataBtn() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue(dccgetdatabtn.isEnabled(),"dccgetdatabtn is enabled");
					 Reporter.log(" verifyMyerpdccgetdatabn", true);
					 dccgetdatabtn.click();
				}
				public void VerifyandClickonMyerpDCSelectBtn() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue(dcddlselectbutton.isEnabled(),"dcddlselectbutton is enabled");
					 Reporter.log(" verifyMyerpdcddlselectbutton", true);
					 dcddlselectbutton.click();
				}
				public void VerifyandClickonMyerpDCInvoiceNumber() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue( dcinvoicenum.isEnabled()," dcinvoicenum is enabled");
					 Reporter.log(" verifyMyerp dcinvoicenum", true);
					 dcinvoicenum.click();
					 dcinvoicenum.sendKeys("4003");
				}
				public void VerifyandClickonMyerpDCConsumerNumber() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue(dcconsumernum.isEnabled(),"dcconsumernum is enabled");
					 Reporter.log(" verifyMyerpdcconsumernum", true);
					 dcconsumernum.click();
					 dcconsumernum.sendKeys("4004");
					 
				}
				public void VerifyandClickonMyerpDCCashReceivedAmount() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue(dccashreceivedamount.isEnabled(),"dccashreceivedamount is enabled");
					 Reporter.log(" verifyMyerpdccashreceivedamount", true);
					 dccashreceivedamount.click();
					 dccashreceivedamount.sendKeys("15000");
					 
				}
				public void VerifyandClickonMyerpDCCancelBtn() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue(dccancelbtn.isEnabled(),"dccancelbtn is enabled");
					 Reporter.log(" verifyMyerpdccancelbtn", true);
					 dccancelbtn.click();
				}
				public void VerifyandClickonMyerpDCDeleteBtn() throws InterruptedException{
					Thread.sleep(500);
					 Assert.assertTrue(dcdeletebtn.isEnabled(),"dcdeletebtn is enabled");
					 Reporter.log(" verifyMyerpdcdeletebtn", true);
					 dcdeletebtn.click();
				}
				public void VerifyandClickonMyerpDCSaveBtn(){
					 Assert.assertTrue(dcsavebtn.isEnabled(),"dcsavebtn is enabled");
					 Reporter.log(" verifyMyerpdcsavebtn", true);
					 dcsavebtn.click();
				}
				public void VerifyandClickonMyerpDCExportBtn(){
					 Assert.assertTrue(dcexportbtn.isEnabled(),"dcexportbtn is enabled");
					 Reporter.log(" verifyMyerpdcexportbtn", true);
					 dcexportbtn.click();
				}
				
			
}