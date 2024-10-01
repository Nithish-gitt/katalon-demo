package customKeywords

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

public class LoginToColumbia {

	@Keyword
	def LogintoColumbia(String username,String password) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://columbiacountyga--uat.sandbox.my.salesforce.com/')
		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Page_Login  Salesforce/input_Username_username'), username)

		WebUI.setText(findTestObject('Page_Login  Salesforce/input_Password_pw'), password)

		WebUI.click(findTestObject('Page_Login  Salesforce/input_Password_Login'))

		String currentUrl = WebUI.getUrl()

		if (currentUrl.contains('lightning')) {
			println('The URL contains the specific text.')
			assert true
		}
		else {
			println('The URL does not contain the specific text.')
			assert false
		}
	}
}
