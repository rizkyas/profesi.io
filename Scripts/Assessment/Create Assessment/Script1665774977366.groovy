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

'Button Create Assessment'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/span_Buat Asesmen'))

'Input Name Assessment\r\n'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_Email_vs-inputx vs-input--input norma_38a119'))

'Name Assessment'
WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_Email_vs-inputx vs-input--input norma_38a119'), 
    'Asesmen Create Test')

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/span_1'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_1'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/span_2'))

WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/Search Daftar Jabatan'), 'SDM')

WebUI.sendKeys(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/Search Daftar Jabatan'), Keys.chord(Keys.ENTER))

'Search Employee SDM'
WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/Search Daftar Pegawai'), 'Cri')

'Add Asesi'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/div_Kepala Divisi SDM  Cristiano Ronaldo   _a7a188'))

'Add Asesor\r\n'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/button_Tambah'))

WebUI.rightClick(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/td_Marc Marquez'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/td_Perencanaan SDM'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/td_Kepala Bagian Perencanaan SDM'))

'Input Search By Name'
WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_Email_vs-inputx vs-input--input norma_38a119'), 
    'Tian')

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/p_Cristiano Ronaldo'))

'Input Search Departement SDM'
WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_Email_vs-inputx vs-input--input norma_38a119'), 
    'SDM')

'Hit Enter Pencarian SDM'
WebUI.sendKeys(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_Email_vs-inputx vs-input--input norma_38a119'), 
    Keys.chord(Keys.ENTER))

'Input Search departement Perencanaan'
WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_Email_vs-inputx vs-input--input norma_38a119'), 
    'Perencanaan')

'Choose Neymar Jr'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/p_Neymar Jr'))

'Choose Kyliab Mbappe\r\n'
WebUI.doubleClick(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/p_Kylian Mbappe'))

'Delete Neymar Jr\r\n'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/svg_Kepala Divisi SDM_feather feather-x w-5 h-5'))

'Delete Kylian Mbappe'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/svg_Kepala Divisi SDM_feather feather-x w-5 h-5'))

