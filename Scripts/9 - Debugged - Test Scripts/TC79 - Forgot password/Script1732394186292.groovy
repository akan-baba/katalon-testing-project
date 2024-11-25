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

WebUI.openBrowser('') // Breakpoint 1

WebUI.navigateToUrl('https://demowebshop.tricentis.com/') //Breakpoint 1: Ensures the correct URL loads.

WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

WebUI.click(findTestObject('1. User-Login/5. a_Forgot password')) // Breakpoint 2: Waits for clink password link

WebUI.setText(findTestObject('1. User-Login/8. input_Your email address'), 'baba-ikpa@genesisone.org.uk') //Breakpoint 3: Waits for email input.
WebUI.click(findTestObject('1. User-Login/9. recover-send-email-btn'))

WebUI.verifyTextPresent('Email with instructions has been sent to you.', false) // Breakpoint 4: Verifies the presence of the mesage

WebUI.closeBrowser() // Breakpoint 5


