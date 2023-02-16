
package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class UpdatedCommercialDelivery {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[7]/a") private WebElement ucommercialdeliveryform;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement ucdgetdatabtn;
			@FindBy (xpath="//select[@id='ddlGodown']") private WebElement ucdselectgodown;
			@FindBy (xpath="//select[@id='ddlProductType']") private WebElement ucdselectproducttype;
			@FindBy (xpath="//input[@id='txtFullCylinder']") private WebElement ucdFullcyl;
			@FindBy (xpath="//input[@id='txtEmptyCylinder']") private WebElement ucdEmptycyl;
			@FindBy (xpath="//input[@id='txtSV']") private WebElement ucvsvcyl;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ucdsubmitbtn;
			

			// initialization
						public UpdatedCommercialDelivery(WebDriver driver) {
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
							public void VerifyandClickonMyerpGTUpdatedCommercialDeliveryForm () { 
								 Assert.assertTrue(ucommercialdeliveryform.isEnabled(),"ucommercialdeliveryform is enabled");
								 Reporter.log(" verifyMyerpucommercialdeliveryform", true);
								 ucommercialdeliveryform.click();

                             }
							public void VerifyandClickonMyerpUCDGetDtaBtn () { 
								 Assert.assertTrue(ucdgetdatabtn.isEnabled(),"ucdgetdatabtn is enabled");
								 Reporter.log("verifyMyerpucdgetdatabtn", true);
								 ucdgetdatabtn.click();

                            }
							
							public void VerifyMyerpUSelectGodown()  throws InterruptedException {
								Select cdsp = new Select(ucdselectgodown);
								Thread.sleep(500);
								Assert.assertTrue(ucdselectgodown.isDisplayed(),"ucdselectgodown is displayed");
								Assert.assertFalse(ucdselectgodown.isSelected());
								cdsp.selectByVisibleText("VIRAR");
							}
							public void VerifyandClickonMyerpGTSelectProduct() throws InterruptedException { 
								Select ucdsp = new Select(ucdselectproducttype);
								Thread.sleep(500);
								Assert.assertTrue(ucdselectproducttype.isDisplayed(),"ucdselectproducttype is displayed");
								Assert.assertFalse(ucdselectproducttype.isSelected());
								ucdsp.selectByVisibleText("5 KG COMM");
							}
							public void VerifyandClickonMyerpUCDFullCylTxtbox() { 
								 Assert.assertTrue(ucdFullcyl.isEnabled(),"ucdFullcyl is enabled");
								 Reporter.log("verifyMyerpucdFullcyl", true);
								 ucdFullcyl.click();
								 ucdFullcyl.clear();
								 ucdFullcyl.sendKeys("50");

                           }
							public void VerifyandClickonMyerpUCDEmptyCylTxtbox() { 
								 Assert.assertTrue(ucdEmptycyl.isEnabled(),"ucdEmptycyl is enabled");
								 Reporter.log("verifyMyerpucdEmptycyl", true);
								 ucdEmptycyl.click();
								 ucdEmptycyl.sendKeys("30");

                          }
							public void VerifyandClickonMyerpUCDSVCylTextbox() { 
								 Assert.assertTrue(ucvsvcyl.isEnabled(),"ucvsvcyl is enabled");
								 Reporter.log("verifyMyerpucvsvcyl", true);
								 ucvsvcyl.click();
								 ucvsvcyl.sendKeys("1");

                         }
							public void VerifyandClickonMyerpUCDSubmitBtn() { 
								 Assert.assertTrue(ucdsubmitbtn.isEnabled(),"ucdsubmitbtn is enabled");
								 Reporter.log("verifyMyerpucdsubmitbtn", true);
								 ucdsubmitbtn.click();

                          }
}





