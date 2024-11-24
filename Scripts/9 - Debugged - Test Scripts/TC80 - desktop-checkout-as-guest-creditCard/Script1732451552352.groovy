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

// Open the browser and navigate to the application
WebUI.openBrowser('') // Breakpoint 1: Confirm the browser opens successfully

WebUI.navigateToUrl('https://demowebshop.tricentis.com/') // Breakpoint 2: Ensure the correct URL loads

// Interact with the "Computers" menu
WebUI.waitForElementClickable(findTestObject('3. Computers/Desktop/1. a_Computers'), 10)
WebUI.mouseOver(findTestObject('3. Computers/Desktop/1. a_Computers')) // Breakpoint 3: Verify mouse hover works

// Navigate to "Desktops"
WebUI.click(findTestObject('3. Computers/Desktop/2. a_Desktops')) // Breakpoint 4: Confirm click action navigates to Desktops

// Add a product to the cart
WebUI.click(findTestObject('3. Computers/Desktop/3. add-to-cart-button')) // Breakpoint 5: Confirm the "Add to Cart" button works

// Select HDD attribute
WebUI.waitForElementClickable(findTestObject('3. Computers/Desktop/HDD/320GB-attribute_72_3_20'), 10)
WebUI.click(findTestObject('3. Computers/Desktop/HDD/320GB-attribute_72_3_20')) // Breakpoint 6: Inspect HDD selection

// Select processor
WebUI.click(findTestObject('3. Computers/Desktop/processor/medium-attribute_72_5_18'))

// Select RAM
WebUI.click(findTestObject('3. Computers/Desktop/RAM/4GB-attribute_72_6_19'))

// Set the quantity of the product
String quantity = '2' // Inspect the quantity value in the Variables Tab
WebUI.setText(findTestObject('3. Computers/Desktop/4. enteredQuantity'), quantity) // Breakpoint 7: Confirm quantity is set

// Add to cart
WebUI.click(findTestObject('3. Computers/Desktop/5. add-to-cart-button-72'))

// Go to the shopping cart
WebUI.click(findTestObject('3. Computers/Desktop/6. span_Shopping cart')) // Breakpoint 8: Ensure cart contains items

// Select shipping country
WebUI.selectOptionByValue(findTestObject('3. Computers/Desktop/7. select_Select country'), '80', false)

// Agree to terms and conditions
WebUI.click(findTestObject('3. Computers/Desktop/8. input_termsofservice'))

// Proceed to checkout
WebUI.click(findTestObject('3. Computers/Desktop/9. button_Checkout')) // Breakpoint 9: Verify navigation to checkout page

// Call the test case for the payment process
WebUI.callTestCase(findTestCase('CallTestCases/1. CheckoutasGuestPageCreditCard'), [:], FailureHandling.STOP_ON_FAILURE) // 
