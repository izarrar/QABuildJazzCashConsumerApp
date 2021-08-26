package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.MobileLoadAndBundlesPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TelenorBundles  extends AppSetup{

	@Parameters({"MSISDN"})
	@Test (priority=1)
	public void MSISDN_Entered_Successfully(String MSISDN) throws InterruptedException {

		
		LoginPagePOM POM=new LoginPagePOM(driver);

		WebDriverWait wait = new WebDriverWait(driver,40);

		wait.until(ExpectedConditions.visibilityOf(POM.MSISDNField));
		POM.MSISDNField.click();
		
		wait.until(ExpectedConditions.visibilityOf(POM.MSISDN));


		POM.MSISDN.sendKeys(MSISDN);
		Thread.sleep(3000);
		POM.Next.click();
		Thread.sleep(3000);

	}
	

	@Test(priority=2)
	public void Entered_MPIN_Successfully() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);

//		wait.until(ExpectedConditions.visibilityOf(POM.ForgotMPIN));

		//Entering MPIN
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();
		Thread.sleep(5000);
		
		
		if (POM.KeyBoardSetup.isDisplayed()) {
			
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		}
		
		else {
			
			Thread.sleep(2000);
		}
		
		
		

	}
		
//		wait.until(ExpectedConditions.visibilityOf(POM.LowBalance));
//		POM.LowBalance.isDisplayed();
		

//
//	}

	@Test(priority=3)
	public void Customer_Logged_In_Successfully() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,40);
		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		
		
		wait.until(ExpectedConditions.visibilityOf(POM.Next4));

		POM.Next4.isDisplayed();  
		Thread.sleep(2000);
	}



	@Test(priority=4)
	public void Clicked_On_Add_Money_CoachMark() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,40);
		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		wait.until(ExpectedConditions.visibilityOf(POM.Next4));

		POM.Next4.click();   //Add Money
		Thread.sleep(2000);

	}

	@Test(priority=5)
	public void Clicked_On_Balance_And_Transaction_History_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Balance & Transaction History
		Thread.sleep(2000);
        
	}

	@Test(priority=6)
	public void Clicked_On_Ready_Cash_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Balance & Transaction History
		Thread.sleep(2000);

	}
	@Test(priority=7)
	public void Clicked_On_My_Account_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //My Account
		Thread.sleep(2000); 

	}

	@Test(priority=8)
	public void Clicked_On_Personalize_JazzCash_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Personalize JazzCash
		Thread.sleep(2000);

	}

	@Test(priority=9)
	public void Clicked_On_Explore_All_Services_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login

		POM.Next4.click();   //Explore All Services
		Thread.sleep(2000);

	}

	@Test(priority=10)
	public void Clicked_On_Notification_And_Promotions_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Gotit1.click();   //Notification and promotions
		Thread.sleep(2000);
		
	}


	//********************************************Telenor Bundles**************************//
//
	@Test(priority=11)
	public void Clicked_On_Mobile_Bundles() throws InterruptedException 
	{		

		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Appdrawer));
		POM.Appdrawer.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Mobile Bundles" + "\").instance(0))")).click();

	}

	@Test(priority=12)
	public void Operator_Selected_Successfully() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Telenor" + "\").instance(0))")).click();
	
		Thread.sleep(2000);
	}
	
	@Test(priority=13)
	public void Search_Bundle_Successfully() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.ClickontheSearchBundleField)).click();
		POM.ClickontheSearchBundleField.sendKeys("Monthly WhatsApp & FB Offer");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(2000);
	}
	
	@Test(priority=14)
	public void Click_on_the_subscribe_Bundle_Button() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.SubscribeBundle));
		POM.SubscribeBundle.click();
		Thread.sleep(2000);
	}
	
	

	@Test(priority=15)
	public void Entered_Recipient_Mobile_Number() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.RecipientMobileNumber));

		POM.RecipientMobileNumber.click();
		POM.RecipientMobileNumber.sendKeys("03435598382");
		POM.ConfirmNumber.click();
		Thread.sleep(3000);

		
	}

	@Test(priority=16)
	public void Confirmed_Mobile_Bundle_Purchase() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));

	POM.ConfirmTransaction.click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(1000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(3000);
	
	}
//
//	@Test(priority=17)
//	public void MPIN_Entered() throws InterruptedException 
//	{		
//		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		wait.until(ExpectedConditions.visibilityOf(POM.One));
//
//		POM.One.click();
//		POM.One.click();
//		POM.Two.click();
//		POM.Two.click();	
//
//	}
//
//	@Test(priority=18)
//	public void Mobile_Bundle_Reciept() throws InterruptedException 
//	{		
//		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		wait.until(ExpectedConditions.visibilityOf(POM.Rupees));
//
//		POM.Rupees.isDisplayed();
//		Thread.sleep(2000);
//	
//		
//	driver.findElementById("com.techlogix.mobilinkcustomer:id/btn_done").click();

	
	
	
}







	



