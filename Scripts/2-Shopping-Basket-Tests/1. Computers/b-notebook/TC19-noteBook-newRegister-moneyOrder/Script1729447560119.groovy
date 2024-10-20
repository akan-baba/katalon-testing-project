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

WebUI.mouseOver(findTestObject('3. Computers/noteBook/1. a_Computers'))

WebUI.click(findTestObject('3. Computers/noteBook/2. a_Notebooks'))

WebUI.click(findTestObject('3. Computers/noteBook/4. img'))

WebUI.clearText(findTestObject('3. Computers/noteBook/5. EnteredQuantity'))

WebUI.setText(findTestObject('3. Computers/noteBook/5. EnteredQuantity'), '2')

WebUI.click(findTestObject('3. Computers/noteBook/6. add-to-cart-button-31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3. Computers/noteBook/7. Shopping cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3. Computers/noteBook/8. termsofservice'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3. Computers/noteBook/9. Checkout'))

WebUI.callTestCase(findTestCase('CallTestCase/4. newRegistrationMoneyOrder'), [:], FailureHandling.STOP_ON_FAILURE)

