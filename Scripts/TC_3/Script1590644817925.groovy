import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.tap(findTestObject('Object Repository/Campus/btn_more'),2)
Mobile.tap(findTestObject('Object Repository/Campus/campus_search'),2)
Mobile.waitForElementPresent(findTestObject('Object Repository/Campus Menu/icon_campus'), 5)
Mobile.waitForElementPresent(findTestObject('Object Repository/Campus Menu/input_search_campus'), 5)

//Verify all menu on campus
kampus  = Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_kampus'), 2)
jurusan = Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_jurusan'), 2)
karir	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_karir'), 2)
beasis	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_beasiswa'), 2)
ujiPotn	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_uji_potensi'), 2)
mitra	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_mitra'), 2)
belajar	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_belajar'), 2)
cekPel	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_cek_peluang'), 2)
if(kampus==true && jurusan==true && karir==true && beasis==true && ujiPotn==true && mitra==true && belajar==true && cekPel==true){
	Mobile.comment('All menu complete') //comment message if element complete
}else{
	def testName = RunConfiguration.getExecutionSourceName().toString() +' Error run test menu campus not complete' //get test name and give error message
	CustomKeywords.'usefull.function.failure'(testName, FailureHandling.STOP_ON_FAILURE) //use function to execute if fail test
}

//verify all bottom menus
beranda 	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_beranda'), 2)
direktori 	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_direktori'), 2)
favorit 	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_favorit'), 2)
riwayat 	= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_riwayat_test'), 2)
profil 		= Mobile.verifyElementExist(findTestObject('Object Repository/Campus Menu/icon_menu_profil'), 2)
if(beranda==true && direktori==true && favorit==true && riwayat==true && profil==true){
	Mobile.comment('All bottom menu complete') //comment message if element complete
}else{
	def testName = RunConfiguration.getExecutionSourceName().toString() +' Error run test bottom menu not complete' //get test name and give error message
	CustomKeywords.'usefull.function.failure'(testName, FailureHandling.STOP_ON_FAILURE) //use function to execute if fail test
}
