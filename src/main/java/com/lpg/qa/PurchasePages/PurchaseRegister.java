package com.lpg.qa.PurchasePages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class PurchaseRegister {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a") private WebElement gerneralreport; 
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[5]/a") private WebElement purchaseregister;
			@FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
			@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;
			@FindBy (xpath="//select[@id='ddlSupplierID']") private WebElement selectsupplier;
			@FindBy (xpath="//select[@id='ddlPurchaseType']") private WebElement selectpurchasetype;
			@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement selectcomp;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
			 @FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;
			
			
			
			// initialization
						public PurchaseRegister(WebDriver driver) {
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
							public void VerifyandClickonMyerpPurchaseRegister() {
								 Assert.assertTrue(purchaseregister.isEnabled(),"purchaseregister is enabled");
								 Reporter.log(" verifyMyerppurchaseregister", true);
								 purchaseregister.click();
							}
							public void VerifyandClickonMyerpPlaseFromSelectDate() throws InterruptedException {
								 Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
								 Reporter.log(" verifyMyerpselectdate", true);
								 selectdate.click();
								 selectdate.clear();
								 selectdate.sendKeys("01/01/2023");
								 body.click();
								 Thread.sleep(500);
							}
							public void VerifyandClickonMyerpPlaseToSelectDate() throws InterruptedException {
								 Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
								 Reporter.log(" verifyMyerpselectdate", true);
								 selectdate.click();
								 selectdate.clear();
								 selectdate.sendKeys("13/01/2023");
								 body.click();
								 Thread.sleep(500);
							}
							public void verifyMyerpSelectCompany() throws InterruptedException {
								Select su = new Select(selectcomp);
								Thread.sleep(1000);
								Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
								Assert.assertFalse(selectcomp.isSelected());
								su.selectByVisibleText("ANITA GAS SERVICES");
							
							}
							public void verifyMyerpSelectSupplier() throws InterruptedException {
								Select su = new Select(selectsupplier);
								Thread.sleep(1000);
								Assert.assertFalse(selectsupplier.isDisplayed(),"selectsupplier is displayed");
								Assert.assertFalse(selectsupplier.isSelected());
								su.selectByVisibleText("SUP_RITESH NTPC_30");
							
							}
							public void verifyMyerpSelectPurchaseType() throws InterruptedException {
								Select su = new Select(selectpurchasetype);
								Thread.sleep(1000);
								Assert.assertFalse(selectpurchasetype.isDisplayed(),"selectpurchasetype is displayed");
								Assert.assertFalse(selectpurchasetype.isSelected());
								su.selectByVisibleText("Purchase BPCL");
							
							}
							
							
							public void VerifyandClickonMyerpGetdataBtn() {
								 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
								 Reporter.log(" verifyMyerpgetdatabtn", true);
								 getdatabtn.click();
								 getdatabtn.click();
							}
			}                   

							
							
							
							
