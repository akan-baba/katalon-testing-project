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

public class ChangePasswordKeywords {

	@Keyword
	def changePassword() {
		WebUI.click(findTestObject('a11. Miscellaneous/5. ChangePassword/1. My account'))

		WebUI.click(findTestObject('a11. Miscellaneous/5. ChangePassword/2. Change password'))

		WebUI.setText(findTestObject('a11. Miscellaneous/5. ChangePassword/3. OldPassword'), 'red123')

		WebUI.setText(findTestObject('a11. Miscellaneous/5. ChangePassword/4. NewPassword'), 'red123')

		WebUI.setText(findTestObject('a11. Miscellaneous/5. ChangePassword/5. ConfirmNewPassword'), 'red123')

		WebUI.click(findTestObject('a11. Miscellaneous/5. ChangePassword/6. Change-password-button'))

		'Password changed'
		WebUI.verifyTextPresent('Password was changed', false)
	}
}
