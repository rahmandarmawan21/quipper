import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

lblCourse = Mobile.getText(findTestObject('Object Repository/List Course/lbl_course_1'), 1) //get text name object
Mobile.tap(findTestObject('Object Repository/List Course/lbl_course_1'), 2) //click first menu course
Mobile.waitForElementPresent(findTestObject('Object Repository/Video/lbl_title_course'), 10) //wait until title course present
titleVideo = Mobile.getText(findTestObject('Object Repository/Video/lbl_title_course'), 1)//get text name object
rsTitle = Mobile.verifyEqual(lblCourse, titleVideo)
if(rsTitle==true){
	Mobile.waitForElementPresent(findTestObject('Object Repository/Video/window_video'), 10)
	Mobile.delay(3) //wait until video play
	Mobile.tap(findTestObject('Object Repository/Video/btn_play'), 2) //click button play
	Mobile.delay(3) //wait until video play
	Mobile.tap(findTestObject('Object Repository/Video/display_video'), 1) //click display video to make pause button show
	Mobile.tap(findTestObject('Object Repository/Video/btn_pause'), 1, FailureHandling.OPTIONAL) //click button pause
	Mobile.tap(findTestObject('Object Repository/Video/btn_back'), 2) //click button back to homescreen
}else{
	def testName = RunConfiguration.getExecutionSourceName().toString() +' Error run test' //get test name and give error message
	CustomKeywords.'usefull.function.failure'(testName, FailureHandling.STOP_ON_FAILURE) //use function to execute if fail test
}