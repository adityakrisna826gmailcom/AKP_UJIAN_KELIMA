package ujian.ujiankelima.appium.pageobject;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BMICalculator {

	public AndroidDriver<MobileElement> driver;
	
	public BMICalculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// Locator number
//	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Kalender lengkap dengan TANGGAL MERAH BUKA AD\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View")
//	private MobileElement btnJenisKelamin;
//	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Setuju\"]")
//	private MobileElement btnSetuju;
//	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Kalender lengkap dengan TANGGAL MERAH BUKA AD\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText[1]")
//	private MobileElement inpTinggi;
//	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Kalender lengkap dengan TANGGAL MERAH BUKA AD\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText[2]")
//	private MobileElement inpBerat;
//	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Kalkulator BMI\"]")
//	private MobileElement txtValid;
	
	@AndroidFindBy(id = "com.bmi.body.mass.index.calculator:id/radio1")
	private MobileElement btnMale;
	@AndroidFindBy(id = "com.bmi.body.mass.index.calculator:id/radio2")
	private MobileElement btnFemale;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"plus\"])[1]")
	private MobileElement btnPlusAge;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"minus\"])[1]")
	private MobileElement btnMinusAge;
	@AndroidFindBy(id = "com.bmi.body.mass.index.calculator:id/calculate")
	private MobileElement btnCalculate;
	@AndroidFindBy(id = "com.bmi.body.mass.index.calculator:id/normal")
	private MobileElement btnRecalculate;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"plus\"])[2]")
	private MobileElement btnPlusWeight;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"minus\"])[2]")
	private MobileElement btnMinusWeight;
	@AndroidFindBy(id = "com.bmi.body.mass.index.calculator:id/textView")
	private MobileElement txtResult;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement txtGender;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Drawer Open\"]")
	private MobileElement btnSetting;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	private MobileElement btnRate;
	@AndroidFindBy(id = "com.bmi.body.mass.index.calculator:id/close")
	private MobileElement btnClose;
	@AndroidFindBy(xpath = "	\r\n" + "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement txtResultRate;
	@AndroidFindBy(xpath = "	\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
	private MobileElement txtBMICalc;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	private MobileElement btnShare;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement txtEmpty;
	
	
	
	
	
	
	public void dataMale() throws InterruptedException
	{
		btnMale.click();
		Thread.sleep(1000);
		btnPlusAge.click();
		Thread.sleep(1000);
		btnPlusAge.click();
		Thread.sleep(1000);
		btnPlusAge.click();
		Thread.sleep(1000);
		btnPlusAge.click();
		Thread.sleep(1000);
		
		btnPlusWeight.click();
		Thread.sleep(1000);
		btnPlusWeight.click();
		Thread.sleep(1000);
		btnPlusWeight.click();
		Thread.sleep(1000);
		btnPlusWeight.click();
		Thread.sleep(1000);
	}
	
	public void dataFemale() throws InterruptedException
	{
		btnFemale.click();
		Thread.sleep(1000);
		btnMinusAge.click();
		Thread.sleep(1000);
		btnMinusAge.click();
		Thread.sleep(1000);
		btnMinusAge.click();
		Thread.sleep(1000);
		btnMinusAge.click();
		Thread.sleep(1000);
		
		btnMinusWeight.click();
		Thread.sleep(1000);
		btnMinusWeight.click();
		Thread.sleep(1000);
		btnMinusWeight.click();
		Thread.sleep(1000);
		btnMinusWeight.click();
		Thread.sleep(1000);
	}
	
	public void btnRateUs() throws InterruptedException
	{
		btnRate.click();
		Thread.sleep(1000);
	}
	
	public void btnClose() throws InterruptedException
	{
		btnClose.click();
		Thread.sleep(1000);
	}
	
	
	public void btnCalculate() throws InterruptedException
	{
		btnCalculate.click();
		Thread.sleep(1000);
	}
	
	public void btnRecalculate() throws InterruptedException
	{
		btnRecalculate.click();
		Thread.sleep(1000);
	}
	
	public void btnSetting() throws InterruptedException
	{
		btnSetting.click();
		Thread.sleep(1000);
	}
	
	public void btnShare() throws InterruptedException
	{
		btnShare.click();
		Thread.sleep(1000);
	}
//	
	public String getTxtResult() {
		return txtResult.getText();
	}
	
	public String getTxtGender() {
		return txtGender.getText();
	}
	
	public String getTxtResultRate() {
		return txtResultRate.getText();
	}
	
	public String getTxtBMICalc() {
		return txtBMICalc.getText();
	}
	
	public String getTxtEmpty() {
		return txtEmpty.getText();
	}
	
}
