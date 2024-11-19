package com

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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class contactUs {
	
	@Keyword
	public void contactUsForm () {
		WebUI.click(findTestObject('a11. Miscellaneous/1. Contact-Us/1. a_Contact us'))
		
		WebUI.setText(findTestObject('a11. Miscellaneous/1. Contact-Us/2. FullName'), 'Jane Doe')
		
		WebUI.setText(findTestObject('a11. Miscellaneous/1. Contact-Us/3. Email'), 'jane@aol.com')
		
		WebUI.setText(findTestObject('a11. Miscellaneous/1. Contact-Us/4. Enter_Enquiry'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua')
		
		WebUI.click(findTestObject('a11. Miscellaneous/1. Contact-Us/5. Send-email'))
		
		WebUI.verifyTextPresent('Your enquiry has been successfully sent to the store owner', false)
	}
}
