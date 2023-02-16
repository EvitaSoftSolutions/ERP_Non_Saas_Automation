package com.lpg.qa.GodownTransaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class ERV {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
			@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[3]/a") private WebElement ervform;
			@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement eselectgodown; 
			@FindBy (xpath="//select[@id='ddlVehical_Id']") private WebElement selectvehiclenum;
			@FindBy (xpath="//input[@id='txtProduct']") private WebElement eproducttxt;
			@FindBy (xpath="//input[@id='txtSoundQunatity']") private WebElement esoundqauntity;
			@FindBy (xpath="//input[@id='txtDefective']") private WebElement edefective;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement eclearbtn;
			@FindBy (xpath="//input[@id='btnEdit']") private WebElement submiterv;
			@FindBy (xpath="//*[@id=\"tb2\"]") private WebElement  xmierv;
			
			// initialization
			public ERV(WebDriver driver) {
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
				public void VerifyandClickonMyerpGTERVForm () { 
					 Assert.assertTrue(ervform.isEnabled(),"ervform is enabled");
					 Reporter.log(" verifyMyerpervform", true);
					 ervform.click();
				}
				public void VerifyMyerpERVSelectGodown()  throws InterruptedException {
					Select  ervsg= new Select(eselectgodown);
					Thread.sleep(500);
					Assert.assertFalse(eselectgodown.isDisplayed(),"eselectgodown is displayed");
					Assert.assertFalse(eselectgodown.isSelected());
					ervsg.selectByVisibleText("VIRAR");
				}
				public void VerifyMyerpERVVehicleNumber()  throws InterruptedException {
					Select  ervsg= new Select(selectvehiclenum);
					Thread.sleep(500);
					Assert.assertFalse(selectvehiclenum.isDisplayed(),"eselectgodown is displayed");
					Assert.assertFalse(selectvehiclenum.isSelected());
					ervsg.selectByVisibleText("MH 04 HY 7867");
				}
				public void VerifyandClickonMyerpEProductTextBox() { 
					 Assert.assertTrue(eproducttxt.isEnabled(),"eproducttxt is enabled");
					 Reporter.log(" verifyMyerpeproducttxt", true);
					 eproducttxt.click();
					 eproducttxt.sendKeys("5 KG COMM");
				}
				public void VerifyandClickonMyerpSoundQantityTextBox() { 
					 Assert.assertTrue(esoundqauntity.isEnabled(),"esoundqauntity is enabled");
					 Reporter.log(" verifyMyerpesoundqauntity", true);
					 esoundqauntity.click();
					 esoundqauntity.sendKeys("20");
				}
				public void VerifyandClickonMyerpDefective() { 
					 Assert.assertTrue(edefective.isEnabled(),"edefective is enabled");
					 Reporter.log(" verifyMyerpedefective", true);
					 edefective.click();
					 edefective.sendKeys("100");
				}
                public void VerifyandClickonMyerpClearBtn() throws InterruptedException { 
                	Thread.sleep(100);
	                 Assert.assertTrue(eclearbtn.isEnabled(),"eclearbtn is enabled");
	                 Reporter.log(" verifyMyerpeclearbtn", true);
	                 eclearbtn.click();
                }
                public void VerifyandClickonMyerpSumitERVBtn() throws InterruptedException { 
                	Thread.sleep(100);
	                 Assert.assertTrue(submiterv.isEnabled(),"submiterv is enabled");
	                 Reporter.log(" verifyMyerpsubmiterv", true);
	                 submiterv.click();
               }
                public void VerifyandClickonMyerpXMIERV() throws InterruptedException { 
                	Thread.sleep(100);
	                 Assert.assertTrue(xmierv.isEnabled(),"xmierv is enabled");
	                 Reporter.log(" verifyMyerpxmierv", true);
	                 xmierv.click();
               }
}


