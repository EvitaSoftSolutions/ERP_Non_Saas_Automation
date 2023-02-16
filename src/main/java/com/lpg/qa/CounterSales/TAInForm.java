package com.lpg.qa.CounterSales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class TAInForm {
	
	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Counter Sales']")private WebElement countersales;
	@FindBy(xpath="//a[text()=' Transfer Advise (TA) In']")private WebElement transferadvice;
	@FindBy(xpath="//input[@id='txtGSTIN']")private WebElement consumergstin;
	@FindBy(xpath="//input[@id='txtDocNo']")private WebElement docserialno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy(xpath="//select[@id='ddlConsumerType']")private WebElement consumertype;
	@FindBy(xpath="//select[@id='ddlConnectionCategory']")private WebElement connectioncategory;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement productselect;
	@FindBy(xpath="//input[@id='txtRegistrationNo']")private WebElement registratonno;
	@FindBy(xpath="//input[@id='txtConsumerName']")private WebElement consumername;
	@FindBy(xpath="//input[@id='txtAddress']")private WebElement address;
	@FindBy(xpath="//input[@id='txtCity']")private WebElement entercity;
	@FindBy(xpath="//select[@id='ddlstate']")private WebElement state;
	@FindBy(xpath="//select[@id='ddldistrict']")private WebElement district;
	@FindBy(xpath="//select[@id='ddlTahsil']")private WebElement tehsil;
	@FindBy(xpath="//input[@id='txtContact']")private WebElement contact;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy(xpath="//input[@id='txtPreDistributerCode']")private WebElement predistcode;
	@FindBy(xpath="//input[@id='txtPreConsumerNo']")private WebElement preconsumerno;
	@FindBy(xpath="//select[@id='ddlPreDocType']")private WebElement predoctype;
	@FindBy(xpath="//input[@id='txtNumberofCylinder']")private WebElement numberofcyl;
	@FindBy(xpath="//input[@id='txtNumberofDPR']")private WebElement numberofdpr;
	@FindBy(xpath="//input[@id='txtRemarks']")private WebElement remarks;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	
	//initialization
		public TAInForm(WebDriver driver) {
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
		public void verifyMyerpTransferAdvice() {
			Assert.assertTrue(transferadvice.isEnabled(),"TransferAdvice is enable");
			Reporter.log("verifyMyerptransferadvice",true);
			transferadvice.click();
		}
		public void verifyMyerpConsumerGstin() {
			Assert.assertTrue(consumergstin.isEnabled(),"ConsumerGstin is enable");
			Reporter.log("verifyMyerpconsumergstin",true);
			consumergstin.sendKeys("12asdf1234df1as");
		}
		public void verifyMyerpDocSerialNo() {
			Assert.assertTrue(docserialno.isEnabled(),"DocSerialNo is enable");
			Reporter.log("verifyMyerpdocserialno",true);
			docserialno.sendKeys("2030");
		}
		public void verifyMyerpConsumerno() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("21011");
		}
		public void ConsumerType() throws InterruptedException {
			Select ct= new Select(consumertype);
			Thread.sleep(1000);
			Assert.assertFalse(consumertype.isDisplayed(),"ConsumerType is  displayed");
			Assert.assertFalse(consumertype.isSelected());
			ct.selectByVisibleText("DOMESTIC");
		}
		public void ConnectionCategory() throws InterruptedException {
			Select cc= new Select(connectioncategory);
			Thread.sleep(1000);
			Assert.assertFalse(connectioncategory.isDisplayed(),"ConnectionCategory is  displayed");
			Assert.assertFalse(connectioncategory.isSelected());
			cc.selectByVisibleText("VIP");
		}
		public void ProductSelect() throws InterruptedException {
			Select ps= new Select(productselect);
			Thread.sleep(1000);
			Assert.assertFalse(productselect.isDisplayed(),"ProductSelect is  displayed");
			Assert.assertFalse(productselect.isSelected());
			ps.selectByVisibleText("14.2 DOM");
		}
		public void verifyMyerpRegistratonNo() {
			Assert.assertTrue(registratonno.isEnabled(),"RegistratonNo is enable");
			Reporter.log("verifyMyerpregistratonno",true);
			registratonno.sendKeys("37483");
		}
		public void verifyMyerpConsumerName() {
			Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
			Reporter.log("verifyMyerpconsumername",true);
			consumername.sendKeys("Ganak sonar");
		}
		public void verifyMyerpAddress() {
			Assert.assertTrue(address.isEnabled(),"Address is enable");
			Reporter.log("verifyMyerpaddress",true);
			address.sendKeys("VIRAR");
		}
		public void verifyMyerpEnterCity() {
			Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
			Reporter.log("verifyMyerpentercity",true);
			entercity.sendKeys("VIRAR");
		}
		public void State() throws InterruptedException {
			Select s = new Select(state);
			Thread.sleep(1000);
			Assert.assertFalse(state.isDisplayed(),"State is  displayed");
			Assert.assertFalse(state.isSelected());
			s.selectByVisibleText("MAHARASHTRA");
		}
		public void District() throws InterruptedException {
			Select d = new Select(district);
			Thread.sleep(1000);
			Assert.assertFalse(district.isDisplayed(),"District is  displayed");
			Assert.assertFalse(district.isSelected());
			d.selectByVisibleText("Palghar");
		}
		public void Tehsil() throws InterruptedException {
			Select t = new Select(tehsil);
			Thread.sleep(1000);
			Assert.assertFalse(tehsil.isDisplayed(),"tehsil is  displayed");
			Assert.assertFalse(tehsil.isSelected());
			t.selectByVisibleText("Vasai");
		}
		public void verifyMyerpcontact() {
			Assert.assertTrue(contact.isEnabled(),"contact is enable");
			Reporter.log("verifyMyerpcontact",true);
			contact.sendKeys("8970123456");
		}
		public void verifyMyerpEmail() {
			Assert.assertTrue(email.isEnabled(),"Email is enable");
			Reporter.log("verifyMyerpemail",true);
			email.sendKeys("janaksonar123@gmail.com");
		}
		public void verifyMyerpPredistCode() {
			Assert.assertTrue(predistcode.isEnabled(),"PredistCode is enable");
			Reporter.log("verifyMyerppredistcode",true);
			predistcode.sendKeys("213451");
		}
		public void verifyMyerpPreconSumerNo() {
			Assert.assertTrue(preconsumerno.isEnabled(),"PreconSumerNo is enable");
			Reporter.log("verifyMyerppreconsumerno",true);
			preconsumerno.sendKeys("897678");
		}
		public void PredocType() throws InterruptedException {
			Select pt = new Select(predoctype);
			Thread.sleep(1000);
			Assert.assertFalse(predoctype.isDisplayed(),"PredocType is  displayed");
			Assert.assertFalse(predoctype.isSelected());
			pt.selectByVisibleText("DOMESTIC");
		}
		public void verifyMyerpNumberofcyl() {
			Assert.assertTrue(numberofcyl.isEnabled(),"Numberofcyl is enable");
			Reporter.log("verifyMyerpnumberofcyl",true);
			numberofcyl.sendKeys("2");
		}
		public void verifyMyerpNumberofDpr() {
			Assert.assertTrue(numberofdpr.isEnabled(),"NumberofDpr is enable");
			Reporter.log("verifyMyerpnumberofdpr",true);
			numberofdpr.sendKeys("1");
		}
		public void verifyMyerpRemarks() {
			Assert.assertTrue(remarks.isEnabled(),"Remarks is enable");
			Reporter.log("verifyMyerpremarks",true);
			remarks.sendKeys("VERY GOOD");
		}
		public void verifyMyerpclearbtn() {
			Assert.assertTrue(clearbtn.isEnabled(),"clearbtn is enable");
			Reporter.log("verifyMyerpclearbtn",true);
			clearbtn.click();
		}
		public void verifyMyerpConsumerGstin1() {
			Assert.assertTrue(consumergstin.isEnabled(),"ConsumerGstin is enable");
			Reporter.log("verifyMyerpconsumergstin",true);
			consumergstin.sendKeys("12asdf1234df1as");
		}
		public void verifyMyerpDocSerialNo1() {
			Assert.assertTrue(docserialno.isEnabled(),"DocSerialNo is enable");
			Reporter.log("verifyMyerpdocserialno",true);
			docserialno.sendKeys("2030");
		}
		public void verifyMyerpConsumerno1() {
			Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
			Reporter.log("verifyMyerpconsumerno",true);
			consumerno.sendKeys("21011");
		}
		public void ConsumerType1() throws InterruptedException {
			Select ct = new Select(consumertype);
			Thread.sleep(1000);
			Assert.assertFalse(consumertype.isDisplayed(),"ConsumerType is  displayed");
			Assert.assertFalse(consumertype.isSelected());
			ct.selectByVisibleText("DOMESTIC");
		}
		public void ConnectionCategory1() throws InterruptedException {
			Select cc = new Select(connectioncategory);
			Thread.sleep(1000);
			Assert.assertFalse(connectioncategory.isDisplayed(),"ConnectionCategory is  displayed");
			Assert.assertFalse(connectioncategory.isSelected());
			cc.selectByVisibleText("VIP");
		}
		public void ProductSelect1() throws InterruptedException {
			Select ps = new Select(productselect);
			Thread.sleep(1000);
			Assert.assertFalse(productselect.isDisplayed(),"ProductSelect is  displayed");
			Assert.assertFalse(productselect.isSelected());
			ps.selectByVisibleText("14.2 DOM");
		}
		public void verifyMyerpRegistratonNo1() {
			Assert.assertTrue(registratonno.isEnabled(),"RegistratonNo is enable");
			Reporter.log("verifyMyerpregistratonno",true);
			registratonno.sendKeys("37483");
		}
		public void verifyMyerpConsumerName1() {
			Assert.assertTrue(consumername.isEnabled(),"ConsumerName is enable");
			Reporter.log("verifyMyerpconsumername",true);
			consumername.sendKeys("Ganak sonar");
		}
		public void verifyMyerpAddress1() {
			Assert.assertTrue(address.isEnabled(),"Address is enable");
			Reporter.log("verifyMyerpaddress",true);
			address.sendKeys("VIRAR");
		}
		public void verifyMyerpEnterCity1() {
			Assert.assertTrue(entercity.isEnabled(),"EnterCity is enable");
			Reporter.log("verifyMyerpentercity",true);
			entercity.sendKeys("VIRAR");
		}
		public void State1() throws InterruptedException {
			Select s = new Select(state);
			Thread.sleep(1000);
			Assert.assertFalse(state.isDisplayed(),"State is  displayed");
			Assert.assertFalse(state.isSelected());
			s.selectByVisibleText("MAHARASHTRA");
		}
		public void District1() throws InterruptedException {
			Select d = new Select(district);
			Thread.sleep(1000);
			Assert.assertFalse(district.isDisplayed(),"District is  displayed");
			Assert.assertFalse(district.isSelected());
			d.selectByVisibleText("Palghar");
		}
		public void Tehsil1() throws InterruptedException {
			Select t = new Select(tehsil);
			Thread.sleep(1000);
			Assert.assertFalse(tehsil.isDisplayed(),"tehsil is  displayed");
			Assert.assertFalse(tehsil.isSelected());
			t.selectByVisibleText("Vasai");
		}
		public void verifyMyerpcontact1() {
			Assert.assertTrue(contact.isEnabled(),"contact is enable");
			Reporter.log("verifyMyerpcontact",true);
			contact.sendKeys("8970123456");
		}
		public void verifyMyerpEmail1() {
			Assert.assertTrue(email.isEnabled(),"Email is enable");
			Reporter.log("verifyMyerpemail",true);
			email.sendKeys("janaksonar123@gmail.com");
		}
		public void verifyMyerpPredistCode1() {
			Assert.assertTrue(predistcode.isEnabled(),"PredistCode is enable");
			Reporter.log("verifyMyerppredistcode",true);
			predistcode.sendKeys("213451");
		}
		public void verifyMyerpPreconSumerNo1() {
			Assert.assertTrue(preconsumerno.isEnabled(),"PreconSumerNo is enable");
			Reporter.log("verifyMyerppreconsumerno",true);
			preconsumerno.sendKeys("897678");
		}
		public void PredocType1() throws InterruptedException {
			Select pt = new Select(predoctype);
			Thread.sleep(1000);
			Assert.assertFalse(predoctype.isDisplayed(),"PredocType is  displayed");
			Assert.assertFalse(predoctype.isSelected());
			pt.selectByVisibleText("DOMESTIC");
		}
		public void verifyMyerpNumberofcyl1() {
			Assert.assertTrue(numberofcyl.isEnabled(),"Numberofcyl is enable");
			Reporter.log("verifyMyerpnumberofcyl",true);
			numberofcyl.sendKeys("2");
		}
		public void verifyMyerpNumberofDpr1() {
			Assert.assertTrue(numberofdpr.isEnabled(),"NumberofDpr is enable");
			Reporter.log("verifyMyerpnumberofdpr",true);
			numberofdpr.sendKeys("1");
		}
		public void verifyMyerpRemarks1() {
			Assert.assertTrue(remarks.isEnabled(),"Remarks is enable");
			Reporter.log("verifyMyerpremarks",true);
			remarks.sendKeys("VERY GOOD");
		}
		public void verifyMyerpSubmitbtn() {
			Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
			Reporter.log("verifyMyerpsubmitbtn",true);
			submitbtn.click();
		}


}
