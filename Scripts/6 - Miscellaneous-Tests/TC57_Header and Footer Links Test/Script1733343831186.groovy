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

// Open browser and navigate to the homepage
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com')

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/3. a_Sitemap'))

WebUI.verifyTextPresent('Sitemap', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/4. a_Shipping  Returns'))

WebUI.verifyTextPresent('Shipping & Returns', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/5. a_Privacy Notice'))

WebUI.verifyTextPresent('Privacy policy', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/6. a_Conditions of Use'))

WebUI.verifyTextPresent('Conditions of use', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/7. a_About us'))

WebUI.verifyTextPresent('About Us', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/8. a_Contact us'))

WebUI.verifyTextPresent('Contact Us', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/9. a_Search'))

WebUI.verifyTextPresent('Search', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a10. a_News'))

WebUI.verifyTextPresent('News', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a11. a_Blog'))

WebUI.verifyTextPresent('Blog', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a12. a_Recently viewed products'))

WebUI.verifyTextPresent('Recently viewed products', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a13. a_Register'))

WebUI.verifyTextPresent('Register', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a14. a_Log in'))

WebUI.verifyTextPresent('Welcome, Please Sign In!', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a15. span_Shopping cart'))

WebUI.verifyTextPresent('Your Shopping Cart is empty!', false)

WebUI.click(findTestObject('a11. Miscellaneous/2. NavigationLinks/a16. span_Wishlist'))

WebUI.verifyTextPresent('The wishlist is empty!', false)

