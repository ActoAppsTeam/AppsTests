import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ASMV3/Registratie/OpenGlobalMenuNav'))

WebUI.waitForElementPresent(findTestObject('ASMV3/Registratie/GlobalMenuNavButtonCollapsed'), 5)

WebUI.click(findTestObject('ASMV3/Registratie/ClickNewRegistration'))

WebUI.click(findTestObject('ASMV3/Registratie/Input Objects/button_DossierSearch'))

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Registratie/Input Objects/input_DossierSearchDialog'), DossierNaam)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Registratie/Input Objects/button_DossierSearchDialog_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Registratie/Input Objects/select_DossierSearchItem'))

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Registratie/Input Objects/input_InstallatieSearchDialog'), InstallatieNaam)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Registratie/Input Objects/button_InstallatieSearchDialog_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Registratie/Input Objects/select_InstallatieSearchItem'))

WebUI.delay(3)

WebUI.focus(findTestObject('ASMV3/Registratie/Input Objects/input_BezoekSoort'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('ASMV3/Registratie/Input Objects/input_BezoekSoort'), BezoekSoort, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Registratie/Input Objects/input_Melder'), Melder)

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Registratie/Input Objects/input_Bedrijf'), Bedrijf)

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Registratie/Input Objects/input_Referentie'), Referentie)

WebUI.setText(findTestObject('ASMV3/Registratie/Input Objects/input_MeldingsTekst'), MeldingsTekst)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Registratie/Input Objects/button_Versturen'))

WebUI.delay(60)

