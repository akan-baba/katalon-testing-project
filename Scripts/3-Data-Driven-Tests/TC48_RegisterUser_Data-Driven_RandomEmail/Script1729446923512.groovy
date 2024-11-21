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

// Function to generate random email
String generateRandomEmail() {
	def randomNumber = new Random().nextInt(10000) // Generate random number for uniqueness
	return "user" + randomNumber + "@example.com"  // Generate email like user1234@example.com
}

// Get total number of rows from the Excel data file
def totalRows = findTestData('Data Files/registration').getRowNumbers()

// Loop through each row in the Excel file (for first name and last name)
for (def rowNumber = 1; rowNumber <= totalRows; rowNumber++) {
	try {
		// Get first name and last name from the Excel data file
		String firstName = findTestData('Data Files/registration').getValue('first name', rowNumber)
		String lastName = findTestData('Data Files/registration').getValue('last name', rowNumber)
		
		// Generate a random email
		String email = generateRandomEmail()
		
		// Step 1: Open browser
		WebUI.openBrowser('')
		
		// Step 2: Navigate to the registration page
		WebUI.navigateToUrl('https://demowebshop.tricentis.com/')
		
		// Step 3: Click on the register link/button
		WebUI.waitForElementClickable(findTestObject('2. User-Registration/1. a_Register'), 10)
		WebUI.click(findTestObject('2. User-Registration/1. a_Register'))
		
		// Step 4: Select gender (use a reliable locator)
		WebUI.waitForElementClickable(findTestObject('2. User-Registration/2. input_Gender'), 10)
		WebUI.click(findTestObject('2. User-Registration/2. input_Gender'))
		
		// Step 5: Set first name from the data file
		WebUI.setText(findTestObject('2. User-Registration/4. input_First name'), firstName)
		
		// Step 6: Set last name from the data file
		WebUI.setText(findTestObject('2. User-Registration/5. input_Last name'), lastName)
		
		// Step 7: Set the randomly generated email
		WebUI.setText(findTestObject('2. User-Registration/6. input_Email'), email)
		
		// Step 8: Set and confirm the password (password is fixed as 'red123')
		WebUI.setText(findTestObject('2. User-Registration/7. input_Password'), 'red123')
		WebUI.setText(findTestObject('2. User-Registration/8. input_Confirm password'), 'red123')
		
		// Step 9: Click on the register button
		WebUI.click(findTestObject('2. User-Registration/9. input__register-button'))
		
		// Step 10: Verify the registration was successful
		WebUI.waitForElementVisible(findTestObject('2. User-Registration/10. div_SuccessMessage'), 10)
		WebUI.verifyTextPresent('Your registration completed', false)
	} catch (Exception e) {
		// Log error and continue with the next iteration
		WebUI.comment("Error during registration for row $rowNumber: " + e.message)
	} finally {
		// Step 11: Close browser after registration
		WebUI.closeBrowser()
	}
}
