package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class DomesticDelievery {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[5]/a") private WebElement domesticdeliveryform; 
			@FindBy (xpath="//select[@id='ddlProductID']") private WebElement ddselectproduct; 
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement ddgetdtabtn; 
			@FindBy (xpath="//*[@id=\"tblmain_filter\"]/label/input") private WebElement ddsearchdtabtn;
			@FindBy (xpath="//select[@id='ddlGodown']") private WebElement ddselectgodown; 
			@FindBy (xpath="//input[@id='txtFullcyl']") private WebElement ddfullcyl;
			@FindBy (xpath="//input[@id='txtDel']") private WebElement ddemptycyl;
			@FindBy (xpath="//*[@id=\"btnSubmit\"]") private WebElement ddsubmitbtn;
			
			
			// initialization
						public DomesticDelievery(WebDriver driver) {
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
							public void VerifyandClickonMyerpGTDomesticDeliveryForm () { 
								 Assert.assertTrue(domesticdeliveryform.isEnabled(),"domesticdeliveryform is enabled");
								 Reporter.log(" verifyMyerpdomesticdeliveryform", true);
								 domesticdeliveryform.click();

                             }
							public void VerifyMyerpTVSelectProduct()  throws InterruptedException {
								Select ddsp = new Select(ddselectproduct);
								Thread.sleep(500);
								Assert.assertTrue(ddselectproduct.isDisplayed(),"ddselectproduct is displayed");
								Assert.assertFalse(ddselectproduct.isSelected());
								ddsp.selectByVisibleText("14.2 KG DOM");
							}
							public void VerifyandClickonMyerpGTDDGetDataBtn() { 
								 Assert.assertTrue(ddgetdtabtn.isEnabled(),"ddgetdtabtn is enabled");
								 Reporter.log(" verifyMyerpddgetdtabtn", true);
								 ddgetdtabtn.click();

                            }
							public void VerifyandClickonMyerpGTDDSearchBtn() { 
								 Assert.assertTrue(ddsearchdtabtn.isEnabled(),"ddsearchdtabtn is enabled");
								 Reporter.log(" verifyMyerpddsearchdtabtn", true);
								 ddsearchdtabtn.click();
								 ddsearchdtabtn.sendKeys("AJIT");

                           }
							public void VerifyMyerpTVSelectGodown()  throws InterruptedException {
								Select ddsp = new Select(ddselectgodown);
								Thread.sleep(500);
								Assert.assertFalse(ddselectgodown.isDisplayed(),"ddselectgodown is displayed");
								Assert.assertFalse(ddselectgodown.isSelected());
								ddsp.selectByVisibleText("VIRAR");
							}
							public void VerifyandClickonMyerpGTDDFullCyl() { 
								 Assert.assertTrue(ddfullcyl.isEnabled(),"ddfullcyl is enabled");
								 Reporter.log(" verifyMyerpddfullcyl", true);
								 ddfullcyl.click();
								 ddfullcyl.sendKeys("20");
							}

							 public void VerifyandClickonMyerpGTDDEmptyCyl() {
								 Assert.assertTrue(ddemptycyl.isEnabled(),"ddemptycyl is enabled");
								 Reporter.log(" verifyMyerpddemptycyl", true);
								 ddemptycyl.click();
								 ddemptycyl.sendKeys("5");
								
						    }
							 public void VerifyandClickonMyerpGTDDESubmitBtn() { 
								 Assert.assertTrue(ddsubmitbtn.isEnabled(),"ddsubmitbtn is enabled");
								 Reporter.log(" verifyMyerpddsubmitbtn", true);
								 ddsubmitbtn.click();
								 ddsubmitbtn.sendKeys("20");
								
						    }
							
}