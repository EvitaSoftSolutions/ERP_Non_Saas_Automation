package com.lpg.qa.commercialcylsale;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ComsaleListForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Commercial Cyl. Sales']")private WebElement commercialcylsale;
	@FindBy(xpath="//a[text()=' Commercial Sale List']")private WebElement comsalelist;
	@FindBy(xpath="//input[@id='Challandate']")private WebElement comsaledate;
	@FindBy(xpath="//*[@id=\"divContentHolder\"]/section[2]/div/div/div/form/div")private WebElement body;
	@FindBy(xpath="//select[@id='ddlDeliveryMan']")private WebElement deliverymanname;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//a[@href='CommercialSale?Id=9&Type=Empty']")private WebElement receditbtn;
	@FindBy(xpath="//*[@id=\"txtEmptyCylRecivedtb2\"]")private WebElement emptycylrecieved;
	@FindBy(xpath="//*[@id=\"txtChallanNotb2\"]")private WebElement schallanno;

	@FindBy(xpath="//a[@href='CommercialSale?Id=8&Type=Sale']")private WebElement cseditbtn;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//*[@id=\"btnSubmit\"]")private WebElement submitbtn2;
	@FindBy(xpath="//button[@id='btnDelete']")private WebElement deletebtn;

	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}

	public ComsaleListForm(WebDriver driver) {
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
	public void verifyMyerpCommercialcylsale() {
		Assert.assertTrue(commercialcylsale.isEnabled(),"Commercialcylsale is enable");
		Reporter.log("verifyMyerpcommercialcylsale",true);
		commercialcylsale.click();
	}
	public void verifyMyerpComsalelist() {
		Assert.assertTrue(comsalelist.isEnabled(),"Comsalelist is enable");
		Reporter.log("verifyMyerpcomsalelist",true);
		comsalelist.click();
	}
	public void verifyMyerpComsaleDate() {
		Assert.assertTrue(comsaledate.isEnabled(),"comsaledate is enable");
		Reporter.log("verifyMyerpcomsaledate",true);
		comsaledate.clear();
		comsaledate.sendKeys("2/03/2023");
		body.click();
	}


	public void Deliverymanname() throws InterruptedException {
		Select sc = new Select(deliverymanname);
		Thread.sleep(1000);
		Assert.assertFalse(deliverymanname.isDisplayed(),"Deliverymanname is  displayed");
		Assert.assertFalse(deliverymanname.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}

	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();

	}
	public void verifyMyerpRECEditbtn() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(receditbtn.isEnabled(),"RECEditbtn is enable");
		Reporter.log("verifyMyerpreceditbtn",true);
		receditbtn.click();
		Thread.sleep(3000);
	}
	public void verifyMyerpCSEditbtn() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(cseditbtn.isEnabled(),"CSEditbtn is enable");
		Reporter.log("verifyMyerpcseditbtn",true);
		cseditbtn.click();
		Thread.sleep(8000);
	}
	public void verifyMyerpCashamount() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.clear();
		cashamount.sendKeys("8100");
	}
	public void verifyMyerpEChallanno() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(schallanno.isEnabled(),"sChallanno is enable");
		Reporter.log("verifyMyerpscahllanno",true);
		//schallanno.clear();
		schallanno.sendKeys("45");
	}
	public void verifyMyerpEListEmptycylReceived() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(emptycylrecieved.isEnabled(),"emptycylrecieved is enable");
		Reporter.log("verifyMyerpemptycylreceived",true);
		emptycylrecieved.click();
		//emptycylrecieved.clear();
		emptycylrecieved.sendKeys("2");
	}

	public void verifyMyerpSubmitbtn2() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(submitbtn2.isEnabled(),"submitbtn2 is enable");
		Reporter.log("verifyMyerpsubmitbtn2",true);
		submitbtn2.click();
		submitbtn2.click();

		Thread.sleep(800);
		if (isAlertPresent2(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent2(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);

			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(1200);
			al.accept();
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}


}
