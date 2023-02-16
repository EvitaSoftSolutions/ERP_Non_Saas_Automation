package com.lpg.qa.tvmodules;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.Reporter;

	public class TranferVoucherTVOut {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/a/span[1]") private WebElement tvmodule;  
			@FindBy (xpath="//*[@id=\"menuTVOUT\"]/ul/li[1]/a") private WebElement tvtvoutforrm; 
			@FindBy (xpath="//input[@id='txtConsumer_No']") private WebElement tvoutconsumernum;
			@FindBy (xpath="//button[@id='btnGetConsumerData']") private WebElement tvoutsubmitbtn;
			@FindBy (xpath="//select[@id='ddlProduct']") private WebElement tvselectproduct;
			@FindBy (xpath="//select[@id='ddlDPR_Recieved']") private WebElement tselectdprreceived;
			@FindBy (xpath="//select[@id='ddlRecieved_At']") private WebElement tcylenderrecivedat;
			@FindBy (xpath="//select[@id='ddlRecieved_By']") private WebElement tcylenderreceivedby;
			@FindBy (xpath="//select[@id='ddlReson']") private WebElement ttvoutreasons;
			@FindBy (xpath="//input[@id='txtTotal_Deposite_Amount']") private WebElement ttotaldeposit;
			@FindBy (xpath="//select[@id='ddlstate']") private WebElement tselectstate; 
			@FindBy (xpath="//input[@id='txtServices']") private WebElement tservicestextbox;
			@FindBy (xpath="//input[@id='txtQunatity']") private WebElement tquantitytextbox;
			@FindBy (xpath="//input[@id='txtUnitCost']") private WebElement tunitcosattextbox;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement tclearbtn;
			@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn;
			
			
			
			
			
			
			// initialization
			public TranferVoucherTVOut(WebDriver driver) {
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
				public void VerifyMyerpTVtvoutForm() {
					 Assert.assertTrue(tvtvoutforrm.isEnabled(),"tvtvoutforrm Module field is enabled");		 
					 Reporter.log("verifyMyerptvtvoutforrm", true);
					 tvtvoutforrm.click(); 
				}
				public void VerifyMyerpTVtvoutConsumerNum() {
					 Assert.assertTrue(tvoutconsumernum.isEnabled(),"tvoutconsumernum Module field is enabled");		 
					 Reporter.log("verifyMyerptvoutconsumernum", true);
					 tvoutconsumernum.click(); 
					 tvoutconsumernum.sendKeys("8794");
				}
				public void VerifyMyerpTVtvoutSubmitBtn() {
					 Assert.assertTrue(tvoutsubmitbtn.isEnabled(),"tvoutsubmitbtn Module field is enabled");		 
					 Reporter.log("verifyMyertvoutsubmitbtn", true);
					 tvoutsubmitbtn.click(); 
					
				}
				public void TVtvOutSelectDprReceived() throws InterruptedException {
					Select tdr = new Select(tselectdprreceived);
					Thread.sleep(500);
					Assert.assertTrue(tselectdprreceived.isDisplayed(),"tselectdprreceivedis displayed");
					Assert.assertFalse(tselectdprreceived.isSelected());
					tdr.selectByVisibleText("YES");
				}
				public void TVtvOutSelectCylenderReceivedAt() throws InterruptedException {
					Select tsra = new Select(tcylenderrecivedat);
					Thread.sleep(500);
					Assert.assertFalse(tcylenderrecivedat.isDisplayed(),"tcylenderrecivedat displayed");
					Assert.assertFalse(tcylenderrecivedat.isSelected());
					tsra.selectByVisibleText("VIRAR");
				}
				public void TVtvOutSelectCylenderReceivedBy() throws InterruptedException {
					Select tsra = new Select(tcylenderreceivedby);
					Thread.sleep(500);
					Assert.assertFalse(tcylenderreceivedby.isDisplayed(),"tcylenderrecivedby field  displayed");
					Assert.assertFalse(tcylenderreceivedby.isSelected());
					tsra.selectByVisibleText("AJIT");
				}
				public void TVtvOutSelectCylenderReasonForTVout() throws InterruptedException {
					Select tsra = new Select(ttvoutreasons);
					Thread.sleep(500);
					Assert.assertFalse(ttvoutreasons.isDisplayed(),"ttvoutreasons displayed");
					Assert.assertFalse(ttvoutreasons.isSelected());
					tsra.selectByVisibleText("For Multiple Connection");
				}
				public void VerifyMyerpTVtvOutTotalDepositAmount() {
					 Assert.assertTrue(ttotaldeposit.isEnabled(),"ttotaldeposit Module field is enabled");		 
					 Reporter.log("verifyMyertvouttotaldeposit", true);
					 ttotaldeposit.click(); 
					 ttotaldeposit.sendKeys("1000");
				}
				public void TVtvOutSelectState() throws InterruptedException {
					Select tss = new Select(tselectstate);
					Thread.sleep(500);
					Assert.assertFalse(tselectstate.isDisplayed(),"tselectstate  displayed");
					Assert.assertFalse(tselectstate.isSelected());
					tss.selectByVisibleText("ASSAM");
				}
				
				public void VerifyMyerpTVtvOutServicesTextbox() throws InterruptedException {
					    Assert.assertTrue(tservicestextbox.isEnabled(),"tservicestextbox) field is enabled");		 
						 Reporter.log("verifyMyerptservicestextbox)", true);
						 tservicestextbox.click(); 
						 tservicestextbox.sendKeys("MECHANICAL SERVICES");
					}
				public void VerifyMyerpTVtvOutQantityTextbox() {
					 Assert.assertTrue(tquantitytextbox.isEnabled(),"tquantitytextbox field is enabled");		 
					 Reporter.log("verifyMyerptquantitytextbox", true);
					 tquantitytextbox.click(); 
					 tquantitytextbox.sendKeys("2");
				}
				public void VerifyMyerpTVtvOutUnitCostTextbox() {
					 Assert.assertTrue(tunitcosattextbox.isEnabled(),"tunitcosattextbox field is enabled");		 
					 Reporter.log("verifyMyerptunitcosattextbox", true);
					 tunitcosattextbox.click(); 
					 tunitcosattextbox.sendKeys("120");
				}
				public void VerifyMyerpTVtvOutClearBtn() {
					 Assert.assertTrue(tclearbtn.isEnabled(),"tclearbtn field is enabled");		 
					 Reporter.log("verifyMyerptclearbtn", true);
					 tclearbtn.click(); 
					
				}
				public void VerifyMyerpTVtvOutSubmitBtn() {
					 Assert.assertTrue(tsubmitbtn.isEnabled(),"tsubmitbtn  field is enabled");		 
					 Reporter.log("verifyMyerptsubmitbtnn", true);
					 tsubmitbtn.click(); 
					
				}
				public void TVtvOutSelectProduct() throws InterruptedException {
					Select tsp = new Select(tvselectproduct);
					Thread.sleep(500);
					Assert.assertFalse(tvselectproduct.isDisplayed(),"tvselectproductis displayed");
					Assert.assertFalse(tvselectproduct.isSelected());
					tsp.selectByVisibleText("5 KG COMM");
				}
				
				
}
