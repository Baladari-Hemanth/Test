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
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.deleteClause_scope as deleteClause_scope
import org.openqa.selenium.Keys as Keys
import org.stringtemplate.v4.compiler.STParser.element_return as element_return

ExcelData data = findTestData('Excell_Data')

WebUI.openBrowser('')
WebUI.navigateToUrl('http://demoaut.katalon.com/profile.php')

for (int i = 0; i <= (data.getRowNumbers() - 1); i++) {

	login(data.internallyGetValue('Username', i), data.internallyGetValue('Password', i))
	WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
	WebUI.delay(10)
	if(WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false, FailureHandling.OPTIONAL)){	
	//if(WebUI.verifyElementPresent(findTestObject('Object Repository/Obj_UserNme,Pswd,Login/error_Login Failed/p_Login failed Please ensure t'), 5, FailureHandling.CONTINUE_ON_FAILURE)== true){	
		println("--------- failed login-------------------")
	}else {
	WebUI.click(findTestObject('Object Repository/Menu/a_menu-toggle'))
	WebUI.click(findTestObject('Object Repository/Menu/a_Logout'))
	println("--------- log out successfull-------------------")
	//WebUI.closeBrowser()
	}
}

def login(def usr,def psd) {
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), usr)
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), psd)
}



