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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

// Import RandomStringUtils from Apache Commons Lang
// Generate random first name and last name
String firstName = RandomStringUtils.randomAlphabetic(5 // Generates a random string of 5 alphabetic characters for first name
    )

String lastName = RandomStringUtils.randomAlphabetic(7 // Generates a random string of 7 alphabetic characters for last name
    )

// Generate random email using first name and last name
String email = ((firstName.toLowerCase() + '.') + lastName.toLowerCase()) + '@example.com'

WebUI.openBrowser('')

// Navigate to the registration page
WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Click on the register link/button
WebUI.click(findTestObject('2. User-Registration/1. a_Register'))

// Select gender (you can modify this part based on the actual selector for male/female)
WebUI.click(findTestObject('2. User-Registration/2. input_Gender'))

// Set randomly generated first name
WebUI.setText(findTestObject('2. User-Registration/4. input_First name'), firstName)

// Set randomly generated last name
WebUI.setText(findTestObject('2. User-Registration/5. input_Last name'), lastName)

// Set randomly generated email
WebUI.setText(findTestObject('2. User-Registration/6. input_Email'), email)

// Set the password
WebUI.setText(findTestObject('2. User-Registration/7. input_Password'), 'red123')

// Confirm the password
WebUI.setText(findTestObject('2. User-Registration/8. input_Confirm password'), 'red123')

// Click on the register button
WebUI.click(findTestObject('2. User-Registration/9. input__register-button'))

WebUI.verifyTextPresent('Your registration completed', false)

