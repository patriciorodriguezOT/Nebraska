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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import generic.generic_functions as Generic_functions


String chars = 'abcdefghijklmnopqrstuvwxyz'
String nums = '123456780'
String DOB = Generic_functions.randomPastDate(18250, 5840)


// Set Random Variables
String randomFirstName = Generic_functions.randomString(chars, 5)
String randomLastName = Generic_functions.randomString(chars, 5)
String randomSSN = Generic_functions.randomString(nums, 9)
GlobalVariable.G_Applicant_FirstName = ('PR' + randomFirstName)
GlobalVariable.G_Applicant_LastName = ('Automation' + randomLastName)
GlobalVariable.G_Applicant_Email = (('pruebas.onetree+Applicant' + randomFirstName) + '@gmail.com')


// Open Browser
WebUI.openBrowser(GlobalVariable.G_Registration_Form)


// Enter Individual Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeFirstName'(GlobalVariable.G_Applicant_FirstName)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeLastName'(GlobalVariable.G_Applicant_LastName)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeDOB'(DOB)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completePlaceOfBirth'(GlobalVariable.G_Applicant_PlaceOfBirth)



// Enter Mailing Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectCountryEEUU'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeZipCode'(GlobalVariable.G_Applicant_ZipCode)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeAddressLine'(GlobalVariable.G_Applicant_AddressLine)



// Select Yes on dropdown "Is the Physical address the same?"
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectSameAddress'('Yes')



// Enter Identification Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.selectUSCitizen'('Yes')

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeSSN'(randomSSN)



// Enter PhoneNumber Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completePrimaryPhoneNumber'(GlobalVariable.G_Applicant_PhoneNumber)



// Enter Email Address Information
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeEmailAddress'(GlobalVariable.G_Applicant_Email)

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.completeRetypeEmailAddress'(GlobalVariable.G_Applicant_Email)



// Click on Submit and complete Registration
CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.clickOnSubmitBtn'()

CustomKeywords.'pages.Page_Licensure_Unit_User_Registration.verifyRegistrationCompletedSuccessfully'()



// Close Browser
WebUI.closeBrowser()

