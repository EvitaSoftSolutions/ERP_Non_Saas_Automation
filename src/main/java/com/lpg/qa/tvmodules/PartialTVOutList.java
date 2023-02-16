
package com.lpg.qa.tvmodules;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

	 public class PartialTVOutList { 
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/a/span[1]") private WebElement tvmodule;  
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/ul/li[4]/a") private WebElement ptvtvoutlistform; 
			@FindBy (xpath="//*[@id=\"tblmain\"]/tbody/tr[2]/td[2]/a") private WebElement tvtvoconsumernum;
			@FindBy (xpath="//select[@id='ddlDPR_Recieved']") private WebElement tselectdprreceived;
			@FindBy (xpath="//select[@id='ddlRecieved_By']") private WebElement tcylenderreceivedby;
			@FindBy (xpath="//input[@id='txtTotal_Deposite_Amount']") private WebElement ttotaldeposit;
			@FindBy (xpath="//select[@id='ddlstate']") private WebElement tselectstate; 
			@FindBy (xpath="//button[@id='btnclear']") private WebElement tclearbtn;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn;
			
			
			
			
			
			
			// initialization
			public PartialTVOutList(WebDriver driver) {
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
				public void VerifyMyerpPTVtvoutListForm() {
					 Assert.assertTrue(ptvtvoutlistform.isEnabled(),"ptvtvoutlistform field is enabled");		 
					 Reporter.log("verifyMyerpptvtvoutlistform", true);
					 ptvtvoutlistform.click(); 
				}
				public void VerifyMyerpPTVtvoutListConsumerNum() {
					 Assert.assertTrue(tvtvoconsumernum.isEnabled(),"tvtvoconsumernum  field is enabled");		 
					 Reporter.log("verifyMyerptvoutconsumernum", true);
					 tvtvoconsumernum.click(); 
				}
				public void VerifyMyerpPTVtvOutSelectDprReceived() throws InterruptedException {
					Select tdr = new Select(tselectdprreceived);
					Thread.sleep(1000);
					Assert.assertTrue(tselectdprreceived.isDisplayed(),"tselectdprreceivedis displayed");
					Assert.assertFalse(tselectdprreceived.isSelected());
					tdr.selectByVisibleText("YES");
				}
				public void VerifyMyerpPTVtvOutSelectCylenderReceivedBy() throws InterruptedException {
					Select tsra = new Select(tcylenderreceivedby);
					Thread.sleep(1000);
					Assert.assertFalse(tcylenderreceivedby.isDisplayed(),"tcylenderrecivedby field  displayed");
					Assert.assertFalse(tcylenderreceivedby.isSelected());
					tsra.selectByVisibleText("AJIT");
				}
				
				public void VerifyMyerpPTVtvOutTotalDepositAmount() {
					 Assert.assertTrue(ttotaldeposit.isEnabled(),"ttotaldeposit Module field is enabled");		 
					 Reporter.log("verifyMyertvouttotaldeposit", true);
					 ttotaldeposit.click(); 
					 ttotaldeposit.sendKeys("1000");
				}
				public void VerifyMyerpPTVtvOutSelectState() throws InterruptedException {
					Select tss = new Select(tselectstate);
					Thread.sleep(500);
					Assert.assertFalse(tselectstate.isDisplayed(),"tselectstate  displayed");
					Assert.assertFalse(tselectstate.isSelected());
					tss.selectByVisibleText("ASSAM");
				}
				public void VerifyMyerpPTVtvOutClearBtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(tclearbtn.isEnabled(),"tclearbtn field is enabled");		 
					 Reporter.log("verifyMyerptclearbtn", true);
					 tclearbtn.click(); 
					
				}
				public void VerifyMyerpPTVtvOutSubmitBtn() throws InterruptedException {
					Thread.sleep(1000);
					 Assert.assertTrue(tsubmitbtn.isEnabled(),"tsubmitbtn  field is enabled");		 
					 Reporter.log("verifyMyerptsubmitbtnn", true);
					 tsubmitbtn.click(); 
					
				}
			
				
				
}
