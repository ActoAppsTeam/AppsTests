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

WebUI.click(findTestObject('ASMV3/Order/OpenWerkorder'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/StartWerkorder'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/WizardSteps/wizardStep_Material'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_Busvoorraad'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_DialogBusvoorraadSluiten'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_Besteld'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_DialogBesteldSluiten'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_ProjectMateriaal'))

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Order/Material/Input Objects/input_ProjectMateriaalRegel'), ProjectMateriaal)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_ProjectMateriaalAnnuleren'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_ProjectMateriaal'))

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Order/Material/Input Objects/input_ProjectMateriaalRegel'), ProjectMateriaal)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/addProjectMateriaalPlus'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/addProjectMateriaalPlus'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/addProjectMateriaalMin'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Material/Input Objects/button_ProjectMateriaalOpslaan'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/WizardSteps/wizardStep_Time'))

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Order/Time/Input Objects/input_CommercialHours'), SetNormalHours)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('ASMV3/Order/Time/Input Objects/button_AddCommercialHours'), 5)

WebUI.click(findTestObject('ASMV3/Order/Time/Input Objects/button_AddCommercialHours'))

WebUI.delay(3)

WebUI.setText(findTestObject('ASMV3/Order/Time/Input Objects/input_TravelHours'), SetTravelHours)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('ASMV3/Order/Time/Input Objects/input_TravelInOut'), TravelTimeInOut)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('ASMV3/Order/Time/Input Objects/button_AddTravelHours'), 5)

WebUI.click(findTestObject('ASMV3/Order/Time/Input Objects/button_AddTravelHours'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/WizardSteps/wizardStep_Resume'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Resume/Input Objects/button_NietAfgewerktMelden'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('ASMV3/Order/Resume/Input Objects/select_RedenNietAfgemeld'), 4)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Resume/Input Objects/button_NietAfgewerktMeldenAnnuleren'))

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Resume/Input Objects/button_NietAfgewerktMelden'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('ASMV3/Order/Resume/Input Objects/select_RedenNietAfgemeld'), 4)

WebUI.delay(3)

WebUI.click(findTestObject('ASMV3/Order/Resume/Input Objects/button_NietAfgewerktMeldenOpslaan'))

WebUI.delay(10)

