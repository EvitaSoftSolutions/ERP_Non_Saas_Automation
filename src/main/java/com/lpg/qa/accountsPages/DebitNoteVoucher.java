package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class DebitNoteVoucher  {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[5]/a") private WebElement debitnotevoucherform; 
			@FindBy (xpath="//input[@id='txtVoucherNo']") private WebElement dbcvvnumber;
			@FindBy (xpath="//input[@id='Transdate']") private WebElement dbvtransactiondate; 
			@FindBy (xpath="//input[@id='txtDebitFromAcc']") private WebElement debitfromledger;
			@FindBy (xpath="//input[@id='txtDebit_Amount']") private WebElement dbvdebitamount;
			@FindBy (xpath="//input[@id='txtaccount']") private WebElement dbvledger1;
			@FindBy (xpath="//input[@id='txtcredit_Amount']") private WebElement dbvamount1;
			@FindBy (xpath="//input[@id='txtGrdNarration']") private WebElement dbvnarriation1;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement dbvsavebtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement dbvnewbtn;
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a[1]") private WebElement dbvupdatedebitnote;
			@FindBy (xpath="//input[@id='txtMDLDocumentNo']") private WebElement udbvdocno;
			@FindBy (xpath="//button[@id='btnMDLGet']") private WebElement udbvgetdatabtn;
			
			
			
			// initialization
		    private WebDriver driver;
			
			public DebitNoteVoucher(WebDriver driver) {
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
				public void VerifyandClickonMyerpDebitNoteVoucherForm () { 
					 Assert.assertTrue(debitnotevoucherform.isEnabled(),"contravoucherform is enabled");
					 Reporter.log("contravoucherform", true);
					 debitnotevoucherform.click();

                 } 
				public void VerifyandClickonMyerpDBVoucherNumber () throws InterruptedException { 
					Thread.sleep(1000);
					 Assert.assertTrue(dbcvvnumber.isEnabled(),"rvvnumber is enabled");
					 Reporter.log("Verifymyerppvvnumber", true);
					 dbcvvnumber.click();
					 dbcvvnumber.sendKeys("992343");

                } 
				public void VerifyandClickonMyerpDBVTransactionDate () { 
					 Assert.assertTrue(dbvtransactiondate.isEnabled(),"cvtransactiondate is enabled");
					 Reporter.log("VerifyMyercrvtransactiondate", true);
					 dbvtransactiondate.clear();
					 dbvtransactiondate.click();
					 dbvtransactiondate.sendKeys("15/12/2022");

                } 
				public void VerifyandClickonMyerpDBVDebitFromLedger() { 
					 Assert.assertTrue(debitfromledger.isEnabled(),"debitfromledger is enabled");
					 Reporter.log("Verifymyerpdebitfromledger", true);
					 debitfromledger.clear();
					 debitfromledger.click();
					 debitfromledger.sendKeys("TESTNEW1 : 200018");

             } 
				public void VerifyandClickonMyerpDBVAmount() { 
					 Assert.assertTrue(dbvdebitamount.isEnabled(),"dbvdebitamount is enabled");
					 Reporter.log("Verifymyerpdbvdebitamount", true);
					 dbvdebitamount.click();
					 dbvdebitamount.sendKeys("500");

             }
				public void VerifyandClickonMyerpDBVLedger1() { 
					 Assert.assertTrue(dbvledger1.isEnabled(),"dbvledger1 is enabled");
					 Reporter.log("Verifymyerpdbvledger1", true);
					 dbvledger1.clear();
					 dbvledger1.click();
					 dbvledger1.sendKeys("PROFIT AND LOSS A/C : 400000");

              } 
				public void VerifyandClickonMyerpDBVAmountTextbox1() { 
					 Assert.assertTrue(dbvamount1.isEnabled(),"pvamounttxtbox is enabled");
					 Reporter.log("Verifymyerppvamounttxtbox", true);
					 dbvamount1.click();
					 dbvamount1.sendKeys("500");

              }
				
				public void VerifyandClickonMyerpDBVNarration1 () { 
					 Assert.assertTrue(dbvnarriation1.isEnabled(),"rpvnarriation1 is enabled");
					 Reporter.log("Verifymyerprvpvnarriation1", true);
					 dbvnarriation1.click();
					 dbvnarriation1.sendKeys("being paid from testnew legers");

              } 
				public void VerifyandClickonMyerpDBVSavebtn() throws InterruptedException { 
					 Assert.assertTrue(dbvsavebtn.isEnabled(),"rvsavebtn is enabled");
					 Reporter.log("Verifymyerprvsavebtn", true);
					 dbvsavebtn.click();
					
			  }
				
				public void VerifyandClickonMyerpDBVNewbtn() { 
					 Assert.assertTrue(dbvnewbtn.isEnabled(),"pvnewbtn is enabled");
					 Reporter.log("Verifymyerppvnewbtn", true);
					 dbvnewbtn.click();

             } 
				public void VerifyandClickonMyerpUpdateDebitNoteVoucherForm () { 
					 Assert.assertTrue(dbvupdatedebitnote.isEnabled(),"dbvupdatedebitnote is enabled");
					 Reporter.log("dbvupdatedebitnote", true);
					 dbvupdatedebitnote.click();

                } 
				public void VerifyandClickonMyerpDBVUpdateDocNumber() { 
					 Assert.assertTrue(udbvdocno.isEnabled(),"udbvdocno is enabled");
					 Reporter.log("udbvdocno", true);
					 udbvdocno.click();
					 udbvdocno.sendKeys("2200024");
				     

               } 
				public void VerifyandClickonMyerpUpdateGetDataBtn () { 
					 Assert.assertTrue(udbvgetdatabtn.isEnabled(),"udbvgetdatabtn is enabled");
					 Reporter.log("udbvgetdatabtn", true);
					 

               } 
            public void VerifyandClickonMyerpAlertpopup() throws InterruptedException { 
					
            	     udbvgetdatabtn.click();
					 Thread.sleep(1000);
					 Alert alert1 = driver.switchTo().alert();
					 String alertMagssage1 = driver.switchTo().alert().getText();
					 System.out.print(alertMagssage1);
					 Thread.sleep(1000);	
					 alert1.accept();
					
			
				}
				
}