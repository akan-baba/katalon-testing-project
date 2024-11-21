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

/* Wishlist Management: Add and Remove Item Validation
 *1. Open the browser and navigate to the website homepage: `https://demowebshop.tricentis.com/`.
 *2. Click on the "Apparel & Shoes" link in the navigation menu.
 *3. Click on the image of the "50's Rockabilly Polka Dot Top JR Plus Size" dress to view its product details.
 *4. Click the "Add to Wishlist" button on the product page to add the dress to the wishlist.
 *5. Navigate to the "Wishlist" page by clicking the "Wishlist" link in the navigation menu.
 *6. Verify that the dress, "50's Rockabilly Polka Dot Top JR Plus Size," has been added to the wishlist.
 *7. Click the "Remove" checkbox next to the dress in the wishlist.
 *8. Click the "Update Wishlist" button to apply the changes.
 *9. Verify that the dress, "50's Rockabilly Polka Dot Top JR Plus Size," has been removed from the wishlist.
 **/
// 1. Open the browser and navigate to the website homepage
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

// 2. Click on the "Apparel & Shoes" link in the navigation menu
WebUI.click(findTestObject('7. Apparel - Shoes/1. a_Apparel  Shoes'))

// 3. Click on the image of the "50's Rockabilly Polka Dot Top JR Plus Size" dress to view its product details
WebUI.click(findTestObject('7. Apparel - Shoes/2. imgRockabillyDress'))

// 4. Click the "Add to Wishlist" button on the product page to add the dress to the wishlist
WebUI.click(findTestObject('a10. Wishlist/1. add-to-wishlist-button-5'))

// 5. Navigate to the "Wishlist" page by clicking the "Wishlist" link in the navigation menu
WebUI.click(findTestObject('a10. Wishlist/4. span_Wishlist'))

// 6. Verify that the dress, "50's Rockabilly Polka Dot Top JR Plus Size," has been added to the wishlist
WebUI.verifyTextPresent('50\'s Rockabilly Polka Dot Top JR Plus Size', false)

// 7. Click the "Remove" checkbox next to the dress in the wishlist
WebUI.click(findTestObject('a10. Wishlist/5. Remove_removefromcart'))

// 8. Click the "Update Wishlist" button to apply the changes
WebUI.click(findTestObject('a10. Wishlist/5. Qty_updatecart'))

// 9. Verify that the dress, "50's Rockabilly Polka Dot Top JR Plus Size," has been removed from the wishlist
WebUI.verifyTextNotPresent('50\'s Rockabilly Polka Dot Top JR Plus Size', false)

