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

/* Validate User Logout
 *1. Open the browser enter url 'https://demowebshop.tricentis.com/'.
 *2. Click on the "Log in" link in the header.
 *3. Complete login form with email 'colleen@aol.com' and password 'red123'
 *4. Verify that the user is login.
 *5. Click logout link
 *5. Verify user is logged out
 **/
// Open the browser and navigate to the specified URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Click on the "Log in" link in the header
WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

// Complete login form with email 'colleen@aol.com' and password 'red123'
WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'colleen@aol.com')

WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'red123')

WebUI.click(findTestObject('1. User-Login/6.  login-button'))

// Verify that the user is logged in
WebUI.verifyTextPresent('colleen@aol.com', false)

// Click on the logout link
WebUI.click(findTestObject('1. User-Login/7. a_Log out'))

// Verify user is logged out
WebUI.verifyTextNotPresent('colleen@aol.com', false)

