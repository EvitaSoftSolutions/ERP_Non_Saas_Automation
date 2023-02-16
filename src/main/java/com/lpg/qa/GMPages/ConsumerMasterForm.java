package com.lpg.qa.GMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ConsumerMasterForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//*[@id=\"menuMasters\"]/a")private WebElement master;
	@FindBy(xpath="//li[@id='menuMasters']/child::a/following-sibling::ul/child::li/child::a")private WebElement generalmaster;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena1;
	@FindBy(xpath="//a[text()='Next']")private WebElement pagena2;
	@FindBy(xpath="//a[text()='Consumer Master']")private WebElement consumermaster;
	@FindBy(xpath="//input[@id='txtConsumerName']")private WebElement consumername;
	@FindBy(xpath="//input[@id='txtConsumerno']")private WebElement consumerno;
	@FindBy(xpath="//input[@id='txtAddress']")private WebElement address;
	@FindBy(xpath="//input[@id='txtContact']")private WebElement contact;
	@FindBy(xpath="//input[@id='txtSVNo']")private WebElement svno;
	@FindBy(xpath="//input[@id='datepicker']")private WebElement datepicker; 
	@FindBy(xpath="//select[@id='ddlProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtNoOfCyl']")private WebElement noofcyl;
	@FindBy(xpath="//input[@id='txtBlueBookNo']")private WebElement blubookno;
	@FindBy(xpath="//input[@id='InspectionDate']")private WebElement inspectiondate;
	@FindBy(xpath="//select[@id='ddlConsumerType']")private WebElement consumertype;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  pcsearchbar;
	
	
	//initialization
			public ConsumerMasterForm(WebDriver driver) {
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
			public void verifyMyerpMasterModule() {
				Assert.assertTrue(master.isEnabled()," Mastermodule is enable");
				Reporter.log("verifyMyerpmastermodule",true);
				master.click();
			}
			public void verifyMyerpGeneralMaster() {
				Assert.assertTrue(generalmaster.isEnabled(),"GeneralMaster is Enable");
				Reporter.log("verifyMyerpgeneralmaster",true);
				generalmaster.click();
				
			}
			public void verifyMyerpPageNavigation1() {
				Assert.assertTrue(pagena1.isEnabled(),"PageNavigation1 is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena1.click();
				
			}
			public void verifyMyerpPageNavigation2() {
				Assert.assertTrue(pagena2.isEnabled(),"PageNavigation2 is Enable");
				Reporter.log("verifyMyerppagena",true);
				pagena2.click();
			}
			public void verifyMyerpConsumerMaster() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(consumermaster.isEnabled(),"ConsumerMaster is Enable");
				Reporter.log("verifyMyerpconsumermaster",true);
				consumermaster.click();
			}
			public void verifyMyerpConsumerName() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(consumername.isEnabled(),"ConsumerName is Enable");
				Reporter.log("verifyMyerpconsumername",true);
				consumername.sendKeys("Prasant");
			}
			public void verifyMyerpConsumerNo() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(consumerno.isEnabled(),"ConsumerNo is Enable");
				Reporter.log("verifyMyerpconsumerno",true);
				consumerno.sendKeys("01122");
			}
			public void verifyMyerpAddress() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(address.isEnabled(),"Address is Enable");
				Reporter.log("verifyMyerpaddress",true);
				address.sendKeys("VASAI");
			}
			public void verifyMyerpContact() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(contact.isEnabled(),"Contact is Enable");
				Reporter.log("verifyMyerpcontact",true);
				contact.sendKeys("9981364780");
			}
			public void verifyMyerpSVNUMBER() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(svno.isEnabled(),"SVNUMBER is Enable");
				Reporter.log("verifyMyerpsvno",true);
				svno.sendKeys("55667");
			}
			public void verifyMyerpDatepicker() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(datepicker.isEnabled(),"Datepicker is Enable");
				Reporter.log("verifyMyerpdatepicker",true);
				datepicker.sendKeys("30/11/2022");
			}
			public void Product() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("14.2 KG");
			}
			public void verifyMyerpNoofcyl() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(noofcyl.isEnabled(),"Noofcyl is Enable");
				Reporter.log("verifyMyerpnoofcyl",true);
				noofcyl.sendKeys("1");
			}
			public void verifyMyerpBluBookNo() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(blubookno.isEnabled(),"BluBookNo is Enable");
				Reporter.log("verifyMyerpblubookno",true);
				blubookno.sendKeys("1710");
			}
			public void verifyMyerpInspectionDate() throws InterruptedException {
				Thread.sleep(800);
				Assert.assertTrue(inspectiondate.isEnabled(),"InspectionDate is Enable");
				Reporter.log("verifyMyerpinspectiondate",true);
				inspectiondate.sendKeys("30/11/2022");
			}
			public void ConsumerType() throws InterruptedException {
    			Select sc = new Select(consumertype);
    			Thread.sleep(1000);
    			Assert.assertFalse(consumertype.isDisplayed(),"ConsumerType is  displayed");
    			Assert.assertFalse(consumertype.isSelected());
    			sc.selectByVisibleText("LOTVAL");
			}
			public void verifyMyerpClearBtn() {
				Assert.assertTrue(clearbtn.isEnabled(),"ClearBtn is Enable");
				Reporter.log("verifyMyerpclearbtn",true);
				clearbtn.click();
			}
			public void verifyMyerpConsumerName1() {
				Assert.assertTrue(consumername.isEnabled(),"ConsumerName is Enable");
				Reporter.log("verifyMyerpconsumername",true);
				consumername.sendKeys("Prasant");
			}
			public void verifyMyerpConsumerNo1() {
				Assert.assertTrue(consumerno.isEnabled(),"ConsumerNo is Enable");
				Reporter.log("verifyMyerpconsumerno",true);
				consumerno.sendKeys("01122");
			}
			public void verifyMyerpAddress1() {
				Assert.assertTrue(address.isEnabled(),"Address is Enable");
				Reporter.log("verifyMyerpaddress",true);
				address.sendKeys("VASAI");
			}
			public void verifyMyerpContact1() {
				Assert.assertTrue(contact.isEnabled(),"Contact is Enable");
				Reporter.log("verifyMyerpcontact",true);
				contact.sendKeys("9981364780");
			}
			public void verifyMyerpSVNUMBER1() {
				Assert.assertTrue(svno.isEnabled(),"SVNUMBER is Enable");
				Reporter.log("verifyMyerpsvno",true);
				svno.sendKeys("55667");
			}
			public void verifyMyerpDatepicker1() {
				Assert.assertTrue(datepicker.isEnabled(),"Datepicker is Enable");
				Reporter.log("verifyMyerpdatepicker",true);
				datepicker.sendKeys("30/11/2022");
			}
			public void Product1() throws InterruptedException {
    			Select sc = new Select(product);
    			Thread.sleep(1000);
    			Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
    			Assert.assertFalse(product.isSelected());
    			sc.selectByVisibleText("14.2 KG");
			}
			public void verifyMyerpNoofcyl1() {
				Assert.assertTrue(noofcyl.isEnabled(),"Noofcyl is Enable");
				Reporter.log("verifyMyerpnoofcyl",true);
				noofcyl.sendKeys("1");
			}
			public void verifyMyerpBluBookNo1() {
				Assert.assertTrue(blubookno.isEnabled(),"BluBookNo is Enable");
				Reporter.log("verifyMyerpblubookno",true);
				blubookno.sendKeys("1710");
			}
			public void verifyMyerpInspectionDate1() {
				Assert.assertTrue(inspectiondate.isEnabled(),"InspectionDate is Enable");
				Reporter.log("verifyMyerpinspectiondate",true);
				inspectiondate.sendKeys("30/11/2022");
			}
			public void ConsumerType1() throws InterruptedException {
    			Select sc = new Select(consumertype);
    			Thread.sleep(1000);
    			Assert.assertFalse(consumertype.isDisplayed(),"ConsumerType is  displayed");
    			Assert.assertFalse(consumertype.isSelected());
    			sc.selectByVisibleText("LOTVAL");
			}
			public void verifyMyerpSubmitbtn() {
				Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is Enable");
				Reporter.log("verifyMyerpsubmitbtn",true);
				submitbtn.click();
			}
			public void VerifyandClickonPSearchbar2() throws InterruptedException {
		    	  Thread.sleep(500);
		    	  Assert.assertTrue(pcsearchbar.isEnabled()," pcsearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp pcsearchbar", true);
		    	  pcsearchbar.click(); 
		    	  pcsearchbar.clear();
		    	  pcsearchbar.sendKeys("Prasant");
		    	  
		    	  Thread.sleep(500);
		    	  }

	
}
