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

/* User Login Validation
 *1. Open the browser and navigate to the login page.
 *2. Click the login link
 *3. Input a valid email and password.
 *4. Click the "Login" button.
 *5. Verify that the user is login.
 **/
// This script was generated using Katalon StudioAssist (AI)
// Open the browser and navigate to the login page
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Click the login link
WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

// Input a valid email and password
WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'colleen@aol.com')

WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'red123')

// Click the "Login" button
WebUI.click(findTestObject('1. User-Login/6.  login-button'))

// Verify that the user is logged in
WebUI.verifyTextPresent('colleen@aol.com', false)

