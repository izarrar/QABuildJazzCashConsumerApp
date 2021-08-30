package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.MayaPOM;
import Pages.MobileLoadAndBundlesPOM;
import Pages.MoneyTransferPOM;
import Pages.MyAccountsPO;
import Pages.ScanQRPOM;
import Pages.Education;
import Pages.Cash2GoodPOM;
import Pages.Orders;
import Pages.Profile_Feature;
import Pages.AddMoneyPOM;
import Pages.InviteEarnPOM;
import Pages.pompak;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SprintOnepointZero  extends AppSetup{

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

	
	//********************Maya*************************

	@Test(priority=11)
	public void Click_on_Maya_Icon() throws InterruptedException
	{
		MayaPOM POM=new MayaPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Maya Health" + "\").instance(0))")).click();
		//wait.until(ExpectedConditions.visibilityOf(POM.ClickOnMayaHelath));
		//POM.ClickOnMayaHelath.click();
		
	}
	
	
	@Test(priority=12)
	public void Click_on_Skip_Readmore() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		MayaPOM POM=new MayaPOM(driver);
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
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	}
	


	//********************Ala Cart*************************////

	@Test(priority=38)
	public void Click_on_Alacart_Icon() throws InterruptedException
	{
		Orders POM=new Orders(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "AlaCart" + "\").instance(0))")).click();
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		POM.AlaCart.click();

	

	}
	
	
	@Test(priority=39)
	public void Skip_Readmore_PopUp() throws InterruptedException
	{
		Orders POM=new Orders(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOf(POM.SkipReadMore));
		
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(3000);

	}


//	@Test(priority=40)
//	public void Select_Category_alaCart() throws InterruptedException
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		Orders POM=new Orders(driver);
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Women's Fashion\"))")).click();
////		wait.until(ExpectedConditions.visibilityOf(POM.HealthandSports));
////		POM.HealthandSports.click();	
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority=41)
//	public void Select_Product() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		Orders POM=new Orders(driver);
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Silver Micro Pave Cubic Zirconia Metal Ring-UA786133PK" + "\").instance(0))")).click();
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		
////		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnProduct));
////		POM.ClickOnProduct.click();
//	}

	
	
	
	@Test(priority=42)
	public void Search_For_Rs1_Product_1() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Others\"))")).click();
//		wait.until(ExpectedConditions.visibilityOf(POM.HealthandSports));
//		POM.HealthandSports.click();	
		Thread.sleep(3000);
	
	}

	
	
	@Test(priority = 43)
	public void Change_View() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ChangeView));
		POM.ChangeView.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	@Test(priority=44)
	public void Sorting_by_Name() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Name" + "\").instance(0))")).click();;
	}
	
	@Test(priority=45)
	public void Sorting_by_Date() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Date" + "\").instance(0))")).click();;
	}
	
	@Test(priority=46)
	public void Sorting_by_Price() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Price" + "\").instance(0))")).click();;
	}
	
	
	
	@Test(priority=47)
	public void Identify_Rs1_Product() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "General Zakat" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//	
//	
//	@Test(priority=48)
//	public void Search_Rs1_Product() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		Orders POM=new Orders(driver);
//		POM.Search_Product_Screen.sendKeys("testskuJCS", Keys.RETURN);
//		Thread.sleep(2000);
//		//sPOM.Search_Product_Screen.submit();
//		Thread.sleep(2000);
//	}
	

//	@Test(priority=49)
//	public void Open_Rs1_Product_Details() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.Open_1Rs_Product_Details));
//		POM.Open_1Rs_Product_Details.click();
//		Thread.sleep(2000);
//	
//	}
	

	
	@Test(priority=50)
	public void Add_To_Cart() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.BuyNow));
		POM.BuyNow.click();

	}

	@Test(priority=51)
	public void Cart_View() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCart));
		POM.ClickonCart.click();

	}
//
	@Test(priority=52)
	public void Check_Out_Product() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCheckout));
		Thread.sleep(3000);
		POM.ClickonCheckout.click();

}
//
	@Test(priority=53)
	public void Select_Standard_Delivery() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonStandardDelivery));
		POM.ClickonStandardDelivery.click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Standard Delivery\"))")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Standard Delivery" + "\").instance(0))")).click();
		//Thread.sleep(2000);
	
	
	}
//
//
	@Test(priority=54)
	public void Open_Payment_Screen() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.PayNow));
		POM.PayNow.click();
		
		Thread.sleep(3000);

	}
////
	@Test(priority=55)
	public void Selected_Payment_Method() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		LoginPagePOM POM=new LoginPagePOM(driver);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Pay On Delivery (POD)" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//
	@Test(priority=56)
	public void Confirmed_Transaction() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));
		POM.ConfirmTransaction.click();

	}
//
//
	@Test(priority=57)
	public void Confirmed_MPIN () throws InterruptedException

	{		

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
	//	wait.until(ExpectedConditions.visibilityOf(POM.UseMpin));
	//	POM.UseMpin.click();
		//wait.until(ExpectedConditions.visibilityOf(POM.One));
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();

	}
//
	@Test(priority=58)
	public void Close_Receipt () throws InterruptedException

	{	

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCross));
		POM.ClickonCross.click();
		Thread.sleep(3000);
	}

//
	@Test(priority=59)
	public void Profile_View() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonProfile));
		Thread.sleep(3000);
		//POM.AlaCart.click();
		POM.ClickonProfile.click();


	}
//
	@Test(priority=60)
	public void Open_Menu() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonMenu));
		POM.ClickonMenu.click();

	}

//
	@Test(priority=61)
	public void Order_Selection() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonOrder));
		POM.ClickonOrder.click();


	}

	@Test(priority=62)
	public void Track_Order() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTrackOrder));
		POM.ClickonTrackOrder.click();

	}

	@Test(priority=63)
	public void Cancle_Order() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCancleOrder));
		POM.ClickonCancleOrder.click();
		Thread.sleep(3000);

	}

	@Test(priority=64)
	public void Confirm_Cancellation() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSureCancle));
		POM.ClickonSureCancle.click();
		wait.until(ExpectedConditions.visibilityOf(POM.Close));

		POM.Close.click();
		Thread.sleep(3000);
	//	driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}


//	//@Parameters({"ZipCode", "NearestLandMark"})
//	
//		@Test(priority=65)
//		public void Add_New_Address() throws InterruptedException
//		{
//			
//			WebDriverWait wait = new WebDriverWait(driver,40);
//			Profile_Feature POM=new Profile_Feature(driver);
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonProfileofAlaCart));
//			POM.ClickonProfileofAlaCart.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAddressBook));
////			POM.ClickonAddressBook.click();
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonPlusButton));
////			POM.ClickonPlusButton.click();
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonFindonMap));
////			POM.ClickonFindonMap.click();
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAllowLocation));
////			POM.ClickonAllowLocation.click();
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAllowTheApp));
////			POM.ClickonAllowTheApp.click();
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
////			//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Confirm Location" + "\").instance(0))")).click();
////			POM.ClickonConfirmLocation.click();
//			
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			//driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchLocationOnMap));
////			POM.ClickonConfirmLocation.click();
////			Thread.sleep(2000);
////			POM.ClickonConfirmLocation.sendKeys("Get Well Medical Center");
////			Thread.sleep(2000);
////			
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchSugguestions));
////			POM.ClickonSearchSugguestions.click();
////				
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
////			//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Confirm Location" + "\").instance(0))")).click();
////			POM.ClickonConfirmLocation.click();
////			
////			wait.until(ExpectedConditions.visibilityOf(POM.WaitforContact));
////			POM.ZipCode.sendKeys("4600");
////			Thread.sleep(3000);
////			POM.NearestLandMark.sendKeys("Police Station");
////			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Save" + "\").instance(0))")).click();
////			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
////			POM.ClickonSave.click();	
////			wait.until(ExpectedConditions.visibilityOf(POM.Close_Text_Wait));
////			driver.pressKey(new KeyEvent(AndroidKey.BACK));
////			wait.until(ExpectedConditions.visibilityOf(POM.Draw_Close));
////			POM.Draw_Close.click();
////
//	}

	
	@Test(priority=66)
	public void Search_Product() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		//POM.AlaCart.click();
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchBox));
		POM.ClickonSearchBox.click();
		//Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchForQuery));
//		POM.ClickonSearchForQuery.click();
//		Thread.sleep(2000);
//		
//		POM.ClickonSearchForQuery.sendKeys("Bank ");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
//		wait.until(ExpectedConditions.visibilityOf(POM.SelectSuggestion));
//		POM.SelectSuggestion.click();
//		Thread.sleep(3000);
		
	}
	

	

	
	@Test(priority=67)
	public void Profile_Payment_Method() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonProfileofAlaCart));
		POM.ClickonProfileofAlaCart.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonPaymentMethod ));
		POM.ClickonPaymentMethod.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	
	@Test(priority=68)
	public void Profile_Help_And_Support() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonHelpandSupport));
		POM.ClickonHelpandSupport.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	
	@Test(priority=69)
	public void Profile_About_AlaCart() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonAboutAlaCart));
		POM.ClickonAboutAlaCart.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	
	@Test(priority= 70)
	public void Profile_Terms_And_Conditions() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTermsAndCondition));
		POM.ClickonTermsAndCondition.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	
	
	@Test(priority= 71)
	public void Profile_Wish_List() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonWishList));
		POM.ClickonWishList.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	
	
	
	@Test(priority= 72)
	public void Profile_AlaCartCradits() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonAlaCartCredits));
		POM.ClickonAlaCartCredits.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
	
	
	
	@Test(priority= 73)
	public void Profile_View_JazzCash_Profile() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonJazzCashProfile));
		POM.ClickonJazzCashProfile.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}
	
		
	
	@Test(priority= 74)
	public void Open_All_Categories() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Open All Categories" + "\").instance(0))")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	
	}
	
	
	@Test(priority= 75)
	public void Click_on_Expand_Categories() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);

		wait.until(ExpectedConditions.visibilityOf(POM.ClickonExpand));
		POM.ClickonExpand.click();
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority= 76)
	public void Close_All_Catergories() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);

		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCloseAllCategories));
		POM.ClickonCloseAllCategories.click();
		Thread.sleep(2000);
	}
		
	
	
	@Test(priority= 77)
	public void View_Cart() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders (driver);

		wait.until(ExpectedConditions.visibilityOf(POM.Cart_Icon));
		POM.Cart_Icon.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		
	}
	

	//********************************************Telenor Bundles**************************//
//
	@Test(priority=78)
	public void Clicked_On_Mobile_Bundles() throws InterruptedException 
	{		

		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Appdrawer));
		POM.Appdrawer.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Mobile Bundles" + "\").instance(0))")).click();

	}

	@Test(priority=82)
	public void Bundle_Selected_Successfully() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Telenor" + "\").instance(0))")).click();
		
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Telenor\"))")).click();
		
	//wait.until(ExpectedConditions.visibilityOf(POM.SelectOperator));
	//	POM.SelectOperator.click();
		Thread.sleep(2000);

		
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "4G Weekly Super" + "\").instance(0))"));
		wait.until(ExpectedConditions.visibilityOf(POM.SubscribeBundle));
		POM.SubscribeBundle.click();
		
		
		
		
		Thread.sleep(2000);
	}

	@Test(priority=83)
	public void Entered_Recipient_Mobile_Number() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.RecipientMobileNumber));

		POM.RecipientMobileNumber.click();
		POM.RecipientMobileNumber.sendKeys("03435598382");
		POM.ConfirmNumber.click();

//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(1000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(1000);
		
	}

	@Test(priority=84)
	public void Confirmed_Mobile_Bundle_Purchase() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));

		POM.ConfirmTransaction.click();
	}

	@Test(priority=85)
	public void MPIN_Entered() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.One));

		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();	

	}

	@Test(priority=86)
	public void Mobile_Bundle_Reciept() throws InterruptedException 
	{		
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Rupees));

		POM.Rupees.isDisplayed();
		Thread.sleep(2000);
	
		
	driver.findElementById("com.techlogix.mobilinkcustomer:id/btn_done").click();

		
		
	}



//------------------------------------------Cash2Good--------------------------------------------------

@Test(priority=136)
public void Clicked_On_Cash2Good_icon() throws InterruptedException 
{		

	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.Appdrawer));
	POM.Appdrawer.click();
	Thread.sleep(1000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Cash2Goods Transfer" + "\").instance(0))")).click();
	Thread.sleep(3000);
}

//@Test(priority=137)
//public void Click_On_Cash2Good() throws InterruptedException 
//{		
//	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.ClickonCash2Good));
//	POM.ClickonCash2Good.click();
//	Thread.sleep(3000);
//
//}





@Test(priority = 138)
public void Clicked_On_C2GMobile_Number_Search() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	
	wait.until(ExpectedConditions.visibilityOf(POM.ClickonMobileSearchField));

	POM.ClickonMobileSearchField.click();
	Thread.sleep(4000);

}

@Test(priority = 139)
public void Enter_C2G_Mobile_Number() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	POM.ClickonMobileSearchField.sendKeys("03345648867");

	Thread.sleep(2000);
}



@Test(priority = 140)
public void Click_on_Mobile_Number_CheckBox() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	POM.ClickonC2GMobileNumberCheckbox.click();
	Thread.sleep(2000);
}


@Test(priority = 141)
public void Click_on_C2G_Send_Button() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	POM.ClickonC2GSendButton.click();
	Thread.sleep(2000);
}



@Test(priority = 142)
public void Select_City_Dropdown() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.C2GSelectCityDropDown));
	POM.C2GSelectCityDropDown.click();
	Thread.sleep(2000);
}



@Test(priority = 143)
public void C2G_Click_on_search_field() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.C2GSelectCitySearchfield));
	POM.C2GSelectCitySearchfield.click();
	Thread.sleep(2000);
}

@Test(priority = 144)
public void C2G_Enter_City_Name() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	//wait.until(ExpectedConditions.visibilityOf(POM.C2GSelectCityDropDown));
	POM.C2GSelectCitySearchfield.sendKeys("Rawalpindi");;
	Thread.sleep(2000);
}

@Test(priority = 145)
public void C2G_Select_City() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.C2GClickonCity));
	POM.C2GClickonCity.click();
	Thread.sleep(2000);
}


@Test(priority = 146)
public void Select_Category() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	Thread.sleep(2000);
	
	driver.findElement(MobileBy.AndroidUIAutomator(
	        "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
	         ".scrollIntoView(new UiSelector().textContains(\"Computers and Computer Peripheral Equipment and Software\"))")).click();

	Thread.sleep(2000);
}


@Test(priority = 147)
public void Click_on_amount() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	Thread.sleep(2000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Rs." + "\").instance(0))")).click();
	Thread.sleep(2000);
}




@Test(priority = 148)
public void Enter_C2G_Amount() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.Three));
	POM.One.click();
	Thread.sleep(2000);
}


@Test(priority = 149)
public void Enter_C2G_Amount_Continue() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.ClickonC2GAmountContinue));
	POM.ClickonC2GAmountContinue.click();
	Thread.sleep(2000);
}


@Test(priority = 150)
public void Send_C2G_Button() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Send Rs. 1 Cash2Goods" + "\").instance(0))"));
    POM.ClickOnSendC2GButton.click();
    Thread.sleep(2000);



}


@Test(priority = 151)
public void Click_On_C2G_Confirm_Button() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.ClickonC2GSubmitButton));
    POM.ClickonC2GSubmitButton.click();
    Thread.sleep(2000);



}



@Test(priority = 152)
public void Enter_C2G_MPIN() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.visibilityOf(POM.ClickonC2GUseMPIN));
//	POM.ClickonC2GUseMPIN.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(POM.Zero));

	POM.One.click();
	POM.One.click();
	POM.Two.click();
	POM.Two.click();



}


@Test(priority = 153)
public void C2G_Receipt() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.C2GReceiptVisibility));
	Thread.sleep(2000);

}

@Test(priority = 154)
public void C2G_Receipt_Back() throws InterruptedException 
{		
	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(POM.C2GClickonReceiptBackButton));
	POM.C2GClickonReceiptBackButton.click();
}

@Test(priority = 154)

public void Clicked_Help_and_Support() throws InterruptedException 
{		

	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.C2GHelpandSupport));
	POM.C2GHelpandSupport.click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	
	
	
	
}

/////////////////////////////////////////////////////////POMPACK//////////////////////////////////////

@Test(priority=150)

public void Search_Pompak() throws InterruptedException 
{		


//	pompak POM=new pompak(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.SearchApp_pompak)); // wait and click MT
//	POM.SearchApp_pompak.click();
//	POM.SearchApp_pompak.sendKeys("PomPak");
//	Thread.sleep(3000);
	
	
	MoneyTransferPOM POM=new MoneyTransferPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);

	driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
	POM.SearchApp.sendKeys("Pompak"); // search MT
	wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click MT
	driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
	POM.ClickMT.click();
	Thread.sleep(3000);

	

}



//@Test(priority=151)
//
//public void Clicked_On_Pompak() throws InterruptedException 
//{		
//
//
//	pompak POM=new pompak(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.Pompak_Search)); // wait and click MT
//	POM.Pompak_Search.click();
//	Thread.sleep(3000);
//
//}


@Test(priority=152)
public void Clicked_On_play_video() throws InterruptedException 
{		


	pompak POM=new pompak(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.play_Video)); // wait and click MT
	POM.play_Video.click();
	Thread.sleep(5000);
	POM.play_Video.click();

}

@Test(priority=153)
public void Clicked_On_download_app() throws InterruptedException 
{		


	pompak POM=new pompak(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.Download_Button)); // wait and click MT
	POM.Download_Button.click();
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));


}
	
}



