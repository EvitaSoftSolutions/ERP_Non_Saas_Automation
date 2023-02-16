package com.lpg.qa.commercialcylsale;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.Reporter;

	public class CommercialCylSaleRegister {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement genralreport;
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[12]/a") private WebElement commercialcylsaleregister;
			@FindBy (xpath="//input[@id='FromDate']") private WebElement fromdate;
			@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;   
			@FindBy (xpath="//select[@id='ddlDeliveryMan']") private WebElement selectdeliveryman;
			@FindBy (xpath="//select[@id='ddlProduct']") private WebElement selectproduct;
			@FindBy (xpath="//select[@id='ddlParty']") private WebElement selectparty;
			@FindBy (xpath="//Button[@id='btnGetdata']") private WebElement getdatabtn;
			
			// initialization
						public CommercialCylSaleRegister(WebDriver driver) {
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
								 Reporter.log("verifyMyerplogin", true);
								login.click();
							}
							
							public void VerifyMyerpGenralReportModule() {
								 Assert.assertTrue(genralreport.isEnabled(),"genralreport field is enabled");		 
								 Reporter.log("verifyMyerpgenralreport", true);
								 genralreport.click(); 
							}

							public void VerifyMyerpCommercialCylSaleRegister() {
								 Assert.assertTrue(commercialcylsaleregister.isEnabled(),"commercialcylsaleregister field is enabled");		 
								 Reporter.log("verifyMyerpcommercialcylsaleregister", true);
								 commercialcylsaleregister.click(); 
							}

							public void VerifyMyerpFromDate() {
								 Assert.assertTrue(fromdate.isEnabled(),"fromdate field is enabled");		 
								 Reporter.log("verifyMyerpfromdate", true);
								 fromdate.click(); 
								 fromdate.clear();
								 fromdate.sendKeys("8/01/2023");
							}

							public void VerifyMyerpTodate() {
								 Assert.assertTrue(todate.isEnabled(),"todate field is enabled");		 
								 Reporter.log("verifyMyerptodate", true);
								 todate.click(); 
								 todate.clear();
								 todate.sendKeys("15/01/2023");
							}
							public void verifyMyerpSelectDeliveryMan() throws InterruptedException {
								Select su = new Select(selectdeliveryman);
								Thread.sleep(1000);
								Assert.assertFalse(selectdeliveryman.isDisplayed(),"selectdeliveryman is displayed");
								Assert.assertFalse(selectdeliveryman.isSelected());
								su.selectByVisibleText("RAJU/SHYAM");
							
							}
							public void verifyMyerpSelectProduct() throws InterruptedException {
								Select su = new Select(selectproduct);
								Thread.sleep(1000);
								Assert.assertFalse(selectproduct.isDisplayed(),"selectdeliveryman is displayed");
								Assert.assertFalse(selectproduct.isSelected());
								su.selectByVisibleText("47.5 KG LOT");
							
							}
							public void verifyMyerpSelectParty() throws InterruptedException {
								Select su = new Select(selectparty);
								Thread.sleep(1000);
								Assert.assertFalse(selectparty.isDisplayed(),"selectparty is displayed");
								Assert.assertFalse(selectparty.isSelected());
								su.selectByVisibleText("786 CATRESS");
							
							}
							public void VerifyandClickonMyerpGetDataBtn() throws InterruptedException {
								Thread.sleep(1000);
								 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
								 Reporter.log("verifyMyerpgetdatabtn", true);
								 getdatabtn.click();
							}

}
