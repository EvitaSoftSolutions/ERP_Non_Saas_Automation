
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


public class JournalVoucher {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
			@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[4]/a") private WebElement journalvoucherform; 
			@FindBy (xpath="//input[@id='Transdate']") private WebElement jvtransactiondate; 
			@FindBy (xpath="//textarea[@id='txtnarration']") private WebElement jvnarriation;
			@FindBy (xpath="//input[@id='txtAccount2']") private WebElement jvledger;
			@FindBy (xpath="//input[@id='txtAmount']") private WebElement jvamount;
			@FindBy (xpath="//select[@id='ddlDebit_credit']") private WebElement jvselectdebitcredit;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement jvsavebtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement jvnewbtn;
			@FindBy (xpath="//button[@id='btnAddHeader']") private WebElement jvaddheaderbtn;
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[2]/div/div[1]/div/div") private WebElement  jvfbody;
			
	
			

			// initialization
			 WebDriver driver;
			 public void setup(WebDriver driver) 
			 {
				 this.driver=driver;
			 }
		
			public JournalVoucher(WebDriver driver) {
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
				public void VerifyandClickonMyerpJournalVoucherForm () { 
					 Assert.assertTrue(journalvoucherform.isEnabled(),"Journalvoucherform is enabled");
					 Reporter.log("journalvoucherform", true);
					 journalvoucherform.click();

                 }  
				public void VerifyandClickonMyerpJVTransactionDate () { 
					 Assert.assertTrue(jvtransactiondate.isEnabled(),"cvtransactiondate is enabled");
					 Reporter.log("VerifyMyercrvtransactiondate", true);
					 jvtransactiondate.clear();
					 jvtransactiondate.click();
					 jvtransactiondate.sendKeys("6/04/2023");

                } 
				public void VerifyandClickonMyerpJVLedger() throws InterruptedException { 
					 Assert.assertTrue(jvledger.isEnabled(),"jvledger is enabled");
					 Reporter.log("Verifymyerpjvledger", true);
					 jvledger.clear();
					 jvledger.click();
					 jvledger.sendKeys("SHREYA HOTEL : 100001");
					 jvfbody.click();
					 Thread.sleep(700);

             } 
				public void VerifyandClickonMyerpJVAmount() throws InterruptedException { 
					Thread.sleep(700);
					 Assert.assertTrue(jvamount.isEnabled(),"jvamount is enabled");
					 Reporter.log("Verifymyerpjvamount", true);
					 jvamount.click();
					 jvamount.sendKeys("1000");

             }
				public void VerifyandClickonMyerpJVSelectDebitCredit () throws InterruptedException { 
		               Select jscb = new Select(jvselectdebitcredit);
						Thread.sleep(1000);
						Assert.assertTrue(jvselectdebitcredit.isDisplayed(),"jvselectdebitcredit is displayed");
						Assert.assertFalse(jvselectdebitcredit.isSelected());
						jscb.selectByVisibleText("Debit");

            } 
				public void VerifyandClickonMyerpJVNarration() { 
					 Assert.assertTrue(jvnarriation.isEnabled(),"jvnarriation is enabled");
					 Reporter.log("Verifymyerpjvnarriation", true);
					 jvnarriation.click();
					 jvnarriation.sendKeys("Being Deters Amount Change");

              } 
				public void VerifyandClickonMyerpJVSavebtn() throws InterruptedException { 
					 Assert.assertTrue(jvsavebtn.isEnabled(),"jvsavebtn is enabled");
					 Reporter.log("Verifymyerpjvsavebtn", true);
					 jvsavebtn.click();
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
				public void VerifyandClickonMyerpJVNewbtn() { 
					 Assert.assertTrue(jvnewbtn.isEnabled(),"jvnewbtn is enabled");
					 Reporter.log("Verifymyerpjvnewbtn", true);
					 jvnewbtn.click();

             } 
				public void VerifyandClickonMyerpJVAddHeaderbtn() { 
					 Assert.assertTrue(jvaddheaderbtn.isEnabled(),"jvaddheaderbtn is enabled");
					 Reporter.log("Verifymyerpjvaddheaderbtn", true);
					 jvaddheaderbtn.click();
   }
				public void VerifyandClickonMyerpJVLedger1() throws InterruptedException { 
					 Assert.assertTrue(jvledger.isEnabled(),"jvledger is enabled");
					 Reporter.log("Verifymyerpjvledger", true);
					 jvledger.clear();
					 jvledger.click();
					 jvledger.sendKeys("PURCHASE : 300005");
					 jvfbody.click();
					 Thread.sleep(700);

            } 
				public void VerifyandClickonMyerpJVAmount1() throws InterruptedException { 
					Thread.sleep(700);
					 Assert.assertTrue(jvamount.isEnabled(),"jvamount is enabled");
					 Reporter.log("Verifymyerpjvamount", true);
					 jvamount.click();
					 jvamount.sendKeys("1000");

            }
				public void VerifyandClickonMyerpJVSelectDebitCredit1() throws InterruptedException { 
		               Select jscb = new Select(jvselectdebitcredit);
						Thread.sleep(1000);
						Assert.assertTrue(jvselectdebitcredit.isDisplayed(),"jvselectdebitcredit is displayed");
						Assert.assertFalse(jvselectdebitcredit.isSelected());
						jscb.selectByVisibleText("Credit");
				}
}
			
				