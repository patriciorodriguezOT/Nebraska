package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.Click

import internal.GlobalVariable

public class Page_Licensure_Unit_License_Application_Other_License {


	private TestObject dropdownHasBeenDeniedRight			= findTestObject('Page_Licensure Unit License Application/Other Licenses/span_Select Has been denied the right-arrow')
	private TestObject selectHasBeenDeniedRightNoOpt		= findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Has been denied the right- No')
	private TestObject selectHasBeenDeniedRightYesOpt		= findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Has been denied the right- Yes')
	private TestObject dropdownHasBeenDeniedIssuance		= findTestObject('Page_Licensure Unit License Application/Other Licenses/span_Select Has been denied issuance-arrow')
	private TestObject selectHasBeenDeniedIssuanceNoOpt		= findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Has been denied issuance - No')
	private TestObject selectHasBeenDeniedIssuanceYesOpt	= findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Has been denied issuance - Yes')
	private TestObject dropdownDoesApplicantHold			= findTestObject('Page_Licensure Unit License Application/Other Licenses/span_Select Does applicant hold-arrow')
	private TestObject selectDoesApplicantHoldNoOpt			= findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Does applicant hold - No')
	private TestObject selectDoesApplicantHoldYesOpt		= findTestObject('Page_Licensure Unit License Application/Other Licenses/li_Does applicant hold - Yes')
	private TestObject buttonNext							= findTestObject('Page_Licensure Unit License Application/Other Licenses/button_Next')





	@Keyword
	def selectHasBeenDeniedRight (String answer) {
		if (answer == 'Yes') {
			WebUI.waitForElementVisible(dropdownHasBeenDeniedRight, 0)

			WebUI.click(dropdownHasBeenDeniedRight)

			WebUI.click(selectHasBeenDeniedRightYesOpt)
		} else {
			WebUI.waitForElementVisible(dropdownHasBeenDeniedRight, 0)

			WebUI.click(dropdownHasBeenDeniedRight)

			WebUI.click(selectHasBeenDeniedRightNoOpt)
		}
	}


	@Keyword
	def selectHasBeenDeniedIssuance (String answer) {
		if (answer == 'Yes') {
			WebUI.waitForElementVisible(dropdownHasBeenDeniedIssuance, 0)

			WebUI.click(dropdownHasBeenDeniedIssuance)

			WebUI.click(selectHasBeenDeniedIssuanceYesOpt)
		} else {
			WebUI.waitForElementVisible(dropdownHasBeenDeniedIssuance, 0)

			WebUI.click(dropdownHasBeenDeniedIssuance)

			WebUI.click(selectHasBeenDeniedIssuanceNoOpt)
		}
	}


	@Keyword
	def selectDoesApplicantHold (String answer) {
		if (answer == 'Yes') {
			WebUI.waitForElementVisible(dropdownDoesApplicantHold, 0)

			WebUI.click(dropdownDoesApplicantHold)

			WebUI.click(selectDoesApplicantHoldYesOpt)
		} else {
			WebUI.waitForElementVisible(dropdownDoesApplicantHold, 0)

			WebUI.click(dropdownDoesApplicantHold)

			WebUI.click(selectDoesApplicantHoldNoOpt)
		}
	}


	@Keyword
	def clickOnNextButton () {
		WebUI.waitForElementVisible(buttonNext, 0)

		WebUI.click(buttonNext)
	}
}
