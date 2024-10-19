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

// Click on the register link/button
WebUI.click(findTestObject('2. User-Registration/1. a_Register'))

// Select gender (you can modify this part based on the actual selector for male/female)
WebUI.click(findTestObject('2. User-Registration/2. input_Gender'))

WebUI.setText(findTestObject('2. User-Registration/4. input_First name'), 'John')

WebUI.setText(findTestObject('2. User-Registration/5. input_Last name'), 'Doe')

WebUI.setText(findTestObject('2. User-Registration/6. input_Email'), 'colleen@aol.com')

WebUI.setText(findTestObject('2. User-Registration/7. input_Password'), 'red123')

WebUI.setText(findTestObject('2. User-Registration/8. input_Confirm password'), 'red123')

WebUI.click(findTestObject('2. User-Registration/9. input__register-button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('The specified email already exists', false)

