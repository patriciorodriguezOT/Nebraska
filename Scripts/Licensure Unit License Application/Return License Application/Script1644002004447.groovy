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
import generic.generic_functions as Generic_functions
import generic.common_functions as Common_functions
import pages.Page_Login as loginPage



String messageTitle = 'Checklist Tasks'
String messageBody = 'A total of 2 checklist(s) not completed/approved were reset. Please click "Create Letter" to be redirected to Letter Management to begin generating a letter regarding this returned application.'
// Go to Login Page
WebUI.openBrowser(GlobalVariable.G_Nebraska_Link)

// Login with LU Staff user
CustomKeywords.'pages.Page_Login.login'(GlobalVariable.G_LU_Staff_UserName, GlobalVariable.G_LU_Staff_Pass)


// Go to Applications in Progress
CustomKeywords.'pages.Page_Home_Admin.clickOnApplicationsInProcess'()


// Search Applicant by First Name
CustomKeywords.'pages.Page_Home_Admin_ApplicationsInProgress.clickOnSearchRecordButton'()

CustomKeywords.'pages.Page_Home_Admin_ApplicationsInProgress.selectFirstNameForSearch'()

CustomKeywords.'pages.Page_Home_Admin_ApplicationsInProgress.enterSearchCriteria'(GlobalVariable.G_Applicant_FirstName)

CustomKeywords.'pages.Page_Home_Admin_ApplicationsInProgress.clickOnSearchButton'()


// Click on Review Link on the License Application
CustomKeywords.'pages.Page_Home_Admin_ApplicationsInProgress.clickOnReviewLink'()



// Move to Next Window
int currentTab = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentTab + 1)


// Go to Checklist tab of the Form
CustomKeywords.'pages.Page_Licensure_Unit_License_Application.clickOnChecklistTab'()


// Request More Info for Task Task "Citizenship Documentation"
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist.clickOnOpenCitizenshipDocumentation'()

WebUI.switchToWindowIndex(currentTab + 2)

CustomKeywords.'pages.Page_Licensure_Unit_Checklist_Task.clickOnApproveTab'()

CustomKeywords.'pages.Page_Licensure_Unit_Checklist_Task.clickOnRequestMoreInfoButton'()

CustomKeywords.'pages.Page_Licensure_Unit_Checklist_Task.clickOnCloseButton'()

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()

System.sleep(2000)

WebUI.switchToWindowIndex(currentTab + 1)


// Request More Info for Task "Transcripts"
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Checklist.clickOnOpenTranscript'()

WebUI.switchToWindowIndex(currentTab + 2)

CustomKeywords.'pages.Page_Licensure_Unit_Checklist_Task.clickOnApproveTab'()

CustomKeywords.'pages.Page_Licensure_Unit_Checklist_Task.clickOnRequestMoreInfoButton'()

CustomKeywords.'pages.Page_Licensure_Unit_Checklist_Task.clickOnCloseButton'()

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()

System.sleep(2000)

WebUI.switchToWindowIndex(currentTab + 1)



// Go to Manage Tab
CustomKeywords.'pages.Page_Licensure_Unit_License_Application.clickOnManageTab'()

CustomKeywords.'pages.Page_Licensure_Unit_License_Application.setApplicationDeficient'()

CustomKeywords.'pages.ModalDialog.clickOnReturnApplicationBtn'()

CustomKeywords.'pages.ModalDialog.verifyBody'(messageBody)

CustomKeywords.'pages.ModalDialog.verifyTitle'(messageTitle)

CustomKeywords.'pages.ModalDialog.clickOnCloseButton'()


CustomKeywords.'pages.Page_Licensure_Unit_License.verifyStatus'('Waiting Applicant Action')



// Close License Application
CustomKeywords.'pages.Page_Licensure_Unit_License_Application_Manage.clickOnCancelAndClose'()

CustomKeywords.'pages.ModalDialog.clickOnOkaybutton'()

System.sleep(2000)


// Close browser
WebUI.closeBrowser()


