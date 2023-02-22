package com.lpg.qa.tvmodules;


import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
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
	@FindBy (xpath="//select[@id='ddldistrict']") private WebElement tselectdistrict;
	@FindBy (xpath="//select[@id='ddlTahsil']") private WebElement tselecttehshil;
	@FindBy (xpath="//input[@id='txtServices']") private WebElement tservicestextbox;
	@FindBy (xpath="//input[@id='txtQunatity']") private WebElement tquantitytextbox;
	@FindBy (xpath="//input[@id='txtUnitCost']") private WebElement tunitcosattextbox;
	@FindBy (xpath="//input[@id='txtCity']") private WebElement tentercity;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement tclearbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement tsubmitbtn;






	//initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}
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

	public void VerifyMyerpTVModule() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(tvmodule.isEnabled(),"tvmodule Module field is enabled");		 
		Reporter.log("verifyMyerptvmodule", true);
		tvmodule.click(); 
	}
	public void VerifyMyerpTVtvoutForm() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(tvtvoutforrm.isEnabled(),"tvtvoutforrm Module field is enabled");		 
		Reporter.log("verifyMyerptvtvoutforrm", true);
		tvtvoutforrm.click(); 
	}
	
	public void VerifyMyerpTVtvoutConsumerNum() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(tvoutconsumernum.isEnabled(),"tvoutconsumernum Module field is enabled");		 
		Reporter.log("verifyMyerptvoutconsumernum", true);
		tvoutconsumernum.click(); 
		tvoutconsumernum.sendKeys("2012");
	}
	public void VerifyMyerpTVtvoutConsumerSubmitBtn() throws InterruptedException {
		Thread.sleep(700);
		Assert.assertTrue(tvoutsubmitbtn.isEnabled(),"tvoutsubmitbtn Module field is enabled");		 
		Reporter.log("verifyMyertvoutsubmitbtn", true);
		tvoutsubmitbtn.click(); 

	}
	public void TVtvOutSelectProduct() throws InterruptedException {
		Thread.sleep(700);
		Select tsp = new Select(tvselectproduct);
		Thread.sleep(500);
		Assert.assertFalse(tvselectproduct.isDisplayed(),"tvselectproductis displayed");
		Assert.assertFalse(tvselectproduct.isSelected());
		tsp.selectByVisibleText("19 KG");
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
		tsra.selectByVisibleText("VIRAR WEST");
	}
	public void TVtvOutSelectCylenderReceivedBy() throws InterruptedException {
		Select tsra = new Select(tcylenderreceivedby);
		Thread.sleep(500);
		Assert.assertFalse(tcylenderreceivedby.isDisplayed(),"tcylenderrecivedby field  displayed");
		Assert.assertFalse(tcylenderreceivedby.isSelected());
		tsra.selectByVisibleText("SAMAR");
	}
	public void TVtvOutSelectCylenderReasonForTVout() throws InterruptedException {
		Select tsra = new Select(ttvoutreasons);
		Thread.sleep(500);
		Assert.assertFalse(ttvoutreasons.isDisplayed(),"ttvoutreasons displayed");
		Assert.assertFalse(ttvoutreasons.isSelected());
		tsra.selectByVisibleText("OTHERS");
	}
	public void VerifyMyerpTVtvOutTotalDepositAmount() {
		Assert.assertTrue(ttotaldeposit.isEnabled(),"ttotaldeposit Module field is enabled");		 
		Reporter.log("verifyMyertvouttotaldeposit", true);
		ttotaldeposit.click(); 
		ttotaldeposit.sendKeys("1000");
	}
	public void TVtvOutSelectState() throws InterruptedException {
		Select tss = new Select(tselectstate);
		Thread.sleep(700);
		Assert.assertFalse(tselectstate.isDisplayed(),"tselectstate  displayed");
		Assert.assertFalse(tselectstate.isSelected());
		tss.selectByVisibleText("MAHARASHTRA");
	}
public void District() throws InterruptedException {
	Select tsc = new Select(tselectdistrict);
	Thread.sleep(1000);
	Assert.assertFalse(tselectdistrict.isDisplayed(),"District is  displayed");
	Assert.assertFalse(tselectdistrict.isSelected());
	tsc.selectByVisibleText("Palghar");
}
public void Tahsil() throws InterruptedException {
	Select sc = new Select(tselecttehshil);
	Thread.sleep(1000);
	Assert.assertFalse(tselecttehshil.isDisplayed(),"Tahsil is  displayed");
	Assert.assertFalse(tselecttehshil.isSelected());
	sc.selectByVisibleText("Vasai");
}
public void VerifyMyerpTVtvOutEnterCity() throws InterruptedException {
	Thread.sleep(700);
	Assert.assertTrue(tentercity.isEnabled(),"tentercity field is enabled");		 
	Reporter.log("verifyMyerptentercity", true);
	tentercity.click(); 
	tentercity.sendKeys("virar");
}

public void VerifyMyerpTVtvOutServicesTextbox() throws InterruptedException {
	Thread.sleep(700);
	Assert.assertTrue(tservicestextbox.isEnabled(),"tservicestextbox field is enabled");		 
	Reporter.log("verifyMyerptservicestextbox", true);
	tservicestextbox.sendKeys("MECHANICAL SERVICE");
}
public void VerifyMyerpTVtvOutQantityTextbox() throws InterruptedException {
	Thread.sleep(700);
	Assert.assertTrue(tquantitytextbox.isEnabled(),"tquantitytextbox field is enabled");		 
	Reporter.log("verifyMyerptquantitytextbox", true);
	tquantitytextbox.click(); 
	tquantitytextbox.sendKeys("2");
}
public void VerifyMyerpTVtvOutUnitCostTextbox() throws InterruptedException {
	Thread.sleep(700);
	Assert.assertTrue(tunitcosattextbox.isEnabled(),"tunitcosattextbox field is enabled");		 
	Reporter.log("verifyMyerptunitcosattextbox", true);
	tunitcosattextbox.click(); 
	tunitcosattextbox.clear();
	tunitcosattextbox.sendKeys("120");
}

public void VerifyMyerpTVtvOutClearBtn() throws InterruptedException {
	Thread.sleep(700);
	Assert.assertTrue(tclearbtn.isEnabled(),"tclearbtn field is enabled");		 
	Reporter.log("verifyMyerptclearbtn", true);
	tclearbtn.click(); 

}
public void VerifyMyerpTVtvOutSubmitBtn() throws InterruptedException {
	Thread.sleep(700);
	Assert.assertTrue(tsubmitbtn.isEnabled(),"tsubmitbtn  field is enabled");		 
	Reporter.log("verifyMyerptsubmitbtnn", true);
	tsubmitbtn.click();
	Thread.sleep(1000);
	if (isAlertPresent(driver)) { System.out.println("alert is present");

	}else { System.out.println("alert is not present"); }

} 
public static boolean isAlertPresent(WebDriver driver) throws
InterruptedException { 
	try {
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000); 
		al.accept();
		Thread.sleep(1000); 
		al.accept();
		return true; }
	catch (UnhandledAlertException u)
	{ // TODO Auto-generated catch block
		u.printStackTrace(); } return false;

}

}


