package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class XMIList {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[8]/a") private WebElement xmiform; 
			@FindBy (xpath="//*[@id=\"tblmain\"]/tbody/tr[1]/td[2]/a") private WebElement xmiervnumber;
			@FindBy (xpath="//input[@id='txtInvoiceNumber']") private WebElement xinvoicenumber; 
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement xmisubmitbtn;
			
			
			// initialization
			public XMIList(WebDriver driver) {
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
				public void VerifyandClickonMyerpGodownTransactionModule () {
					 Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
					 Reporter.log(" verifyMyerpgtmodule", true);
					 gtmodule.click();
				}
				public void VerifyandClickonMyerpGTXMIForm () { 
					 Assert.assertTrue(xmiform.isEnabled(),"xmiformis enabled");
					 Reporter.log(" verifyMyerpxmiform", true);
					 xmiform.click();

                 }
				public void VerifyandClickonMyerpGTXMIErvNyumber() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(xmiervnumber.isEnabled(),"xmiervnumber is enabled");
					 Reporter.log("verifyMyerpxmiervnumber", true);
					 xmiervnumber.click();

                }
				public void VerifyandClickonMyerpGTXMIInvoiceNumber() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(xinvoicenumber.isEnabled(),"xinvoicenumber is enabled");
					 Reporter.log("verifyMyerpxinvoicenumber", true);
					 xinvoicenumber.click();
					 xinvoicenumber.sendKeys("4001");
					 
               }
				public void VerifyandClickonMyerpGTXMISubmitBtn() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(xmisubmitbtn.isEnabled(),"xmisubmitbtn is enabled");
					 Reporter.log("verifyMyerpxmisubmitbtn", true);
					 xmisubmitbtn.click();
				}
}