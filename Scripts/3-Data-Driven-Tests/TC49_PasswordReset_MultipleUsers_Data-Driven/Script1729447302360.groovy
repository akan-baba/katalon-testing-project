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

// Get total number of rows from the 'password' data file
def totalRows = findTestData('Data Files/password').getRowNumbers()

// Loop through each user in the Excel file
for (def rowNumber = 1; rowNumber <= totalRows; rowNumber++) {
    // Get email, old password, and new password from the 'password' Excel data file
    String email = findTestData('Data Files/password').getValue('email', rowNumber)

    String oldPassword = findTestData('Data Files/password').getValue('password', rowNumber)

    String newPassword = findTestData('Data Files/password').getValue('password', rowNumber // Use correct column if available
        )

    // Step 1: Open browser
    WebUI.openBrowser('')

    // Step 2: Navigate to the website login page
    WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

    // Step 3: Click on the login link
    WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

    // Step 4: Enter the email and old password from the 'password' Excel file
    WebUI.setText(findTestObject('1. User-Login/2. input_Email'), email)

    WebUI.setText(findTestObject('1. User-Login/3. input_Password'), oldPassword)

    // Step 5: Click on the login button
    WebUI.click(findTestObject('1. User-Login/6.  login-button'))

    // Step 6: Verify successful login by checking for the displayed email address
    WebUI.verifyTextPresent(email, false)

    // Step 7: Click on the email displayed on the page to access account settings (or profile)
    WebUI.click(findTestObject('1. User-Login/a11. a_EmailLink') // Assuming this is the Test Object for the email link
        )

    // Step 8: Navigate to the change password section
    WebUI.click(findTestObject('1. User-Login/a12. a_Change password'))

    // Step 9: Enter the old password, new password, and confirm new password
    WebUI.setText(findTestObject('1. User-Login/a12. OldPassword'), oldPassword)

    WebUI.setText(findTestObject('1. User-Login/a13. NewPassword'), newPassword)

    WebUI.setText(findTestObject('1. User-Login/a14. ConfirmNewPassword'), newPassword)

    // Step 10: Submit the password change request
    WebUI.click(findTestObject('1. User-Login/a15. change-password-button'), FailureHandling.STOP_ON_FAILURE)

    // Step 11: Verify that the password was successfully changed
    WebUI.verifyTextPresent('Password was changed', false)

    // Step 12: Close the browser after each iteration
    WebUI.closeBrowser()
}

