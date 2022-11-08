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

WebUI.clearText(findTestObject('Customer details/Name (customer details)'))

WebUI.sendKeys(findTestObject('Customer details/Name (customer details)'), 'syuffie')

WebUI.clearText(findTestObject('Customer details/email (customer detail)'))

WebUI.sendKeys(findTestObject('Customer details/email (customer detail)'), 'rozakana44@gmail.com')

WebUI.clearText(findTestObject('Customer details/Phone number (customer details)'))

WebUI.sendKeys(findTestObject('Customer details/Phone number (customer details)'), '085746601592')

WebUI.clearText(findTestObject('Customer details/City (customers details)'))

WebUI.sendKeys(findTestObject('Customer details/City (customers details)'), 'tulungagung')

WebUI.clearText(findTestObject('Customer details/Address (customer details)'))

WebUI.sendKeys(findTestObject('Customer details/Address (customer details)'), 'perum bangau putih blok g27, desa bangoan kecamatan kedungwaru')

WebUI.clearText(findTestObject('Customer details/Postal code (customer details)'))

WebUI.sendKeys(findTestObject('Customer details/Postal code (customer details)'), '66229')

WebUI.click(findTestObject('Button/Button Checkout'))

WebUI.switchToFrame(findTestObject('frame/iframe'), 2)

WebUI.verifyElementText(findTestObject('Verify/select method'), 'Select method')

WebUI.click(findTestObject('Field/CC field'))

WebUI.verifyElementText(findTestObject('Verify/Credit atau debit card'), 'Credit/debit card')

WebUI.sendKeys(findTestObject('Field/credit card number'), '4811111111111114')

WebUI.click(findTestObject('promo field/Potongan 10 persen'))

WebUI.scrollToElement(findTestObject('Button/Button Pay now'), 0)

WebUI.click(findTestObject('Button/Button Pay now'))

WebUI.verifyElementText(findTestObject('Warning message/warning message expiration date'), 'Expiry can\'t be empty.')

WebUI.verifyElementText(findTestObject('Warning message/warning message CVV'), 'CVV can\'t be empty.')

WebUI.closeBrowser()

