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

/* Login with Invalid Credentials Validation
 *1. Open the browser and navigate to the login page: `https://demowebshop.tricentis.com/`.
 *2. Click the login link
 *3. Input an invalid email address in the "Email" field (e.g., `invaliduser@example.com`).
 *4. Input an invalid password in the "Password" field (e.g., `wrongpassword`).
 *5. Click the "Log in" button.
 *6. Verify error message text is displayed 'Login was unsuccessful. Please correct the errors and try again.'.
 **/
// Open the browser and navigate to the login page
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Click the login link
WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

// Input an invalid email address in the "Email" field
WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'invaliduser@example.com')

// Input an invalid password in the "Password" field
WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'wrongpassword')

// Click the "Log in" button
WebUI.click(findTestObject('1. User-Login/6.  login-button'))

// Verify error message text is displayed 'Login was unsuccessful. Please correct the errors and try again.'
WebUI.verifyTextPresent('Login was unsuccessful. Please correct the errors and try again.', false)

