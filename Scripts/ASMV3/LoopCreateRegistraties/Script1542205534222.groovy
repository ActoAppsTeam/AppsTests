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

for (def index : (0..10)) {
    WebUI.callTestCase(findTestCase('ASMV3/CreateNewRegistratie'), [('AanneemSom') : '10000000', ('AfspraakGroep') : '""'
            , ('Bedrijf') : 'Katalon test Service', ('BezoekSoort') : 14, ('Contract') : '', ('DossierNaam') : 'Hanze Academie'
            , ('Installatie') : '60 Verwarming', ('Melder') : 'Katalon service monteur', ('MeldingsTekst') : 'Periodieke controle. Brander hapert af en toe.'
            , ('Referentie') : 'Katalon-testservice-2018', ('InstallatieNaam') : '60 Verwarming'], FailureHandling.STOP_ON_FAILURE)
}

