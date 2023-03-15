package DomesticCashCollectionTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lpg.qa.Base.LpgTestBase;
import Deliverycashcollection.DomesticCash;



public class DomesticCashTest extends LpgTestBase{

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//	LpgTestBase.driver.close();
	}	

	@Test
	public void DomesticCashPageTest() throws InterruptedException {
		DomesticCash pp=new  DomesticCash(LpgTestBase.driver); 

		pp.setup(driver);
	  /*pp.VerifyandClickonMyerpGodownTransactionModule();
		pp.VerifyandClickonMyerpGTPartialPurchaseForm();
		pp.VerifyandClickonMyerpGTPPInvoiceNumber();
		pp.VerifyandClickonMyerpGTPPErvNumber();
		pp.VerifyMyerpPPSelectGodown();
		pp.VerifyMyerpPPSelectVehicle();
		pp.VerifyandClickonMyerpGTPPProduct();
		pp.VerifyandClickonMyerpGTPPQauntity();
		//pp.VerifyandClickonMyerpGTPPLost();
		//pp.VerifyandClickonMyerpGTPPDefective();
		pp.VerifyandClickonMyerpGTPPSubmitBtn();

		pp.VerifyandClickonMyerpGTAccepteLoadForm();
		pp.VerifyandClickonMyerpGTAccepteLoadInvoceNum();
		pp.VerifyandClickonMyerpGTALsubmitbtn();
		pp.VerifyandClickonMyerpGTInvoiceNumber();
		pp.VerifyandClickonMyerpALCompanyInvoiceDate();
		pp.VerifyMyerpALSelectCompany();
		pp.VerifyMyerpALSelectSupplier();
		pp.VerifyandClickonMyerpALAccountTextbox();
		pp.VerifyandClickonMyerpALSubmitBtn();
		
		pp.VerifyandClickonMyerpGodownTransactionModule1();
		pp.VerifyandClickonMyerpGTDomesticDeliveryForm();
		pp.VerifyMyerpTVSelectProduct();
		pp.VerifyandClickonMyerpGTDDSearchBtn();
		pp.VerifyandClickonMyerpGTDDFullCyl();
		pp.VerifyandClickonMyerpGTDDEmptyCyl();
		pp.VerifyandClickonMyerpGTDDESubmitBtn();
		
		
		pp.VerifyandClickonMyerpDeliveryCashCollectionModule();
		pp.VerifyandClickonMyerpDomesticCashForm();
		pp.VerifyandClickonMyerpDCCalender();
		pp.VerifyandClickonDCMyerpGetDataBtn();
		pp.VerifyandClickonMyerpDCSelectBtn();
		pp.VerifyandClickonMyerpDCInvoiceNumber();
	//	pp.VerifyandClickonMyerpDCConsumerNumber();
		pp.VerifyandClickonMyerpDCCashReceivedAmount();
		pp.VerifyandClickonMyerpDCSaveBtn();
		
		*/
		
		 /* pp.VerifyandClickonMyerpDCCancelBtn(); pp.VerifyandClickonMyerpDCSelectBtn();
		 * pp.VerifyandClickonMyerpDCInvoiceNumber();
		 * pp.VerifyandClickonMyerpDCConsumerNumber();
		 * pp.VerifyandClickonMyerpDCCashReceivedAmount();
		 */
		
		 pp.VerifyandClickonMyerpGodownTransactionModule2();
		 pp.VerifyandClickonMyerpGTERVForm();
		 pp.VerifyandClickonMyerpSumitERVBtn();
		/* pp.VerifyandClickonMyerpXMIERV();
		 pp.VerifyMyerpERVSelectGodown();
		 pp.VerifyMyerpERVVehicleNumber();
		 pp.VerifyandClickonMyerpEProductTextBox();
		 pp.VerifyandClickonMyerpSoundQantityTextBox();
		 pp.VerifyandClickonMyerpDefective();*/
		 pp.VerifyandClickonMyerpSubmitBtn();
		 
	}
}
