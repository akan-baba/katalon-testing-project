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

WebUI.mouseOver(findTestObject('3. Computers/Desktop/1. a_Computers'))

WebUI.click(findTestObject('3. Computers/Desktop/2. a_Desktops'))

WebUI.click(findTestObject('3. Computers/Desktop/3. add-to-cart-button'))

WebUI.click(findTestObject('3. Computers/Desktop/HDD/320GB-attribute_72_3_20'))

WebUI.click(findTestObject('3. Computers/Desktop/processor/medium-attribute_72_5_18'))

WebUI.click(findTestObject('3. Computers/Desktop/RAM/4GB-attribute_72_6_19'))

WebUI.setText(findTestObject('3. Computers/Desktop/4. enteredQuantity'), '2')

WebUI.click(findTestObject('3. Computers/Desktop/5. add-to-cart-button-72'))

WebUI.click(findTestObject('3. Computers/Desktop/6. span_Shopping cart'))

WebUI.selectOptionByValue(findTestObject('3. Computers/Desktop/7. select_Select country'), '80', false)

WebUI.click(findTestObject('3. Computers/Desktop/8. input_termsofservice'))

WebUI.click(findTestObject('3. Computers/Desktop/9. button_Checkout'))

WebUI.callTestCase(findTestCase('a10 - CallTestCases/3. NewRegistrationCreditCard'), [:], FailureHandling.STOP_ON_FAILURE)

