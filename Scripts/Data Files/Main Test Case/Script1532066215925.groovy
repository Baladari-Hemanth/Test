import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl('http://demoaut.katalon.com/profile.php')

for(int i = 1; i <= (findTestData('directExcell').getRowNumbers()); i++){
	login(findTestData('directExcell').getValue("Username", i), findTestData('directExcell').getValue("Password", i))
	if(WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false, FailureHandling.OPTIONAL)){
		println("--------- login failed -------------------")
	}else {
		WebUI.click(findTestObject('Object Repository/Menu/a_menu-toggle'))
		WebUI.click(findTestObject('Object Repository/Menu/a_Logout'))
		WebUI.comment('---- logout ssuccessfull--------------')
		WebUI.closeBrowser()
	}
}
def login(def usr,def psd) {
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), usr)
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), psd)
	WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
}