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

WebUI.click(findTestObject('7. Apparel - Shoes/1. a_Apparel  Shoes'))

WebUI.click(findTestObject('7. Apparel - Shoes/shirt/1.a_2-next'))

WebUI.click(findTestObject('7. Apparel - Shoes/shirt/2.shirt-img'))

WebUI.selectOptionByValue(findTestObject('7. Apparel - Shoes/shirt/3. select_Shirt-size                                                                                                  Medium                                                                                                    La'), 
    '109', false)

WebUI.click(findTestObject('7. Apparel - Shoes/shirt/4. shirt-add-to-cart-button-10'))

WebUI.click(findTestObject('7. Apparel - Shoes/a12. Shopping cart'))

WebUI.click(findTestObject('7. Apparel - Shoes/a13. termsofservice'))

WebUI.click(findTestObject('7. Apparel - Shoes/a14. button_Checkout'))

WebUI.callTestCase(findTestCase('CallTestCase/4. newRegistrationMoneyOrder'), [:], FailureHandling.STOP_ON_FAILURE)

