package com.lpg.qa.tvmodules;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

	public class TVOutList {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/a/span[1]") private WebElement tvmodule;  
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/ul/li[2]/a") private WebElement tvtvoutlistform; 
			@FindBy (xpath="//*[@id=\"tblmain\"]/tbody/tr[1]/td[2]/a") private WebElement tvtvoconsumernum;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement tclearbtn;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn;
			
			
			
			
			
			
			// initialization
			public TVOutList(WebDriver driver) {
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
				public void VerifyMyerpTVtvoutListForm() {
					 Assert.assertTrue(tvtvoutlistform.isEnabled(),"tvtvoutlistform field is enabled");		 
					 Reporter.log("verifyMyerptvtvoutlistform", true);
					 tvtvoutlistform.click(); 
				}
				public void VerifyMyerpTVtvoutListConsumerNum() {
					 Assert.assertTrue(tvtvoconsumernum.isEnabled(),"tvtvoconsumernum  field is enabled");		 
					 Reporter.log("verifyMyerptvoutconsumernum", true);
					 tvtvoconsumernum.click(); 
				}
				
				public void VerifyMyerpTVtvOutClearBtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(tclearbtn.isEnabled(),"tclearbtn field is enabled");		 
					 Reporter.log("verifyMyerptclearbtn", true);
					 tclearbtn.click(); 
					
				}
				public void VerifyMyerpTVtvOutSubmitBtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(tsubmitbtn.isEnabled(),"tsubmitbtn  field is enabled");		 
					 Reporter.log("verifyMyerptsubmitbtnn", true);
					 tsubmitbtn.click(); 
					
				}
			
				
				
}
