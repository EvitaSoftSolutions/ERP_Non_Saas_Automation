package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class CounterSaleInvoiceDetails {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement gerneralreport; 
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[8]/a") private WebElement counterinvoicedetails;
			@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp;
			@FindBy (xpath="//input[@id='txtCounterSaleId']") private WebElement countersaleinvoiceno;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn; 
			@FindBy (xpath="//button[@id='btnPrint']") private WebElement printinvoicebtn; 
			
			
			
			
			// initialization
						public CounterSaleInvoiceDetails(WebDriver driver) {
							PageFactory.initElements(driver, this);
						}

							// usage
					
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
							public void VerifyandClickonMyerpConterInvoiceDetails() {
								 Assert.assertTrue(counterinvoicedetails.isEnabled(),"counterinvoicedetails is enabled");
								 Reporter.log(" verifyMyerpcounterinvoicedetails", true);
								 counterinvoicedetails.click();
							}
							
							public void verifyMyerpSelectCompany() throws InterruptedException {
								Select su = new Select(selectcomp);
								Thread.sleep(1000);
								Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
								Assert.assertFalse(selectcomp.isSelected());
								su.selectByVisibleText("ANITA GAS SERVICES");
							
							}
							
							public void VerifyandClickonMyerpCounterSaleVoucherNumber() {
								 Assert.assertTrue(countersaleinvoiceno.isEnabled(),"purchasebillno is enabled");
								 Reporter.log(" verifyMyerppurchasebillno", true);
								 countersaleinvoiceno.click();
								 countersaleinvoiceno.sendKeys("2200016");
								 
							}
							public void VerifyandClickonMyerpGetdataBtn() {
								 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
								 Reporter.log(" verifyMyerpgetdatabtn", true);
								 getdatabtn.click();
								 
							}
							public void VerifyandClickonMyerpPrintInvoiceBtn() throws InterruptedException {
								Thread.sleep(1000);
								 Assert.assertTrue(printinvoicebtn.isEnabled(),"printinvoicebtn is enabled");
								 Reporter.log(" verifyMyerprintinvoicebtn", true);
								 printinvoicebtn.click();
								 
							}
}


