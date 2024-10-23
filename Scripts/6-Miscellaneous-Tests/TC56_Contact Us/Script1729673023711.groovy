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

WebUI.click(findTestObject('a11. Miscellaneous/a. Contact Us/1. a_Contact us'))

WebUI.setText(findTestObject('a11. Miscellaneous/a. Contact Us/2. FullName'), 'Jane Doe')

WebUI.setText(findTestObject('a11. Miscellaneous/a. Contact Us/3. Email'), 'jane-doe@aol.com')

WebUI.setText(findTestObject('a11. Miscellaneous/a. Contact Us/4. Enter_Enquiry'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.click(findTestObject('a11. Miscellaneous/a. Contact Us/5. Send-email'))

WebUI.verifyTextPresent('Your enquiry has been successfully sent to the store owner.', false)

