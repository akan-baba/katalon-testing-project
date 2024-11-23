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

// Open the browser
WebUI.openBrowser('')

// Navigate to the Demo Web Shop login page
WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Wait for the login link/button to be clickable and interact with it
WebUI.waitForElementClickable(findTestObject('1. User-Login/1. a_Log in'), 10)
WebUI.click(findTestObject('1. User-Login/1. a_Log in')) // Breakpoint - 1

// Input the email address
WebUI.waitForElementVisible(findTestObject('1. User-Login/2. input_Email'), 10)
String email = 'colleen@aol.com'
WebUI.setText(findTestObject('1. User-Login/2. input_Email'), email)

// Input the password
WebUI.waitForElementVisible(findTestObject('1. User-Login/3. input_Password'), 10) // Breakpoint - 2
String password = 'red123'
WebUI.setText(findTestObject('1. User-Login/3. input_Password'), password)

// Click the login button
WebUI.waitForElementClickable(findTestObject('1. User-Login/6.  login-button'), 10)
WebUI.click(findTestObject('1. User-Login/6.  login-button'))

// Verify the email is displayed on the page after successful login
WebUI.waitForPageLoad(10)
WebUI.verifyTextPresent(email, false)

// Log out of the application
WebUI.waitForElementClickable(findTestObject('1. User-Login/7. a_Log out'), 10)
WebUI.click(findTestObject('1. User-Login/7. a_Log out'))

// Close the browser
WebUI.closeBrowser()


