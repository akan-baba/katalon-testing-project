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
/* User Registration with Random Email in the Test Case
 *1. Open the browser and navigate to the registration page: `https://demowebshop.tricentis.com/register`.
 *3. Click the register link
 *2. Select the "Gender" radio button (e.g., "Male" or "Female").
 *3. Input a valid first name 'Jane' field.
 *4. Input a valid last name 'Doe' field.
 *5. Generate a random email address (e.g., "user[random_number]@example.com") directly in the test case and input it in the "Email" field.
 *6. Input a valid password "red123" field.
 *7. Confirm the password by re-entering it in the "red123" field.
 *8. Click the "Register" button.
 *9. Verify that the registration is successful by checking for the confirmation message: "Your registration completed".
 **/ // Import RandomStringUtils for generating random strings
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

// Generate random first name and last name
String firstName = RandomStringUtils.randomAlphabetic(5 // Generates a random string of 5 alphabetic characters
    )

String lastName = RandomStringUtils.randomAlphabetic(7 // Generates a random string of 7 alphabetic characters
    )

// Generate random email using first name and last name
String email = ((firstName.toLowerCase() + '.') + lastName.toLowerCase()) + '@example.com'

// Open the browser and navigate to the registration page
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/register')

WebUI.click(findTestObject('2. User-Registration/1. a_Register'))

WebUI.click(findTestObject('2. User-Registration/2. input_Gender'))

WebUI.setText(findTestObject('2. User-Registration/4. input_First name'), firstName)

WebUI.setText(findTestObject('2. User-Registration/5. input_Last name'), lastName)

WebUI.setText(findTestObject('2. User-Registration/6. input_Email'), email)

println('Generated Email: ' + email)

// Input the password
WebUI.setText(findTestObject('2. User-Registration/7. input_Password'), 'red123')

// Confirm the password
WebUI.setText(findTestObject('2. User-Registration/8. input_Confirm password'), 'red123')

// Click the "Register" button
WebUI.click(findTestObject('2. User-Registration/9. input__register-button'))

// Verify the registration success message
WebUI.verifyTextPresent('Your registration completed', false)

// Close the browser
WebUI.closeBrowser()

