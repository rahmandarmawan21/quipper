import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.context.TestCaseContext
import internal.GlobalVariable as GlobalVariable

nmaCourse = Mobile.getText(findTestObject('Object Repository/List Course/lbl_course_1'), 2) //get name course on attribute text
nmaTeach = Mobile.getText(findTestObject('Object Repository/List Course/lbl_name_1'), 2) //get name course on attribute text
C = Mobile.verifyEqual(nmaCourse, 'G12 Chemistry') //set value to variable
T = Mobile.verifyEqual(nmaTeach, 'Kaoru Sakata') //set value to variable
if(C==true && T==true){
	Mobile.comment('Name Course and Name Teacher Same Value') //comment message if element is equal
}else{
	def testName = RunConfiguration.getExecutionSourceName().toString() +' Error run test' //get test name and give error message
	CustomKeywords.'usefull.function.failure'(testName, FailureHandling.STOP_ON_FAILURE) //use function to execute if fail test
}