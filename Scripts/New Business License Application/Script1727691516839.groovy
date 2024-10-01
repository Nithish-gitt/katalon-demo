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

CustomKeywords.'customKeywords.LoginToColumbia.LogintoColumbia'(username, password)

WebUI.click(findTestObject('Page_Recently Viewed  Accounts  Salesforce/div_App Launcher'))

WebUI.setText(findTestObject('Page_Recently Viewed  Accounts  Salesforce/input_Search apps and items_input-149'), 'Applications')

WebUI.click(findTestObject('Page_Recently Viewed  Accounts  Salesforce/div_Applications'))

WebUI.click(findTestObject('Page_Recently Viewed  Applications  Salesforce/a_New'))

WebUI.click(findTestObject('Page_New Application  Salesforce/span_Business License'))

WebUI.click(findTestObject('Page_New Application  Salesforce/button_Next'))

Type = WebUI.getText(findTestObject('Page_New Application Business License  Salesforce/button_Initial Application'))

Type = WebUI.verifyMatch(Type, 'Initial Application', false)

WebUI.setText(findTestObject('Page_New Application Business License  Salesforce/input_Applicant Help Info_combobox-input-372'), 
    'Nithish')

WebUI.click(findTestObject('Page_New Application Business License  Salesforce/span_Nithish V'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_New Application Business License  Salesforce/Location type'), 10)

WebUI.click(findTestObject('Page_New Application Business License  Salesforce/Location type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_New Application Business License  Salesforce/span_Commercial'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_New Application Business License  Salesforce/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

cancelText = WebUI.getText(findTestObject('Page_New Application Business License  Salesforce/Cancel text'), FailureHandling.STOP_ON_FAILURE)

//NewApplicationText = WebUI.getText(findTestObject('Page_New Application Business License  Salesforce/New Application Text'), 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyMatch(NewApplicationText, 'Application', false)
WebUI.verifyMatch(cancelText, 'Please close the current tab.', false)

WebUI.closeBrowser()

