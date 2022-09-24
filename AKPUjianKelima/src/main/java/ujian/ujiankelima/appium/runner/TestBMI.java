package ujian.ujiankelima.appium.runner;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ujian.ujiankelima.appium.pageobject.BMICalculator;

public class TestBMI {

	private static AndroidDriver<MobileElement> driver;
	private BMICalculator bmiCalculator;
	
	@BeforeTest
	public void befTest()
	{
		
		try {
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "G011A");
			capabilities.setCapability("uuid", "127.0.0.1:21513");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "7.1.2");
			capabilities.setCapability("appPackage", "com.bmi.body.mass.index.calculator");
			capabilities.setCapability("appActivity", "com.bmi.bodymassindex.MainActivity");
			
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			bmiCalculator = new BMICalculator(driver);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 0)
	public void testDataMale() throws InterruptedException {
		bmiCalculator.dataMale();
		bmiCalculator.btnCalculate();
//		bmiCalculator.btnRecalculate();
//		bmiCalculator.inputData("180", "60", "24");
		assertTrue(bmiCalculator.getTxtResult().contains("Results"));
	}
	
	@Test(priority = 1)
	public void testDataFemale() throws InterruptedException {
		bmiCalculator.btnRecalculate();
		assertTrue(bmiCalculator.getTxtGender().contains("Gender"));
		
		bmiCalculator.dataFemale();
		bmiCalculator.btnCalculate();
		assertTrue(bmiCalculator.getTxtResult().contains("Results"));
	}
	
	@Test(priority = 2)
	public void testRateRate() throws InterruptedException {
		bmiCalculator.btnRecalculate();
		assertTrue(bmiCalculator.getTxtGender().contains("Gender"));
		bmiCalculator.btnSetting();
		
		bmiCalculator.btnRateUs();
		assertTrue(bmiCalculator.getTxtResultRate().contains("Do You Like BMI Calculator"));
		bmiCalculator.btnClose();
		assertTrue(bmiCalculator.getTxtBMICalc().contains("Calculate Body Mass Index"));
	}
	
	@Test(priority = 3)
	public void testSetting() throws InterruptedException {
		bmiCalculator.btnShare();
		assertTrue(bmiCalculator.getTxtEmpty().contains("Share using"));
		
	}
	
	@AfterTest
	public void closeApp() {
		driver.quit();
	}	
}
