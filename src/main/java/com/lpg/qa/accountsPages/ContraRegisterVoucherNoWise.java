package com.lpg.qa.accountsPages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.Reporter;


	public class ContraRegisterVoucherNoWise{
				@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
				@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
				@FindBy (xpath="//input[@id='password-field']") private WebElement password;
				@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
				@FindBy (xpath="//span[text()='Accounts Report']") private WebElement accountreport;
				@FindBy (xpath="//a[text()=' Accounting Reports']") private WebElement accountingreport;
				@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[8]/td[2]/a") private WebElement contranowisereport;
				@FindBy(xpath="//select[@id='ddlCompanyCode']")private WebElement selectcomp;
				@FindBy (xpath="//input[@id='txtFromDocNo']") private WebElement fromdocno;
				@FindBy (xpath="//input[@id='txtToDocNo']") private WebElement todocno;
			    @FindBy (xpath="//button[@id='btnGetdata']") private WebElement getdatabtn;
				@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/div/section[2]/div/div/div/div") private WebElement body;
				
				// initialization
				public ContraRegisterVoucherNoWise(WebDriver driver) {
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
						 Reporter.log("verifyMyerpPassword", true);
						 password.sendKeys("admin@123");
					}
					
					public void VerifyandClickonMyerpLoginBtn() {
						 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
						 Reporter.log("verifyMyerplogin", true);
						login.click();
					}
					public void VerifyandClickonMyerpAccountReport() {
						 Assert.assertTrue(accountreport.isEnabled(),"accountreport is enabled");
						 Reporter.log("verifyMyerpaccountreport", true);
						 accountreport.click();
					}
					public void VerifyandClickonMyerpAccountingReport() {
						 Assert.assertTrue(accountingreport.isEnabled(),"accountingreport is enabled");
						 Reporter.log("verifyMyerpaccountingreport", true);
						 accountingreport.click();
					}
					
					public void VerifyandClickonMyerpContraNoWiseReport() throws InterruptedException {
						Thread.sleep(600);
						 Assert.assertTrue(contranowisereport.isEnabled(),"contranowisereport is enabled");
						 Reporter.log("verifyMyerpcontranowisereport", true);
						 contranowisereport.click();
						 
					}
					public void verifyMyerpSelectCompany() throws InterruptedException {
						Select su = new Select(selectcomp);
						Thread.sleep(1000);
						Assert.assertFalse(selectcomp.isDisplayed(),"SelectCompany is displayed");
						Assert.assertFalse(selectcomp.isSelected());
						su.selectByVisibleText("ANITA GAS SERVICES");
					
					}
					
					public void VerifyMyerpFromDocNo() {
						 Assert.assertTrue(fromdocno.isEnabled(),"fromdocno field is enabled");		 
						 Reporter.log("verifyMyerpfromdocno", true);
						 fromdocno.click(); 
						 fromdocno.clear();
						 fromdocno.sendKeys("2300002");
					}

					public void VerifyMyerpToDocNo() {
						 Assert.assertTrue(todocno.isEnabled(),"todocno field is enabled");		 
						 Reporter.log("verifyMyerptodocno", true);
						 todocno.click(); 
						 todocno.clear();
						 todocno.sendKeys("2300002");
						
					}
					
					public void VerifyandClickonMyerpGetdataBtn() {
						 Assert.assertTrue(getdatabtn.isEnabled(),"getdatabtn is enabled");
						 Reporter.log(" verifyMyerpgetdatabtn", true);
						 getdatabtn.click();
					
					}
	}                   
