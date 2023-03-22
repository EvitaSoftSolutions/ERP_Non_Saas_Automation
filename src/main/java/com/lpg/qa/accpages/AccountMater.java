package com.lpg.qa.accpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class AccountMater {
	
	@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
	@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
	
	@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[1]/td[2]/a") private WebElement newledgresform;
	@FindBy (xpath="//input[@id='txtNameOfLedger']") private WebElement nameofledger;
	@FindBy (xpath="//select[@id='ddlGroup']") private WebElement selectgroup;
	@FindBy (xpath="//input[@id='txtAlias']") private WebElement aliasname;
	@FindBy (xpath="//input[@id='OpeningDate']")private WebElement date;
	@FindBy (xpath="//button[@id='btnClear']") private WebElement clearbtn;
	@FindBy (xpath="//button[@id='btnSave']") private WebElement savebtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement saveokbtn;
	@FindBy (xpath="//button[@id='btnGet']") private WebElement getlist;
	
	@FindBy (xpath="//*[@id=\"bck\"]") private WebElement backbtn;
	@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[4]/td[2]/a") private WebElement bankform; 
	@FindBy (xpath="//select[@id='ddlUnderGroup']") private WebElement selectundergroup;
	@FindBy (xpath="//input[@id='txtBank_Code']") private WebElement bankcode;
	@FindBy (xpath="//input[@id='txtDescription']") private WebElement bdescription;
	@FindBy (xpath="//input[@id='txtAccountCode']") private WebElement baccountnumber;
	@FindBy (xpath="//select[@id='ddlAccountType']") private WebElement bsaccounttype;
	@FindBy (xpath="//select[@id='ddlCompanyID']") private WebElement bselectcompany;
	@FindBy (xpath="//input[@id='txtAlias']") private WebElement baliasname;
	@FindBy (xpath="//input[@id='txtBSR_Code']")private WebElement bsr;
	@FindBy (xpath="//input[@id='txtAddr1']")private WebElement address;
	@FindBy (xpath="//input[@id='txtBranch']")private WebElement branch;
	@FindBy (xpath="//input[@id='txtEmail']")private WebElement email;
	@FindBy (xpath="//input[@id='txtManager']")private WebElement manager;
	@FindBy (xpath="//input[@id='txtCont_Person']")private WebElement contactperson;
	@FindBy (xpath="//input[@id='txtPhone']")private WebElement phone;
	@FindBy (xpath="//input[@id='txtIFSCode']")private WebElement ifsdcode;
	@FindBy (xpath="//input[@id='chkActive']") private WebElement bactivechkbtn;
	@FindBy (xpath="//button[@id='btnclear']") private WebElement bcleartbtn;
	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement bsubmitbtn;
	@FindBy (xpath="//button[text()='OK']") private WebElement bsubmitokbtn;
	
	@FindBy(xpath="//a[text()='Opening Stock']")private WebElement openingstock;
	@FindBy(xpath="//select[@id='ddlGodownID']")private WebElement godown;
	@FindBy(xpath="//select[@id='ddlProductID']")private WebElement product;
	@FindBy(xpath="//input[@id='Fromdate']")private WebElement fromdate;
	@FindBy(xpath="//input[@id='txtOpeningFull']")private WebElement openingfull;
	@FindBy(xpath="//input[@id='txtOpeningEmpty']")private WebElement openingempty;
	@FindBy(xpath="//input[@id='txtDefective']")private WebElement defective;
	@FindBy(xpath="//input[@id='txtCredit']")private WebElement credit;
	@FindBy(xpath="//input[@id='txtMinStock']")private WebElement minstock;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement openingvaluation;
	@FindBy(xpath="//button[@id='btnclear']")private WebElement osclearbtn;
	@FindBy(xpath="//button[@id='btnSubmit']")private WebElement submitbtn;
	@FindBy(xpath="//input[@id='rdoOther']")private WebElement retiobutton;
	@FindBy(xpath="//input[@id='txtStockOpeningValuation']")private WebElement stockopeningvaluation;
	@FindBy(xpath="//select[@id='ddlCompanyID']")private WebElement companyselect;
	@FindBy(xpath="//input[@id='txtotherprodOpeningQty']")private WebElement openingqty;
	

	
	
	
	

	
	
	// initialization
	 WebDriver driver;
	 public void setup(WebDriver driver) 
	 {
		 this.driver=driver;
	 }
		
	public AccountMater(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		// usage
	
	public void VerifyMyerpMasterModule() {
		 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
		 Reporter.log("verifyMyerpMasterModule", true);
		 master.click(); 
	}
	public void VerifyMyerpAccountMaster() {
		 Assert.assertTrue(accountmaster.isEnabled(),"accountmaster Module field is enabled");		 
		 Reporter.log("verifyMyerpaccountmaster", true);
		 accountmaster.click(); 
	}
	public void VerifyMyerpNewLedgersForm() {
		 Assert.assertTrue(newledgresform.isEnabled(),"newledgresform Module field is enabled");		 
		 Reporter.log("verifyMyerpnewledgresform", true);
		 newledgresform.click(); 
	}
	
	
	public void VerifyMyerpNameOfLedgers() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("cylinder deposit");
		 
	}
	public void VerifyMyerpSelectGroup() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("DEPOSITS");
	}
	public void VerifyMyerpAliasname() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("cylinder deposit");
		 
	}
	public void VerifyMyerpDate() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
	}
	public void VerifyMyerpNameOfLedgers1() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("cylinder Lost");
		 
	}
	public void VerifyMyerpSelectGroup1() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("STOCK IN HAND");
	}
	public void VerifyMyerpAliasname1() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("cylinder Lost");
		 
	}
	public void VerifyMyerpDate1() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn1() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn1() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
	}
	public void VerifyMyerpNameOfLedgers2() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("Dpr deposits");
		 
	}
	public void VerifyMyerpSelectGroup2() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("DEPOSITS");
	}
	public void VerifyMyerpAliasname2() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("Dpr deposits");
		 
	}
	public void VerifyMyerpDate2() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn2() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn2() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
	}
	public void VerifyMyerpNameOfLedgers3() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("Dpr lost");
		 
	}
	public void VerifyMyerpSelectGroup3() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("STOCK IN HAND");
	}
	public void VerifyMyerpAliasname3() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("Dpr lost");
		 
	}
	public void VerifyMyerpDate3() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn3() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn3() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
	}
	public void VerifyMyerpNameOfLedgers4() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("Bpcl online receivable");
		 
	}
	public void VerifyMyerpSelectGroup4() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("SALES");
	}
	public void VerifyMyerpAliasname4() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("Bpcl online receivable");
		 
	}
	public void VerifyMyerpDate4() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn4() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn4() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
	}
	
	
	public void VerifyMyerpNameOfLedgers5() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("DBTL");
		 
	}
	public void VerifyMyerpSelectGroup5() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("OTHER INCOME");
	}
	public void VerifyMyerpAliasname5() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("DBTL");
		 
	}
	public void VerifyMyerpDate5() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn5() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn5() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
		 Thread.sleep(500);
	}
	
	
	public void VerifyMyerpNameOfLedgers6() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(nameofledger.isEnabled(),"nameofledger Module field is enabled");		 
		 Reporter.log("verifyMyerpnameofledger", true);
		 nameofledger.click();
		 nameofledger.sendKeys("Discount");
		 
	}
	public void VerifyMyerpSelectGroup6() throws InterruptedException {
		Select sc = new Select(selectgroup);
		Thread.sleep(1000);
		Assert.assertFalse(selectgroup.isDisplayed(),"selectgroup is displayed");
		Assert.assertFalse(selectgroup.isSelected());
		sc.selectByVisibleText("INDIRECT EXPENCES");
	}
	public void VerifyMyerpAliasname6() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(aliasname.isEnabled(),"nlaliasname field is enabled");		 
		 Reporter.log("verifyMyerpnlaliasname", true);
		 aliasname.click();
		 aliasname.sendKeys("Discount");
		 
	}
	public void VerifyMyerpDate6() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(date.isEnabled(),"date field is enabled");		 
		 Reporter.log("verifyMyerpdate", true);
		 date.click();
		 date.clear();
		 date.sendKeys("01-01-2023");
		 
	}
	public void VerifyMyerpSaveBtn6() throws InterruptedException {
		Thread.sleep(400);
		 Assert.assertTrue(savebtn.isEnabled(),"savebtn field is enabled");		 
		 Reporter.log("verifyMyerpnlsavebtn", true);
		 savebtn.click();
	}
	public void VerifyMyerpSaveOKBtn6() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(saveokbtn.isEnabled(),"saveokbtn  field is enabled");		 
		 Reporter.log("verifyMyerpnlsaveokbtn", true);
		 saveokbtn.click();
		 Thread.sleep(500);
		 
	}
	public void VerifyMyerpBackBtn() throws InterruptedException {
		Thread.sleep(1000);
		 Assert.assertTrue(backbtn.isEnabled(),"backbtn  field is enabled");		 
		 Reporter.log("verifyMyerpbackbtn", true);
		 backbtn.click();
		 Thread.sleep(600);
	}
	
	
	public void VerifyMyerpBankForm() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bankform.isEnabled(),"bankform Module field is enabled");		 
		 Reporter.log("verifyMyerpbankform", true);
		 bankform.click(); 
	}
	public void BankSelectUnderGroup() throws InterruptedException {
		Select bsug = new Select(selectundergroup);
		Thread.sleep(500);
		Assert.assertFalse(selectundergroup.isDisplayed(),"selectundergroup is displayed");
		Assert.assertFalse(selectundergroup.isSelected());
		bsug.selectByVisibleText("BANK");
	}
	public void VerifyMyerpBankCode() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bankcode.isEnabled(),"bankcode  field is enabled");		 
		 Reporter.log("verifyMyerpbankcode", true);
		 bankcode.click(); 
		 bankcode.sendKeys("2024");
	}
	public void VerifyMyerpBankDescripption() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bdescription.isEnabled(),"bdescription  field is enabled");		 
		 Reporter.log("verifyMyerpbdescription", true);
		 bdescription.click(); 
		 bdescription.sendKeys("STATE BANK OF INDIA");
	}
	public void VerifyMyerpBankAccNumber() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(baccountnumber.isEnabled(),"baccountnumber  field is enabled");		 
		 Reporter.log("verifyMyerpbaccountnumber", true);
		 baccountnumber.click(); 
		 baccountnumber.sendKeys("SBI37487548483900");
	}
	public void BankSelectAccountType() throws InterruptedException {
		Select bsat = new Select(bsaccounttype);
		Thread.sleep(500);
		Assert.assertFalse(bsaccounttype.isDisplayed(),"bsaccounttype is displayed");
		Assert.assertFalse(bsaccounttype.isSelected());
		bsat.selectByVisibleText("Savings");
	}
	public void BankSelectCompany() throws InterruptedException {
		Select bsug = new Select(bselectcompany);
		Thread.sleep(500);
		Assert.assertFalse(bselectcompany.isDisplayed(),"bselectcompany is displayed");
		Assert.assertFalse(bselectcompany.isSelected());
		bsug.selectByVisibleText("PANKAJ GAS SERVICES");
	}
	public void VerifyMyerpBankAlias() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(baliasname.isEnabled(),"baliasname field is enabled");		 
		 Reporter.log("verifyMyerpbaliasname", true);
		 baliasname.click(); 
		 baliasname.sendKeys("STATE BANK OF INDIA");
	}
	public void VerifyMyerpBsr() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bsr.isEnabled(),"bsr field is enabled");		 
		 Reporter.log("verifyMyerpbsr", true);
		 bsr.click(); 
		 bsr.sendKeys("349802");
	}
	public void VerifyMyerpAddress() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(address.isEnabled(),"address field is enabled");		 
		 Reporter.log("verifyMyerpaddress", true);
		 address.click(); 
		 address.sendKeys("VIRAR");
	}
	public void VerifyMyerpBranch() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(branch.isEnabled(),"branch field is enabled");		 
		 Reporter.log("verifyMyerpbranch", true);
		 branch.click(); 
		 branch.sendKeys("VIRAR");
	}
	public void VerifyMyerpEmail() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(email.isEnabled(),"email field is enabled");		 
		 Reporter.log("verifyMyerpemail", true);
		 email.click(); 
		 email.sendKeys("anitagaservices@gmail.com");
	}
	public void VerifyMyerpManager() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(manager.isEnabled(),"manager field is enabled");		 
		 Reporter.log("verifyMyerpmanager", true);
		 manager.click(); 
		 manager.sendKeys("LAL THAKUR");
	}
	public void VerifyMyerpContactperson() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(contactperson.isEnabled(),"contactperson field is enabled");		 
		 Reporter.log("verifyMyerpcontactperson", true);
		 contactperson.click(); 
		 contactperson.sendKeys("LAL THAKUR");
	}
	public void VerifyMyerpphone() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(phone.isEnabled(),"phone field is enabled");		 
		 Reporter.log("verifyMyerpphone", true);
		 phone.click(); 
		 phone.sendKeys("8828420045");
	}
	public void VerifyMyerpIfsdcode() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(ifsdcode.isEnabled(),"ifsdcode field is enabled");		 
		 Reporter.log("verifyMyerpifsdcode", true);
		 ifsdcode.click(); 
		 ifsdcode.sendKeys("SBI29383378232832938");
	}
	public void VerifyBankActiveCHKBtn() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bactivechkbtn.isEnabled(),"bactivechk btn is enabled");
		 Reporter.log(" verifyMyerpbactivechkbtn", true);
		 bactivechkbtn.click();
	}
	
	public void VerifyMyerpBClearBtn() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bcleartbtn.isEnabled(),"bcleartbtn form field is enabled");		 
		 Reporter.log("verifyMyerpbcleartbtn", true);
		 bcleartbtn.click(); 
		
	}
	
	public void VerifyMyerpBSubmitBtn() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bsubmitbtn.isEnabled(),"bsubmitbtn form field is enabled");		 
		 Reporter.log("verifyMyerpbsubmitbtn", true);
		 bsubmitbtn.click();
	}
	public void VerifyMyerpBSubmitOKBtn() throws InterruptedException {
		Thread.sleep(500);
		 Assert.assertTrue(bsubmitokbtn.isEnabled(),"bsubmitokbtn form field is enabled");		 
		 Reporter.log("verifyMyerpbsubmitokbtn", true);
		 bsubmitokbtn.click(); 
	}
	
	
	
	
	
	public void verifyMyerpOpeningStock() {
		Assert.assertTrue(openingstock.isEnabled(),"OpeningStock is enable");
		Reporter.log("verifyMyerpopeningstock",true);
		openingstock.click();
	}
	public void verifyMyerpSelectGodown() throws InterruptedException {
		Select sc = new Select(godown);
		Thread.sleep(1000);
		Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
		Assert.assertFalse(godown.isSelected());
		sc.selectByVisibleText("VIRAR WEST");
	}
	public void verifyMyerpProduct() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpFromDate() {
		Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
		Reporter.log("verifyMyerpfromdate",true);
		fromdate.sendKeys("01/12/2022");
	}
	public void verifyMyerpOpeningFull() {
		Assert.assertTrue(openingfull.isEnabled(),"OpeningFull is enable");
		Reporter.log("verifyMyerpopeningfull",true);
		openingfull.sendKeys("200");
	}
	public void verifyMyerpOpeningEmpty() {
		Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
		Reporter.log("verifyMyerpopeningempty",true);
		openingempty.sendKeys("15");
	}
	public void verifyMyerpDefective() {
		Assert.assertTrue(defective.isEnabled(),"Defective is enable");
		Reporter.log("verifyMyerpdefective",true);
		defective.sendKeys("0");
	}
	public void verifyMyerpCredit() {
		Assert.assertTrue(credit.isEnabled(),"Credit is enable");
		Reporter.log("verifyMyerpcredit",true);
		credit.sendKeys("0");
	}
	public void verifyMyerpMinStock() {
		Assert.assertTrue(minstock.isEnabled(),"MinStock is enable");
		Reporter.log("verifyMyerpminstock",true);
		minstock.sendKeys("5");
	}
	public void verifyMyerpOpeningValuation() {
		Assert.assertTrue(openingvaluation.isEnabled(),"OpeningValuation is enable");
		Reporter.log("verifyMyerpopeningvaluation",true);
		openingvaluation.sendKeys("20");
	}
	public void verifyMyerpClearbtn() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void Godown1() throws InterruptedException {
		Select sc = new Select(godown);
		Thread.sleep(1000);
		Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
		Assert.assertFalse(godown.isSelected());
		sc.selectByVisibleText("VIRAR WEST");
	}
	public void Product1() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("19 KG");
	}
	public void verifyMyerpFromDate1() {
		Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
		Reporter.log("verifyMyerpfromdate",true);
		fromdate.sendKeys("01/12/2022");
	}
	public void verifyMyerpOpeningFull1() {
		Assert.assertTrue(openingfull.isEnabled(),"OpeningFull is enable");
		Reporter.log("verifyMyerpopeningfull",true);
		openingfull.sendKeys("200");
	}
	public void verifyMyerpOpeningEmpty1() {
		Assert.assertTrue(openingempty.isEnabled(),"OpeningEmpty is enable");
		Reporter.log("verifyMyerpopeningempty",true);
		openingempty.sendKeys("15");
	}
	public void verifyMyerpDefective1() {
		Assert.assertTrue(defective.isEnabled(),"Defective is enable");
		Reporter.log("verifyMyerpdefective",true);
		defective.sendKeys("0");
	}
	public void verifyMyerpCredit1() {
		Assert.assertTrue(credit.isEnabled(),"Credit is enable");
		Reporter.log("verifyMyerpcredit",true);
		credit.sendKeys("0");
	}
	public void verifyMyerpMinStock1() {
		Assert.assertTrue(minstock.isEnabled(),"MinStock is enable");
		Reporter.log("verifyMyerpminstock",true);
		minstock.sendKeys("5");
	}
	public void verifyMyerpOpeningValuation1() {
		Assert.assertTrue(openingvaluation.isEnabled(),"OpeningValuation is enable");
		Reporter.log("verifyMyerpopeningvaluation",true);
		openingvaluation.sendKeys("20");
	}
	public void verifyMyerpSubmitbtn() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		 Thread.sleep(1000);
		 if (isAlertPresent(driver)) { System.out.println("alert is present");
		  
		  }else { System.out.println("alert is not present"); }
		  
		  } 
	public static boolean isAlertPresent(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			 al.accept();
		return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

		}
   
	
	public void verifyMyerpRetiobutton() {
		Assert.assertTrue(retiobutton.isEnabled(),"Retiobutton is enable");
		Reporter.log("verifyMyerpretiobutton",true);
		retiobutton.click();
	}
	public void Godown2() throws InterruptedException {
		Select sc = new Select(godown);
		Thread.sleep(1000);
		Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
		Assert.assertFalse(godown.isSelected());
		sc.selectByVisibleText("VIRAR WEST");
	}
	public void Product2() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("SRT PIPE");
	}
	public void verifyMyerpFromDate2() {
		Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
		Reporter.log("verifyMyerpfromdate",true);
		fromdate.sendKeys("01/12/2022");
	}
	public void verifyMyerpStockOpeningValuation() {
		Assert.assertTrue(stockopeningvaluation.isEnabled(),"StockOpeningValuation is enable");
		Reporter.log("verifyMyerpstockopeningvaluation",true);
		stockopeningvaluation.sendKeys("200");
	}
	public void CompanySelect() throws InterruptedException {
		Select cs = new Select(companyselect);
		Thread.sleep(1000);
		Assert.assertFalse(companyselect.isDisplayed(),"CompanySelect is  displayed");
		Assert.assertFalse(companyselect.isSelected());
		cs.selectByVisibleText("PANKAJ GAS SERVICES");
	}
	public void verifyMyerpOpeningQty() {
		Assert.assertTrue(openingqty.isEnabled(),"OpeningQty is enable");
		Reporter.log("verifyMyerpopeningqty",true);
		openingqty.sendKeys("10");
	}
	public void verifyMyerpClearbtn1() {
		Assert.assertTrue(clearbtn.isEnabled(),"Clearbtn is enable");
		Reporter.log("verifyMyerpclearbtn",true);
		clearbtn.click();
	}
	public void Godown3() throws InterruptedException {
		Select sc = new Select(godown);
		Thread.sleep(1000);
		Assert.assertFalse(godown.isDisplayed(),"Godown is  displayed");
		Assert.assertFalse(godown.isSelected());
		sc.selectByVisibleText("VIRAR WEST");
	}
	public void Product3() throws InterruptedException {
		Select sc = new Select(product);
		Thread.sleep(1000);
		Assert.assertFalse(product.isDisplayed(),"Product is  displayed");
		Assert.assertFalse(product.isSelected());
		sc.selectByVisibleText("SRT PIPE");
	}
	public void verifyMyerpFromDate3() {
		Assert.assertTrue(fromdate.isEnabled(),"FromDate is enable");
		Reporter.log("verifyMyerpfromdate",true);
		fromdate.sendKeys("21/03/2023");
	}
	public void verifyMyerpStockOpeningValuation1() {
		Assert.assertTrue(stockopeningvaluation.isEnabled(),"StockOpeningValuation is enable");
		Reporter.log("verifyMyerpstockopeningvaluation",true);
		stockopeningvaluation.sendKeys("21/03/2023");
	}
	public void CompanySelect1() throws InterruptedException {
		Select cs = new Select(companyselect);
		Thread.sleep(1000);
		Assert.assertFalse(companyselect.isDisplayed(),"CompanySelect is  displayed");
		Assert.assertFalse(companyselect.isSelected());
		cs.selectByVisibleText("PANKAJ GAS SERVICES");
	}
	public void verifyMyerpOpeningQty1() {
		Assert.assertTrue(openingqty.isEnabled(),"OpeningQty is enable");
		Reporter.log("verifyMyerpopeningqty",true);
		openingqty.sendKeys("10");
	}
	public void verifyMyerpSubmitbtn1() throws InterruptedException {
		Assert.assertTrue(submitbtn.isEnabled(),"Submitbtn is enable");
		Reporter.log("verifyMyerpsubmitbtn",true);
		submitbtn.click();
		 Thread.sleep(1000);
		 if (isAlertPresent1(driver)) { System.out.println("alert is present");
		  
		  }else { System.out.println("alert is not present"); }
		  
		  } 
	public static boolean isAlertPresent1(WebDriver driver) throws
	InterruptedException { 
		try {
			Alert al=driver.switchTo().alert();
			Thread.sleep(2000); 
			 al.accept();
		return true; }
		catch (UnhandledAlertException u)
		{ // TODO Auto-generated catch block
			u.printStackTrace(); } return false;

		}
}           
