package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class EMR {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[10]/a") private WebElement emrform;
			@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement emrselectgodown;
			@FindBy (xpath="//input[@id='txtEMR_No']") private WebElement emrinvoicenumber; 
			@FindBy (xpath="//select[@id='ddlVehical_Id']") private WebElement emrselectvehicle;
			@FindBy (xpath="//input[@id='txtProduct']") private WebElement emrproduct;
			@FindBy (xpath="//input[@id='txtSoundQunatity']") private WebElement emrquantity;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement emrclearbtn;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement emrsubmitbtn;
			
			
			// initialization
			public EMR(WebDriver driver) {
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
				public void VerifyandClickonMyerpGodownTransactionModule(){
					 Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
					 Reporter.log(" verifyMyerpgtmodule", true);
					 gtmodule.click();
				}
				public void VerifyandClickonMyerpGTEMRForm() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(emrform.isEnabled(),"emrform is enabled");
					 Reporter.log(" verifyMyerpemrform", true);
					 emrform.click();

				}
			
				public void VerifyMyerpEMRSelectGodown()  throws InterruptedException {
					Select emrsg = new Select(emrselectgodown);
					Thread.sleep(1000);
					Assert.assertFalse(emrselectgodown.isDisplayed(),"emrselectgodown is displayed");
					Assert.assertFalse(emrselectgodown.isSelected());
					emrsg.selectByVisibleText("VIRAR");
				}
				public void VerifyandClickonMyerpGTEMRReInvoiceNumber() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(emrinvoicenumber.isEnabled(),"emrinvoicenumber is enabled");
					 Reporter.log("verifyMyerpemrinvoicenumber", true);
					 emrinvoicenumber.click();
					 emrinvoicenumber.sendKeys("4003");
					 
               }
				public void VerifyMyerpEMRSelectVehicle()  throws InterruptedException {
					Select emrsv = new Select(emrselectvehicle);
					Thread.sleep(500);
					Assert.assertFalse(emrselectvehicle.isSelected());
					emrsv.selectByVisibleText("MH 48 AA 7886");
				}
				public void VerifyandClickonMyerpGTEMRProduct() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(emrproduct.isEnabled(),"emrproduct is enabled");
					 Reporter.log("verifyMyerpemrproduct", true);
					 emrproduct.click();
					 emrproduct.sendKeys("5 KG COMM");
				}
				public void VerifyandClickonMyerpGTEMRSoundQauntity() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(emrquantity.isEnabled(),"emrquantity is enabled");
					 Reporter.log("verifyMyerpemrquantity", true);
					 emrquantity.click();
					 emrquantity.sendKeys("10");
				}
				public void VerifyandClickonMyerpGTEMRClearBtn() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(emrclearbtn.isEnabled(),"emrclearbtn is enabled");
					 Reporter.log("verifyMyerpemrclearbtn", true);
					 emrclearbtn.click();
				}
				public void VerifyandClickonMyerpGTEMRSubmitBtn() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(emrsubmitbtn.isEnabled(),"emrsubmitbtn is enabled");
					 Reporter.log("verifyMyerpemrsubmitbtn", true);
					 emrsubmitbtn.click();
				}
}