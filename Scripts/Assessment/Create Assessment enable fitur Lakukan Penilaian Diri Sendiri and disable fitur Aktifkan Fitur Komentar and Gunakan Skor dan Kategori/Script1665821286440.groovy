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
    'Create Asesmen dengan enable fitur Lakukan Penilaian Diri Sendiri and disable fitur Aktifkan Fitur Komentar and Gunakan Skor dan Kategori')

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/span_1'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/input_1'))

WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/span_2'))

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Disable Aktifkan Fitur Komentar'))

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Disable Gunakan Skor dan Kategori Kesesuaian Kompetensi'))

WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/Search Daftar Jabatan'), 'SDM')

WebUI.sendKeys(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/Search Daftar Jabatan'), Keys.chord(Keys.ENTER))

'Search Employee SDM'
WebUI.setText(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/Search Daftar Pegawai'), 'Cri')

'Add Asesi'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/div_Kepala Divisi SDM  Cristiano Ronaldo   _a7a188'))

'Add Asesor\r\n'
WebUI.click(findTestObject('Object Repository/Assessment Page/Page_Profesi.io/button_Tambah'))

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Button Atasan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Click Marc Marquez'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Rekan Kerja'))

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Click Lionel Mesi'))

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Bawahan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Click Neymar Jr'))

WebUI.delay(3)

'Hit Enter Pencarian SDM'
WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Button Tambah Asesi'), FailureHandling.STOP_ON_FAILURE)

'Input Search departement Perencanaan'
WebUI.click(findTestObject('Assessment Page/Page_Profesi.io/Button Draft'), FailureHandling.STOP_ON_FAILURE)

