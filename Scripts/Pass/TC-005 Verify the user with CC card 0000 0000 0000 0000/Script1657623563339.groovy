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

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Button/Button Buynow'))

WebUI.verifyElementText(findTestObject('Verify/Shopping Cart'), 'Shopping Cart  ')

WebUI.click(findTestObject('Button/Button Checkout'))

WebUI.switchToFrame(findTestObject('frame/iframe'), 0)

WebUI.verifyElementText(findTestObject('Verify/select method'), 'Select method')

WebUI.click(findTestObject('Field/CC field'))

WebUI.verifyElementText(findTestObject('Verify/Credit atau debit card'), 'Credit/debit card')

WebUI.sendKeys(findTestObject('Field/credit card number'), '0000000000000000')

WebUI.sendKeys(findTestObject('Field/Expiration date field'), '0125')

WebUI.sendKeys(findTestObject('Field/CVV field'), '123')

WebUI.scrollToElement(findTestObject('promo field/Proceed without promo'), 0)

WebUI.click(findTestObject('promo field/Proceed without promo'))

WebUI.scrollToElement(findTestObject('Button/Button Pay now'), 0)

WebUI.click(findTestObject('Button/Button Pay now'))

WebUI.verifyElementText(findTestObject('Warning message/warning error message'), 'Payment data is invalid')

WebUI.verifyElementText(findTestObject('Warning message/warning error message2'), 'Your transaction failed to be processed. Please retry.')

WebUI.click(findTestObject('Button/Button retry'))

WebUI.scrollToElement(findTestObject('scrool text credt atau debit card'), 0)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('frame/iframe'), 2)

WebUI.verifyElementText(findTestObject('Warning message/warning message Card got declined by the bank'), 'Card got declined by the bank. Try using another card/payment method.')

WebUI.closeBrowser()

