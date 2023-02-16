package com.lpg.qa.GodownTransaction;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.Reporter;


public class AcceptedLoad {
				@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
				@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
				@FindBy (xpath="//input[@id='password-field']") private WebElement password;
				@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
				@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
				@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[1]/a") private WebElement acceptedloadform;
				@FindBy (xpath="//input[@id='txtInvoiceNumber']") private WebElement alinvoicenumtxt;
				@FindBy (xpath="//button[@id='btnSubmit']") private WebElement alsubmitbtn;
				@FindBy (xpath="//*[@id=\"tblmain\"]/tbody/tr/td[2]/a") private WebElement alinvoicenum;
				@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement alselectcompany;
				@FindBy (xpath="//select[@id='ddlSupplierID']") private WebElement alselectsupplier;
				@FindBy (xpath="//input[@id='txtAccount']") private WebElement alaccounttxt; 
				@FindBy (xpath="//button[@id='btnSubmit']") private WebElement allsubmitbtn;
				@FindBy (xpath="//button[@id='btnclear']") private WebElement alclearbtn;
				
				// initialization
				public AcceptedLoad(WebDriver driver) {
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
					public void VerifyandClickonMyerpGTAccepteLoadForm () {
						 Assert.assertTrue(acceptedloadform.isEnabled(),"acceptedloadform is enabled");
						 Reporter.log(" verifyMyerpacceptedloadform", true);
						 acceptedloadform.click();
					}
					public void VerifyandClickonMyerpGTAccepteLoadInvoceNum() {
						 Assert.assertTrue(alinvoicenumtxt.isEnabled(),"alinvoicenumtxt is enabled");
						 Reporter.log(" verifyMyerpalinvoicenumtxt", true);
						 alinvoicenumtxt.click();
						 alinvoicenumtxt.sendKeys("9910");
					}
					public void VerifyandClickonMyerpGTALsubmitbtn() throws InterruptedException {
						Thread.sleep(500);
						 Assert.assertTrue(alsubmitbtn.isEnabled(),"alsubmitbtn is enabled");
						 Reporter.log(" verifyMyerpalsubmitbtn", true);
						 alsubmitbtn.click();
					}
					public void VerifyandClickonMyerpGTInvoiceNumber() throws InterruptedException {
						Thread.sleep(500);
						 Assert.assertTrue(alinvoicenum.isEnabled(),"alinvoicenum is enabled");
						 Reporter.log(" verifyMyerpalinvoicenum", true);
						 alinvoicenum.click();
					}
					public void VerifyandClickonMyerpGTAccountTextBox() {
						 Assert.assertTrue(alaccounttxt.isEnabled(),"alaccounttxt is enabled");
						 Reporter.log(" verifyMyerpalaccounttxt", true);
						 alaccounttxt.click();
						 alaccounttxt.sendKeys("MAYA 4545 : 400280");
					}
					public void VerifyandClickonMyerpGTClearBtn() {
						 Assert.assertTrue(alclearbtn.isEnabled(),"alclearbtn is enabled");
						 Reporter.log(" verifyMyerpalclearbtn", true);
						 alclearbtn.click();
					}
					public void VerifyandClickonMyerpGTSubmitBtn() {
						 Assert.assertTrue(allsubmitbtn.isEnabled(),"allsubmitbtn is enabled");
						 Reporter.log(" verifyMyerpallsubmitbtn", true);
						 allsubmitbtn.click();
					}
					public void VerifyMyerpALSelectCompany()  throws InterruptedException {
						Thread.sleep(1000);
						Select alsc = new Select(alselectcompany);
				        Assert.assertFalse(alselectcompany.isDisplayed(),"alselectcompany is displayed");
						Assert.assertFalse(alselectcompany.isSelected());
						alsc.selectByVisibleText("ANITA GAS SERVICES");
					}
					public void VerifyMyerpALSelectSupplier()  throws InterruptedException {
						Thread.sleep(500);
						Select alss = new Select(alselectsupplier);
				        Assert.assertFalse(alselectsupplier.isDisplayed(),"alselectsupplier is displayed");
						Assert.assertFalse(alselectsupplier.isSelected());
						alss.selectByVisibleText("SUP_ROHIT_40");
					}
					public void VerifyandClickonMyerpALAccountTextbox() {
						 Assert.assertTrue(alaccounttxt.isEnabled(),"alaccounttxt is enabled");
						 Reporter.log(" verifyMyerpalaccounttxt", true);
						 alaccounttxt.click();
						 alaccounttxt.sendKeys("MAYA 4545 : 400280");
					}
					public void VerifyandClickonMyerpALSubmitBtn() {
						 Assert.assertTrue(allsubmitbtn.isEnabled(),"allsubmitbtn is enabled");
						 Reporter.log(" verifyMyerpallsubmitbtn", true);
						 allsubmitbtn.click();
					}
					public void VerifyandClickonMyerpALClearBtn() {
						 Assert.assertTrue(alclearbtn.isEnabled(),"alclearbtn is enabled");
						 Reporter.log(" verifyMyerpalclearbtn", true);
						 alclearbtn.click();
					}
}                   
