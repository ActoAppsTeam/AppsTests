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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/dev/Account/Account/Login.aspx?ReturnUrl=%2fdev%2fhome%2f#home/index')

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto Informatisering B.V. - Lo/input_Acto Informatisering B.V'), 
    'ekroes')

WebUI.setEncryptedText(findTestObject('Object Repository/RecorderdOrder/Page_Acto Informatisering B.V. - Lo/input_Gebruikersnaam of e-mail'), 
    'enAOsLjPgt09aTMyRCOaoP0a5GX6lSz4')

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto Informatisering B.V. - Lo/input_U moet uw huidige wachtw'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Home/div_ASM v3.1 pilot Tes ( Ander'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/div_6Werkorders'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/input_Gestart'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/input_Open'))

WebUI.click(findTestObject('ASMV3/Order/OpenWerkorder'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/button_Start werkorder'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_2'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Busvoorraad'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/button_Sluiten'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Besteld'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/button_Sluiten'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Projectmateriaal'))

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/input_Omschrijving_form-contro'), 
    '6000 meter verlengkabel voor E-bike V320')

WebUI.doubleClick(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/div_'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/div_'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/div_-'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/button_Opslaan'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_3'))

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/textarea_Oplossingstekst_form-'), 
    'Brander schoongemaakt, deze was verstopt door roet.')

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/textarea_Internetekst_form-con'), 
    'Brander cleanup')

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/textarea_Instructie volgend be'), 
    'Nogmaals controleren')

WebUI.selectOptionByValue(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/select_Kies..Gedeeltelijke uit'), 
    'GEDE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/select_Kies..BeschadigingDefec'), 
    'ONDE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/select_Kies..Brander functione'), 
    'BRAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/select_Kies..Installatie afges'), 
    'ONDE', true)

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_4'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Normale uren_glyphicon gl'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Normale uren_glyphicon gl_1'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Normale uren_glyphicon gl_2'))

WebUI.doubleClick(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Normale uren_glyphicon gl_3'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Normale uren_glyphicon gl_4'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/div_Toevoegen'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Toevoegen'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Reisuren_glyphicon glyphi'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Reisuren_glyphicon glyphi_1'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_00'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/td_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/select_Reizen buiten werktijdR'), 
    'Reizen in werktijd', true)

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Toevoegen'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_5'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/span_Handtekening'))

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/input_Naam_form-control'), 'Joris Bandoman')

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/input_E-mail_form-control'), 'j.bandoman@yaris.com')

WebUI.setText(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/textarea_Opmerkingen_form-cont'), 
    'Geen opmerkingen')

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/canvas'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/button_Gereed melden'))

WebUI.click(findTestObject('Object Repository/RecorderdOrder/Page_Acto  Servicemonteur/i_Servicemonteur_glyphicon gly'))

WebUI.closeBrowser()

