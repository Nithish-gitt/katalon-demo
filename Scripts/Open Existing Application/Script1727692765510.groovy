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

WebUI.click(findTestObject('Page_Recently Viewed  Applications  Salesforce/button_Select a List View Applications'))

WebUI.click(findTestObject('Page_Recently Viewed  Applications  Salesforce/a_Open Applications'))

WebUI.setText(findTestObject('Page_Open Applications  Applications  Salesforce/input_Search this list_Application__c-search-input'), 
    'APP-24-00094')

WebUI.scrollToElement(findTestObject('Page_Open Applications  Applications  Salesforce/a_APP-24-00094'), 10)

WebUI.click(findTestObject('Page_Open Applications  Applications  Salesforce/a_APP-24-00094'))

ApplicationNumber = WebUI.getText(findTestObject('Page_APP-24-00094  Application  Salesforce/slot_APP-24-00094'))

WebUI.verifyMatch(ApplicationNumber, 'APP-24-00094', false)

WebUI.closeBrowser()

