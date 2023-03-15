package Deliverycashcollection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class DomesticCash {

	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]") private WebElement gtmodule;
	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[9]/a") private WebElement ppform; 
	@FindBy (xpath="//input[@id='txtERVNumber']") private WebElement ppervnumber;
	@FindBy (xpath="//input[@id='txtInvoiceNumber']") private WebElement ppinvoicenumber; 
	@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement ppselectgodown;
	@FindBy (xpath="//select[@id='ddlVehicalID']") private WebElement ppselectvehicle;
	@FindBy (xpath="//input[@id='txtProduct']") private WebElement ppproduct;
	@FindBy (xpath="//input[@id='txtSoundQunatity']") private WebElement ppquantity;
	@FindBy (xpath="//input[@id='txtDefect_Cyl']") private WebElement ppdefective;
	@FindBy (xpath="//input[@id='txtLost']") private WebElement pplost;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement ppsubmitbtn;

	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[1]/a") private WebElement acceptedloadform;
	@FindBy (xpath="//input[@id='txtInvoiceNumber']") private WebElement alinvoicenumtxt;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement alsubmitbtn;
	@FindBy (xpath="//*[@id=\"tblmain\"]/tbody/tr/td[2]/a") private WebElement alinvoicenum;
	@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement alselectcompany;
	@FindBy (xpath="//input[@id='CompanInvoicedate']") private WebElement companyinvoicedate;
	@FindBy (xpath="//select[@id='ddlSupplierID']") private WebElement alselectsupplier;
	@FindBy (xpath="//input[@id='txtAccount']") private WebElement alaccounttxt; 
	@FindBy (xpath="//*[@id=\"btnSubmit\"]") private WebElement allsubmitbtn;

	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[5]/a") private WebElement domesticdeliveryform; 
	@FindBy (xpath="//select[@id='ddlProductID']") private WebElement ddselectproduct; 
	@FindBy (xpath="//button[@id='btnGetdata']") private WebElement ddgetdtabtn; 
	@FindBy (xpath="//*[@id=\"tblmain_filter\"]/label/input") private WebElement ddsearchdtabtn;
	@FindBy (xpath="//select[@id='ddlGodown']") private WebElement ddselectgodown; 
	@FindBy (xpath="//input[@id='txtFullcyl']") private WebElement ddfullcyl;
	@FindBy (xpath="//input[@id='txtDel']") private WebElement ddemptycyl;
	@FindBy (xpath="//*[@id=\"btnSubmit\"]") private WebElement ddsubmitbtn;

	@FindBy (xpath="//*[@id=\"null\"]/a/span[1]") private WebElement dccmodule;
	@FindBy (xpath="//*[@id=\"null\"]/ul/li/a") private WebElement domesticcashform;
	@FindBy (xpath="//input[@id='datepicker']") private WebElement dcccalender;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement dccgetdatabtn;
	@FindBy (xpath="//input[@id='btnEdit']") private WebElement dcddlselectbutton;
	@FindBy (xpath="//input[@id='txtInvoiceNo']") private WebElement dcinvoicenum;
	@FindBy (xpath="//input[@id='txtConusmerNo']") private WebElement dcconsumernum;
	@FindBy (xpath="//input[@id='txtRecivedAmt']") private WebElement  dccashreceivedamount;
	@FindBy (xpath="//button[@id='btnCancel']") private WebElement  dccancelbtn;
	@FindBy (xpath="//button[@id='btnDeleteDetails']") private WebElement dcdeletebtn;
	@FindBy (xpath="//button[@id='btnSaveDetails']") private WebElement dcsavebtn;
	@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement dcexportbtn;
	
	@FindBy (xpath="//*[@id=\"menuGodowntrn\"]/ul/li[3]/a") private WebElement ervform;
	@FindBy (xpath="//select[@id='ddlGodownID']") private WebElement eselectgodown; 
	@FindBy (xpath="//select[@id='ddlVehical_Id']") private WebElement selectvehiclenum;
	@FindBy (xpath="//input[@id='txtProduct']") private WebElement eproducttxt;
	@FindBy (xpath="//input[@id='txtSoundQunatity']") private WebElement esoundqauntity;
	@FindBy (xpath="//input[@id='txtDefective']") private WebElement edefective;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement eclearbtn;
	@FindBy (xpath="//input[@id='btnEdit']") private WebElement submiterv;
	@FindBy (xpath="//*[@id=\"btnSubmit\"]") private WebElement submitbtn;

	
	@FindBy (xpath="//*[@id=\"tb2\"]") private WebElement  xmierv;
	





	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
	public DomesticCash(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void VerifyandClickonMyerpGodownTransactionModule(){
		Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
		Reporter.log(" verifyMyerpgtmodule", true);
		gtmodule.click();
	}
	public void VerifyandClickonMyerpGTPartialPurchaseForm() { 
		Assert.assertTrue(ppform.isEnabled(),"ppformis enabled");
		Reporter.log(" verifyMyerpppform", true);
		ppform.click();

	}
	public void VerifyandClickonMyerpGTPPInvoiceNumber() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ppinvoicenumber.isEnabled(),"ppinvoicenumber is enabled");
		Reporter.log("verifyMyerpppinvoicenumberr", true);
		ppinvoicenumber.click();
		ppinvoicenumber.sendKeys("2111");

	}
	public void VerifyandClickonMyerpGTPPErvNumber() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ppervnumber.isEnabled(),"ppervnumber is enabled");
		Reporter.log("verifyMyerpppervnumber", true);
		ppervnumber.click();
		ppervnumber.sendKeys("3111");

	}

	public void VerifyMyerpPPSelectGodown()  throws InterruptedException {
		Select ppsg = new Select(ppselectgodown);
		Thread.sleep(500);
		Assert.assertTrue(ppselectgodown.isDisplayed(),"ppselectgodown is displayed");
		Assert.assertFalse(ppselectgodown.isSelected());
		ppsg.selectByVisibleText("VIRAR EAST");
	}
	public void VerifyMyerpPPSelectVehicle()  throws InterruptedException {
		Select ppsg = new Select(ppselectvehicle);
		Thread.sleep(500);
		Assert.assertTrue(ppselectvehicle.isDisplayed(),"ppselectvehicle is displayed");
		Assert.assertFalse(ppselectvehicle.isSelected());
		ppsg.selectByVisibleText("MH 02 BA 1237");
	}
	public void VerifyandClickonMyerpGTPPProduct() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ppproduct.isEnabled(),"ppproduct is enabled");
		Reporter.log("verifyMyerpppproduct", true);
		ppproduct.click();
		ppproduct.sendKeys("14.2 KG");
	}
	public void VerifyandClickonMyerpGTPPQauntity() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ppquantity.isEnabled(),"ppquantity is enabled");
		Reporter.log("verifyMyerpppquantity", true);
		ppquantity.click();
		ppquantity.sendKeys("200");
	}
	public void VerifyandClickonMyerpGTPPLost() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(pplost.isEnabled(),"pplost is enabled");
		Reporter.log("verifyMyerppplost", true);
		pplost.click();
		pplost.sendKeys("9");
	}
	public void VerifyandClickonMyerpGTPPDefective() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ppdefective.isEnabled(),"ppdefective is enabled");
		Reporter.log("verifyMyerpppdefective", true);
		ppdefective.click();
		ppdefective.sendKeys("1");
	}
	public void VerifyandClickonMyerpGTPPSubmitBtn() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(ppsubmitbtn.isEnabled(),"ppsubmitbtnis enabled");
		Reporter.log("verifyMyerpppsubmitbtn", true);
		ppsubmitbtn.click();
		Thread.sleep(1000);
		if (isAlertPresent(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			Thread.sleep(2500);
			al.accept();
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;


	}


	public void VerifyandClickonMyerpGTAccepteLoadForm () throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(acceptedloadform.isEnabled(),"acceptedloadform is enabled");
		Reporter.log(" verifyMyerpacceptedloadform", true);
		acceptedloadform.click();
	}


	public void VerifyandClickonMyerpGTAccepteLoadInvoceNum() {
		Assert.assertTrue(alinvoicenumtxt.isEnabled(),"alinvoicenumtxt is enabled");
		Reporter.log(" verifyMyerpalinvoicenumtxt", true);
		alinvoicenumtxt.click();
		alinvoicenumtxt.sendKeys("2111");
	}
	public void VerifyandClickonMyerpGTALsubmitbtn() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(alsubmitbtn.isEnabled(),"alsubmitbtn is enabled");
		Reporter.log(" verifyMyerpalsubmitbtn", true);
		alsubmitbtn.click();
	}
	public void VerifyandClickonMyerpGTInvoiceNumber() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(alinvoicenum.isEnabled(),"alinvoicenum is enabled");
		Reporter.log(" verifyMyerpalinvoicenum", true);
		alinvoicenum.click();
	}
	public void VerifyMyerpALSelectCompany()  throws InterruptedException {
		Thread.sleep(2000);
		Select alsc = new Select(alselectcompany);
		Assert.assertFalse(alselectcompany.isDisplayed(),"alselectcompany is displayed");
		Assert.assertFalse(alselectcompany.isSelected());
		alsc.selectByVisibleText("ANITA GAS SERVICES");
	}
	public void VerifyandClickonMyerpALCompanyInvoiceDate() throws InterruptedException {
		Assert.assertTrue(companyinvoicedate.isEnabled(),"companyinvoicedate is enabled");
		Reporter.log(" verifyMyerpcompanyinvoicedate", true);
		Thread.sleep(2000);
		companyinvoicedate.click();
		companyinvoicedate.sendKeys("04/03/2023");
		Thread.sleep(800);
	}
	public void VerifyMyerpALSelectSupplier()  throws InterruptedException {
		Thread.sleep(2000);
		Select alss = new Select(alselectsupplier);
		Assert.assertFalse(alselectsupplier.isDisplayed(),"alselectsupplier is displayed");
		Assert.assertFalse(alselectsupplier.isSelected());
		alss.selectByVisibleText("SUP_BPCL_1");
	}
	public void VerifyandClickonMyerpALAccountTextbox() throws InterruptedException {
		Assert.assertTrue(alaccounttxt.isEnabled(),"alaccounttxt is enabled");
		Reporter.log(" verifyMyerpalaccounttxt", true);
		alaccounttxt.click();
		Thread.sleep(800);
		alaccounttxt.sendKeys("PURCHASE : 300005");
		Thread.sleep(800);
	}
	public void VerifyandClickonMyerpALSubmitBtn() throws InterruptedException {
		Assert.assertTrue(allsubmitbtn.isEnabled(),"allsubmitbtn is enabled");
		Reporter.log(" verifyMyerpallsubmitbtn", true);
		Thread.sleep(1000);
		allsubmitbtn.click();
		Thread.sleep(1500); 
		if (isAlertPresent1(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent1(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(1500); 
			Alert al=driver.switchTo().alert();
			Thread.sleep(1000);  
			al.accept(); 
			Thread.sleep(2000);
			al.accept();
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}





	public void VerifyandClickonMyerpGodownTransactionModule1() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
		Reporter.log(" verifyMyerpgtmodule", true);
		gtmodule.click();
	}
	public void VerifyandClickonMyerpGTDomesticDeliveryForm () { 
		Assert.assertTrue(domesticdeliveryform.isEnabled(),"domesticdeliveryform is enabled");
		Reporter.log(" verifyMyerpdomesticdeliveryform", true);
		domesticdeliveryform.click();

	}
	public void VerifyMyerpTVSelectProduct()  throws InterruptedException {
		Select ddsp = new Select(ddselectproduct);
		Thread.sleep(500);
		Assert.assertTrue(ddselectproduct.isDisplayed(),"ddselectproduct is displayed");
		Assert.assertFalse(ddselectproduct.isSelected());
		ddsp.selectByVisibleText("14.2 KG");
	}
	public void VerifyandClickonMyerpGTDDGetDataBtn() { 
		Assert.assertTrue(ddgetdtabtn.isEnabled(),"ddgetdtabtn is enabled");
		Reporter.log(" verifyMyerpddgetdtabtn", true);
		ddgetdtabtn.click();

	}
	public void VerifyandClickonMyerpGTDDSearchBtn() { 
		Assert.assertTrue(ddsearchdtabtn.isEnabled(),"ddsearchdtabtn is enabled");
		Reporter.log(" verifyMyerpddsearchdtabtn", true);
		ddsearchdtabtn.click();
		ddsearchdtabtn.sendKeys("RAMESH SACHAN");

	}
	public void VerifyMyerpTVSelectGodown()  throws InterruptedException {
		Select ddsp = new Select(ddselectgodown);
		Thread.sleep(500);
		Assert.assertFalse(ddselectgodown.isDisplayed(),"ddselectgodown is displayed");
		Assert.assertFalse(ddselectgodown.isSelected());
		ddsp.selectByVisibleText("VIRAR EAST");
	}
	public void VerifyandClickonMyerpGTDDFullCyl() { 
		Assert.assertTrue(ddfullcyl.isEnabled(),"ddfullcyl is enabled");
		Reporter.log(" verifyMyerpddfullcyl", true);
		ddfullcyl.clear();
		ddfullcyl.click();
		ddfullcyl.sendKeys("20");
	}

	public void VerifyandClickonMyerpGTDDEmptyCyl() {
		Assert.assertTrue(ddemptycyl.isEnabled(),"ddemptycyl is enabled");
		Reporter.log(" verifyMyerpddemptycyl", true);
		ddemptycyl.clear();
		ddemptycyl.click();
		ddemptycyl.sendKeys("20");

	}
	public void VerifyandClickonMyerpGTDDESubmitBtn() throws InterruptedException { 
		Assert.assertTrue(ddsubmitbtn.isEnabled(),"ddsubmitbtn is enabled");
		Reporter.log(" verifyMyerpddsubmitbtn", true);
		ddsubmitbtn.click();
		Thread.sleep(500);
		if (isAlertPresent2(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	} 
	public static boolean isAlertPresent2(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(800); 
			Alert al=driver.switchTo().alert();
			Thread.sleep(1000); 
			String  alert_msg=driver.getTitle(); 
			System.out.println(alert_msg);
			al.accept(); 
			return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}




	public void VerifyandClickonMyerpDeliveryCashCollectionModule() throws InterruptedException{
		Thread.sleep(1000);
		Assert.assertTrue(dccmodule.isEnabled(),"dccmodule is enabled");
		Reporter.log(" verifyMyerpdccmodule", true);
		dccmodule.click();
	}
	public void VerifyandClickonMyerpDomesticCashForm() throws InterruptedException{
		Thread.sleep(1000);
		Assert.assertTrue(domesticcashform.isEnabled(),"domesticcashform is enabled");
		Reporter.log(" verifyMyerpdomesticcashform", true);
		domesticcashform.click();
	}
	public void VerifyandClickonMyerpDCCalender(){
		Assert.assertTrue(dcccalender.isEnabled(),"dcccalender is enabled");
		Reporter.log(" verifyMyerpdcccalender", true);
		dcccalender.click();
		dcccalender.clear();
		dcccalender.sendKeys("04/3/2023");
	}
	public void VerifyandClickonDCMyerpGetDataBtn() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue(dccgetdatabtn.isEnabled(),"dccgetdatabtn is enabled");
		Reporter.log(" verifyMyerpdccgetdatabn", true);
		dccgetdatabtn.click();
	}
	public void VerifyandClickonMyerpDCSelectBtn() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue(dcddlselectbutton.isEnabled(),"dcddlselectbutton is enabled");
		Reporter.log(" verifyMyerpdcddlselectbutton", true);
		dcddlselectbutton.click();
	}
	public void VerifyandClickonMyerpDCInvoiceNumber() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue( dcinvoicenum.isEnabled()," dcinvoicenum is enabled");
		Reporter.log(" verifyMyerp dcinvoicenum", true);
		dcinvoicenum.click();
		dcinvoicenum.sendKeys("2111");
	}
	public void VerifyandClickonMyerpDCConsumerNumber() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue(dcconsumernum.isEnabled(),"dcconsumernum is enabled");
		Reporter.log(" verifyMyerpdcconsumernum", true);
		dcconsumernum.click();
		dcconsumernum.sendKeys("4004");

	}
	public void VerifyandClickonMyerpDCCashReceivedAmount() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue(dccashreceivedamount.isEnabled(),"dccashreceivedamount is enabled");
		Reporter.log(" verifyMyerpdccashreceivedamount", true);
		dccashreceivedamount.click();
		dccashreceivedamount.sendKeys("21050");

	}
	public void VerifyandClickonMyerpDCCancelBtn() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue(dccancelbtn.isEnabled(),"dccancelbtn is enabled");
		Reporter.log(" verifyMyerpdccancelbtn", true);
		dccancelbtn.click();
	}
	public void VerifyandClickonMyerpDCDeleteBtn() throws InterruptedException{
		Thread.sleep(500);
		Assert.assertTrue(dcdeletebtn.isEnabled(),"dcdeletebtn is enabled");
		Reporter.log(" verifyMyerpdcdeletebtn", true);
		dcdeletebtn.click();
	}
	public void VerifyandClickonMyerpDCSaveBtn()throws InterruptedException { 
		Thread.sleep(2000);
		Assert.assertTrue(dcsavebtn.isEnabled(),"dcsavebtn is enabled");
		Reporter.log("verifyMyerpdcsavebtn", true);
		dcsavebtn.click();
		Thread.sleep(500);
		if (isAlertPresent3(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	}
	public static boolean isAlertPresent3(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(3000); 
			Alert al=driver.switchTo().alert();
			Thread.sleep(3000); 
			al.accept();
			Thread.sleep(2000); 
			al.accept();
               return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	
	
	
	
	

	public void VerifyandClickonMyerpGodownTransactionModule2() {
		 Assert.assertTrue(gtmodule.isEnabled(),"gtmodule is enabled");
		 Reporter.log(" verifyMyerpgtmodule", true);
		 gtmodule.click();
	}
	public void VerifyandClickonMyerpGTERVForm () { 
		 Assert.assertTrue(ervform.isEnabled(),"ervform is enabled");
		 Reporter.log(" verifyMyerpervform", true);
		 ervform.click();
	}
	public void VerifyMyerpERVSelectGodown()  throws InterruptedException {
		Select  ervsg= new Select(eselectgodown);
		Thread.sleep(500);
		Assert.assertFalse(eselectgodown.isDisplayed(),"eselectgodown is displayed");
		Assert.assertFalse(eselectgodown.isSelected());
		ervsg.selectByVisibleText("VIRAR EAST");
	}
	public void VerifyMyerpERVVehicleNumber()  throws InterruptedException {
		Select  ervsg= new Select(selectvehiclenum);
		Thread.sleep(500);
		Assert.assertFalse(selectvehiclenum.isDisplayed(),"eselectgodown is displayed");
		Assert.assertFalse(selectvehiclenum.isSelected());
		ervsg.selectByVisibleText("MH 02 BA 1237");
	}
	public void VerifyandClickonMyerpEProductTextBox() { 
		 Assert.assertTrue(eproducttxt.isEnabled(),"eproducttxt is enabled");
		 Reporter.log(" verifyMyerpeproducttxt", true);
		 eproducttxt.click();
		 eproducttxt.sendKeys("14.2 KG");
	}
	public void VerifyandClickonMyerpSoundQantityTextBox() { 
		 Assert.assertTrue(esoundqauntity.isEnabled(),"esoundqauntity is enabled");
		 Reporter.log(" verifyMyerpesoundqauntity", true);
		 esoundqauntity.click();
		 esoundqauntity.sendKeys("200");
	}
	public void VerifyandClickonMyerpDefective() { 
		 Assert.assertTrue(edefective.isEnabled(),"edefective is enabled");
		 Reporter.log(" verifyMyerpedefective", true);
		 edefective.click();
		 edefective.sendKeys("");
	}
   public void VerifyandClickonMyerpSumitERVBtn() throws InterruptedException { 
   	Thread.sleep(2000);
       Assert.assertTrue(submiterv.isEnabled(),"submitervbtn is enabled");
        Reporter.log(" verifyMyerpsubmiterv", true);
        submiterv.click();
        Thread.sleep(500);
		if (isAlertPresent5(driver)) { System.out.println("alert is present");

		}else { System.out.println("alert is not present"); }

	}
	public static boolean isAlertPresent5(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(3000); 
			Alert al=driver.switchTo().alert();
			Thread.sleep(3000); 
			al.accept();
               return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}
	   public void VerifyandClickonMyerpSubmitBtn() throws InterruptedException { 
	   	Thread.sleep(4000);
	        Assert.assertTrue(submitbtn.isEnabled(),"submitbtn is enabled");
	        Reporter.log(" verifyMyerpsubmitbtn", true);
	        submitbtn.click();
	        Thread.sleep(500);
			if (isAlertPresent6(driver)) { System.out.println("alert is present");

			}else { System.out.println("alert is not present"); }

		}
		public static boolean isAlertPresent6(WebDriver driver) throws
		InterruptedException { 
			try {
				Thread.sleep(3000); 
				Alert al=driver.switchTo().alert();
				Thread.sleep(2000); 
				al.accept();
				Thread.sleep(2000); 
				al.accept();
	               return true; }
			catch (UnhandledAlertException u)
			{ // TODO Auto-generated catch block
				u.printStackTrace(); } return false;

		}
	        
        
  
   public void VerifyandClickonMyerpXMIERV() throws InterruptedException { 
   	Thread.sleep(100);
        Assert.assertTrue(xmierv.isEnabled(),"xmierv is enabled");
        Reporter.log(" verifyMyerpxmierv", true);
        xmierv.click();
  }
}




