package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class ContraVoucher {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[3]/a") private WebElement contravoucherform; 
			@FindBy (xpath="//input[@id='txtVoucherNo']") private WebElement cvvnumber;
			@FindBy (xpath="//input[@id='transdate']") private WebElement cvtransactiondate; 
			@FindBy (xpath="//input[@id='txtchequeno']") private WebElement cvchequeno;
			@FindBy (xpath="//input[@id='Chequedate']") private WebElement cvchequedate;
			@FindBy (xpath="//input[@id='txtAmount']") private WebElement cvamounttxtbox;
			@FindBy (xpath="//select[@id='ddlDrwanfrom']") private WebElement cvselectdrownfrom;
			@FindBy (xpath="//select[@id='ddlDepositIn']") private WebElement cvselectdepositin;
			@FindBy (xpath="//textarea[@id='txtnarration']") private WebElement cvnarriation1;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cvsavebtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement cvnewbtn;
	
			
			
			// initialization
		
			private WebDriver driver;
			public ContraVoucher(WebDriver driver) {
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
				public void VerifyandClickonMyerpContraVoucherForm () { 
					 Assert.assertTrue(contravoucherform.isEnabled(),"contravoucherform is enabled");
					 Reporter.log("contravoucherform", true);
					 contravoucherform.click();

                 } public void VerifyandClickonMyerpContraVoucherNumber () throws InterruptedException { 
					Thread.sleep(1000);
					 Assert.assertTrue(cvvnumber.isEnabled(),"rvvnumber is enabled");
					 Reporter.log("Verifymyerppvvnumber", true);
					 cvvnumber.click();
					 cvvnumber.sendKeys("2729820");

                } 
				public void VerifyandClickonMyerpCVTransactionDate () { 
					 Assert.assertTrue(cvtransactiondate.isEnabled(),"cvtransactiondate is enabled");
					 Reporter.log("VerifyMyercrvtransactiondate", true);
					 cvtransactiondate.clear();
					 cvtransactiondate.click();
					 cvtransactiondate.sendKeys("16/12/2022");

                } 
				public void VerifyandClickonMyerpCVChequeNumber () { 
					 Assert.assertTrue(cvchequeno.isEnabled(),"rvchequeno is enabled");
					 Reporter.log("Verifymyerprvchequeno", true);
					 cvchequeno.click();
					 cvchequeno.sendKeys("57hg887");

              } 
				public void VerifyandClickonMyerpCVChequeDate () { 
					 Assert.assertTrue(cvchequedate.isEnabled(),"pvchequedate is enabled");
					 Reporter.log("Verifymyerppvchequedate", true);
					 cvchequedate.clear();
					 cvchequedate.click();
					 cvchequedate.sendKeys("16/12/2022");

              } 
				public void VerifyandClickonMyerpCVAmountTextbox() { 
					 Assert.assertTrue(cvamounttxtbox.isEnabled(),"pvamounttxtbox is enabled");
					 Reporter.log("Verifymyerppvamounttxtbox", true);
					 cvamounttxtbox.click();
					 cvamounttxtbox.sendKeys("1000");

              }
				
				public void VerifyMyerpCVSelectDrownFrom()  throws InterruptedException {
					Thread.sleep(800);
					Select alss = new Select(cvselectdrownfrom);
			        Assert.assertFalse(cvselectdrownfrom.isDisplayed(),"pvselectbankorcash is displayed");
					Assert.assertFalse(cvselectdrownfrom.isSelected());
					alss.selectByVisibleText("MAYA BANK");
				}
				public void VerifyMyerpCVSelectDepositeIn()  throws InterruptedException {
					Thread.sleep(800);
					Select alss = new Select(cvselectdepositin);
			        Assert.assertFalse(cvselectdepositin.isDisplayed(),"cvselectdepositin is displayed");
					Assert.assertFalse(cvselectdepositin.isSelected());
					alss.selectByVisibleText("IDBI BANK");
				}
				
				 
				public void VerifyandClickonMyerpRVNarration1 () { 
					 Assert.assertTrue(cvnarriation1.isEnabled(),"rpvnarriation1 is enabled");
					 Reporter.log("Verifymyerprvpvnarriation1", true);
					 cvnarriation1.click();
					 cvnarriation1.sendKeys("being paid from maya 4545 legers");

              } 
				public void VerifyandClickonMyerpCVSavebtn() throws InterruptedException { 
					 Assert.assertTrue(cvsavebtn.isEnabled(),"rvsavebtn is enabled");
					 Reporter.log("Verifymyerprvsavebtn", true);
					
					
			  } 
           public void VerifyandClickonMyerpCVAlertpopup() throws InterruptedException { 
					cvsavebtn.click();
					 Thread.sleep(1000);
					 Alert alert1 = driver.switchTo().alert();
					 String alertMagssage1 = driver.switchTo().alert().getText();
					 System.out.print(alertMagssage1);
					 Thread.sleep(1000);	
					 alert1.accept();
					
			
				}
			public void VerifyandClickonMyerpCVNewbtn() { 
					 Assert.assertTrue(cvnewbtn.isEnabled(),"pvnewbtn is enabled");
					 Reporter.log("Verifymyerppvnewbtn", true);
					 cvnewbtn.click();

             } 
				
				
}