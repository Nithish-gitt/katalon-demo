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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://columbiacountyga--uat.sandbox.my.site.com/columbiaportal/s/login/')

WebUI.setText(findTestObject('Page_Login/div_Email'), username)

WebUI.setText(findTestObject('Page_Login/div_Password'), password)

WebUI.click(findTestObject('Page_Login/button_Log in'))

String currentUrl = WebUI.getUrl()

if (currentUrl.contains('columbiaportal')) {
    println('The URL contains the specific text.')

    assert true
} else {
    println('The URL does not contain the specific text.')

    assert false
}

WebUI.click(findTestObject('Page_Home/button_Licenses'))

WebUI.click(findTestObject('Page_Home/a_New License Application'))

WebUI.click(findTestObject('Page_License Applications/button_Start New Application'))

WebUI.click(findTestObject('Page_License Applications/label_Business License'))

WebUI.click(findTestObject('Page_License Applications/button_Next'))

stage = WebUI.getText(findTestObject('Page_License Applications/lightning-progress-step_Registered Businesses - Current StageRegistered Businesses'))

WebUI.verifyMatch(stage, 'License Type - Current Stage', false)

WebUI.click(findTestObject('Page_License Applications/button_Next'))

WebUI.click(findTestObject('Page_License Applications/span_MassageTherapy_slds-radio_faux'))

WebUI.click(findTestObject('Page_License Applications/button_Next'))

WebUI.click(findTestObject('Page_License Applications/button_--None--'))

WebUI.click(findTestObject('Page_License Applications/span_Commercial'))

WebUI.setText(findTestObject('Page_License Applications/input__Address of business'), '459')

WebUI.click(findTestObject('Page_License Applications/input__Address of business'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_License Applications/lightning-base-combobox-formatted-text_459 Park W Dr, Grovetown, GA 30813,'))

WebUI.setText(findTestObject('Page_License Applications/input__Property_Owner_Name'), 'testUser')

WebUI.setText(findTestObject('Page_License Applications/textarea__property owner address'), 'Address')

WebUI.click(findTestObject('Page_License Applications/button_Next'))

WebUI.setText(findTestObject('Page_License Applications/textarea__input-385'), 'Description')

WebUI.click(findTestObject('Page_License Applications/button_Next'))

WebUI.setText(findTestObject('Page_License Applications/input__Number_of_full_time_employees'), '10')

WebUI.setText(findTestObject('Page_License Applications/input_FTE of part time employees_FTE_of_part_time_employees_X'), 
    '5')

WebUI.click(findTestObject('Page_License Applications/button_Next'))

relatedPartiesText = WebUI.getText(findTestObject('Page_License Applications/strong_Related Parties'))

WebUI.verifyMatch(relatedPartiesText, 'Related Parties', false)

WebUI.setText(findTestObject('Page_Related Parties Details/input_First Name_firstName'), 'Joe')

WebUI.setText(findTestObject('Page_Related Parties Details/input_Last Name_lastName'), 'Richards')

WebUI.selectOptionByValue(findTestObject('Page_Related Parties Details/select_--None--RelatedOwnerContactOtherContractorLicensee'), 
    'ApplicationContactTypePicklist.Contact', false)

WebUI.setText(findTestObject('Page_Related Parties Details/input_Phone_input-497'), '6322589654')

WebUI.setText(findTestObject('Page_Related Parties Details/input_Email_input-500'), 'Joe@gmail.com')

WebUI.click(findTestObject('Page_License Applications/button_Next'))

stage = WebUI.getText(findTestObject('Page_License Applications/lightning-progress-step_Registered Businesses - Current StageRegistered Businesses'))

WebUI.verifyMatch(stage, 'Confirmation - Current Stage', false)

WebUI.scrollToElement(findTestObject('Page_License Applications/button_Next'), 0)

WebUI.click(findTestObject('Page_License Applications/button_Next'))

WebUI.click(findTestObject('Page_Related Parties Details/span_Acknowledgement_slds-checkbox_faux'))

