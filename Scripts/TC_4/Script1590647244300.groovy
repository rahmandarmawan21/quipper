import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.waitForElementPresent(findTestObject('Object Repository/Campus Menu/input_search_campus'), 5)
Mobile.setText(findTestObject('Object Repository/Campus Menu/input_search_campus'), nmCampus, 2)
namCampus = Mobile.getText(findTestObject('Object Repository/Campus/lbl_name_campus'), 2)
Mobile.waitForElementPresent(findTestObject('Object Repository/Campus/lbl_name_campus'), 10)
//Mobile.sendKeys(findTestObject('Object Repository/Campus Menu/input_search_campus'), Keys.chord(Keys.ENTER))
Mobile.tap(findTestObject('Object Repository/Campus/lbl_name_campus'), 1)
Mobile.delay(2)
Mobile.waitForElementPresent(findTestObject('Object Repository/Campus/title_campus_web'), 10)
lamanCampus = Mobile.getText(findTestObject('Object Repository/Campus/title_campus_web'), 2)
eqName = Mobile.verifyEqual(namCampus, lamanCampus)
if(eqName==true){
	Mobile.comment('correctly opens the '+nmCampus+' web page')
	Mobile.closeApplication()
}else{
	def testName = RunConfiguration.getExecutionSourceName().toString() +' Error run test not correctly open' //get test name and give error message
	CustomKeywords.'usefull.function.failure'(testName, FailureHandling.STOP_ON_FAILURE) //use function to execute if fail test
}