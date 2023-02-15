package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class NameForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Name Change']")private WebElement namechange;
	@FindBy(xpath="//input[@id='txtConsumerNoSearch']")private WebElement consumerno;
	@FindBy(xpath="//button[@id='btnGetConsumerData']")private WebElement searchbtn;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement gstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement docserno;
	@FindBy(xpath="//input[@id='txtNewConsumerName']")private WebElement newconsumername;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement entercity;
	@FindBy(xpath="//select[@id='ddlstate']")private WebElement state;
	@FindBy(xpath="//select[@id='ddldistrict']")private WebElement district;
	@FindBy(xpath="//select[@id='ddlTahsil']")private WebElement tehasil;
	@FindBy(xpath="//input[@id='txtPostDistributorCode']")private WebElement distributorcode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//input[@id='txtService']")private WebElement service;
	@FindBy(xpath="//input[@id='txtSrvQunatity']")private WebElement srvquantity;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
			public NameForm(WebDriver driver) {
				PageFactory.initElements(driver,this);
				}

		//usage
			
			public void verifyMyerpagancycode() {
				Assert.assertTrue(agancycode.isEnabled(),"agancycode find is enable");
				Reporter.log("verifyMyerpagancycode",true);
				agancycode.sendKeys("ERP_00001");
				
			}
			public void verifyMyerpusrname() {
				Assert.assertTrue(userid.isEnabled(),"username find is enable");
				Reporter.log("verifyMyerpUserid",true);
				userid.sendKeys("admin");
			}
			public void verifyMyerppassword() {
				Assert.assertTrue(password.isEnabled(),"password find is enable");
				Reporter.log("verifyMyerppassword",true);
				password.sendKeys("admin@123");
			}
			public void verifyMyerploginbtn() {
				Assert.assertTrue(login.isEnabled(),"loginbtn is enable");
				Reporter.log("verifyMyerplogin",true);
				login.click();
			}
			public void verifyMyerpCounterSales() {
				Assert.assertTrue(countersales.isEnabled(),"CounterSales is enable");
				Reporter.log("verifyMyerpcountersales",true);
				countersales.click();
			}
			public void verifyMyerpNamechange() {
				Assert.assertTrue(namechange.isEnabled(),"Namechange is enable");
				Reporter.log("verifyMyerpnamechange",true);
				namechange.click();
			}
			public void verifyMyerpConsumerno() {
				Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
				Reporter.log("verifyMyerpconsumerno",true);
				consumerno.sendKeys("9011");
			}
			public void verifyMyerpSearchbtn() {
				Assert.assertTrue(searchbtn.isEnabled(),"Searchbtn is enable");
				Reporter.log("verifyMyerpsearchbtn",true);
				searchbtn.click();
			}
			public void verifyMyerpGstin() {
				Assert.assertTrue(gstin.isEnabled(),"Gstin is enable");
				Reporter.log("verifyMyerpgstin",true);
				gstin.sendKeys("12abcd1234ab12d");
			}
			public void verifyMyerpDocserno() {
				Assert.assertTrue(docserno.isEnabled(),"Docserno is enable");
				Reporter.log("verifyMyerpdocserno",true);
				docserno.sendKeys("107");
			}
			public void verifyMyerpNewConsumerName() {
				Assert.assertTrue(newconsumername.isEnabled(),"NewConsumerName is enable");
				Reporter.log("verifyMyerpnewconsumername",true);
				newconsumername.sendKeys("Rohit Saksena");
			}
			public void verifyMyerpEntercity() {
				Assert.assertTrue(entercity.isEnabled(),"Entercity is enable");
				Reporter.log("verifyMyerpentercity",true);
				entercity.sendKeys("Nalasopara");
			}
			public void State() throws InterruptedException {
    			Select sc = new Select(state);
    			Thread.sleep(1000);
    			Assert.assertFalse(state.isDisplayed(),"State is  displayed");
    			Assert.assertFalse(state.isSelected());
    			sc.selectByVisibleText("MAHARASHTRA");
			}
			public void District() throws InterruptedException {
    			Select sc = new Select(district);
    			Thread.sleep(1000);
    			Assert.assertFalse(district.isDisplayed(),"District is  displayed");
    			Assert.assertFalse(district.isSelected());
    			sc.selectByVisibleText("Palghar");
			}
			public void Tehasil() throws InterruptedException {
    			Select sc = new Select(tehasil);
    			Thread.sleep(1000);
    			Assert.assertFalse(tehasil.isDisplayed(),"Tehasil is  displayed");
    			Assert.assertFalse(tehasil.isSelected());
    			sc.selectByVisibleText("Vasai");
			}
			public void verifyMyerpDistributorcode() {
				Assert.assertTrue(distributorcode.isEnabled(),"Distributorcode is enable");
				Reporter.log("verifyMyerpdistributorcode",true);
				distributorcode.sendKeys("108");
			}
			public void verifyMyerpEmail() {
				Assert.assertTrue(email.isEnabled(),"Email is enable");
				Reporter.log("verifyMyerpemail",true);
				email.sendKeys("rohit123@gmail.com");
			}
			public void Modeofpayment() throws InterruptedException {
    			Select sc = new Select(modeofpayment);
    			Thread.sleep(1000);
    			Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
    			Assert.assertFalse(modeofpayment.isSelected());
    			sc.selectByVisibleText("CASH");
			}
			public void verifyMyerpCashamount() {
				Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
				Reporter.log("verifyMyerpcashamount",true);
				cashamount.sendKeys("1000");
			}
			public void verifyMyerpService() {
				Assert.assertTrue(service.isEnabled(),"Service is enable");
				Reporter.log("verifyMyerpservice",true);
				service.sendKeys("");
			}
			public void verifyMyerpSrvquantity() {
				Assert.assertTrue(srvquantity.isEnabled(),"Srvquantity is enable");
				Reporter.log("verifyMyerpsrvquantity",true);
				srvquantity.sendKeys("1");
			}
			public void verifyMyerpClearbtn() {
				Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
			}




}
