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
import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

ExcelData data = findTestData('Excell_Data')

println(data)
//print(data.getRowNumbers())

//for (def index : (0..data.getRowNumbers()-1)) {
//	
//	print(index)
//}

//WebUI.openBrowser('http://demoaut.katalon.com/profile.php#login')
//
//WebUI.setText(findTestObject('Obj_UserNme,Pswd,Login/Page_CURA Healthcare Service/input_username'), userName)
//
//WebUI.setText(findTestObject('Obj_UserNme,Pswd,Login/Page_CURA Healthcare Service/input_password'), pswrd)
//
//WebUI.click(findTestObject('Obj_UserNme,Pswd,Login/Page_CURA Healthcare Service/button_Login'))
//
//String er_msg = WebUI.getText(findTestObject('Object Repository/Obj_UserNme,Pswd,Login/error_Login Failed/p_Login failed Please ensure t'))
//
//WebUI.verifyEqual(er_msg, 'Login failed! Please ensure the username and password are valid.')
//
//WebUI.closeBrowser()

