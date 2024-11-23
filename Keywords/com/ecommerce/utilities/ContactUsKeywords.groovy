package com.ecommerce.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ContactUsKeywords {
	@Keyword
	def contactUsForm () {
		// Click on the contact us link to navigate to the contact form page
		WebUI.click(findTestObject('a11. Miscellaneous/1. Contact-Us/1. a_Contact us'))
		
		// Input valid name, email, and enquiry fields
		WebUI.setText(findTestObject('a11. Miscellaneous/1. Contact-Us/2. FullName'), 'colleen james')
		
		WebUI.setText(findTestObject('a11. Miscellaneous/1. Contact-Us/3. input_Email'), 'colleen@aol.com')
		
		WebUI.setText(findTestObject('a11. Miscellaneous/1. Contact-Us/4. textarea_Enquiry'), 'Sed ut perspiciatis unde omnis iste natus error sit voluptatem')
		
		// Click the "Submit" button
		WebUI.click(findTestObject('a11. Miscellaneous/1. Contact-Us/5. input_Enquiry_submit-btn'))
		
		// Verify that a success message is displayed
		WebUI.verifyTextPresent('Your enquiry has been successfully sent to the store owner.', false)
	}
	
}
