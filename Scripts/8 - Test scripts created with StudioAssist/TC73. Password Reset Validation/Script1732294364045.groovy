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

/* Password Reset Validation
 *1. Open the browser enter url https://demowebshop.tricentis.com/.
 *2. Click the login link and login page is displayed.
 *3. Click the Forgot password? link
 *4. Input a valid email address.
 *5. Click the "Reset Password" button.
 *6. Verify that a password reset confirmation message is displayed.
 **/
// Open the browser and navigate to the specified URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Click the login link to navigate to the login page
WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

// Click the "Forgot password?" link
WebUI.click(findTestObject('1. User-Login/5. a_Forgot password'))

// Input a valid email address
WebUI.setText(findTestObject('1. User-Login/8. input_Your email address'), 'test@example.com')

// Click the "Reset Password" button
WebUI.click(findTestObject('1. User-Login/9. recover-send-email-btn'))

// Verify that a password reset confirmation message is displayed
WebUI.verifyTextPresent('Email with instructions has been sent to you.', false)

