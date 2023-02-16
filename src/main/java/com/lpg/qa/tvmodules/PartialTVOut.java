package com.lpg.qa.tvmodules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class PartialTVOut {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/a/span[1]") private WebElement tvmodule; 
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/ul/li[3]/a") private WebElement ptvoform;
			@FindBy (xpath="//input[@id='chkNewConsumer']") private WebElement consumernotavailchk;
			@FindBy (xpath="//input[@id='txtNewConsumerNo']") private WebElement ptvtvoconsumernum;
			@FindBy (xpath="//select[@id='ddlNewProduct']") private WebElement ptvoselectproduct;
			@FindBy (xpath="//input[@id='txtNewnumberofcylinder']") private WebElement ptvoutnumberofcyl;
			@FindBy (xpath="//select[@id='ddlNewGodownID']") private WebElement ptvoutselectgodown;
			@FindBy (xpath="//button[@id='NewbtnSubmit']") private WebElement ptvoutsubmitbtn;
			
			// initialization
			public PartialTVOut(WebDriver driver) {
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
			
				public void VerifyMyerpTVModule() {
					 Assert.assertTrue(tvmodule.isEnabled(),"tvmodule Module field is enabled");		 
					 Reporter.log("verifyMyerptvmodule", true);
					 tvmodule.click(); 
				}
				public void VerifyMyerpPartialTVtvoutForm() {
					 Assert.assertTrue(ptvoform.isEnabled(),"ptvoformform field is enabled");		 
					 Reporter.log("verifyMyerpptvoform", true);
					 ptvoform.click(); 
				}
			public void VerifyMyerpPTVOutIfConsumernotAvailbleCHK() {
					 Assert.assertTrue(consumernotavailchk.isEnabled(),"consumernotavailchk field is enabled");		 
					 Reporter.log("verifyMyerpconsumernotavailchk", true);
					 consumernotavailchk.click(); 
				}
				public void VerifyMyerpPTVtvoutConsumerNum() {
					 Assert.assertTrue(ptvtvoconsumernum.isEnabled(),"ptvtvoconsumernum field is enabled");		 
					 Reporter.log("verifyMyerpptvtvoconsumernum", true);
					 ptvtvoconsumernum.click(); 
					 ptvtvoconsumernum.sendKeys("4567");
				}
				public void VerifyMyerpTVSelectProduct()  throws InterruptedException {
						Select ptsp = new Select(ptvoselectproduct);
						Thread.sleep(500);
						Assert.assertFalse(ptvoselectproduct.isDisplayed(),"ptvoselectproduct is displayed");
						Assert.assertFalse(ptvoselectproduct.isSelected());
						ptsp.selectByVisibleText("5 KG COMM");
					}
				public void VerifyMyerpTVNumberOfCylender()
				{
					 Assert.assertTrue(ptvoutnumberofcyl.isEnabled(),"ptvoutnumberofcyl field is enabled");		 
					 Reporter.log("verifyMyerpptvoutnumberofcyl", true);
					 ptvoutnumberofcyl.click(); 
					 ptvoutnumberofcyl.sendKeys("10");
				}
				public void VerifyMyerpTVSelectGodown()  throws InterruptedException {
					Thread.sleep(500);
					Select ptsp = new Select(ptvoutselectgodown);
			        Assert.assertTrue(ptvoutselectgodown.isDisplayed(),"ptvoutselectgodown is displayed");
					Assert.assertFalse(ptvoutselectgodown.isSelected());
					ptsp.selectByVisibleText("VIRAR");
				}
				
				public void VerifyMyerpTVtvOutSubmitBtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(ptvoutsubmitbtn.isEnabled(),"ptvoutsubmitbtn  field is enabled");		 
					 Reporter.log("verifyMyerpptvoutsubmitbtn", true);
					 ptvoutsubmitbtn.click(); 
					
				}
}
			