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

WebUI.click(findTestObject('5. Checkout and register/1. button-1 register-button'))

// Import RandomStringUtils from Apache Commons Lang
// Generate random first name and last name
String firstName = RandomStringUtils.randomAlphabetic(5 // Generates a random string of 5 alphabetic characters for first name
    )

String lastName = RandomStringUtils.randomAlphabetic(7 // Generates a random string of 7 alphabetic characters for last name
    )

// Generate random email using first name and last name
String email = ((firstName.toLowerCase() + '.') + lastName.toLowerCase()) + '@example.com'

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

WebUI.click(findTestObject('5. Checkout and register/1.  register-continue-button'))

WebUI.click(findTestObject('5. Checkout and register/2. termsofservice'))

WebUI.click(findTestObject('5. Checkout and register/3. button_Checkout'))

WebUI.selectOptionByValue(findTestObject('4. Checkout as Guest/5. Select country'), '80', false)

WebUI.setText(findTestObject('4. Checkout as Guest/6. City'), 'Manchy')

WebUI.setText(findTestObject('4. Checkout as Guest/7. Address1'), 'Moss Grange')

WebUI.setText(findTestObject('4. Checkout as Guest/8. ZipPostalCode'), 'W1 7RJ')

WebUI.setText(findTestObject('4. Checkout as Guest/9. PhoneNumber'), '01612261085')

WebUI.click(findTestObject('4. Checkout as Guest/a10. new-address-next-step-button'))

WebUI.click(findTestObject('4. Checkout as Guest/a11.  new-address-next-step-button'))

WebUI.click(findTestObject('4. Checkout as Guest/a12. shipping-method-next-step-button'))

WebUI.click(findTestObject('4. Checkout as Guest/a13. creditCard'))

WebUI.click(findTestObject('4. Checkout as Guest/a15. payment-method-next-step-button'))

WebUI.selectOptionByValue(findTestObject('4. Checkout as Guest/a16. select_VisaMaster'), 'Visa', false)

WebUI.setText(findTestObject('4. Checkout as Guest/a17. CardholderName'), 'Baba Okon')

WebUI.setText(findTestObject('4. Checkout as Guest/a18. CardNumber'), '378282246310005')

WebUI.selectOptionByValue(findTestObject('4. Checkout as Guest/a19. select_day'), '4', false)

WebUI.selectOptionByValue(findTestObject('4. Checkout as Guest/a20. select_year'), '2029', false)

WebUI.setText(findTestObject('4. Checkout as Guest/a21. CardCode'), '213')

WebUI.click(findTestObject('4. Checkout as Guest/a22. payment-info-next-step-button'))

WebUI.click(findTestObject('4. Checkout as Guest/a24. confirm-order-next-step-button'))

WebUI.verifyTextPresent('Your order has been successfully processed!', false)

WebUI.closeBrowser()

