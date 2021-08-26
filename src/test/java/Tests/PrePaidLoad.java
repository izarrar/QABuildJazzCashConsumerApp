package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MobileLoadAndBundlesPOM;
import io.appium.java_client.MobileBy;

@Test  (priority = 5)

public class PrePaidLoad extends AppSetup{
	@Parameters({"device"})

	public void PrePaidMobileLoad(String device) throws InterruptedException 
	{		




		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		POM.Appdrawer.click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Prepaid Load" + "\").instance(0))")).click();
		Thread.sleep(2000);

		POM.SearchMobileNO.click();
		Thread.sleep(2000);

		POM.SearchMobileNO.sendKeys("03025782949");
		Thread.sleep(3000);

		POM.SelectNO.click();
		Thread.sleep(2000);


		POM.Three.click();
		Thread.sleep(2000);


		POM.Zero.click();
		Thread.sleep(2000);



		POM.LoadRS.click();
		Thread.sleep(2000);
		POM.ConfirmTransaction.click();
		POM.UseMPIM.click();
		Thread.sleep(2000);


		//Entering MPIN
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();
		Thread.sleep(3000);

		POM.Done.click();


	}
}
