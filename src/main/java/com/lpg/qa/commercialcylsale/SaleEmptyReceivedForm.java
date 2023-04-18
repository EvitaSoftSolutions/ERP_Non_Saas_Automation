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

public class SaleEmptyReceivedForm {

	@FindBy(xpath="//input[@id='txtAgencyCode']")private WebElement agancycode;
	@FindBy(xpath="//input[@id='txtEmail']")private WebElement userid;
	@FindBy(xpath="//input[@id='password-field']")private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")private WebElement login;
	@FindBy(xpath="//span[text()='Commercial Cyl. Sales']")private WebElement commercialcylsale;
	@FindBy(xpath="//a[text()=' Sale/Empty Received']")private WebElement salempyreceived;
	@FindBy(xpath="//select[@id='ddlDeliveryMan']")private WebElement deliveryman;
	@FindBy(xpath="//select[@id='ddlParty']")private WebElement party;
	@FindBy(xpath="//input[@id='txtChallanNo']")private WebElement challanno;
	@FindBy(xpath="//input[@id='txtConsumerNo']")private WebElement consumerno;
	@FindBy(xpath="//select[@id='ddlDelMode']")private WebElement delivarymode;
	@FindBy(xpath="//select[@id='ddlArea']")private WebElement selectarea;
	@FindBy(xpath="//select[@id='ddlProduct']")private WebElement product;
	@FindBy(xpath="//input[@id='txtSellingPrice']")private WebElement sellingprice;
	@FindBy(xpath="//input[@id='txtFullQty']")private WebElement fullqty;
	@FindBy(xpath="//input[@id='txtEmptyCylRecived']")private WebElement emptycylreceived;
	@FindBy(xpath="//select[@id='ddlModeofPayment']")private WebElement modeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmount']")private WebElement cashamount;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement clearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;

	@FindBy(xpath="//*[@id=\"tb2\"]")private WebElement receivedemptycyonly;
	@FindBy(xpath="//select[@id='ddlDeliveryMantb2']")private WebElement sdeliveryman;
	@FindBy(xpath="//select[@id='ddlPartytb2']")private WebElement sparty;
	@FindBy(xpath="//input[@id='txtChallanNotb2']")private WebElement schallanno;
	@FindBy(xpath="//input[@id='txtEmptyCylRecivedtb2']")private WebElement semptycylreceived;
	@FindBy(xpath="//select[@id='ddlProducttb2']")private WebElement sproduct;
	@FindBy(xpath="//select[@id='ddlModeofPaymenttb2']")private WebElement smodeofpayment;
	@FindBy(xpath="//input[@id='txtCashAmounttb2']")private WebElement scashamount;
	
	@FindBy(xpath="//a[text()=' Commercial Sale List']")private WebElement comsalelist;
	@FindBy(xpath="//input[@id='Challandate']")private WebElement comsaledate;
	@FindBy(xpath="//select[@id='ddlDeliveryMan']")private WebElement deliverymanname;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn5;
	@FindBy(xpath="//a[text()='Edit']")private WebElement editbtn;
	@FindBy(xpath="//button[@id='btnDelete']")private WebElement delete;


	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}

	public SaleEmptyReceivedForm(WebDriver driver) {
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
	public void verifyMyerpSalempyreceived() {
		Assert.assertTrue(salempyreceived.isEnabled(),"Salempyreceived is enable");
		Reporter.log("verifyMyerpsalempyreceived",true);
		salempyreceived.click();
	}
	public void Deliveryman() throws InterruptedException {
		Select sc = new Select(deliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
		Assert.assertFalse(deliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void Party() throws InterruptedException {
		Select sc = new Select(party);
		Thread.sleep(1000);
		Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
		Assert.assertFalse(party.isSelected());
		sc.selectByVisibleText("SURYA HOTEL");
	}
	public void verifyMyerpChallanno() {
		Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
		Reporter.log("verifyMyerpcahllanno",true);
		challanno.sendKeys("890456");
	}
	public void verifyMyerpConsumerno() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("12012");
	}
	public void Delivarymode() throws InterruptedException {
		Select sc = new Select(delivarymode);
		Thread.sleep(1000);
		Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
		Assert.assertFalse(delivarymode.isSelected());
		sc.selectByVisibleText("Tempo");
	}
	public void Selectarea() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Product() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpsellingprice() {
		Assert.assertTrue(sellingprice.isEnabled(),"sellingprice is enable");
		Reporter.log("verifyMyerpsellingprice",true);
		sellingprice.sendKeys("1720");
	}

	public void verifyMyerpFullqty() {
		Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
		Reporter.log("verifyMyerpfullqty",true);
		fullqty.sendKeys("5");
	}
	public void verifyMyerpEmptycylReceived() {
		Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
		Reporter.log("verifyMyerpemptycylreceived",true);
		emptycylreceived.sendKeys("3");
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
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.sendKeys("8000");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void Deliveryman1() throws InterruptedException {
		Select sc = new Select(deliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
		Assert.assertFalse(deliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void Party1() throws InterruptedException {
		Select sc = new Select(party);
		Thread.sleep(1000);
		Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
		Assert.assertFalse(party.isSelected());
		sc.selectByVisibleText("SURYA HOTEL");
	}
	public void verifyMyerpChallanno1() {
		Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
		Reporter.log("verifyMyerpcahllanno",true);
		challanno.sendKeys("890456");
	}
	public void verifyMyerpConsumerno1() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("12012");
	}
	public void Delivarymode1() throws InterruptedException {
		Select sc = new Select(delivarymode);
		Thread.sleep(1000);
		Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
		Assert.assertFalse(delivarymode.isSelected());
		sc.selectByVisibleText("Tempo");
	}
	public void Selectarea1() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Product1() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpFullqty1() {
		Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
		Reporter.log("verifyMyerpfullqty",true);
		fullqty.sendKeys("5");
	}
	public void verifyMyerpEmptycylReceived1() {
		Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
		Reporter.log("verifyMyerpemptycylreceived",true);
		emptycylreceived.sendKeys("3");
	}
	public void Modeofpayment1() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount1() {
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.sendKeys("8000");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(800);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent4(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);

			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(800);
			al.accept(); 
			Thread.sleep(800);
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

	public void verifyMyerpreceivedemptycyonly() throws InterruptedException {
		Assert.assertTrue(receivedemptycyonly.isEnabled(),"receivedemptycyonly is enable");
		Reporter.log("verifyMyerpreceivedemptycyonly",true);
		receivedemptycyonly.click();
	}
	public void verifyMyerpEDeliveryman() throws InterruptedException {
		Select sc = new Select(sdeliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(sdeliveryman.isDisplayed(),"sdeliveryman is  displayed");
		Assert.assertFalse(sdeliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void verifyMyerpEParty() throws InterruptedException {
		Select sc = new Select(sparty);
		Thread.sleep(1000);
		Assert.assertFalse(sparty.isDisplayed(),"sParty is  displayed");
		Assert.assertFalse(sparty.isSelected());
		sc.selectByVisibleText("SURYA HOTEL");
	}
	public void verifyMyerpEChallanno() {
		Assert.assertTrue(schallanno.isEnabled(),"sChallanno is enable");
		Reporter.log("verifyMyerpscahllanno",true);
		schallanno.sendKeys("890456");
	}
	public void verifyMyerpEProduct() throws InterruptedException {
		Select sc = new Select(sproduct);
		Thread.sleep(1000);
		Assert.assertFalse(sproduct.isDisplayed(),"sProduct is  displayed");
		Assert.assertFalse(sproduct.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpEEmptycylReceived() {
		Assert.assertTrue(semptycylreceived.isEnabled(),"sEmptycylReceived is enable");
		Reporter.log("verifyMyerpsemptycylreceived",true);
		semptycylreceived.sendKeys("4");
	}
	public void verifyMyerpEModeofpayment() throws InterruptedException {
		Select sc = new Select(smodeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(smodeofpayment.isDisplayed(),"sModeofpayment is  displayed");
		Assert.assertFalse(smodeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpECashamount() {
		Assert.assertTrue(scashamount.isEnabled(),"sCashamount is enable");
		Reporter.log("verifyMyerpempscashamount",true);
		scashamount.sendKeys("10000");
	}








	public void Deliveryman2() throws InterruptedException {
		Select sc = new Select(deliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
		Assert.assertFalse(deliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void Party2() throws InterruptedException {
		Select sc = new Select(party);
		Thread.sleep(1000);
		Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
		Assert.assertFalse(party.isSelected());
		sc.selectByVisibleText("SAMAR HOTEL");
	}
	public void verifyMyerpChallanno2() {
		Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
		Reporter.log("verifyMyerpcahllanno",true);
		challanno.sendKeys("0456");
	}
	public void verifyMyerpConsumerno2() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("120");
	}
	public void Delivarymode2() throws InterruptedException {
		Select sc = new Select(delivarymode);
		Thread.sleep(1000);
		Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
		Assert.assertFalse(delivarymode.isSelected());
		sc.selectByVisibleText("Tempo");
	}
	public void Selectarea2() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Product2() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpFullqty2() {
		Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
		Reporter.log("verifyMyerpfullqty",true);
		fullqty.sendKeys("5");
	}
	public void verifyMyerpEmptycylReceived2() {
		Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
		Reporter.log("verifyMyerpemptycylreceived",true);
		emptycylreceived.sendKeys("3");
	}
	public void Modeofpayment2() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount2() {
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.sendKeys("8000");
	}
	public void verifyMyerpSubmitbtn2() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
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
			Thread.sleep(800);
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

	public void verifyMyerpreceivedemptycyonly2() throws InterruptedException {
		Assert.assertTrue(receivedemptycyonly.isEnabled(),"receivedemptycyonly is enable");
		Reporter.log("verifyMyerpreceivedemptycyonly",true);
		receivedemptycyonly.click();
	}
	public void verifyMyerpEDeliveryman2() throws InterruptedException {
		Select sc = new Select(sdeliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(sdeliveryman.isDisplayed(),"sdeliveryman is  displayed");
		Assert.assertFalse(sdeliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void verifyMyerpEParty2() throws InterruptedException {
		Select sc = new Select(sparty);
		Thread.sleep(1000);
		Assert.assertFalse(sparty.isDisplayed(),"sParty is  displayed");
		Assert.assertFalse(sparty.isSelected());
		sc.selectByVisibleText("SAMAR HOTEL");
	}
	public void verifyMyerpEChallanno2() {
		Assert.assertTrue(schallanno.isEnabled(),"sChallanno is enable");
		Reporter.log("verifyMyerpscahllanno",true);
		schallanno.sendKeys("8906");
	}
	public void verifyMyerpEProduct2() throws InterruptedException {
		Select sc = new Select(sproduct);
		Thread.sleep(1000);
		Assert.assertFalse(sproduct.isDisplayed(),"sProduct is  displayed");
		Assert.assertFalse(sproduct.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpEEmptycylReceived2() {
		Assert.assertTrue(semptycylreceived.isEnabled(),"sEmptycylReceived is enable");
		Reporter.log("verifyMyerpsemptycylreceived",true);
		semptycylreceived.sendKeys("2");
	}
	public void verifyMyerpEModeofpayment2() throws InterruptedException {
		Select sc = new Select(smodeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(smodeofpayment.isDisplayed(),"sModeofpayment is  displayed");
		Assert.assertFalse(smodeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpECashamount2() {
		Assert.assertTrue(scashamount.isEnabled(),"sCashamount is enable");
		Reporter.log("verifyMyerpempscashamount",true);
		scashamount.sendKeys("300");
	}





	public void Deliveryman3() throws InterruptedException {
		Thread.sleep(1000);
		Select sc = new Select(deliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
		Assert.assertFalse(deliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void Party3() throws InterruptedException {
		Select sc = new Select(party);
		Thread.sleep(1000);
		Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
		Assert.assertFalse(party.isSelected());
		sc.selectByVisibleText("MUKESH TEA CENTER");
	}
	public void verifyMyerpChallanno3() {
		Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
		Reporter.log("verifyMyerpcahllanno",true);
		challanno.sendKeys("7856");
	}
	public void verifyMyerpConsumerno3() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("1620");
	}
	public void Delivarymode3() throws InterruptedException {
		Select sc = new Select(delivarymode);
		Thread.sleep(1000);
		Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
		Assert.assertFalse(delivarymode.isSelected());
		sc.selectByVisibleText("Tempo");
	}
	public void Selectarea3() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Product3() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpFullqty3() {
		Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
		Reporter.log("verifyMyerpfullqty",true);
		fullqty.sendKeys("5");
	}
	public void verifyMyerpEmptycylReceived3() {
		Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
		Reporter.log("verifyMyerpemptycylreceived",true);
		emptycylreceived.sendKeys("3");
	}
	public void Modeofpayment3() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount3() {
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.sendKeys("8000");
	}
	public void verifyMyerpSubmitbtn3() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(800);
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent3(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);

			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(800);
			return true; }

		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

	public void verifyMyerpeceivedemptycyonly3() throws InterruptedException {
		Thread.sleep(1000);

		Assert.assertTrue(receivedemptycyonly.isEnabled(),"receivedemptycyonly is enable");
		Reporter.log("verifyMyerpreceivedemptycyonly",true);
		receivedemptycyonly.click();
	}
	public void verifyMyerpEDeliveryman3() throws InterruptedException {
		Thread.sleep(1000);

		Select sc = new Select(sdeliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(sdeliveryman.isDisplayed(),"sdeliveryman is  displayed");
		Assert.assertFalse(sdeliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void verifyMyerpEParty3() throws InterruptedException {
		Select sc = new Select(sparty);
		Thread.sleep(1000);
		Assert.assertFalse(sparty.isDisplayed(),"sParty is  displayed");
		Assert.assertFalse(sparty.isSelected());
		sc.selectByVisibleText("MUKESH TEA CENTER");
	}
	public void verifyMyerpEChallanno3() {
		Assert.assertTrue(schallanno.isEnabled(),"sChallanno is enable");
		Reporter.log("verifyMyerpscahllanno",true);
		schallanno.sendKeys("3406");
	}
	public void verifyMyerpEProduct3() throws InterruptedException {
		Select sc = new Select(sproduct);
		Thread.sleep(1000);
		Assert.assertFalse(sproduct.isDisplayed(),"sProduct is  displayed");
		Assert.assertFalse(sproduct.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpEEmptycylReceived3() {
		Assert.assertTrue(semptycylreceived.isEnabled(),"sEmptycylReceived is enable");
		Reporter.log("verifyMyerpsemptycylreceived",true);
		semptycylreceived.sendKeys("2");
	}
	public void verifyMyerpEModeofpayment3() throws InterruptedException {
		Select sc = new Select(smodeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(smodeofpayment.isDisplayed(),"sModeofpayment is  displayed");
		Assert.assertFalse(smodeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpECashamount3() {
		Assert.assertTrue(scashamount.isEnabled(),"sCashamount is enable");
		Reporter.log("verifyMyerpempscashamount",true);
		scashamount.sendKeys("300");
	}




	public void Deliveryman4() throws InterruptedException {
		Thread.sleep(1000);
		Select sc = new Select(deliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(deliveryman.isDisplayed(),"Deliveryman is  displayed");
		Assert.assertFalse(deliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void Party4() throws InterruptedException {
		Select sc = new Select(party);
		Thread.sleep(1000);
		Assert.assertFalse(party.isDisplayed(),"Party is  displayed");
		Assert.assertFalse(party.isSelected());
		sc.selectByVisibleText("DINESH DHABA");
	}
	public void verifyMyerpChallanno4() {
		Assert.assertTrue(challanno.isEnabled(),"Challanno is enable");
		Reporter.log("verifyMyerpcahllanno",true);
		challanno.sendKeys("45486");
	}
	public void verifyMyerpConsumerno4() {
		Assert.assertTrue(consumerno.isEnabled(),"Consumerno is enable");
		Reporter.log("verifyMyerpconsumerno",true);
		consumerno.sendKeys("12308");
	}
	public void Delivarymode4() throws InterruptedException {
		Select sc = new Select(delivarymode);
		Thread.sleep(1000);
		Assert.assertFalse(delivarymode.isDisplayed(),"Delivarymode is  displayed");
		Assert.assertFalse(delivarymode.isSelected());
		sc.selectByVisibleText("Tempo");
	}
	public void Selectarea4() throws InterruptedException {
		Select sc = new Select(selectarea);
		Thread.sleep(1000);
		Assert.assertFalse(selectarea.isDisplayed(),"Selectarea is  displayed");
		Assert.assertFalse(selectarea.isSelected());
		sc.selectByVisibleText("VIRAR");
	}
	public void Product4() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpFullqty4() {
		Assert.assertTrue(fullqty.isEnabled(),"Fullqty is enable");
		Reporter.log("verifyMyerpfullqty",true);
		fullqty.sendKeys("5");
	}
	public void verifyMyerpEmptycylReceived4() {
		Assert.assertTrue(emptycylreceived.isEnabled(),"EmptycylReceived is enable");
		Reporter.log("verifyMyerpemptycylreceived",true);
		emptycylreceived.sendKeys("3");
	}
	public void Modeofpayment4() throws InterruptedException {
		Select sc = new Select(modeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(modeofpayment.isDisplayed(),"Modeofpayment is  displayed");
		Assert.assertFalse(modeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpCashamount4() {
		Assert.assertTrue(cashamount.isEnabled(),"Cashamount is enable");
		Reporter.log("verifyMyerpempcashamount",true);
		cashamount.sendKeys("8000");
	}
	public void verifyMyerpSubmitbtn4() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		Thread.sleep(800);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent5(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);

			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2000);
			al.accept(); 
			Thread.sleep(800);
			return true; }
catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;
	}

	public void verifyMyerpreceivedemptycyonly4() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(receivedemptycyonly.isEnabled(),"receivedemptycyonly is enable");
		Reporter.log("verifyMyerpreceivedemptycyonly",true);
		receivedemptycyonly.click();
	}
	public void verifyMyerpEDeliveryman4() throws InterruptedException {
		Select sc = new Select(sdeliveryman);
		Thread.sleep(1000);
		Assert.assertFalse(sdeliveryman.isDisplayed(),"sdeliveryman is  displayed");
		Assert.assertFalse(sdeliveryman.isSelected());
		sc.selectByVisibleText("DEEPAK PARAMAR");
	}
	public void verifyMyerpEParty4() throws InterruptedException {
		Select sc = new Select(sparty);
		Thread.sleep(1000);
		Assert.assertFalse(sparty.isDisplayed(),"sParty is  displayed");
		Assert.assertFalse(sparty.isSelected());
		sc.selectByVisibleText("DINESH DHABA");
	}
	public void verifyMyerpEChallanno4() {
		Assert.assertTrue(schallanno.isEnabled(),"sChallanno is enable");
		Reporter.log("verifyMyerpscahllanno",true);
		schallanno.sendKeys("89876");
	}
	public void verifyMyerpEProduct4() throws InterruptedException {
		Select sc = new Select(sproduct);
		Thread.sleep(1000);
		Assert.assertFalse(sproduct.isDisplayed(),"sProduct is  displayed");
		Assert.assertFalse(sproduct.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpEEmptycylReceived4() {
		Assert.assertTrue(semptycylreceived.isEnabled(),"sEmptycylReceived is enable");
		Reporter.log("verifyMyerpsemptycylreceived",true);
		semptycylreceived.sendKeys("2");
	}
	public void verifyMyerpEModeofpayment4() throws InterruptedException {
		Select sc = new Select(smodeofpayment);
		Thread.sleep(1000);
		Assert.assertFalse(smodeofpayment.isDisplayed(),"sModeofpayment is  displayed");
		Assert.assertFalse(smodeofpayment.isSelected());
		sc.selectByVisibleText("CASH");
	}
	public void verifyMyerpECashamount4() {
		Assert.assertTrue(scashamount.isEnabled(),"sCashamount is enable");
		Reporter.log("verifyMyerpempscashamount",true);
		scashamount.sendKeys("300");
	}
	
	
	
	
	public void verifyMyerpCommercialcylsalel() throws InterruptedException {
		Thread.sleep(1000);
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
		comsaledate.click();
		comsaledate.sendKeys("1/03/2023");
	}
	
	
	public void Deliverymanname() throws InterruptedException {
		Select sc = new Select(deliverymanname);
		Thread.sleep(1000);
		Assert.assertFalse(deliverymanname.isDisplayed(),"Deliverymanname is  displayed");
		Assert.assertFalse(deliverymanname.isSelected());
		sc.selectByVisibleText("DEEPAK PARMAVAR");
	}
	public void verifyMyerpSubmitbtnlist() {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
	}
	public void verifyMyerpEditbtn() {
		Assert.assertTrue(editbtn.isEnabled(),"Editbtn is enable");
		Reporter.log("verifyMyerpeditbtn",true);
		editbtn.click();
	}
	public void verifyMyerpDelete() {
		Assert.assertTrue(delete.isEnabled(),"Delete is enable");
		Reporter.log("verifyMyerpdelete",true);
		delete.click();
		
	}
	
}

