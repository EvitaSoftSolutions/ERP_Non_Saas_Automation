package com.lpg.qa.CounterSales;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class CounterSaleRegister {
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id=\"menuReports\"]/a/span[1]") private WebElement gerneralreport; 
			@FindBy (xpath="//*[@id=\"menuReports\"]/ul/li[7]/a") private WebElement contersaleregister; 
			@FindBy (xpath="//input[@id='FromDate']") private WebElement selectdate;
			@FindBy (xpath="//input[@id='ToDate']") private WebElement todate;
			@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp;
			@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement selectpaymentmode; 
			@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
			@FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn; 
			@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;
			@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
			@FindBy(xpath="//a[text()=' DBC']")private WebElement clickdbc;
			@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumernumber;
			@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement searchbtn;
			
			// initialization
			WebDriver driver;
			public void setup(WebDriver driver) 
			{
				this.driver=driver;
			}
			public CounterSaleRegister(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

				// usage
		
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
					 Assert.assertTrue(gerneralreport.isEnabled(),"gerneralreport is enabled");
					 Reporter.log(" verifyMyerpgerneralreport", true);
					 gerneralreport.click();
				}
				public void VerifyandClickonMyerpCountersaleRegister() {
					 Assert.assertTrue(contersaleregister.isEnabled(),"contersaleregister is enabled");
					 Reporter.log(" verifyMyerpcontersaleregister", true);
					 contersaleregister.click();
				}
				public void VerifyandClickonMyerpPlaseFromSelectDate() throws InterruptedException {
					 Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
					 Reporter.log(" verifyMyerpselectdate", true);
					 selectdate.click();
					 selectdate.clear();
					 selectdate.sendKeys("01/02/2023");
					 body.click();
					 Thread.sleep(500);
				}
				public void VerifyandClickonMyerpPlaseToSelectDate() throws InterruptedException {
					 Assert.assertTrue(selectdate.isEnabled(),"selectdate is enabled");
					 Reporter.log(" verifyMyerpselectdate", true);
					 selectdate.click();
					 selectdate.clear();
					 selectdate.sendKeys("21/02/2023");
					 body.click();
					 Thread.sleep(500);
				}
				
				public void verifyMyerpSelectCompany() throws InterruptedException {
					Select su = new Select(selectcomp);
					Thread.sleep(1000);
					Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
					Assert.assertFalse(selectcomp.isSelected());
					su.selectByVisibleText("ANITA GAS SERVICES");
				
				}
				public void verifyMyerpSelectPaymentMode() throws InterruptedException {
					Select su = new Select(selectpaymentmode);
					Thread.sleep(1000);
					Assert.assertFalse(selectpaymentmode.isDisplayed(),"selectpaymentmode is displayed");
					Assert.assertFalse(selectpaymentmode.isSelected());
					su.selectByVisibleText("CASH");
				
				}
				
				public void VerifyandClickonMyerpConsumerNumber() {
					 Assert.assertTrue(consumerno.isEnabled(),"consumerno is enabled");
					 Reporter.log(" verifyMyerpconsumerno", true);
					 consumerno.click();
					 consumerno.sendKeys("879");
					 
				}
				public void VerifyandClickonMyerpGetdataBtn() throws InterruptedException{
					Thread.sleep(800);
					 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
					 Reporter.log(" verifyMyerpgetdatabtn", true);
					 getdatabtn.click();
					 Thread.sleep(6000); 
				}
				public void verifyMyerpCounterSales() throws InterruptedException {
					Thread.sleep(1000); 
					Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
					Reporter.log("verifyMyerpcountersales",true);
					countersales.click();
				}
				public void verifyMyerpClickDbc() throws InterruptedException {
					Thread.sleep(800); 
					Assert.assertTrue(clickdbc.isEnabled(),"ClickDbc is enable");
					Reporter.log("verifyMyerpclickdbc",true);
					clickdbc.click();
				}
				public void verifyMyerpConsumerNumber() throws InterruptedException {
					Thread.sleep(800); 
					Assert.assertTrue(consumernumber.isEnabled(),"ConsumerNumber is enable");
					Reporter.log("verifyMyerpconsumernumber",true);
					consumernumber.sendKeys("1414");
				}
				public void verifyMyerpSearchbtn() throws InterruptedException {
					Thread.sleep(800); 
					Assert.assertTrue(searchbtn.isEnabled(),"Searchbtn is enable");
					Reporter.log("verifyMyerpsearchbtn",true);
					searchbtn.click();
				}
				
}