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

/* Validate Newsletter Subscription
 *1. Open the browser and navigate to the homepage: `https://demowebshop.tricentis.com/`.
 *2. Navigate to the subscription section and enter a valid email address in the subscription field (e.g., `testuser@example.com`).
 *3. Click the "Subscribe" button.
 *4. Verify that a success message is displayed, confirming the newsletter subscription.
 **/
// Open the browser and navigate to the homepage
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Navigate to the subscription section and enter a valid email address
WebUI.setText(findTestObject('a11. Miscellaneous/6. Newsletter/1. input_Sign_up_field'), 'testuser@yahoo.com')

// Click the "Subscribe" button
WebUI.click(findTestObject('a11. Miscellaneous/6. Newsletter/2. input_Sign up_button'))

// Verify that a success message is displayed
WebUI.verifyTextPresent('Thank you for signing up! A verification email has been sent. We appreciate your interest.', false)

