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

public class removeFromCart {
	@Keyword
	public void updateCart() {
		WebUI.click(findTestObject('3. Computers/Desktop/6. span_Shopping cart'))
		
		WebUI.click(findTestObject('a11. Miscellaneous/4. UpdateCart/1. removefromcart'))
		
		WebUI.clearText(findTestObject('a11. Miscellaneous/4. UpdateCart/2. Qty_itemquantity'))
		
		WebUI.click(findTestObject('a11. Miscellaneous/4. UpdateCart/3. Total_updatecart'))
		
		WebUI.verifyTextPresent('Your Shopping Cart is empty!', false)
	}
}
