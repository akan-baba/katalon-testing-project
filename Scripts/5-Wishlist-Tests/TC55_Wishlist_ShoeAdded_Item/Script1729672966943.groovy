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

WebUI.click(findTestObject('7. Apparel - Shoes/3. imgShoes'))

WebUI.click(findTestObject('a10. Wishlist/2. shoes-wishlist-button-28'))

WebUI.click(findTestObject('a10. Wishlist/4. span_Wishlist'))

'Verification that shoe has been add to the wishlist'
WebUI.verifyTextPresent('Blue and green Sneaker', false)

WebUI.click(findTestObject('a10. Wishlist/5. Remove_removefromcart'))

WebUI.click(findTestObject('a10. Wishlist/5. Qty_updatecart'))

'Verification that shoe has been removed from wishlist'
WebUI.verifyTextNotPresent('Blue and green Sneaker', false)

