package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class PaymentVoucher {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[1]/a") private WebElement paymentvoucherform; 
			@FindBy (xpath="//input[@id='txtVoucherNo']") private WebElement pvvnumber;
			@FindBy (xpath="//input[@id='transdate']") private WebElement pvtransactiondate; 
			@FindBy (xpath="//select[@id='ddlBank_cash']") private WebElement pvselectbankorcash;
			@FindBy (xpath="//input[@id='txtchequeno']") private WebElement pvchequeno;
			@FindBy (xpath="//input[@id='Chequedate']") private WebElement pvchequedate;
			@FindBy (xpath="//textarea[@id='txtnarration1']") private WebElement pvnarriation1; 
			@FindBy (xpath="//input[@id='txtAccount2']") private WebElement pvledgertextbox;
			@FindBy (xpath="//input[@id='txtAmount']") private WebElement pvamounttxtbox;
			@FindBy (xpath="//select[@id='ddlDebit_credit']") private WebElement pvselectdebitcredit;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement pvsavebtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement pvnewbtn;
			@FindBy (xpath="//button[@id='btnAddHeader']") private WebElement pvaddheaderbtn;
			
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a[1]") private WebElement updatepaymentvoucher;
			@FindBy (xpath="//input[@id='txtMDLDocumentNo']") private WebElement documentno;
			@FindBy (xpath="//button[@id='btnMDLGet']") private WebElement getdatabtn;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement usubmitbtn;
			
			
			
			
			
			// initialization
			 WebDriver driver;
			 public void setup(WebDriver driver) 
			 {
				 this.driver=driver;
			 }
			
			public PaymentVoucher(WebDriver driver) {
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
				public void VerifyandClickonMyerpPayementVoucherForm () { 
					 Assert.assertTrue(paymentvoucherform.isEnabled(),"xmifpaymentvoucherform is enabled");
					 Reporter.log("Verifypaymentvoucherform", true);
					 paymentvoucherform.click();

                 } 
				public void VerifyandClickonMyerpPayementVoucherNumber () throws InterruptedException { 
					Thread.sleep(1000);
					 Assert.assertTrue(pvvnumber.isEnabled(),"pvvnumber is enabled");
					 Reporter.log("Verifymyerppvvnumber", true);
					 pvvnumber.click();
					 pvvnumber.sendKeys("6001");

                } 
				public void VerifyandClickonMyerpPVTransactionDate () { 
					 Assert.assertTrue(pvtransactiondate.isEnabled(),"pvtransactiondate is enabled");
					 Reporter.log("VerifyMyerppvtransactiondate", true);
					 pvtransactiondate.clear();
					 pvtransactiondate.click();
					 pvtransactiondate.sendKeys("16/03/2023");

                } 
				
				public void VerifyMyerpPVSelectBankORCash()  throws InterruptedException {
					Thread.sleep(800);
					Select alss = new Select(pvselectbankorcash);
			        Assert.assertFalse(pvselectbankorcash.isDisplayed(),"pvselectbankorcash is displayed");
					Assert.assertFalse(pvselectbankorcash.isSelected());
					alss.selectByVisibleText("STATE BANK OF INDIA");
				}
				public void VerifyandClickonMyerpPVChequeNumber () throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(pvchequeno.isEnabled(),"pvchequeno is enabled");
					 Reporter.log("Verifymyerppvchequeno", true);
					 pvchequeno.click();
					 pvchequeno.sendKeys("200001");

               } 
				public void VerifyandClickonMyerpPVChequeDate () throws InterruptedException { 
					Thread.sleep(500);
					
					 Assert.assertTrue(pvchequedate.isEnabled(),"pvchequedate is enabled");
					 Reporter.log("Verifymyerppvchequedate", true);
					 pvchequedate.clear();
					 pvchequedate.click();
					 pvchequedate.sendKeys("16/03/2023");

               } 
				public void VerifyandClickonMyerpPVNarration1 () { 
				
					 Assert.assertTrue(pvnarriation1.isEnabled(),"pvnarriation1 is enabled");
					 Reporter.log("Verifymyerppvpvnarriation1", true);
					 pvnarriation1.click();
					 pvnarriation1.sendKeys("Being Amount paid to BPCL");

               } 
				public void VerifyandClickonMyerpPVLedger() { 
					 Assert.assertTrue(pvledgertextbox.isEnabled(),"pvledgertextbox is enabled");
					 Reporter.log("Verifymyerppvledgertextbox", true);
					 pvledgertextbox.click();
					 pvledgertextbox.sendKeys("SUP_BPCL_1 : 200001");

               } 
				public void VerifyandClickonMyerpPVAmountTextbox() { 
					 Assert.assertTrue(pvamounttxtbox.isEnabled(),"pvamounttxtbox is enabled");
					 Reporter.log("Verifymyerppvamounttxtbox", true);
					 pvamounttxtbox.click();
					 pvamounttxtbox.sendKeys("25000");

               } 
				
				public void VerifyandClickonMyerpPVSelectDebitCredit () throws InterruptedException { 
		               Select ps = new Select(pvselectdebitcredit);
						Thread.sleep(1000);
						Assert.assertTrue(pvselectdebitcredit.isDisplayed(),"pvselectdebitcredit is displayed");
						Assert.assertFalse(pvselectdebitcredit.isSelected());
						ps.selectByVisibleText("Credit");

               } 
				
				public void VerifyandClickonMyerpPVSavebtn() throws InterruptedException { 
					 Assert.assertTrue(pvsavebtn.isEnabled(),"pvsavebtn is enabled");
					 Reporter.log("Verifymyerppvsavebtn", true);
					 pvsavebtn.click();
					 Thread.sleep(1000);
					 if (isAlertPresent7(driver)) { System.out.println("alert is present");

						}else
						{ System.out.println("alert is not present"); }
					}

					public static boolean isAlertPresent7(WebDriver driver) throws
					InterruptedException { 
						try {
							Thread.sleep(1000);
							Alert al=driver.switchTo().alert();
							Thread.sleep(2000); 
							al.accept(); 

							return true; }

						catch (UnhandledAlertException u) 
						{ // TODO Auto-generated catch block
							u.printStackTrace(); } return false;
					}

		
				public void VerifyandClickonMyerpPVAddHeaderbtn() { 
					
					 Assert.assertTrue(pvaddheaderbtn.isEnabled(),"pvaddheaderbtn is enabled");
					 Reporter.log("Verifymyerppvaddheaderbtn", true);
					 pvaddheaderbtn.click();
              } 
				public void VerifyandClickonMyerpPVLedger1() { 
					 Assert.assertTrue(pvledgertextbox.isEnabled(),"pvledgertextbox is enabled");
					 Reporter.log("Verifymyerppvledgertextbox", true);
					 pvledgertextbox.click();
					 pvledgertextbox.sendKeys("MAYA 4545 : 400280");

              } 
				public void VerifyandClickonMyerpPVAmountTextbox1() { 
					 Assert.assertTrue(pvamounttxtbox.isEnabled(),"pvamounttxtbox is enabled");
					 Reporter.log("Verifymyerppvamounttxtbox", true);
					 pvamounttxtbox.click();
					 pvamounttxtbox.sendKeys("1000");

              } 
				
				public void VerifyandClickonMyerpPVSelectDebitCredit1() throws InterruptedException { 
		               Select ps = new Select(pvselectdebitcredit);
						Thread.sleep(1000);
						Assert.assertTrue(pvselectdebitcredit.isDisplayed(),"pvselectdebitcredit is displayed");
						Assert.assertFalse(pvselectdebitcredit.isSelected());
						ps.selectByVisibleText("Credit");

              } 
				
				public void VerifyandClickonMyerpPVSavebtn1() throws InterruptedException { 
					 Assert.assertTrue(pvsavebtn.isEnabled(),"pvsavebtn is enabled");
					 Reporter.log("Verifymyerppvsavebtn", true);
					 pvsavebtn.click();	
					 Thread.sleep(200);
			 
				}
			
				public void VerifyandClickonMyerpPVNewbtn() { 
					 Assert.assertTrue(pvnewbtn.isEnabled(),"pvnewbtn is enabled");
					 Reporter.log("Verifymyerppvnewbtn", true);
					 pvnewbtn.click();

             } 
				
				
}