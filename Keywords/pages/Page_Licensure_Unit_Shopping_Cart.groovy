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

public class Page_Licensure_Unit_Shopping_Cart {


	private TestObject buttonRefresh						= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/button_Refresh')
	private TestObject opt1FeeDescription					= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/div_Fee Description Opt1')
	private TestObject opt1FeeAmount						= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/td_Fee Amount Opt1')
	private TestObject opt1TotalToPay						= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/td_Total to Pay Opt1')
	private TestObject opt1FeeId							= findTestObject('Page_Licensure Unit Shopping Cart/Repeating Raw Control/div_Fee Id Opt1')





	@Keyword
	def clickOnRefreshbutton () {
		WebUI.waitForElementVisible(buttonRefresh, 0)

		WebUI.click(buttonRefresh)
	}


	@Keyword
	def verifyOpt1OnRRC (String feeDescription, String feeAmount, String totalToPay, String feeID) {
		WebUI.waitForElementVisible(opt1FeeDescription, 0)

		String currentFeeDescription = WebUI.getText(opt1FeeDescription)

		String currentFeeAmount = WebUI.getText(opt1FeeAmount)

		String currentTotalToPay = WebUI.getText(opt1TotalToPay)

		String currentFeeId = WebUI.getText(opt1FeeId)

		WebUI.verifyMatch(currentFeeDescription, feeDescription, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(currentFeeAmount, feeAmount, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(currentTotalToPay, totalToPay, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(currentFeeId, feeID, false, FailureHandling.CONTINUE_ON_FAILURE)
	}



	@Keyword
	def test () {
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
	}
}
