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

/* Search Functionality Validation
 *1. Open the browser and enter url https://demowebshop.tricentis.com/.
 *2. Input a valid product name in the search bar 'Elite Desktop PC'.
 *3. Click the "Search" button.
 *4. Verify that search results are displayed.
  **/
// Open the browser and enter the URL https://demowebshop.tricentis.com/
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// Input a valid product name in the search bar 'Elite Desktop PC'
WebUI.setText(findTestObject('a11. Miscellaneous/2. NavigationLinks/2. search-field'), 'Elite Desktop PC')

// Click the "Search" button
WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/2. search-box-button'))

// Verify that search results are displayed
WebUI.verifyTextPresent('Elite Desktop PC', false)

