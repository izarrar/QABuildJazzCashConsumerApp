package Tests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.Profile_Feature;
import Pages.MayaPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Maya  extends AppSetup{

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
	public void Customer_Logged_In_Successfully() {

		WebDriverWait wait = new WebDriverWait(driver,40);
		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		
		
		wait.until(ExpectedConditions.visibilityOf(POM.Next4));

		POM.Next4.isDisplayed();  
		
	}



	@Test(priority=4)
	public void Clicked_On_Add_Money_CoachMark() {

		WebDriverWait wait = new WebDriverWait(driver,40);
		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		wait.until(ExpectedConditions.visibilityOf(POM.Next4));

		POM.Next4.click();   //Add Money

	}

	@Test(priority=5)
	public void Clicked_On_Balance_And_Transaction_History_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Balance & Transaction History
        
	}

	@Test(priority=6)
	public void Clicked_On_Ready_Cash_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Balance & Transaction History

	}
	@Test(priority=7)
	public void Clicked_On_My_Account_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //My Account

	}

	@Test(priority=8)
	public void Clicked_On_Personalize_JazzCash_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Personalize JazzCash

	}

	@Test(priority=9)
	public void Clicked_On_Explore_All_Services_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Explore All Services

	}

	@Test(priority=10)
	public void Clicked_On_Notification_And_Promotions_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Gotit1.click();   //Notification and promotions
		
	}

	
	


	//********************Maya*************************

	@Test(priority=11)
	public void Click_on_Maya_Icon() throws InterruptedException
	{
		MayaPOM POM=new MayaPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Maya Health" + "\").instance(0))")).click();
		//wait.until(ExpectedConditions.visibilityOf(POM.ClickOnMayaHelath));
		POM.ClickOnMayaHelath.click();
		
	}
	
	
	@Test(priority=12)
	public void Click_on_Skip_Readmore() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	}
	
	@Test(priority=13)
	public void Click_on_My_Question() throws InterruptedException
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickontheMyQuestion));
		POM.ClickontheMyQuestion.click();
	}
	
	
	
	@Test(priority=14)
	public void Click_on_Ask_Questions() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonAskQuestions));
		POM.ClickonAskQuestions.click();
	} 

	
	
	
	
		
	@Test(priority=15)
	public void Click_on_Type_Questions() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTypeQuestion));
		POM.ClickonTypeQuestion.click();
		
	}
	
	
	@Test(priority=16)
	public void Click_on_Enter_Question() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTypeQuestion));
		POM.ClickonTypeQuestion.sendKeys("This is Test Question");
		
	}
	
	

	@Test(priority=17)
	public void Click_on_Send_Question_Button() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSendButton));
		POM.ClickonSendButton.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=18)
	public void Enter_Mobile_Number() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmMobileNumber));
		POM.ClickonConfirmMobileNumber.click();
		POM.Zero.click();
		POM.Three.click();
		POM.Zero.click();
		POM.Seven.click();
		POM.One.click();
		POM.Four.click();
		POM.One.click();
		POM.Four.click();
		POM.Five.click();
		POM.Two.click();
		POM.Five.click();
		
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority=19)
	public void Click_on_Mobile_Countinue_Button() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.MobileCountinueButton));
		POM.MobileCountinueButton.click();
		Thread.sleep(5000);
	}
	
	
	@Test(priority=20)
	public void Click_on_Sort_BY_Latest() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Latest" + "\").instance(0))")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=21)
	public void Click_on_Sort_BY_Free() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Free" + "\").instance(0))")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=22)
	public void Click_on_Sort_BY_Premium() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Premium" + "\").instance(0))")).click();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}


	@Test(priority=23)
	public void Click_on_Free_Health_Chat() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonFreeHealthChatIcon));
		POM.ClickonFreeHealthChatIcon.click();
		Thread.sleep(2000);
		
		
	}

	@Test(priority=24)
	public void Click_on_Keep_In_English() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonKeepinEnglishButton));
		POM.ClickonKeepinEnglishButton.click();
		Thread.sleep(2000);

	}

	
	@Test(priority=25)
	public void Click_on_Start_Typing_Here() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonStartTypingHere));
		POM.ClickonStartTypingHere.click();
		Thread.sleep(2000);

	}

	@Test(priority=26)
	public void Enter_Free_Question() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonStartTypingHere));
		POM.ClickonStartTypingHere.sendKeys("This is Free Test Question");
		
	}
	
	@Test(priority=27)
	public void Click_on__free_Send_Question_Button() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnFreeHelathSEndButton));
		POM.ClickOnFreeHelathSEndButton.click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	
	
//	@Test(priority=28)
//	public void Click_on_SearchIcon() throws InterruptedException
//	{
//		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		MayaPOM POM=new MayaPOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnSearchIcon));
//		POM.ClickOnSearchIcon.click();
//		Thread.sleep(3000);
//		
//	}
	
//	@Test(priority=29)
//	public void Click_on_Search_Health_Topic() throws InterruptedException
//	{
//		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		MayaPOM POM=new MayaPOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnSearchfield));
//		POM.ClickOnSearchfield.sendKeys("Stom");
//	//	POM.ClickOnSearchfield.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		
//	}

	
//	@Test(priority=30)
//	public void Click_on_Top_Sugguestion() throws InterruptedException
//	{
//		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		MayaPOM POM=new MayaPOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnTopSearch));
//		POM.ClickOnTopSearch.click();
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		
//	}
	
	
	@Test(priority=31)
	public void Click_on_Help_and_Support() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnHelpandSupport));
		POM.ClickOnHelpandSupport.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	
	
	@Test(priority=32)
	public void Click_on_Seek_expert_Consulation() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnSeekHelpFromExpert));
		POM.ClickOnSeekHelpFromExpert.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test(priority=33)
	public void Enter_Question_For_Expert() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTypeQuestion));
		POM.ClickonTypeQuestion.sendKeys("This Question is for Expert");
		
	}
	
	

	@Test(priority=34)
	public void Click_on_Expert_Send_Button() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSendButton));
		POM.ClickonSendButton.click();
		Thread.sleep(2000);
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	
	@Test(priority=35)
	public void Enter_Expert_Mobile_Number() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmMobileNumber));
		POM.ClickonConfirmMobileNumber.click();
		POM.Zero.click();
		POM.Three.click();
		POM.Zero.click();
		POM.Seven.click();
		POM.One.click();
		POM.Four.click();
		POM.One.click();
		POM.Four.click();
		POM.Five.click();
		POM.Two.click();
		POM.Five.click();
		
		Thread.sleep(2000);
	}
	
	
	@Test(priority=36)
	public void Click_on_Expert_Mobile_Countinue_Button() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.MobileCountinueButton));
		POM.MobileCountinueButton.click();
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	
	
	@Test(priority=36)
	public void Click_on_View_All_Packages_Button() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnAllPackagesButton));
		POM.ClickOnAllPackagesButton.click();
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority=37)
	public void View_All_Packages() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Mini Pack\"))"));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
		
	
}



