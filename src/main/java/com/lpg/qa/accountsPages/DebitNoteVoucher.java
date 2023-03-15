package com.lpg.qa.accountsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class DebitNoteVoucher  {
	@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
	@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
	@FindBy (xpath="//input[@id='password-field']") private WebElement password;
	@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
	@FindBy (xpath="//*[@id=\"menuAccounts\"]/a/span[1]") private WebElement acconutsmodule;
	@FindBy (xpath="//*[@id=\"menuAccounts\"]/ul/li[5]/a") private WebElement debitnotevoucherform; 
	@FindBy (xpath="//input[@id='txtVoucherNo']") private WebElement dbcvvnumber;
	@FindBy (xpath="//input[@id='Transdate']") private WebElement dbvtransactiondate; 
	@FindBy (xpath="//input[@id='txtDebitFromAcc']") private WebElement debitfromledger;
	@FindBy (xpath="//*[@id=\"ui-id-3\"]") private WebElement debitfromledger1;
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[2]/div/div[1]/div/div") private WebElement boxbody;
	@FindBy (xpath="//input[@id='txtDebit_Amount']") private WebElement dbvdebitamount;
	@FindBy (xpath="//*[@id=\"imgbtnVLAdd\"]") private WebElement plusbutton;
	@FindBy (xpath="//*[@id=\"imgbtnVLAdd_1\"]") private WebElement plusbutton1;
	@FindBy (xpath="//input[@id='txtaccount']") private WebElement dbvledger1;
	@FindBy (xpath="//input[@id='txtcredit_Amount']") private WebElement dbvamount1;
	@FindBy (xpath="//input[@id='txtGrdNarration']") private WebElement dbvnarriation1;
	@FindBy (xpath="//input[@id='txtcredit_Amount_1']") private WebElement dbvamount2;
	@FindBy (xpath="//input[@id='txtaccount_1']") private WebElement dbvlegder2;
	@FindBy (xpath="//input[@id='txtcredit_Amount_2']") private WebElement dbvamount3;
	@FindBy (xpath="//input[@id='txtaccount_2']") private WebElement dbvledger3;
	@FindBy (xpath="//input[@id='txtcredit_Amount_3']") private WebElement dbvamount4;
	@FindBy (xpath="//input[@id='txtaccount_3']") private WebElement dbvledger4;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement dbvsavebtn;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement dbvnewbtn;
	@FindBy (xpath="//*[@id=\"divContentHolder\"]/form/section[1]/h1/a[1]") private WebElement dbvupdatedebitnote;
	@FindBy (xpath="//input[@id='txtMDLDocumentNo']") private WebElement udbvdocno;
	@FindBy (xpath="//button[@id='btnMDLGet']") private WebElement udbvgetdatabtn;



	// initialization
	WebDriver driver;
	public void setup(WebDriver driver) 
	{
		this.driver=driver;
	}

	public DebitNoteVoucher(WebDriver driver) {
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
	public void VerifyandClickonMyerpAccountsModule () {
		Assert.assertTrue(acconutsmodule.isEnabled(),"acconutsmodule is enabled");
		Reporter.log(" verifyMyerpacconutsmodule", true);
		acconutsmodule.click();
	}
	public void VerifyandClickonMyerpDebitNoteVoucherForm () { 
		Assert.assertTrue(debitnotevoucherform.isEnabled(),"contravoucherform is enabled");
		Reporter.log("contravoucherform", true);
		debitnotevoucherform.click();

	} 
	public void VerifyandClickonMyerpDBVoucherNumber () throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(dbcvvnumber.isEnabled(),"rvvnumber is enabled");
		Reporter.log("Verifymyerppvvnumber", true);
		dbcvvnumber.click();
		dbcvvnumber.sendKeys("10001");

	} 
	public void VerifyandClickonMyerpDBVTransactionDate () { 
		Assert.assertTrue(dbvtransactiondate.isEnabled(),"cvtransactiondate is enabled");
		Reporter.log("VerifyMyercrvtransactiondate", true);
		dbvtransactiondate.clear();
		dbvtransactiondate.click();
		dbvtransactiondate.sendKeys("8/03/2023");

	} 
	public void VerifyandClickonMyerpDBVDebitFromLedger() throws InterruptedException { 
		Assert.assertTrue(debitfromledger.isEnabled(),"debitfromledger is enabled");
		Reporter.log("Verifymyerpdebitfromledger", true);
		debitfromledger.click();
		debitfromledger.sendKeys(" ");
		debitfromledger1.click();
		boxbody.click();
		Thread.sleep(500);

	} 
	public void VerifyandClickonMyerpDBVAmount() { 
		Assert.assertTrue(dbvdebitamount.isEnabled(),"dbvdebitamount is enabled");
		Reporter.log("Verifymyerpdbvdebitamount", true);
		dbvdebitamount.click();
		dbvdebitamount.sendKeys("4500");

	}

	public void VerifyandClickonMyerpDBVLedger1() { 
		Assert.assertTrue(dbvledger1.isEnabled(),"dbvledger1 is enabled");
		Reporter.log("Verifymyerpdbvledger1", true);
		dbvledger1.clear();
		dbvledger1.click();
		dbvledger1.sendKeys("PURCHASE : 300005");

	} 
	public void VerifyandClickonMyerpDBVAmountTextbox1() { 
		Assert.assertTrue(dbvamount1.isEnabled(),"dbvamount1 is enabled");
		Reporter.log("Verifymyerpdbvamount1", true);
		dbvamount1.click();
		dbvamount1.sendKeys("3814");

	}
	public void VerifyandClickonMyepplusbutton() { 
		Assert.assertTrue(plusbutton.isEnabled(),"plusbutton is enabled");
		Reporter.log("Verifymyerpplusbutton", true);
		plusbutton.click();
	}

	public void VerifyandClickonMyerpDBVLedger2() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(dbvlegder2.isEnabled(),"dbvledger2 is enabled");
		Reporter.log("Verifymyerpdbvledger2", true);
		dbvlegder2.clear();
		dbvlegder2.click();
		dbvlegder2.sendKeys("CGST INPUT : 400002");

	} 
	public void VerifyandClickonMyerpDBVAmountTextbox2() throws InterruptedException { 
		Thread.sleep(500);
		Assert.assertTrue(dbvamount2.isEnabled(),"dbvamount2 is enabled");
		Reporter.log("Verifymyerpdbvamount2", true);
		dbvamount2.click();
		dbvamount2.sendKeys("343");

	}

	public void VerifyandClickonMyepplusbutton2() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(plusbutton1.isEnabled(),"plusbutton1 is enabled");
		Reporter.log("Verifymyerpplusbutton1", true);
		plusbutton1.click();
	}
	public void VerifyandClickonMyerpDBVLedger3() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(dbvledger3.isEnabled(),"dbvledger3 is enabled");
		Reporter.log("Verifymyerpdbvledger3", true);
		dbvledger3.clear();
		dbvledger3.click();
		dbvledger3.sendKeys("SGST INPUT : 400003");

	} 
	public void VerifyandClickonMyerpDBVAmountTextbox3() throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(dbvamount3.isEnabled(),"dbvamount3 is enabled");
		Reporter.log("Verifymyerpdbvamount3", true);
		dbvamount3.click();
		dbvamount3.sendKeys("343");

	}
	public void VerifyandClickonMyerpDBVNarration1 () throws InterruptedException { 
		Thread.sleep(1000);
		Assert.assertTrue(dbvnarriation1.isEnabled(),"rpvnarriation1 is enabled");
		Reporter.log("Verifymyerprvpvnarriation1", true);
		dbvnarriation1.click();
		dbvnarriation1.sendKeys("being paid from legers bpcl");

	} 
	public void VerifyandClickonMyerpDBVSavebtn() throws InterruptedException { 
		Assert.assertTrue(dbvsavebtn.isEnabled(),"rvsavebtn is enabled");
		Reporter.log("Verifymyerprvsavebtn", true);
		dbvsavebtn.click();
		Thread.sleep(2000);
		if (isAlertPresent4(driver)) { System.out.println("alert is present");

		}else
		{ System.out.println("alert is not present"); }
	}

	public static boolean isAlertPresent4(WebDriver driver) throws
	InterruptedException { 
		try {
			Thread.sleep(3000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			al.accept(); 
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}

	public void VerifyandClickonMyerpDBVNewbtn() { 
		Assert.assertTrue(dbvnewbtn.isEnabled(),"pvnewbtn is enabled");
		Reporter.log("Verifymyerppvnewbtn", true);
		dbvnewbtn.click();

	} 
	public void VerifyandClickonMyerpUpdateDebitNoteVoucherForm () { 
		Assert.assertTrue(dbvupdatedebitnote.isEnabled(),"dbvupdatedebitnote is enabled");
		Reporter.log("dbvupdatedebitnote", true);
		dbvupdatedebitnote.click();

	} 
	public void VerifyandClickonMyerpDBVUpdateDocNumber() { 
		Assert.assertTrue(udbvdocno.isEnabled(),"udbvdocno is enabled");
		Reporter.log("udbvdocno", true);
		udbvdocno.click();
		udbvdocno.sendKeys("2200024");


	} 
	public void VerifyandClickonMyerpUpdateGetDataBtn () throws InterruptedException { 
		Assert.assertTrue(udbvgetdatabtn.isEnabled(),"udbvgetdatabtn is enabled");
		Reporter.log("udbvgetdatabtn", true);	
		udbvgetdatabtn.click();
		Thread.sleep(1000);
		if (isAlertPresent5(driver)) { System.out.println("alert is present");

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
			return true; }
		catch (UnhandledAlertException u) 
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

	}

	}
