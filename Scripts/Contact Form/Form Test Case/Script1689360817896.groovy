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

WebUI.callTestCase(findTestCase('Main Test Cases/StaringWeb'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/a_Get Started'))

WebUI.navigateToUrl('http://127.0.0.1:5500/contact.html')

WebUI.setText(findTestObject('Object Repository/input_text'), 'Bhavyansh')

WebUI.setText(findTestObject('Object Repository/input_text_1'), 'Ameta')

WebUI.setText(findTestObject('Object Repository/input_text_1_2'), 'bhavyanshameta@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_text_1_2_3'), 'Any Subject')

WebUI.setText(findTestObject('Object Repository/textarea'), 'Comment')

WebUI.click(findTestObject('Object Repository/input_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/a_SAR Technology (1)'), 'SAR Technology')

WebUI.delay(2)

WebUI.closeBrowser()

