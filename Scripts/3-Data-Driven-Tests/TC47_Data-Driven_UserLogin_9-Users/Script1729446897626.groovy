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

// Define the test data
// Get the total number of rows from the data file
def totalRows = findTestData('Data Files/names').getRowNumbers()

// Loop through each row in the data file
for (def rowNumber = 1; rowNumber <= totalRows; rowNumber++) {
    // Retrieve the email and password from the data file for the current row
    String email = findTestData('Data Files/names').getValue('Email', rowNumber)

    String password = findTestData('Data Files/names').getValue('Password', rowNumber)

    // Step 1: Open the browser
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

    // Step 3: Click on the login link/button
    WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

    // Step 4: Enter email from the data file
    WebUI.setText(findTestObject('1. User-Login/2. input_Email'), email)

    // Step 5: Enter password from the data file
    WebUI.setText(findTestObject('1. User-Login/3. input_Password'), password)

    WebUI.click(findTestObject('1. User-Login/6.  login-button'))

    // Step 7: Verify that the email is present on the page (indicative of successful login)
    WebUI.verifyTextPresent(email, false)

    // Step 8: Click on the logout button after a successful login
    WebUI.click(findTestObject('1. User-Login/7. a_Log out'))

    // Step 9: Close the browser before moving to the next row (user)
    WebUI.closeBrowser()
}

