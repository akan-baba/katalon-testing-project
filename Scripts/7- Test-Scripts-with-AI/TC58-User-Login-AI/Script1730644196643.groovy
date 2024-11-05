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

/* Write a Katalon Studio test case to perform the following steps.
 * 1. Open browser to the URL https://demowebshop.tricentis.com/
 * 2. Click the login button
 * 3. Fill in the email fields
 * 4. Fill in the password fields
 * 5. Click the login button
 * 6. Verify login
 * 7. Close the browser
 * */
// Open browser to the URL https://demowebshop.tricentis.com/
WebUI.openBrowser('https://demowebshop.tricentis.com/')

// Click the login button
WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

// Fill in the email fields
WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'colleen@aol.com')

// Fill in the password fields
WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'red123')

// Click the login button
WebUI.click(findTestObject('1. User-Login/6.  login-button'))
// Verify login (Add verification steps here)
WebUI.verifyTextPresent('colleen@aol.com', false)

WebUI.click(findTestObject('1. User-Login/7. a_Log out'))

// Close the browser
WebUI.closeBrowser()

