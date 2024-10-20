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

WebUI.click(findTestObject('8. Jewellery/1. a_Jewellery'))

WebUI.click(findTestObject('8. Jewellery/2. createOwn.img'))

WebUI.selectOptionByValue(findTestObject('8. Jewellery/3. select_material'), '45', false)

WebUI.setText(findTestObject('8. Jewellery/4. input__lenght-in-cm'), '18')

WebUI.click(findTestObject('8. Jewellery/5. input_Pendant_product'))

WebUI.click(findTestObject('8. Jewellery/8. add-to-cart-button--1'))

WebUI.click(findTestObject('8. Jewellery/a11. Shopping cart'))

WebUI.click(findTestObject('8. Jewellery/ia12. termsofservice'))

WebUI.click(findTestObject('8. Jewellery/a13. button_Checkout'))

WebUI.callTestCase(findTestCase('CallTestCase/4. newRegistrationMoneyOrder'), [:], FailureHandling.STOP_ON_FAILURE)

