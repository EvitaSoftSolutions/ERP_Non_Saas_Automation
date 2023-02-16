package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;



public class PartialPurchase {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[9]/a") private WebElement ppform; 
			@FindBy (xpath="//input[@id='txtERVNumber']") private WebElement ppervnumber;
			@FindBy (xpath="//input[@id='txtInvoiceNumber']") private WebElement ppinvoicenumber; 
			@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement ppselectgodown;
			@FindBy (xpath="//select[@id='ddlVehicalID']") private WebElement ppselectvehicle;
			@FindBy (xpath="//input[@id='txtProduct']") private WebElement ppproduct;
			@FindBy (xpath="//input[@id='txtSoundQunatity']") private WebElement ppquantity;
			@FindBy (xpath="//input[@id='txtDefect_Cyl']") private WebElement ppdefective;
			@FindBy (xpath="//input[@id='txtLost']") private WebElement pplost;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ppsubmitbtn;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[1]/a") private WebElement acceptedloadform;

			
			
			// initialization
		 WebDriver driver;
		 public void setup(WebDriver driver) 
		 {
			 this.driver=driver;
		 }
			public PartialPurchase(WebDriver driver) {
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
				public void VerifyandClickonMyerpGTPartialPurchaseForm() { 
					 Assert.assertTrue(ppform.isEnabled(),"ppformis enabled");
					 Reporter.log(" verifyMyerpppform", true);
					 ppform.click();

                 }
				public void VerifyandClickonMyerpGTPPInvoiceNumber() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(ppinvoicenumber.isEnabled(),"ppinvoicenumber is enabled");
					 Reporter.log("verifyMyerpppinvoicenumberr", true);
					 ppinvoicenumber.click();
					 ppinvoicenumber.sendKeys("4002");
					 
               }
				public void VerifyandClickonMyerpGTPPErvNumber() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(ppervnumber.isEnabled(),"ppervnumber is enabled");
					 Reporter.log("verifyMyerpppervnumber", true);
					 ppervnumber.click();
					 ppervnumber.sendKeys("4002");

                }
				
				public void VerifyMyerpPPSelectGodown()  throws InterruptedException {
					Select ppsg = new Select(ppselectgodown);
					Thread.sleep(500);
					Assert.assertTrue(ppselectgodown.isDisplayed(),"ppselectgodown is displayed");
					Assert.assertFalse(ppselectgodown.isSelected());
					ppsg.selectByVisibleText("VIRAR");
				}
				public void VerifyMyerpPPSelectVehicle()  throws InterruptedException {
					Select ppsg = new Select(ppselectvehicle);
					Thread.sleep(500);
					Assert.assertTrue(ppselectvehicle.isDisplayed(),"ppselectvehicle is displayed");
					Assert.assertFalse(ppselectvehicle.isSelected());
					ppsg.selectByVisibleText("MH 48 AA 7886");
				}
				public void VerifyandClickonMyerpGTPPProduct() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(ppproduct.isEnabled(),"ppproduct is enabled");
					 Reporter.log("verifyMyerpppproduct", true);
					 ppproduct.click();
					 ppproduct.sendKeys("5 KG COMM");
				}
				public void VerifyandClickonMyerpGTPPQauntity() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(ppquantity.isEnabled(),"ppquantity is enabled");
					 Reporter.log("verifyMyerpppquantity", true);
					 ppquantity.click();
					 ppquantity.sendKeys("60");
				}
				public void VerifyandClickonMyerpGTPPLost() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(pplost.isEnabled(),"pplost is enabled");
					 Reporter.log("verifyMyerppplost", true);
					 pplost.click();
					 pplost.sendKeys("9");
				}
				public void VerifyandClickonMyerpGTPPDefective() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(ppdefective.isEnabled(),"ppdefective is enabled");
					 Reporter.log("verifyMyerpppdefective", true);
					 ppdefective.click();
					 ppdefective.sendKeys("1");
				}
				public void VerifyandClickonMyerpGTPPSubmitBtn() throws InterruptedException { 
					Thread.sleep(500);
					 Assert.assertTrue(ppsubmitbtn.isEnabled(),"ppsubmitbtnis enabled");
					 Reporter.log("verifyMyerpppsubmitbtn", true);
					 ppsubmitbtn.click();
				     
					 if (isAlertPresent(driver)) { System.out.println("alert is present");
					  
					  }else { System.out.println("alert is not present"); }
					  
					  } 
				public static boolean isAlertPresent(WebDriver driver) throws
				InterruptedException { 
					try {
						Alert al=driver.switchTo().alert();
						Thread.sleep(1000); 
						String  alert_msg=driver.getTitle(); 
						System.out.println(alert_msg);
						al.accept(); 
						Thread.sleep(2000);
						al.accept();
						
						
						return true; }
					catch (UnhandledAlertException u)
					{ // TODO Auto-generated catch block
						u.printStackTrace(); } return false;

					}
				public void VerifyandClickonMyerpGTAccepteLoadForm () {
					 Assert.assertTrue(acceptedloadform.isEnabled(),"acceptedloadform is enabled");
					 Reporter.log(" verifyMyerpacceptedloadform", true);
					 acceptedloadform.click();
				}
}