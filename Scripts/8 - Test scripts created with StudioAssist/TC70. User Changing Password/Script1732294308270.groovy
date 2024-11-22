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

/* Change Password Validation
 *1. Open the browser and navigate to the login page: `https://demowebshop.tricentis.com/login`.
 *2. Click login link
 *3. Log in with valid credentials 'james-doe@aol.coml and red123'
 *4. Click "My Account" link after login.
 *5. Click the "Change password" link from the left navigation menu.
 *6. Input the current "rred123" field.
 *7. Enter a new password in the "red123" field.
 *8. Confirm the new password by re-entering it in the "red123" field.
 *9. Click the "Change password" button.
 *10. Verify text success message.
 **/
// Open the browser and navigate to the login page
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/login')

// Click login link
WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

// Log in with valid credentials 'james-doe@aol.com' and 'red123'
WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'james-doe@aol.com')

WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'red123')

WebUI.click(findTestObject('1. User-Login/6.  login-button'))

// Click "My Account" link after login
WebUI.click(findTestObject('a11. Miscellaneous/5. ChangePassword/1. My account'))

// Click the "Change password" link from the left navigation menu
WebUI.click(findTestObject('a11. Miscellaneous/5. ChangePassword/2. Change password'))

// Input the current password in the "Current password" field
WebUI.setText(findTestObject('a11. Miscellaneous/5. ChangePassword/3. OldPassword'), 'red123')

// Enter a new password in the "New password" field
WebUI.setText(findTestObject('a11. Miscellaneous/5. ChangePassword/4. NewPassword'), 'red123')

// Confirm the new password by re-entering it in the "Confirm new password" field
WebUI.setText(findTestObject('a11. Miscellaneous/5. ChangePassword/5. ConfirmNewPassword'), 'red123')

// Click the "Change password" button
WebUI.click(findTestObject('a11. Miscellaneous/5. ChangePassword/6. Change-password-button'))

// Verify text success message
WebUI.verifyTextPresent('Password was changed', false)

