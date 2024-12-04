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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.mouseOver(findTestObject('6. Electronics/1. a_Electronics'))

WebUI.click(findTestObject('6. Electronics/2. a_Cell phones'))

WebUI.click(findTestObject('6. Electronics/3. img'))

WebUI.clearText(findTestObject('6. Electronics/4.EnteredQuantity'))

WebUI.setText(findTestObject('6. Electronics/4.EnteredQuantity'), '2')

WebUI.click(findTestObject('6. Electronics/5. add-to-cart-button-43'))

WebUI.click(findTestObject('6. Electronics/6. Shopping cart'))

WebUI.click(findTestObject('6. Electronics/7. termsofservice'))

WebUI.click(findTestObject('6. Electronics/8. button_Checkout'))

WebUI.callTestCase(findTestCase('a10 - CallTestCases/1. CheckoutasGuestPageCreditCard'), [:], FailureHandling.STOP_ON_FAILURE)

