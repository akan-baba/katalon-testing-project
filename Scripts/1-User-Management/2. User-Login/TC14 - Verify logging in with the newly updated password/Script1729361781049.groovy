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

// Import necessary libraries
// Test case: Verify logging in with newly updated password
// Step 1: Open browser and navigate to the login page
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'james-doe@aol.com')

WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'red123')

WebUI.click(findTestObject('1. User-Login/6.  login-button'))

WebUI.verifyTextPresent('james-doe@aol.com', false)

WebUI.click(findTestObject('1. User-Login/a11. a_EmailLink'))

WebUI.click(findTestObject('1. User-Login/a12. a_Change password'))

WebUI.setText(findTestObject('1. User-Login/a12. OldPassword'), 'red123')

WebUI.setText(findTestObject('1. User-Login/a13. NewPassword'), 'red123')

WebUI.setText(findTestObject('1. User-Login/a14. ConfirmNewPassword'), 'red123')

WebUI.click(findTestObject('1. User-Login/a15. change-password-button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Password was changed', false)

