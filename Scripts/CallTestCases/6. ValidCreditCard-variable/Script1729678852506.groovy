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

// List of common first names
String[] firstNames = ['Adam', 'Mary', 'John', 'Emily', 'Michael', 'Sarah', 'David', 'Jessica', 'Daniel', 'Laura']

// List of common last names
String[] lastNames = ['Smith', 'Johnson', 'Williams', 'Brown', 'Jones', 'Miller', 'Davis', 'Garcia', 'Rodriguez', 'Martinez']

// Create a Random object
Random random = new Random()

// Randomly pick a first name and a last name from the lists
String firstName = firstNames[random.nextInt(firstNames.length)]

String lastName = lastNames[random.nextInt(lastNames.length)]

// Generate the email using the selected first and last name
String email = ((firstName.toLowerCase() + '.') + lastName.toLowerCase()) + '@example.com'

WebUI.click(findTestObject('4. Checkout as Guest/1. checkout-as-guest-button'))

WebUI.setText(findTestObject('4. Checkout as Guest/2. FirstName'), 'John')

WebUI.setText(findTestObject('4. Checkout as Guest/3. LastName'), 'Doe')

WebUI.setText(findTestObject('4. Checkout as Guest/4. Email'), email)

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

WebUI.setText(findTestObject('4. Checkout as Guest/a17. CardholderName'), GlobalVariable.cardHolderName)

WebUI.setText(findTestObject('4. Checkout as Guest/a18. CardNumber'), GlobalVariable.cardNumber)

WebUI.selectOptionByValue(findTestObject('4. Checkout as Guest/a19. select_day'), GlobalVariable.selectedDay, false)

WebUI.selectOptionByValue(findTestObject('4. Checkout as Guest/a20. select_year'), GlobalVariable.selectedYear, false)

WebUI.setText(findTestObject('4. Checkout as Guest/a21. CardCode'), GlobalVariable.cardCode)

WebUI.click(findTestObject('4. Checkout as Guest/a22. payment-info-next-step-button'))

WebUI.click(findTestObject('4. Checkout as Guest/a24. confirm-order-next-step-button'))

WebUI.verifyTextPresent('Your order has been successfully processed!', false)

WebUI.closeBrowser()


