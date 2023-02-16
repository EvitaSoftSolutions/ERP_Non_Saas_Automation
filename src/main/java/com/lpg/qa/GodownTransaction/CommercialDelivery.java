
package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class CommercialDelivery {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[6]/a") private WebElement commercialdeliveryform;
			@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement cdselectgodown;
			@FindBy (xpath="//select[@id='ddlDeliveryMan']") private WebElement cdselectdeliveryman;
			@FindBy (xpath="//select[@id='ddlProductType']") private WebElement cdselectproducttype; 
			@FindBy (xpath="//input[@id='txtFullCylinder']") private WebElement cdfullcyl;
			@FindBy (xpath="//input[@id='txtFullCylinder']") private WebElement cdemptycyl;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement cdbtnclear;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement cdbtnsubmit;
			
			

			// initialization
						public CommercialDelivery(WebDriver driver) {
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
							public void VerifyandClickonMyerpGTCommercialDeliveryForm () { 
								 Assert.assertTrue(commercialdeliveryform.isEnabled(),"commercialdeliveryform is enabled");
								 Reporter.log(" verifyMyerpcommercialdeliveryform", true);
								 commercialdeliveryform.click();

                             }
							public void VerifyMyerpTVSelectGodown()  throws InterruptedException {
								Select cdsp = new Select(cdselectgodown);
								Thread.sleep(500);
								Assert.assertTrue(cdselectgodown.isDisplayed(),"cdselectgodown is displayed");
								Assert.assertFalse(cdselectgodown.isSelected());
								cdsp.selectByVisibleText("VIRAR");
							}
							public void VerifyMyerpTVSelectDeliveryMan()  throws InterruptedException {
								Select cdsp = new Select(cdselectdeliveryman);
								Thread.sleep(500);
								Assert.assertFalse(cdselectdeliveryman.isDisplayed(),"cdselectdeliveryman is displayed");
								Assert.assertFalse(cdselectdeliveryman.isSelected());
								cdsp.selectByVisibleText("KING");
							}
							
							public void VerifyandClickonMyerpGTSelectProductType() throws InterruptedException { 
								Select cdsp = new Select(cdselectproducttype);
								Thread.sleep(500);
								Assert.assertFalse(cdselectproducttype.isDisplayed(),"cdselectproducttype is displayed");
								Assert.assertFalse(cdselectproducttype.isSelected());
								cdsp.selectByVisibleText("17.5 KG");
							}
							
							public void VerifyandClickonMyerpFullCyl() { 
								 Assert.assertTrue(cdfullcyl.isEnabled(),"cdfullcyl is enabled");
								 Reporter.log(" verifyMyerpcdfullcyl", true);
								 cdfullcyl.click();
								 cdfullcyl.sendKeys("10");

                            }
							public void VerifyandClickonMyerpEmptyCyl() { 
								 Assert.assertTrue(cdemptycyl.isEnabled(),"cdemptycyl is enabled");
								 Reporter.log(" verifyMyerpcdemptycyl", true);
								 cdemptycyl.click();
								 cdemptycyl.sendKeys("10");

                           }
							public void VerifyandClickonMyerpGTclearBtn () { 
								 Assert.assertTrue(cdbtnclear.isEnabled(),"cdbtnclear is enabled");
								 Reporter.log(" verifyMyerpcdbtnclear", true);
								 cdbtnclear.click();

                            }
							public void VerifyandClickonMyerpGTSubmitBtn () { 
								 Assert.assertTrue(cdbtnsubmit.isEnabled(),"cdbtnsubmit is enabled");
								 Reporter.log(" verifyMyerpcdbtnsubmit", true);
								 cdbtnsubmit.click();

                           }
}
