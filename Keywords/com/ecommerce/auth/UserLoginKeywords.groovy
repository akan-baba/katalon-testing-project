package com.ecommerce.auth

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

public class UserLoginKeywords {
	@Keyword
	def userLogin() {
		
		// Click on the register link/button
		WebUI.click(findTestObject('1. User-Login/1. a_Log in'))

		WebUI.setText(findTestObject('1. User-Login/2. input_Email'), 'colleen@aol.com')

		WebUI.setText(findTestObject('1. User-Login/3. input_Password'), 'red123')

		WebUI.click(findTestObject('1. User-Login/6.  login-button'))

		WebUI.verifyTextPresent('colleen@aol.com', false)

		WebUI.click(findTestObject('1. User-Login/7. a_Log out'))
	}
}
