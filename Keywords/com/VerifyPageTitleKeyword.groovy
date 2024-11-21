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
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
public class VerifyPageTitleKeyword {
	@Keyword
	public void pageTitle() {


		// Step 1: Open a browser
		WebUI.openBrowser('')

		// Step 2: Navigate to the website
		WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

		// Step 3: Capture the page title
		String title = WebUI.getWindowTitle()

		// Step 4: Log the captured title
		KeywordUtil.logInfo('Captured Page Title: ' + title)

		// Step 5: Define the expected title
		String expectedTitle = 'Demo Web Shop'

		// Step 6: Verify the page title using a conditional assertion
		if (title.equalsIgnoreCase(expectedTitle)) {
			KeywordUtil.markPassed('Page title is verified successfully: "' + title + '"')
		} else {
			KeywordUtil.markFailed('Page title mismatch. Expected: "' + expectedTitle + '", but got: "' + title + '"')
		}

		
		
	}
}
