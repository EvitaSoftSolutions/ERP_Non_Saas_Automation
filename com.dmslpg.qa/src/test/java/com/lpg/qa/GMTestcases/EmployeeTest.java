package com.lpg.qa.GMTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lpg.qa.Base.LpgTestBase;
import com.lpg.qa.GMPages.Employee;


	public class EmployeeTest  extends LpgTestBase{

			WebDriver driver;
			   
			@BeforeClass
			public void setup() {
				driver=intializeBrowser("chrome");
			}
			
			@AfterClass
			public void teardown() {
			//	TestBase.driver.close();
			}
			
				
				
				@Test
				public void EmployeePageTest() throws InterruptedException {
					Employee e=new Employee(LpgTestBase.driver); 
					/*
					 * e.verifyMyerpagancycode(); e.verifyMyerpUserid(); e.verifyMyerpPassword();
					 * e.VerifyandClickonMyerpLoginBtn();
					 */
					e.setup(driver);
					e.VerifyMyerpMasterModule();
					e.VerifyMyerpGenralMasterModule();
					e.VerifyMyerpEmployeeForm();
					e.VerifyMyerpEmployeeFirstName();
					e.VerifyMyerpEmployeeLastName();
					e.ESelectCompany();
					e.setEmpPageGender("male");
					e.ESelectDesignation();
					e.VerifyMyerppersonalcontanctnumber();
				    e.VerifyMyerpoficialcontanctnumber();
				    e.VerifyMyerpEmailId();
				    e.VerifyMyerpAddress1();
				    e.VerifyMyerpSelectState();
				    e.VerifyMyerpSelectDistrict();
				    e.voidVerifyMyerpSelectTehsil();
				    e.VerifyMyerpEnterCity();
				    e.VerifyMyerpPincode();
				    e.VerifyMyerpBasicPay();
				    e.VerifyMyerpDOB();
				    e.VerifyMyerpJoiningDate();
				    e.VerifyMyerpEmployeeActiveCHK1();
				    e.VerifyMyerpEmployeeClearBtn();
				    
					e.VerifyMyerpEmployeeFirstName1();
					e.VerifyMyerpEmployeeLastName1();
					e.ESelectCompany1();
					e.setEmpPageGender1("male");
					e.ESelectDesignation1();
					e.VerifyMyerppersonalcontanctnumber();
				    e.VerifyMyerpoficialcontanctnumber();
				    e.VerifyMyerpEmailId();
				    e.VerifyMyerpAddress1();
				    e.VerifyMyerpSelectState();
				    e.VerifyMyerpSelectDistrict();
				    e.voidVerifyMyerpSelectTehsil();
				    e.VerifyMyerpEnterCity();
				    e.VerifyMyerpPincode();
				    e.VerifyMyerpBasicPay();
				    e.VerifyMyerpDOB();
				    e.VerifyMyerpJoiningDate();
				    e.VerifyMyerpEmployeeActiveCHK1();
					e.VerifyMyerpEmployeeSubmitBtn();
					e.VerifyMyerpEmployeeSubmitOKBtn();
					e.VerifyandClickonPSearchbar1();
					e.VerifyMyerpEmployeeEditBtn();
					e.VerifyMyerpEmployeeYesUpdateItBtn();
					e.VerifyMyerpEmployeeFirstName2();
					e.VerifyMyerpEmployeeLastName2();
					e.ESelectDesignation2();
					e.VerifyMyerpEmployeeUpdateBtn();
					e.VerifyMyerpEmployeeUpdateOKBtn();
					e.VerifyandClickonPSearchbar2();
					e.VerifyMyerpEmployeeExportBtn();
					
					e.VerifyMyerpEmployeeFirstName3();
					e.VerifyMyerpEmployeeLastName3();
					e.ESelectCompany3();
					e.setEmpPageGender3("male");
					e.ESelectDesignation3();
					e.VerifyMyerppersonalcontanctnumber3();
				    e.VerifyMyerpoficialcontanctnumber3();
				    e.VerifyMyerpEmailId3();
				    e.VerifyMyerpAddress3();
				    e.VerifyMyerpSelectState3();
				    e.VerifyMyerpSelectDistrict3();
				    e.voidVerifyMyerpSelectTehsil3();
				    e.VerifyMyerpEnterCity3();
				    e.VerifyMyerpPincode3();
				    e.VerifyMyerpBasicPay3();
				    e.VerifyMyerpDOB3();
				    e.VerifyMyerpJoiningDate3();
				    e.VerifyMyerpEmployeeActiveCHK3();
					e.VerifyMyerpEmployeeSubmitBtn3();
					e.VerifyMyerpEmployeeSubmitOKBtn3();
					e.VerifyandClickonPSearchbar3();
				
					e.VerifyMyerpEmployeeFirstName4();
					e.VerifyMyerpEmployeeLastName4();
					e.ESelectCompany4();
					e.setEmpPageGender4("male");
					e.ESelectDesignation4();
					e.VerifyMyerppersonalcontanctnumber4();
				    e.VerifyMyerpoficialcontanctnumber4();
				    e.VerifyMyerpEmailId4();
				    e.VerifyMyerpAddress4();
				    e.VerifyMyerpSelectState4();
				    e.VerifyMyerpSelectDistrict4();
				    e.voidVerifyMyerpSelectTehsil4();
				    e.VerifyMyerpEnterCity4();
				    e.VerifyMyerpPincode4();
				    e.VerifyMyerpBasicPay4();
				    e.VerifyMyerpDOB4();
				    e.VerifyMyerpJoiningDate4();
				    e.VerifyMyerpEmployeeActiveCHK4();
					e.VerifyMyerpEmployeeSubmitBtn4();
					e.VerifyMyerpEmployeeSubmitOKBtn4();
					e.VerifyandClickonPSearchbar4();
					
					e.VerifyMyerpEmployeeFirstName5();
					e.VerifyMyerpEmployeeLastName5();
					e.ESelectCompany5();
					e.setEmpPageGender5("male");
					e.ESelectDesignation5();
					e.VerifyMyerppersonalcontanctnumber5();
				    e.VerifyMyerpoficialcontanctnumber5();
				    e.VerifyMyerpEmailId5();
				    e.VerifyMyerpAddress5();
				    e.VerifyMyerpSelectState5();
				    e.VerifyMyerpSelectDistrict5();
				    e.voidVerifyMyerpSelectTehsil5();
				    e.VerifyMyerpEnterCity5();
				    e.VerifyMyerpPincode5();
				    e.VerifyMyerpBasicPay5();
				    e.VerifyMyerpDOB5();
				    e.VerifyMyerpJoiningDate5();
				    e.VerifyMyerpEmployeeActiveCHK5();
					e.VerifyMyerpEmployeeSubmitBtn5();
					e.VerifyMyerpEmployeeSubmitOKBtn5();
					e.VerifyandClickonPSearchbar5();
					e.VerifyMyerpEmployeeExportBtn();
				    
				    

					
					
					
				   } 
			}





