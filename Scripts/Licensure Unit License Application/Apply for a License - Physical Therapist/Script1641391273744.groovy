import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import generic.generic_functions as Generic_functions
import generic.common_functions as common_functions

/*
GlobalVariable.G_Applicant_Email = 'pruebas.onetree+Applicantfyyic@gmail.com'
GlobalVariable.G_Applicant_FirstName = 'PRwslzg' 
GlobalVariable.G_Applicant_LastName = 'Automationdmfxg' 
*/

int currentTab
String aka = 'PR'
String placeOfBirth = 'Alaska'
String schoolName = 'PR Test'
String titleMessageRecord = 'Record Saved'
String printName = 'PR Automation Test'


// Open Browser
WebUI.openBrowser(GlobalVariable.G_Nebraska_Link)



// Common_functions.login(GlobalVariable.G_Applicant_Email, GlobalVariable.G_ApplicantPass)
CustomKeywords.'pages.Page_Login.login'(GlobalVariable.G_Applicant_Email, GlobalVariable.G_ApplicantPass)



// Click on Apply for a License Link
System.sleep(10000)

CustomKeywords.'pages.Page_Applicant_Home.clickOnApplyForALicense'()



// Move to the next Window
currentTab = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentTab + 1)



// Select Physical Therapy on Professional License
//WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/License Type/span_Professioanl License'), 0)
//WebUI.click(findTestObject('Page_Licensure Unit License Application/License Type/span_Professioanl License'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/License Type/li_Physical Therapy'))
CustomKeywords.'pages.Page_License_Information.selectPhisicalTherapyProfessionalLicense'()



// Select Physical Therapist on Professional License Type
//WebUI.click(findTestObject('Page_Licensure Unit License Application/License Type/span_Professioanl License Type'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/License Type/License Type for Physical Therapy/li_Physical Therapist'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/License Type/button_Next'))
CustomKeywords.'pages.Page_License_Information.selectPhisicalTherapistProfessionalLicenseType'()

CustomKeywords.'pages.Page_License_Information.clickOnNextButton'()


// Answer previous questions ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/YES-NO question-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/li_No'))
CustomKeywords.'pages.Page_Questions_Previous_License_Application.answerYesNoQuestion'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/button_Next'))
CustomKeywords.'pages.Page_Questions_Previous_License_Application.clickOnNextButtonm'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/YES-NO question-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/li_No'))
CustomKeywords.'pages.Page_Questions_Previous_License_Application.answerYesNoQuestion'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/button_Next'))
CustomKeywords.'pages.Page_Questions_Previous_License_Application.clickOnNextButtonm'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Question/ConfirmAnswer/button_Yes, these answers are correct'))
CustomKeywords.'pages.Page_Questions_Previous_License_Application.clickOnConfirmAnswers'()



// Acknowledge ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Instructions/button_Acknowledge'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application.clickOnAcknowledgeBtn'()



// Complete Demographics information ---
//WebUI.check(findTestObject('Page_Licensure Unit License Application/Demographics/input_Experience Check-box'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.checkCheckboxExperience'()

//WebUI.sendKeys(findTestObject('Page_Licensure Unit License Application/Demographics/input_AKA'), 'PR')
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.enterAKA'(aka)
	
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Demographics/span_Is the Physical address the same_arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Demographics/li_Yes_Same Address'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.selectSameAddres'('Yes')
	
//WebUI.verifyElementAttributeValue(findTestObject('Page_Licensure Unit License Application/Demographics/input_Place of Birth'), 'value', 'Alaska', 0)
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.verifyPlaceOfBirth'(placeOfBirth)
	
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Demographics/span_Select Spouse of member USAF'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Demographics/li_No spouse USAF'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.selectSpouseMemberUSAF'('No')

//Select NO
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.selectProvisionalLicense'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Demographics/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.clickOnNextButton'()



// Complete Application Fees information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Application Fees/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_ApplicationFees.clickOnNextButton'()



// Complete US Citizenship-Lawful information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/US Citizenship-Lawful Presence/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_US_Citizenshi_Lawful_Presence.clickOnNextButton'()



// Complete Examination information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Examination/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Examination.clickOnNextButton'()



// Complete Education information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Education/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Education.clickOnNextButton'()



// Complete Other License information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/span_Select Has been denied the right-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Has been denied the right- No'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.selectHasBeenDeniedRight'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/span_Select Has been denied issuance-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Has been denied issuance - No'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.selectHasBeenDeniedIssuance'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/span_Select Does applicant hold-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Does applicant hold - No'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.selectDoesApplicantHold'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Other Licenses/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.clickOnNextButton'()



// Complete Convictions information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Convictions/span_Select Is on probation-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Convictions/li_Is on probation - No'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Convictions.selectIsOnProbation'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Convictions/span_Select Has been convicted-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Convictions/li_Has been convicted - No'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Convictions.selectHasBeenConvicted'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Convictions/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Convictions.clickOnNextButton'()



// Complete Practice Prior to License information ---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Practice Prior to License/span_Select Has practiced without license-arrow'))
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Practice Prior to License/li_Has practiced without license - No'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Practice_Prior_To_License.selectHasPracticedWithoutLicense'('No')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Practice Prior to License/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Practice_Prior_To_License.clickOnNextButton'()



//Checklist Management---
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/input_Open Related Form_btnChecklistTaskUpload'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnUploadButton'()

common_functions.uploadFilePath('C:\\Users\\patricior-ot\\Documents\\VisualVault\\Nebraska\\Document Empty.txt')

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnNextButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Acknowledge'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnAcknowledgeButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Open Related Form'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOpenRelatedFormButton'()

WebUI.switchToWindowIndex(currentTab + 2)
	
Thread.sleep(5000)



// Complete School Information
//WebUI.sendKeys(findTestObject('Page_Licensure Unit License Application/Education Information FORM/input__Name Of School'), 'School Name PR Test')
CustomKeywords.'pages.Page_Licensure_Unit_Education_History.enterSchoolName'(schoolName)

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Education Information FORM/span_Select Education Type-s'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Education Information FORM/li_Diploma'), FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'pages.Page_Licensure_Unit_Education_History.selectEducationTypeDiploma'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Education Information FORM/button_Save and Continue'), FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'pages.Page_Licensure_Unit_Education_History.clickOnSaveAndContinue'()

//WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Education Information FORM/h5_Record Saved'),  'Record Saved')
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Education Information FORM/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_Education_History.verifyRecordSavedCorrectly'(titleMessageRecord)

WebUI.switchToWindowIndex(currentTab + 1)

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnNextButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Acknowledge'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnAcknowledgeButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Acknowledge'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnAcknowledgeButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Checklist Management/button_Ok'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()


// Complete Attestation Information ---
//if (WebUI.verifyElementVisible(findTestObject('Page_Licensure Unit License Application/Attestation/input_I am a Citizen of the US'), FailureHandling.OPTIONAL)) {
//WebUI.click(findTestObject('Page_Licensure Unit License Application/Attestation/input_I am a Citizen of the US'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.checkIAmACitizen'()

//WebUI.sendKeys(findTestObject('Page_Licensure Unit License Application/Attestation/input_Print Name'), 'PR Test')
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.enterPrintName'(printName)

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Attestation/input__Signature'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.checkSignature'()

//WebUI.click(findTestObject('Page_Licensure Unit License Application/Attestation/button_Next'))
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.clickOnNextButton'()

System.sleep(15000)

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.clickOnNextButtonModalDialog'()



// Complete Pay Information ---
if (WebUI.verifyElementVisible(findTestObject('Page_Licensure Unit License Application/Pay/button_Pay Now'), 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Licensure Unit License Application/Pay/button_Pay Now'))

    WebUI.switchToWindowIndex(currentTab + 2)

    WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit Shopping Cart/span_Select Payment Type'), 
        0)

    WebUI.waitForElementClickable(findTestObject('Page_Licensure Unit Shopping Cart/button_Cancel and Close'), 
        0)

    Thread.sleep(5000)

    WebUI.click(findTestObject('Page_Licensure Unit Shopping Cart/button_Cancel and Close'))

    WebUI.click(findTestObject('Page_Licensure Unit Shopping Cart/button_Return to Form'))

    WebUI.click(findTestObject('Page_Licensure Unit Shopping Cart/span_Select Payment Type'))

    WebUI.click(findTestObject('Page_Licensure Unit Shopping Cart/li_Credit Card'))

    WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit Shopping Cart/button_Pay Online'), 
        0)

    WebUI.click(findTestObject('Page_Licensure Unit Shopping Cart/button_Pay Online'))

    WebUI.sendKeys(findTestObject('Page_Licensure Unit Shopping Cart/input_Cardholder Name_FIRSTNAME'), 
        'pr')

    WebUI.sendKeys(findTestObject('Page_Licensure Unit Shopping Cart/input_Cardholder Name_LASTNAME'), 
        'test')

    WebUI.sendKeys(findTestObject('Page_Licensure Unit Shopping Cart/input_Card Number_ACCT'), 
        CreditCard_Number)

    WebUI.sendKeys(findTestObject('Page_Licensure Unit Shopping Cart/input__EXPMONTH'), 
        ExpiredMonth_CreditCard)

    WebUI.sendKeys(findTestObject('Page_Licensure Unit Shopping Cart/input__EXPYEAR'), 
        ExpiredYear_CreditCard)

    WebUI.sendKeys(findTestObject('Page_Licensure Unit Shopping Cart/input_Security Code_CSC'), 
        SecurityCode_CreditCard)

    WebUI.click(findTestObject('Page_Licensure Unit Shopping Cart/button_Submit'))

    WebUI.acceptAlert()

    WebUI.switchToWindowIndex(currentTab + 1)

    WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Pay/Message Fee Paid/h5_Fees Paid'), 
        0)

    WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Pay/Message Fee Paid/h5_Fees Paid'), 
        'Fees Paid')

    WebUI.click(findTestObject('Page_Licensure Unit License Application/Pay/Message Fee Paid/button_Payment Susscessful Ok'))
}

if (WebUI.verifyElementVisible(findTestObject('Page_Licensure Unit License Application/Pay/button_Submit'),	FailureHandling.OPTIONAL)) {
	
		WebUI.verifyElementText(findTestObject('Page_Licensure Unit License Application/Pay/kendo-Dropdown-Status'), 'New')
	
		WebUI.click(findTestObject('Page_Licensure Unit License Application/Pay/button_Submit'))
	}

Thread.sleep(5000)

WebUI.waitForElementVisible(findTestObject('Page_Licensure Unit License Application/Pay/Message Application Submitted Successfully/h5_Application Submitted'), 
    0)

WebUI.click(findTestObject('Page_Licensure Unit License Application/Pay/Message Application Submitted Successfully/button_Ok'))

System.sleep(2000)

WebUI.closeBrowser()

