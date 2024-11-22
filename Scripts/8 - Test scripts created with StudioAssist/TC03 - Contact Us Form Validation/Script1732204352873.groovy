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

/* Contact Us Form Validation
 *1. Open the browser to the https://demowebshop.tricentis.com/
 *2. Navigate to contact form page by clicking on the contact us link
 *3. Input a valid name, email, and enquiry fields, colleen james, colleen@aol.com, and "Sed ut perspiciatis unde omnis iste natus error sit voluptatem".
 *4. Click the "Submit" button.
 *5. Verify that a success message is displayed.
 **/
// Open the browser to the specified URL
WebUI.openBrowser('https://demowebshop.tricentis.com/')

// Click on the contact us link to navigate to the contact form page
WebUI.click(findTestObject('null'))

// Input valid name, email, and enquiry fields
WebUI.setText(findTestObject('null'), 'colleen james')

WebUI.setText(findTestObject('null'), 'colleen@aol.com')

WebUI.setText(findTestObject('null'), 'Sed ut perspiciatis unde omnis iste natus error sit voluptatem')

// Click the "Submit" button
WebUI.click(findTestObject('null'))

// Verify that a success message is displayed
WebUI.verifyTextPresent('Your enquiry has been successfully sent to the store owner.', false)

