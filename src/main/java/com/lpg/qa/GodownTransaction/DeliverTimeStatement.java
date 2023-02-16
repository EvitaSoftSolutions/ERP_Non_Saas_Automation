
package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class DeliverTimeStatement {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement gerneralreport;
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[1]/a") private WebElement godowntimestatementreport;
			@FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
			@FindBy (xpath="//select[@id='ddlProduct']") private WebElement selectproduct;
			@FindBy (xpath="//select[@id='ddlDomDelManID']") private WebElement selectdeliveryman;
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
			
			// initialization
			public DeliverTimeStatement(WebDriver driver) {
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
				public void VerifyandClickonMyerpGeneralReport() {
					 Assert.assertTrue(gerneralreport.isEnabled(),"gerneralreport module is enabled");
					 Reporter.log(" verifyMyerpgerneralreport", true);
					 gerneralreport.click();
				}
				
				public void VerifyandClickonMyerpDeliveryTimeStatementReport() {
					 Assert.assertTrue(godowntimestatementreport.isEnabled(),"godowntimestatementreport filed is enabled");
					 Reporter.log(" verifyMyerpgodowntimestatementreport", true);
					 godowntimestatementreport.click();
				}
				
				public void VerifyandClickonMyerpPlaseSelectDate() throws InterruptedException {
					 Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
					 Reporter.log(" verifyMyerpselectdate", true);
					 selectdate.click();
					 selectdate.clear();
					 selectdate.sendKeys("5/01/2022");
					 body.click();
					 Thread.sleep(500);
				}
				public void VerifyMyerpGRDTSSelectProduct()  throws InterruptedException {
					Thread.sleep(500);
					Select alss = new Select(selectproduct);
			        Assert.assertFalse(selectproduct.isDisplayed(),"alselectsupplier is displayed");
					Assert.assertFalse(selectproduct.isSelected());
					alss.selectByVisibleText("5 KG COMM");
					body.click();
				}
				public void VerifyMyerpALSelectDeliveryMan()  throws InterruptedException {
					Thread.sleep(500);
					Select alss = new Select(selectdeliveryman);
			        Assert.assertFalse(selectdeliveryman.isDisplayed(),"alselectsupplier is displayed");
					Assert.assertFalse(selectdeliveryman.isSelected());
					alss.selectByVisibleText("RAJU/SHYAM");
				}
				public void VerifyandClickonMyerpGetdataBtn() {
					 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
					 Reporter.log(" verifyMyerpgetdatabtn", true);
					 getdatabtn.click();
					 getdatabtn.click();
				}
}                   
