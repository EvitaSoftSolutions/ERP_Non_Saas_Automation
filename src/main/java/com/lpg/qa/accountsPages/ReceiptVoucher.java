package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class ReceiptVoucher {
		
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[2]/a") private WebElement receiptvoucherform; 
			@FindBy (xpath="//input[@id='txtVoucherNo']") private WebElement rvvnumber;
			@FindBy (xpath="//input[@id='Trndate']") private WebElement rvtransactiondate; 
			@FindBy (xpath="//select[@id='ddlBank_cash']") private WebElement rvselectbankorcash;
			@FindBy (xpath="//input[@id='txtchequeno']") private WebElement rvchequeno;
			@FindBy (xpath="//input[@id='Chequedate']") private WebElement rvchequedate;
			@FindBy (xpath="//textarea[@id='txtnarration']") private WebElement rvnarriation1;
			@FindBy (xpath="//input[@id='txtaccount']") private WebElement rvledgertextbox;
			@FindBy (xpath="//input[@id='txtAmount']") private WebElement rvamounttxtbox;
			@FindBy (xpath="//select[@id='ddlDebit_credit']") private WebElement rvselectdebitcredit;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement rvsavebtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement rvnewbtn;
			@FindBy (xpath="//button[@id='btnAddHeader']") private WebElement rvaddheaderbtn;
			
			
			// initialization
		private WebDriver driver;
			 public ReceiptVoucher(WebDriver driver) {
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
				public void VerifyandClickonMyerpReceiptVoucherForm () { 
					 Assert.assertTrue(receiptvoucherform.isEnabled(),"receiptvoucherform is enabled");
					 Reporter.log("receiptvoucherform", true);
					 receiptvoucherform.click();

                 } 
				public void VerifyandClickonMyerpReceiptVoucherNumber () throws InterruptedException { 
					Thread.sleep(1000);
					 Assert.assertTrue(rvvnumber.isEnabled(),"rvvnumber is enabled");
					 Reporter.log("Verifymyerppvvnumber", true);
					 rvvnumber.click();
					 rvvnumber.sendKeys("475");

                } 
				public void VerifyandClickonMyerpRVTransactionDate () { 
					 Assert.assertTrue(rvtransactiondate.isEnabled(),"rvtransactiondate is enabled");
					 Reporter.log("VerifyMyerprvtransactiondate", true);
					 rvtransactiondate.clear();
					 rvtransactiondate.click();
					 rvtransactiondate.sendKeys("19/1/2023");

                } 
				
				public void VerifyMyerpRVSelectBankORCash()  throws InterruptedException {
					Thread.sleep(800);
					Select alss = new Select(rvselectbankorcash);
			        Assert.assertFalse(rvselectbankorcash.isDisplayed(),"pvselectbankorcash is displayed");
					Assert.assertFalse(rvselectbankorcash.isSelected());
					Thread.sleep(800);
					alss.selectByVisibleText("MAYA BANK");
				}
				public void VerifyandClickonMyerpRVChequeNumber () { 
					 Assert.assertTrue(rvchequeno.isEnabled(),"rvchequeno is enabled");
					 Reporter.log("Verifymyerprvchequeno", true);
					 rvchequeno.click();
					 rvchequeno.sendKeys("56605");

               } 
				public void VerifyandClickonMyerpRVChequeDate () { 
					 Assert.assertTrue(rvchequedate.isEnabled(),"pvchequedate is enabled");
					 Reporter.log("Verifymyerppvchequedate", true);
					 rvchequedate.clear();
					 rvchequedate.click();
					 rvchequedate.sendKeys("19/1/2022");

               } 
				public void VerifyandClickonMyerpRVNarration1 () { 
					 Assert.assertTrue(rvnarriation1.isEnabled(),"rpvnarriation1 is enabled");
					 Reporter.log("Verifymyerprvpvnarriation1", true);
					 rvnarriation1.click();
					 rvnarriation1.sendKeys("being paid from maya 4545 legers");

               } 
				public void VerifyandClickonMyerpRVLedger() { 
					 Assert.assertTrue(rvledgertextbox.isEnabled(),"pvledgertextbox is enabled");
					 Reporter.log("Verifymyerppvledgertextbox", true);
					 rvledgertextbox.click();
					 rvledgertextbox.sendKeys("MAYA 4545 : 400280");

               } 
				public void VerifyandClickonMyerpRVAmountTextbox() { 
					 Assert.assertTrue(rvamounttxtbox.isEnabled(),"pvamounttxtbox is enabled");
					 Reporter.log("Verifymyerppvamounttxtbox", true);
					 rvamounttxtbox.click();
					 rvamounttxtbox.sendKeys("1000");

               } 
				
				public void VerifyandClickonMyerpRVSelectDebitCredit () throws InterruptedException { 
		               Select ps = new Select(rvselectdebitcredit);
						Thread.sleep(1000);
						Assert.assertTrue(rvselectdebitcredit.isDisplayed(),"rvselectdebitcredit is displayed");
						Assert.assertFalse(rvselectdebitcredit.isSelected());
						ps.selectByVisibleText("Debit");

               } 
				
				public void VerifyandClickonMyerpRVSavebtn() throws InterruptedException { 
					 Assert.assertTrue(rvsavebtn.isEnabled(),"rvsavebtn is enabled");
					 Reporter.log("Verifymyerprvsavebtn", true);
					
					 
					}
				public void VerifyandClickonMyerpRVAlertpopup() throws InterruptedException { 
					
					rvsavebtn.click();
					 Thread.sleep(1000);
					 Alert alert1 = driver.switchTo().alert();
					 String alertMagssage1 = driver.switchTo().alert().getText();
					 System.out.print(alertMagssage1);
					 Thread.sleep(1000);	
					 alert1.accept();
					
			
				}
				
					
				public void VerifyandClickonMyerpRVAddHeaderbtn() throws InterruptedException { 
					Thread.sleep(1000);
					
					 Assert.assertTrue(rvaddheaderbtn.isEnabled(),"rvaddheaderbtn is enabled");
					 Reporter.log("Verifymyerprvaddheaderbtn", true);
					 rvaddheaderbtn.click();
              } 
				public void VerifyandClickonMyerpRVNarration2() { 
					 Assert.assertTrue(rvnarriation1.isEnabled(),"rpvnarriation1 is enabled");
					 Reporter.log("Verifymyerprvpvnarriation1", true);
					 rvnarriation1.clear();
					 rvnarriation1.click();
					 rvnarriation1.sendKeys("being paid to maya 4545 legers");

              } 
				public void VerifyandClickonMyerpRVSelectDebitCredit1() throws InterruptedException { 
		               Select ps = new Select(rvselectdebitcredit);
						Thread.sleep(1000);
						Assert.assertTrue(rvselectdebitcredit.isDisplayed(),"rvselectdebitcredit is displayed");
						Assert.assertFalse(rvselectdebitcredit.isSelected());
						ps.selectByVisibleText("credit");

            } 
				
				public void VerifyandClickonMyerpRVNewbtn() { 
					 Assert.assertTrue(rvnewbtn.isEnabled(),"pvnewbtn is enabled");
					 Reporter.log("Verifymyerppvnewbtn", true);
					 rvnewbtn.click();

             } 
				
				
}