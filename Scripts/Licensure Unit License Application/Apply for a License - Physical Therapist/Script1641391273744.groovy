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
CustomKeywords.'pages.Page_License_Information.selectPhisicalTherapyProfessionalLicense'()



// Select Physical Therapist on Professional License Type
CustomKeywords.'pages.Page_License_Information.selectPhisicalTherapistProfessionalLicenseType'()

CustomKeywords.'pages.Page_License_Information.clickOnNextButton'()


// Answer previous questions ---
CustomKeywords.'pages.Page_Questions_Previous_License_Application.answerYesNoQuestion'('No')

CustomKeywords.'pages.Page_Questions_Previous_License_Application.clickOnNextButtonm'()

CustomKeywords.'pages.Page_Questions_Previous_License_Application.answerYesNoQuestion'('No')

CustomKeywords.'pages.Page_Questions_Previous_License_Application.clickOnNextButtonm'()

CustomKeywords.'pages.Page_Questions_Previous_License_Application.clickOnConfirmAnswers'()



// Acknowledge ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application.clickOnAcknowledgeBtn'()



// Complete Demographics information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.checkCheckboxExperience'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.enterAKA'(aka)
	
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.selectSameAddres'('Yes')
	
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.verifyPlaceOfBirth'(placeOfBirth)
	
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.selectSpouseMemberUSAF'('No')

//Select NO
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.selectProvisionalLicense'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Demographics.clickOnNextButton'()



// Complete Application Fees information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_ApplicationFees.clickOnNextButton'()



// Complete US Citizenship-Lawful information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_US_Citizenshi_Lawful_Presence.clickOnNextButton'()



// Complete Examination information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Examination.clickOnNextButton'()



// Complete Education information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Education.clickOnNextButton'()



// Complete Other License information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.selectHasBeenDeniedRight'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.selectHasBeenDeniedIssuance'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.selectDoesApplicantHold'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Other_License.clickOnNextButton'()



// Complete Convictions information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Convictions.selectIsOnProbation'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Convictions.selectHasBeenConvicted'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Convictions.clickOnNextButton'()



// Complete Practice Prior to License information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Practice_Prior_To_License.selectHasPracticedWithoutLicense'('No')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Practice_Prior_To_License.clickOnNextButton'()



//Checklist Management---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnUploadButton'()

common_functions.uploadFilePath('C:\\Users\\patricior-ot\\Documents\\VisualVault\\Nebraska\\Document Empty.txt')

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnNextButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnAcknowledgeButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOpenRelatedFormButton'()

WebUI.switchToWindowIndex(currentTab + 2)
	
Thread.sleep(5000)



// Complete School Information
CustomKeywords.'pages.Page_Licensure_Unit_Education_History.enterSchoolName'(schoolName)

CustomKeywords.'pages.Page_Licensure_Unit_Education_History.selectEducationTypeDiploma'()

CustomKeywords.'pages.Page_Licensure_Unit_Education_History.clickOnSaveAndContinue'()

CustomKeywords.'pages.Page_Licensure_Unit_Education_History.verifyRecordSavedCorrectly'(titleMessageRecord)

WebUI.switchToWindowIndex(currentTab + 1)

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnNextButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnAcknowledgeButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnAcknowledgeButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist_Management.clickOnOkDialogButton'()


// Complete Attestation Information ---
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.checkIAmACitizen'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.enterPrintName'(printName)

CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Attestation.checkSignature'()

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

