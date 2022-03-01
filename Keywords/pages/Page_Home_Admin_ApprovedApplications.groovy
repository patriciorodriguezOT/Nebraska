package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

import internal.GlobalVariable

public class Page_Home_Admin_ApprovedApplications {

	@Keyword
	def clickOnSearchRecordButton () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/span_SearchBigBtn'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/span_SearchBigBtn'))
	}


	@Keyword
	def enterSearchCriteria (String Criteria) {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/input_Search Criteria'), 0)

		WebUI.sendKeys(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/input_Search Criteria'), Criteria)
	}


	@Keyword
	def selectFirstNameForSearch () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/a_Select Search Criteria Arrow'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/a_Select Search Criteria Arrow'))

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/li_First Name'))
	}


	@Keyword
	def clickOnSearchButton () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/input_SearchSmallBtn'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/input_SearchSmallBtn'))
	}


	@Keyword
	def clickOnOpenLink () {
		WebUI.waitForElementVisible(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/a_Open'), 0)

		WebUI.click(findTestObject('Page_Home_Admin_VisualVault/Home_Section/Page_Approved Applications/a_Open'))
	}
}
