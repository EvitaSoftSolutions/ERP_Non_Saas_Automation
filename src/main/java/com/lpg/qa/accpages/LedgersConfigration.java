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
		

  public class LedgersConfigration {
			
			
			@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
			@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
			@FindBy (xpath="//input[@id='password-field']") private WebElement password;
			@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
			@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;  
			@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[2]/a") private WebElement accountmaster;
			@FindBy (xpath="//*[@id=\"tblGeneralMasters\"]/tbody/tr[3]/td[2]/a") private WebElement Ledgersconfigform;
			@FindBy (xpath="//select[@id='ddlBeyondSaleCash']") private WebElement SelectBeyondSaleCash;
			@FindBy (xpath="//select[@id='ddlFourteenKgDelivery']") private WebElement Select14KgDelivery;
			@FindBy (xpath="//select[@id='ddlInputCGST']") private WebElement SelectCGST;
			@FindBy (xpath="//select[@id='ddlInputSGST']") private WebElement SelectSGST;
			@FindBy (xpath="//select[@id='ddlInputIGST']") private WebElement SelectIGST;
			@FindBy (xpath="//select[@id='ddlOutputCGST']") private WebElement SelectOutputCGST;
			@FindBy (xpath="//select[@id='ddlOutputSGST']") private WebElement SelectOutputSGST;
			@FindBy (xpath="//select[@id='ddlOutputIGST']") private WebElement SelectOutputIGST;
			@FindBy (xpath="//select[@id='ddlFourteenKgCashSale']") private WebElement Select14KgCashSale;
			@FindBy (xpath="//select[@id='ddlFourteenKgBankDeposite']") private WebElement Select14KgBankDeposit;
			@FindBy (xpath="//select[@id='ddlCounterSaleCash']") private WebElement SelectCounterSaleCash;
			@FindBy (xpath="//select[@id='ddlCounterSaleOnline']") private WebElement SelectCounterSaleOnline;
			@FindBy (xpath="//select[@id='ddlCounterSaleSwipe']") private WebElement SelectCounterSaleSwipe;
			@FindBy (xpath="//select[@id='ddlBeyondSaleOnline']") private WebElement SelectBeyondSaleOnline;
			@FindBy (xpath="//select[@id='ddlBeyondSaleSwipe']") private WebElement SelectBeyondSaleSwipe;
			@FindBy (xpath="//select[@id='ddlBEYONDSALE']") private WebElement SelectBeyondSale;
			@FindBy (xpath="//select[@id='ddlPaybleToCompany']") private WebElement SelectPaybleToCompany;
			@FindBy (xpath="//select[@id='ddlCylDeposite']") private WebElement SelectCylinderDeposit;
			@FindBy (xpath="//select[@id='ddlSellDebit']") private WebElement SelectSellDebit;
			@FindBy (xpath="//select[@id='ddlFourteenKgSale']") private WebElement Select14KgSale;
			@FindBy (xpath="//select[@id='ddlCylLost']") private WebElement SelectCylinderLost;
			@FindBy (xpath="//select[@id='ddlDPRLost']") private WebElement SelectDPRLost;
			@FindBy (xpath="//select[@id='ddlDBTL']") private WebElement SelectDBTL;
			@FindBy (xpath="//select[@id='ddlCommercialSaleCash']") private WebElement SelectCommercialSaleCash;
			@FindBy (xpath="//select[@id='ddlRoundOff']") private WebElement SelectRoundOff;
			@FindBy (xpath="//select[@id='ddlCommSale']") private WebElement SelectCommercialSale;
			@FindBy (xpath="//select[@id='ddlTVOUTSUSPENSE']") private WebElement SelectTVOUTSUSPENSE;
			@FindBy (xpath="//select[@id='ddlBPCLReceivable']") private WebElement SelectBPCLReceivable;
			@FindBy (xpath="//select[@id='ddlDiscount']") private WebElement SelectDiscount;
			@FindBy (xpath="//select[@id='ddl14KgSaleDebit']") private WebElement Select14KgSaleDebit;

        	@FindBy (xpath="//button[@id='btnSubmit']") private WebElement lcsubmitbtn;
			@FindBy (xpath="//button[@id='btnclear']") private WebElement lcclearbtn;
			
			// initialization
			WebDriver driver;
			public void setup(WebDriver driver) 
			{
				this.driver=driver;
			}
			public LedgersConfigration(WebDriver driver) {
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
				public void VerifyMyerpMasterModule() {
					 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
					 Reporter.log("verifyMyerpMasterModule", true);
					 master.click(); 
				}
				public void VerifyMyerpAccountMasterModule() {
					 Assert.assertTrue(accountmaster.isEnabled(),"accountmaster Module field is enabled");		 
					 Reporter.log("verifyMyerpaccountmaster", true);
					 accountmaster.click(); 
				}
				public void VerifyMyerpLegersConfigForm() {
					 Assert.assertTrue(Ledgersconfigform.isEnabled(),"Ledgersconfig form field is enabled");		 
					 Reporter.log("verifyMyerpLedgersconfigform", true);
					 Ledgersconfigform.click(); 
                }

				public void SelectBeyondSaleCash() throws InterruptedException {
					Select sc = new Select(SelectBeyondSaleCash);
					Thread.sleep(500);
					Assert.assertFalse(SelectBeyondSaleCash.isDisplayed(),"State is  displayed");
					Assert.assertFalse(SelectBeyondSaleCash.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("CASHINHAND");
				}
				public void Select14KgDelivery() throws InterruptedException {
					Select sc = new Select(Select14KgDelivery);
					Thread.sleep(500);
					Assert.assertFalse(Select14KgDelivery.isDisplayed(),"Select14KgDelivery is  displayed");
					Assert.assertFalse(Select14KgDelivery.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("DOMESTIC SALE");
				}
				public void SelectCGST() throws InterruptedException {
					Select sc = new Select(SelectCGST);
					Thread.sleep(500);
					Assert.assertFalse(SelectCGST.isDisplayed(),"SelectCGST is  displayed");
					Assert.assertFalse(SelectCGST.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("CGST INPUT");
				}
				public void SelectSGST() throws InterruptedException {
					Select sc = new Select(SelectSGST);
					Thread.sleep(500);
					Assert.assertFalse(SelectSGST.isDisplayed(),"State is  displayed");
					Assert.assertFalse(SelectSGST.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("SGST INPUT");
				}
				public void SelectIGST() throws InterruptedException {
					Select sc = new Select(SelectIGST);
					Thread.sleep(500);
					Assert.assertFalse(SelectIGST.isDisplayed(),"SelectIGST is  displayed");
					Assert.assertFalse(SelectIGST.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("IGST INPUT");
				}
				public void SelectOutputCGST() throws InterruptedException {
					Select sc = new Select(SelectOutputCGST);
					Thread.sleep(500);
					Assert.assertFalse(SelectOutputCGST.isDisplayed(),"SelectOutputCGST is  displayed");
					Assert.assertFalse(SelectOutputCGST.isSelected());
					Thread.sleep(1000);
					sc.selectByVisibleText("CGST OUTPUT");
				}
				public void SelectOutputSGST() throws InterruptedException {
					Select sc = new Select(SelectOutputSGST);
					Thread.sleep(500);
					Assert.assertFalse(SelectOutputSGST.isDisplayed(),"SelectOutputSGST is  displayed");
					Assert.assertFalse(SelectOutputSGST.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("SGST OUTPUT");
				}
				public void SelectOutputIGST() throws InterruptedException {
					Select sc = new Select(SelectOutputIGST);
					Thread.sleep(500);
					Assert.assertFalse(SelectOutputIGST.isDisplayed(),"SelectOutputIGST is  displayed");
					Assert.assertFalse(SelectOutputIGST.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("IGST OUTPUT");
				}
				public void Select14KgCashSale() throws InterruptedException {
					Select sc = new Select(Select14KgCashSale);
					Thread.sleep(500);
					Assert.assertFalse(Select14KgCashSale.isDisplayed(),"Select14KgCashSale is  displayed");
					Assert.assertFalse(Select14KgCashSale.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("CASHINHAND");
				}
				
				public void Select14KgBankDeposit() throws InterruptedException {
					Select sc = new Select(Select14KgBankDeposit);
					Thread.sleep(500);
					Assert.assertFalse(Select14KgBankDeposit.isDisplayed(),"Select14KgBankDeposit is  displayed");
					Assert.assertFalse(Select14KgBankDeposit.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("STATE BANK OF INDIA");
				}
				public void SelectCounterSaleCash() throws InterruptedException {
					Select sc = new Select(SelectCounterSaleCash);
					Thread.sleep(500);
					Assert.assertFalse(SelectCounterSaleCash.isDisplayed(),"SelectCounterSaleCash is  displayed");
					Assert.assertFalse(SelectCounterSaleCash.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("CASHINHAND");
				}
				
				public void SelectCounterSaleOnline() throws InterruptedException {
					Select sc = new Select(SelectCounterSaleOnline);
					Thread.sleep(500);
					Assert.assertFalse(SelectCounterSaleOnline.isDisplayed(),"SelectCounterSaleOnline is  displayed");
					Assert.assertFalse(SelectCounterSaleOnline.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("STATE BANK OF INDIA");
				}
				public void SelectCounterSaleSwipe() throws InterruptedException {
					Select sc = new Select(SelectCounterSaleSwipe);
					Thread.sleep(500);
					Assert.assertFalse(SelectCounterSaleSwipe.isDisplayed(),"SelectCounterSaleSwipe is  displayed");
					Assert.assertFalse(SelectCounterSaleSwipe.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("STATE BANK OF INDIA");
				}
				public void SelectBeyondSaleOnline() throws InterruptedException {
					Select sc = new Select(SelectBeyondSaleOnline);
					Thread.sleep(500);
					Assert.assertFalse(SelectBeyondSaleOnline.isDisplayed(),"SelectBeyondSaleOnline is  displayed");
					Assert.assertFalse(SelectBeyondSaleOnline.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("STATE BANK OF INDIA");
				}
				public void SelectBeyondSaleSwipe() throws InterruptedException {
					Select sc = new Select(SelectBeyondSaleSwipe);
					Thread.sleep(500);
					Assert.assertFalse(SelectBeyondSaleSwipe.isDisplayed(),"SelectBeyondSaleSwipe is  displayed");
					Assert.assertFalse(SelectBeyondSaleSwipe.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("STATE BANK OF INDIA");
				}
				public void SelectBeyondSale() throws InterruptedException {
					Select sc = new Select(SelectBeyondSale);
					Thread.sleep(500);
					Assert.assertFalse(SelectBeyondSale.isDisplayed(),"SelectBeyondSale is  displayed");
					Assert.assertFalse(SelectBeyondSale.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("BEYOND SALE");
				}
				public void SelectPaybleToCompany() throws InterruptedException {
					Select sc = new Select(SelectPaybleToCompany);
					Thread.sleep(500);
					Assert.assertFalse(SelectPaybleToCompany.isDisplayed(),"SelectPaybleToCompany is  displayed");
					Assert.assertFalse(SelectPaybleToCompany.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("cylinder deposit");
				}
				public void SelectCylinderDeposit() throws InterruptedException {
					Select sc = new Select(SelectCylinderDeposit);
					Thread.sleep(500);
					Assert.assertFalse(SelectCylinderDeposit.isDisplayed(),"SelectCylinderDeposit is  displayed");
					Assert.assertFalse(SelectCylinderDeposit.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("cylinder deposit");
				}
				public void SelectSellDebit() throws InterruptedException {
					Select sc = new Select(SelectSellDebit);
					Thread.sleep(500);
					Assert.assertFalse(SelectSellDebit.isDisplayed(),"SelectSellDebit is  displayed");
					Assert.assertFalse(SelectSellDebit.isSelected());
					Thread.sleep(1000);
					sc.selectByVisibleText("SaleDebit");
				}
				
				public void Select14KgSale() throws InterruptedException {
					Select sc = new Select(Select14KgSale);
					Thread.sleep(500);
					Assert.assertFalse(Select14KgSale.isDisplayed(),"State is  displayed");
					Assert.assertFalse(Select14KgSale.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("DOMESTIC SALE");
				}
				public void SelectCylinderLost() throws InterruptedException {
					Select sc = new Select(SelectCylinderLost);
					Thread.sleep(500);
					Assert.assertFalse(SelectCylinderLost.isDisplayed(),"SelectCylinderLost is  displayed");
					Assert.assertFalse(SelectCylinderLost.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("cylinder Lost");
				}
				public void SelectDPRLost() throws InterruptedException {
					Select sc = new Select(SelectDPRLost);
					Thread.sleep(500);
					Assert.assertFalse(SelectDPRLost.isDisplayed(),"SelectDPRLost is  displayed");
					Assert.assertFalse(SelectDPRLost.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("Dpr lost");
				}
				public void SelectDBTL() throws InterruptedException {
					Select sc = new Select(SelectDBTL);
					Thread.sleep(500);
					Assert.assertFalse(SelectDBTL.isDisplayed(),"SelectDBTL is  displayed");
					Assert.assertFalse(SelectDBTL.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("DBTL");
				}
				public void SelectCommercialSaleCash() throws InterruptedException {
					Select sc = new Select(SelectCommercialSaleCash);
					Thread.sleep(500);
					Assert.assertFalse(SelectCommercialSaleCash.isDisplayed(),"SelectCommercialSaleCash is  displayed");
					Assert.assertFalse(SelectCommercialSaleCash.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("CASHINHAND");
				}
				public void SelectRoundOff() throws InterruptedException {
					Select sc = new Select(SelectRoundOff);
					Thread.sleep(500);
					Assert.assertFalse(SelectRoundOff.isDisplayed(),"SelectRoundOff is  displayed");
					Assert.assertFalse(SelectRoundOff.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("ROUND OFF");
				}
				public void SelectCommercialSale() throws InterruptedException {
					Select sc = new Select(SelectCommercialSale);
					Thread.sleep(500);
					Assert.assertFalse(SelectCommercialSale.isDisplayed(),"SelectCommercialSale is  displayed");
					Assert.assertFalse(SelectCommercialSale.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("COMMERCIAL SALE");
				}
				public void SelectTVOUTSUSPENSE() throws InterruptedException {
					Select sc = new Select(SelectTVOUTSUSPENSE);
					Thread.sleep(500);
					Assert.assertFalse(SelectTVOUTSUSPENSE.isDisplayed(),"SelectTVOUTSUSPENSE is  displayed");
					Assert.assertFalse(SelectTVOUTSUSPENSE.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("SaleDebit");
				}
				public void SelectBPCLReceivable() throws InterruptedException {
					Select sc = new Select(SelectBPCLReceivable);
					Thread.sleep(500);
					Assert.assertFalse(SelectBPCLReceivable.isDisplayed(),"SelectBPCLReceivable is  displayed");
					Assert.assertFalse(SelectBPCLReceivable.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("Bpcl online receivable");
				}
				
				public void SelectDiscount() throws InterruptedException {
					Select sc = new Select(SelectDiscount);
					Thread.sleep(500);
					Assert.assertFalse(SelectDiscount.isDisplayed(),"SelectDiscount is  displayed");
					Assert.assertFalse(SelectDiscount.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("Discount");
				}
				public void Select14KgSaleDebit() throws InterruptedException {
					Select sc = new Select(Select14KgSaleDebit);
					Thread.sleep(500);
					Assert.assertFalse(Select14KgSaleDebit.isDisplayed(),"Select14KgSaleDebit is  displayed");
					Assert.assertFalse(Select14KgSaleDebit.isSelected());
					Thread.sleep(500);
					sc.selectByVisibleText("SaleDebit");
				}
				
				
				public void VerifyMyerpLCSubmitBtn() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(lcsubmitbtn.isEnabled(),"lcsubmitbtn form field is enabled");		 
					 Reporter.log("verifyMyerplcsubmitbtn", true);
					 lcsubmitbtn.click(); 
					 Thread.sleep(500);
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
               
				public void VerifyMyerpLCClearBtn() throws InterruptedException {
					Thread.sleep(500);
					 Assert.assertTrue(lcclearbtn.isEnabled(),"lcclearbtn form field is enabled");		 
					 Reporter.log("verifyMyerplcclearbtn", true);
					 lcclearbtn.click(); 
              }
}