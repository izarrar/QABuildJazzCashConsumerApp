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

public class CONSUMERAPP  extends AppSetup{

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
		MayaPOM  POM=new MayaPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		//Thread.sleep(3000);
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Maya Health" + "\").instance(0))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
		         ".scrollIntoView(new UiSelector().text(\"Food Delivery\"))")).click();
		Thread.sleep(3000);
		
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
		
	}
	
	
	
	
	
	
	
	
	

	//********************Ala Cart*************************////

	@Test(priority=18)
	public void Click_on_Alacart_Icon() throws InterruptedException
	{
		Orders POM=new Orders(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "AlaCart" + "\").instance(0))")).click();
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		//POM.AlaCart.click();

	

	}
	 
	
	@Test(priority=20)
	public void Skip_Readmore_PopUp() throws InterruptedException
	{
		Orders POM=new Orders(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOf(POM.SkipReadMore));
		
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(3000);

	}


//	@Test(priority=21)
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
//	@Test(priority=22)
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

	
	
	
	@Test(priority=23)
	public void Search_For_Rs1_Product_1() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Others\"))")).click();
//		wait.until(ExpectedConditions.visibilityOf(POM.HealthandSports));
//		POM.HealthandSports.click();	
		Thread.sleep(3000);
	
	}

	
	@Test(priority=24)
	public void Sorting_by_Price() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Price" + "\").instance(0))")).click();
		;
	}
	
	
	
	@Test(priority=25)
	public void Identify_Rs1_Product() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Testprocod21" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//	
//	
//	@Test(priority=26)
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
	

//	@Test(priority=27)
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
	

	
	@Test(priority=28)
	public void Add_To_Cart() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.BuyNow));
		POM.BuyNow.click();

	}

	@Test(priority=29)
	public void Cart_View() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCart));
		POM.ClickonCart.click();

	}
//
	@Test(priority=30)
	public void Check_Out_Product() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCheckout));
		Thread.sleep(3000);
		POM.ClickonCheckout.click();

}
//
	@Test(priority=31)
	public void Select_Standard_Delivery() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonStandardDelivery));
		POM.ClickonStandardDelivery.click();
	}
//
//
	@Test(priority=32)
	public void Open_Payment_Screen() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.PayNow));
		POM.PayNow.click();
		
		Thread.sleep(3000);

	}
////
	@Test(priority=33)
	public void Selected_Payment_Method() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		LoginPagePOM POM=new LoginPagePOM(driver);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Pay On Delivery (POD)" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//
	@Test(priority=34)
	public void Confirmed_Transaction() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));
		POM.ConfirmTransaction.click();

	}
//
//
	@Test(priority=35)
	public void Confirmed_MPIN () throws InterruptedException

	{		

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.UseMpin));
		POM.UseMpin.click();
		wait.until(ExpectedConditions.visibilityOf(POM.One));
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();

	}
//
	@Test(priority=36)
	public void Close_Receipt () throws InterruptedException

	{	

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCross));
		POM.ClickonCross.click();
		Thread.sleep(3000);
	}

//
	@Test(priority=37)
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
	@Test(priority=38)
	public void Open_Menu() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonMenu));
		POM.ClickonMenu.click();

	}

//
	@Test(priority=39)
	public void Order_Selection() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonOrder));
		POM.ClickonOrder.click();


	}

	@Test(priority=40)
	public void Track_Order() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTrackOrder));
		POM.ClickonTrackOrder.click();

	}

	@Test(priority=41)
	public void Cancle_Order() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCancleOrder));
		POM.ClickonCancleOrder.click();
		Thread.sleep(3000);

	}

	@Test(priority=42)
	public void Confirm_Cancellation() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSureCancle));
		POM.ClickonSureCancle.click();
		wait.until(ExpectedConditions.visibilityOf(POM.Close));

		POM.Close.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}


//	@Parameters({"ZipCode", "NearestLandMark"})
//	
//		@Test(priority=43)
//		public void Add_New_Address() throws InterruptedException
//		{
//			
//			WebDriverWait wait = new WebDriverWait(driver,40);
//			Profile_Feature POM=new Profile_Feature(driver);
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonProfileofAlaCart));
//			POM.ClickonProfileofAlaCart.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAddressBook));
//			POM.ClickonAddressBook.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonPlusButton));
//			POM.ClickonPlusButton.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonFindonMap));
//			POM.ClickonFindonMap.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAllowLocation));
//			POM.ClickonAllowLocation.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAllowTheApp));
//			POM.ClickonAllowTheApp.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
//			POM.ClickonConfirmLocation.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.WaitforContact));
//			POM.ZipCode.sendKeys("4600");
//			Thread.sleep(3000);
//			POM.NearestLandMark.sendKeys("Police Station");
//			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Save" + "\").instance(0))")).click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
//			POM.ClickonSave.click();	
//			wait.until(ExpectedConditions.visibilityOf(POM.Close_Text_Wait));
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			wait.until(ExpectedConditions.visibilityOf(POM.Draw_Close));
//			POM.Draw_Close.click();
//
//		}

	
	@Test(priority=44)
	public void Search_Product() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		//POM.AlaCart.click();
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchBox));
		POM.ClickonSearchBox.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchForQuery));
		POM.ClickonSearchForQuery.click();
		POM.ClickonSearchForQuery.sendKeys("Mobici");
		wait.until(ExpectedConditions.visibilityOf(POM.SelectSuggestion));
		POM.SelectSuggestion.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=45)
	public void Change_View() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ChangeView));
		POM.ChangeView.click();
		Thread.sleep(3000);
		
	}
	

	
//	@Test(priority=11)
//	public void Item_Order() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
////
////		wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
////		POM.AlaCart.click();
//		
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "AlaCart" + "\").instance(0))")).click();
//		
//		
//		wait.until(ExpectedConditions.visibilityOf(POM.SkipReadMore));
//		Thread.sleep(5000);
//		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
//		Thread.sleep(3000);
//
//	}
//
//
//	@Test(priority=12)
//	public void Select_Category_alaCart() throws InterruptedException
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.HealthandSports));
//		POM.HealthandSports.click();	
//
//	}
//
//	@Test(priority=13)
//	public void Select_Product() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnProduct));
//		POM.ClickOnProduct.click();
//	}
//
//	@Test(priority=14)
//	public void Add_To_Cart() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.BuyNow));
//		POM.BuyNow.click();
//
//	}
//
//@Test(priority=15)
//	public void Cart_View() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCart));
//		POM.ClickonCart.click();
//
//	}
//
//	@Test(priority=16)
//	public void Check_Out_Product() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCheckout));
//		Thread.sleep(3000);
//		POM.ClickonCheckout.click();
//
//}
//
//	@Test(priority=17)
//	public void Select_Standard_Delivery() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonStandardDelivery));
//		POM.ClickonStandardDelivery.click();
//	}
//
//
//	@Test(priority=18)
//	public void Open_Payment_Screen() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.PayNow));
//		POM.PayNow.click();
//		
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority=19)
//	public void Selected_Payment_Method() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Pay On Delivery (POD)" + "\").instance(0))")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test(priority=20)
//	public void Confirmed_Transaction() throws InterruptedException
//
//	{			
//
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));
//		POM.ConfirmTransaction.click();
//
//	}
//
//
//	@Test(priority=21)
//	public void Confirmed_MPIN () throws InterruptedException
//
//	{		
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.UseMpin));
//		POM.UseMpin.click();
//		wait.until(ExpectedConditions.visibilityOf(POM.One));
//		POM.One.click();
//		POM.One.click();
//		POM.Two.click();
//		POM.Two.click();
//
//	}
//
//	@Test(priority=22)
//	public void Close_Receipt () throws InterruptedException
//
//	{		
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		LoginPagePOM POM=new LoginPagePOM(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCross));
//		POM.ClickonCross.click();
//		Thread.sleep(3000);
//	}
//
//
//	@Test(priority=23)
//	public void Profile_View() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonProfile));
//		Thread.sleep(3000);
//		//POM.AlaCart.click();
//		POM.ClickonProfile.click();
//
//
//	}
//
//	@Test(priority=24)
//	public void Open_Menu() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonMenu));
//		POM.ClickonMenu.click();
//
//	}
//
//
//	@Test(priority=25)
//	public void Order_Selection() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonOrder));
//		POM.ClickonOrder.click();
//
//
//	}
//
//	@Test(priority=26)
//	public void Track_Order() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTrackOrder));
//		POM.ClickonTrackOrder.click();
//
//	}
//
//	@Test(priority=27)
//	public void Cancle_Order() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCancleOrder));
//		POM.ClickonCancleOrder.click();
//		Thread.sleep(3000);
//
//	}
//
//	@Test(priority=28)
//	public void Confirm_Cancellation() throws InterruptedException
//	{
//
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Orders POM=new Orders(driver);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSureCancle));
//		POM.ClickonSureCancle.click();
//		wait.until(ExpectedConditions.visibilityOf(POM.Close));
//
//		POM.Close.click();
//		Thread.sleep(3000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//
//	}
//
//
//	@Parameters({"ZipCode", "NearestLandMark"})
//	
//		@Test(priority=29)
//		public void Add_New_Address() throws InterruptedException
//		{
//			
//			WebDriverWait wait = new WebDriverWait(driver,40);
//			Profile_Feature POM=new Profile_Feature(driver);
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonProfileofAlaCart));
//			POM.ClickonProfileofAlaCart.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAddressBook));
//			POM.ClickonAddressBook.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonPlusButton));
//			POM.ClickonPlusButton.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonFindonMap));
//			POM.ClickonFindonMap.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAllowLocation));
//			POM.ClickonAllowLocation.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonAllowTheApp));
//			POM.ClickonAllowTheApp.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
//			POM.ClickonConfirmLocation.click();
//			wait.until(ExpectedConditions.visibilityOf(POM.WaitforContact));
//			POM.ZipCode.sendKeys("4600");
//			Thread.sleep(3000);
//			POM.NearestLandMark.sendKeys("Police Station");
//			driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Save" + "\").instance(0))")).click();
//			wait.until(ExpectedConditions.visibilityOf(POM.ClickonConfirmLocation));
//			POM.ClickonSave.click();	
//			wait.until(ExpectedConditions.visibilityOf(POM.Close_Text_Wait));
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			wait.until(ExpectedConditions.visibilityOf(POM.Draw_Close));
//			POM.Draw_Close.click();
//
//		}
//
//	
//	@Test(priority=30)
//	public void Search_Product() throws InterruptedException
//	{
//		
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Profile_Feature POM=new Profile_Feature(driver);
//		Thread.sleep(3000);
//		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
//		//POM.AlaCart.click();
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchBox));
//		POM.ClickonSearchBox.click();
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickonSearchForQuery));
//		POM.ClickonSearchForQuery.click();
//		POM.ClickonSearchForQuery.sendKeys("Mobici");
//		wait.until(ExpectedConditions.visibilityOf(POM.SelectSuggestion));
//		POM.SelectSuggestion.click();
//		Thread.sleep(3000);
//		
//	}
//	
//	@Test(priority=31)
//	public void Change_View() throws InterruptedException
//	{
//		
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		Profile_Feature POM=new Profile_Feature(driver);
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOf(POM.ChangeView));
//		POM.ChangeView.click();
//		Thread.sleep(3000);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//***************************Send money to JazzCash Account Flows//////////////////////////////////////////////

	@Test(priority=46)
	public void Clicked_On_Money_Transfer_To_Jazzcash() throws InterruptedException 
	{		

		
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
	
		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
		POM.SearchApp.sendKeys("Money Transfer"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click MT
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
		POM.ClickMT.click();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(POM.TMobile));
		//POM.TMobile.click();
	}

//	@Test(priority=47)
//	public void Clicked_On_Money_Transfer_To_Mobile_Account() throws InterruptedException 
//	{		
//
//		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		wait.until(ExpectedConditions.visibilityOf(POM.TransferMAcc));
//
//		POM.TransferMAcc.click();
//	}

	@Test(priority=48)
	public void Searched_And_Selected_Recipent() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchNO));

		POM.SearchNO.click();
		POM.SearchNO.sendKeys("03435598382");

		wait.until(ExpectedConditions.visibilityOf(POM.Send));
		POM.Send.click();	
		Thread.sleep(3000);
		POM.ClickMT.click();
	}

	@Test(priority=49)
	public void Entered_Amount_To_Transfer_JC() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.DailyDebitLimits));
		POM.One.click();
		Thread.sleep(3000);
		
		
		if (POM.JCTranferFailed.isDisplayed()) {
			
	
		//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Try again" + "\").instance(0))")).click();
			
			
			POM.JCTranferFailed.isDisplayed();
			POM.JCTranferFailedTryAgainButton.click();
			
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));

			}
			
			else {
				
				Thread.sleep(2000);
				
			}
		
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));	
//		Thread.sleep(2000);
	}

	@Test(priority=50)
	public void Amount_Entered_To_Transfer_Successfully() throws InterruptedException {
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Continue1));
		Thread.sleep(1000);
		POM.Continue1.click();

	}

	@Test(priority=51)
	public void Authorize_Transfer_To_JC() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfrimTransaction));
		Thread.sleep(2000);

		POM.ConfrimTransaction.click();
	}	

	@Test(priority=52)
	public void Entered_MPIN_To_Authorize_Transfer_To_JC() throws InterruptedException 
	{		

		LoginPagePOM POM=new LoginPagePOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.One));
		
		Thread.sleep(2000);

		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();	

	}

	@Test(priority=53)
	public void Transfer_To_JC_Reciept() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.TrasactionRecipt));

		POM.TrasactionRecipt.isDisplayed();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//driver.findElementById("com.techlogix.mobilinkcustomer:id/etSearchApp").click();	
		//POM.BackArrow.click();
		
	}


	//***************************Send money to Bank Account Flows

	@Test(priority=54)
	public void Clicked_On_Money_Transfer_To_Bank() throws InterruptedException 
	{		
		
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
		POM.SearchApp.sendKeys("Money Transfer"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click BT
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
		POM.ClickBT.click();
		POM.IBFT.click();
		Thread.sleep(3000);
	}

	@Test(priority=55)
	public void Searched_And_Selected_Bank_Name() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchNO));

		POM.SearchNO.click();
		
		POM.SearchNO.sendKeys("Standard Chartered Bank");
		POM.ClickBankName.click();	
		Thread.sleep(3000);
	}

	@Test(priority=56)
	public void Entered_Account_Number() throws InterruptedException 
	{		

		LoginPagePOM POM=new LoginPagePOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.One));

		POM.Zero.click();
		POM.One.click();
		POM.Seven.click();
		POM.Two.click();
		POM.Five.click();
		POM.Seven.click();
		POM.Eight.click();
		POM.Eight.click();
		POM.Two.click();
		POM.Zero.click();
		POM.One.click();
		
		Thread.sleep(3000);
	
	}

	@Test(priority=57)
	public void Entered_Bank_Account_Number() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Continue1));
		Thread.sleep(2000);

		POM.Continue1.click();
		
		Thread.sleep(3000);
	}


	@Test(priority=58)
	public void Entered_Amount_To_Transfer() throws InterruptedException 
	{
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);

		wait.until(ExpectedConditions.visibilityOf(POM.DailyDebitLimits));

		POM.One.click();	
		Thread.sleep(2000);
		POM.SendButton.click();
		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(2000);
		
		
		
		
	}
	
	
	@Test(priority=59)
	public void Select_Purpoes_of_Payment() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.PurposePaymentSearchBox));

		POM.PurposePaymentSearchBox.click();
		
		
		POM.PurposePaymentSearchBox.sendKeys("Family Support");	
	
		POM.SelectPurposeofPayment.click();	
		Thread.sleep(3000);

	}
	
	


	@Test(priority=60)
	public void Skipped_Recipient_Mobile_Number() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Skip));

		POM.Skip.click();
		
		Thread.sleep(3000);

	}

	@Test(priority=61)
	public void Confirmed_Transfer_To_Bank_Account()  
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.JazzCashWallet));

		POM.Authorise_Transaction.click();
		
		

	}

	@Test(priority=62)
	public void Entered_MPIN_To_Authorize_Transfer_To_Bank() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.MPINScreenVerification));

		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();
		
		Thread.sleep(4000);

	}

		@Test(priority=63)
		public void Transfer_To_Bank_Reciept() throws InterruptedException 
		{		
	
			MoneyTransferPOM POM=new MoneyTransferPOM(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);
			POM.Reciept_Found.isDisplayed();
			//Going back to Home Screen
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
	         
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			
	
		}


	
	
	//***********************************************Send Money to CNIC Flows/////////////////////////////////////////

	@Test(priority=64)
	public void Clicked_On_Money_Transfer_To_CNIC() throws InterruptedException 
	{														
		
	MoneyTransferPOM POM=new MoneyTransferPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	
	driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
	POM.SearchApp.sendKeys("Money Transfer"); // search MT
	//wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click BT
	driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOf(POM.enter));
	POM.CNIC.click();
	Thread.sleep(3000);
	//Thread.sleep(2000);
	
	}
	
	@Test(priority=65)
	public void Enter_CNIC_Number_for_Money_Transfer() throws InterruptedException 
	{														
		
	MoneyTransferPOM POM=new MoneyTransferPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.EnterCNICVisibility));
	
	POM.Three.click();
	Thread.sleep(2000);
	POM.Seven.click();
	Thread.sleep(2000);
	POM.Four.click();
	Thread.sleep(2000);
	POM.Zero.click();
	Thread.sleep(2000);
	POM.Five.click();
	Thread.sleep(2000);
	POM.Four.click();
	Thread.sleep(2000);
	POM.Three.click();
	Thread.sleep(2000);
	POM.Six.click();
	Thread.sleep(2000);
	POM.Two.click();
	Thread.sleep(2000);
	POM.Two.click();
	Thread.sleep(2000);
	POM.Zero.click();
	Thread.sleep(2000);
	POM.Four.click();
	Thread.sleep(2000);
	POM.Three.click();
	
	
	wait.until(ExpectedConditions.visibilityOf(POM.ContinueButton));
	POM.ContinueButton.click();
	Thread.sleep(2000);
	
	
	
	}

	@Test(priority=67)
	public void Amount_Entered_To_CNIC_Transfer() throws InterruptedException 
	{		

		LoginPagePOM POM=new LoginPagePOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.DailyDebitLimits));

		POM.One.click();
		POM.Zero.click();
		
		
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(1000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(1000);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		Thread.sleep(1000);

	}

	@Test(priority=68)
	public void Entered_Recipients_Mobile_Number_CNIC() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.Continue.click();
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Zero));

		//Entering Recipient Mobile Number(03435598382)
		POM.Zero.click();
		POM.Three.click();
		POM.Four.click();
		POM.Three.click();
		POM.Five.click();
		POM.Five.click();
		POM.Nine.click();
		POM.Eight.click();
		POM.Three.click();
		POM.Eight.click();
		POM.Two.click();
		POM.Continue1.click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);

	}

	@Test(priority=69)
	public void Athorize_Send_Money_To_CNIC() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.AuthoriseTransfer1));

		POM.AuthoriseTransfer1.click();
	}

	@Test(priority=70)
	public void Entered_MPIN() throws InterruptedException 
	{		

		LoginPagePOM POM=new LoginPagePOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.One));

		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();	

	}

	@Test(priority=71)
	public void Transfered_To_CNIC_Reciept() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.DoneReciept));

		POM.DoneReciept.isDisplayed();
		POM.DoneReciept.click();

	}
	
	

	
	
	//*********************************Prepaid Load Flows*******************
	
		@Test(priority=72)
	public void Clicked_On_Prepaid_Load() throws InterruptedException 
	{		

		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
		POM.SearchApp.sendKeys("Prepaid Load"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click MT
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_sub_title").click();
		Thread.sleep(2000);
	}
		
	

	@Test(priority=73)
	public void Searched_And_Selected_Jazz_Number() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchMobileNO));

		POM.SearchMobileNO.click();
		POM.SearchMobileNO.sendKeys("03025782949");
		POM.SelectNO.click();
		
		Thread.sleep(3000);
	}

	@Test(priority=74)
	public void Entered_Amount_For_Prepaid_Load() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Three));

		POM.Five.click();
		POM.Zero.click();
		
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		
		
		
		//In case Prepaid is not working
		
		driver.findElementById("com.techlogix.mobilinkcustomer:id/iv_close").click();
		driver.findElementById("com.techlogix.mobilinkcustomer:id/btn_positive").click();
		
		
		POM.LoadRS.click();

	}

	@Test(priority=75)
	public void Confirmed_Prepaid_Load_Transaction() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));

		POM.ConfirmTransaction.click();

	}

	@Test(priority=76)
	public void Entered_MPIN_For_Prepaid_Load_Transaction() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.One));

		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();
		
		

	}

	@Test(priority=77)
	public void Prepaid_Load_Reciept() throws InterruptedException 
	{		
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Rupees));


		POM.Rupees.isDisplayed();
		POM.Closereciept.click();
		POM.Closereciept.click();
		
		driver.findElementById("com.techlogix.mobilinkcustomer:id/btn_positive").click();
		

	}

	
	
	
	
	//***************************Postpaid Load Flows********************


	@Test(priority=78)
	public void Clicked_On_Postpaid_Bill() throws InterruptedException 
	{		

		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
		POM.SearchApp.sendKeys("Postpaid Bill"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click postpaid
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_sub_title").click();
		Thread.sleep(2000);

	}


	
	@Test(priority=79)
	public void Searched_And_Selected_Postpaid_Number() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchMobileNO));

		POM.SearchMobileNO.click();
		POM.SearchMobileNO.sendKeys("03054352178");
		POM.SelectNO.click();
		
		Thread.sleep(3000);
	}

	@Test(priority=80)
	public void Entered_Postpaid_Bill_Amount() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Three));

		POM.Five.click();
		POM.Zero.click();
		//POM.LoadRS.click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		
	

	}



	//********************************************Mobile Bundles**************************//
//
	@Test(priority=81)
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
	public void Operator_Selected_Successfully() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Telenor" + "\").instance(0))")).click();
	
		Thread.sleep(2000);
	}
	
	@Test(priority=83)
	public void Search_Bundle_Successfully() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.ClickontheSearchBundleField)).click();
		POM.ClickontheSearchBundleField.sendKeys("Monthly WhatsApp & FB Offer");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(2000);
	}
	
	@Test(priority=84)
	public void Click_on_the_subscribe_Bundle_Button() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.visibilityOf(POM.SubscribeBundle));
		POM.SubscribeBundle.click();
		Thread.sleep(2000);
	}
	
	

	@Test(priority=85)
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

	@Test(priority=86)
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
//	@Test(priority=87)
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
//	@Test(priority=88)
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

		
		
//	}
	//********************************************Utility Bills**************************//

	@Test(priority=87)
	public void Clicked_On_PTCL() throws InterruptedException 
	{		

		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
		POM.SearchApp.sendKeys("PTCL Landline"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click postpaid
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_sub_title").click();
		Thread.sleep(2000);
		
	}

	

	
	@Test(priority=88)
	public void Searched_And_Selected_PTCL() throws InterruptedException 
	{	
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchServiceProvider));
		POM.SearchServiceProvider.click();
		POM.SearchServiceProvider.sendKeys("PTCL Landline");
		//POM.PTCLClick.click();
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
		Thread.sleep(2000);
	}

	
	
	@Test(priority=89)
	public void Entered_Bill_Reference_NO() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.BillReferenceNo));

		POM.BillReferenceNo.sendKeys("1515465219");	

		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
	}

		@Test(priority=90)
		public void Bill_Details_Fetched_Successfully() throws InterruptedException 
		{		
			MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOf(POM.FetchBill));
	
			POM.FetchBill.click();
	        
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(1000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(1000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(1000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(1000);
			
			}
		
		
		@Test(priority=91)
		public void Clicked_On_Nayatel() throws InterruptedException 
		{		

			MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);
			driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
			POM.SearchApp.sendKeys("Nayatel"); // search MT
			wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click postpaid
			driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_sub_title").click();
			Thread.sleep(2000);
			
		}
		
		

		@Test(priority=92)
		public void Searched_And_Selected_Nayatel() throws InterruptedException 
		{	
			MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOf(POM.SearchServiceProvider));
			POM.SearchServiceProvider.click();
			POM.SearchServiceProvider.sendKeys("Nayatel");
			//POM.PTCLClick.click();
			driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
			Thread.sleep(2000);
		}
		
		
		
		
		@Test(priority=93)
		public void Entered_Bill_Reference_NO_Nayatel() throws InterruptedException 
		{		
			MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOf(POM.BillReferenceNo));

			POM.BillReferenceNo.sendKeys("32177");	

			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(2000);
			
			
			
		}
		
		
		
		
		
		
		
		

	@Test(priority=94)
	public void Bill_Details_Fetched_Failed() throws InterruptedException 
	{		
		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.FetchBill));

		POM.FetchBill.click();
		wait.until(ExpectedConditions.visibilityOf(POM.Okay));

		POM.Okay.click();
		POM.Close.click();
		POM.Okay.click();

	}
	
	
	
	//********************************************<Add Money>**************************//

	@Test(priority=95)
	public void Clicked_On_Add_Money() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickOnAddMoneyButton));
		POM.ClickOnAddMoneyButton.click();	
	
	}
	
	
	@Test(priority=96)
	public void Click_On_Deposit_Via_Debit_Card() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Deposit via Debit Card" + "\").instance(0))")).click();
		Thread.sleep(3000);
}
	
	
	
	
	@Test(priority=97)
	public void Enter_Depit_Card_Amount() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOf(POM.One));
		POM.Three.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	
		
		
		
}

	
	@Test(priority=98)
	public void Click_On_Request_Money() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Request Money" + "\").instance(0))")).click();
		Thread.sleep(2000);

	
}
	
	
	
	@Test(priority=99)
	public void Search_User_For_Request_Money() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchField));
		POM.SearchField.click();
		POM.SearchField.sendKeys("03094004479");
		POM.NumberClick.click();
		Thread.sleep(2000);

	
}
	
	@Test(priority=100)
	public void Enter_Request_Money_Amount() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);

		wait.until(ExpectedConditions.visibilityOf(POM.One));
		POM.Three.click();
		Thread.sleep(3000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		

	
}
	
	
	@Test(priority=101)
	public void Click_on_Deposit_at_Door_Step() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		Thread.sleep(1000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Deposit at Doorstep" + "\").instance(0))")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(POM.One));
		Thread.sleep(1000);
		//test case failed
}
	
	
	
	
	
	@Test(priority=102)
	public void Click_on_Deposite_Via_Bank() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		Thread.sleep(1000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Deposit via Bank" + "\").instance(0))")).click();
		Thread.sleep(4000);
	
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		
}
	
@Test(priority=103)
	public void Click_on_Deposit_Via_JazzCash_Agent() throws InterruptedException 
	{		
		AddMoneyPOM POM=new AddMoneyPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		Thread.sleep(1000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Deposit via JazzCash Agent" + "\").instance(0))")).click();
		Thread.sleep(3000);	
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		
}
	
	
	
	
//////////////////////****Careem Voucher****////////////

	@Test(priority = 104)
	public void Open_Drawer() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); // Search Click
		POM.SearchApp.sendKeys("Careem Voucher"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click Careem
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
		Thread.sleep(1000);
	}

	@Test(priority = 105)
	public void Select_Careem() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Careem Voucher" + "\").instance(0))"))
				.click(); // Find Careem and click
		Thread.sleep(1000);
	}

	@Test(priority = 106)
	public void Select_Voucher() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "Rs. 200" + "\").instance(0))"))
				.click(); // Select Careem Voucher and click
		Thread.sleep(2000);
	}

	@Test(priority = 107)
	public void Click_Continue() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.findElementById("com.techlogix.mobilinkcustomer:id/btn_transaction").click();
		Thread.sleep(1000);

	}

	@Test(priority = 108)
	public void Land_On_Homescreen() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

/////******* Donations ********//////////////////////////////////

	@Test(priority = 109)
	public void Search_Donations() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); // Search Click
		POM.SearchApp.sendKeys("Donations"); // search MT
		wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click Donations
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_sub_title").click();
		Thread.sleep(1000);
	}

	@Test(priority = 110)
	public void Select_SKMCH() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
//		driver.findElementById("com.techlogix.mobilinkcustomer:id/et_search_charity").click(); //Search Click
//		POM.SearchApp.sendKeys("SKMCH"); // search SKMCH
//		Thread.sleep(2000);
//		//wait.until(ExpectedConditions.visibilityOf(POM.SearchApp)); // wait and click on SKMCH
//		driver.findElementById( "com.techlogix.mobilinkcustomer:id/iv_search").click();
//		Thread.sleep(2000);

		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "SKMCH" + "\").instance(0))"))
				.click(); // Select SKMCH and click
		Thread.sleep(2000);

	}

	@Test(priority = 111)
	public void Select_Donation_Type() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_donation_type").click(); // Select Donation Type

	}

//	@Test(priority = 112)
//	public void Enter_Amount() throws InterruptedException {
//		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//		
//		wait.until(ExpectedConditions.visibilityOf(POM.One));
//		POM.One.click();
//
//		wait.until(ExpectedConditions.visibilityOf(POM.Continue1));
//
//		POM.Continue1.click(); // Enter amount to donate
//	}
//
//	@Test(priority = 113)
//	public void Click_Next() throws InterruptedException {
//		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//
//		driver.findElementById("com.techlogix.mobilinkcustomer:id/btn_transaction").click();
//		Thread.sleep(1000);
//	}

	@Test(priority = 114)
	public void Back_To_Homescreen() throws InterruptedException {
		MoneyTransferPOM POM = new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK)); // Back to Homescreen
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK)); // Back to Homescreen
		Thread.sleep(2000);
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	}




	
	//********************************************<Scan QR>**************************//

	@Test(priority= 115)
	
	public void Clicked_On_ScanQR()throws InterruptedException 
	{		
		ScanQRPOM POM=new ScanQRPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(POM.ScanQRClick)); //Click on ScanQR 

		POM.ScanQRClick.click();
		Thread.sleep(3000);

	}

	@Test(priority = 116)
	public void Clicked_On_Enable_Camera() throws InterruptedException 
	{		
		ScanQRPOM POM=new ScanQRPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(POM.EnableCameraButton));

		POM.EnableCameraButton.click();
		Thread.sleep(3000);

	}
	
	
	
	@Test(priority = 117)
	public void Clicked_On_TillID() throws InterruptedException 
	{		
		ScanQRPOM POM=new ScanQRPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(POM.TillIDButton));

		POM.TillIDButton.click();
		Thread.sleep(3000);

	}
	
	

	@Test(priority = 118)
	public void QRPayment() throws InterruptedException 
	{		
		ScanQRPOM POM=new ScanQRPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(POM.QRPayment));

		POM.QRPayment.click();

		Thread.sleep(3000);

	}
	
	
	
	@Test(priority = 119)
	public void Enter_Till_ID() throws InterruptedException 
	{		
		ScanQRPOM POM=new ScanQRPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		POM.Three.click();
		POM.Seven.click();
		POM.Four.click();
		POM.Zero.click();
		POM.Three.click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
		
		
	}
	
	
	//********************************************<Invite&Earn>**************************//

	@Test(priority= 120)
	
	public void Clicked_On_InviteEarnButton()throws InterruptedException 
	{		
		InviteEarnPOM POM=new InviteEarnPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(POM.InviteEarnClick)); //Click on Invite&Earn

		POM.InviteEarnClick.click();
		Thread.sleep(3000);

	}

//	@Test(priority = 121)
//	public void Clicked_On_AddContact() throws InterruptedException 
//	{		
//		InviteEarnPOM POM=new InviteEarnPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		
//		wait.until(ExpectedConditions.visibilityOf(POM.ClickAddContact));
//
//		POM.ClickAddContact.click();
//		Thread.sleep(3000);
//
//	}

	@Test(priority = 122)
	public void Clicked_On_Invite_Friend() throws InterruptedException 
	{		
		InviteEarnPOM POM=new InviteEarnPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonInviteFriends));

		POM.ClickonInviteFriends.click();
		Thread.sleep(1000);

	}
	
	
	@Test(priority = 123)
	public void Clicked_On_Mobile_Number_Search() throws InterruptedException 
	{		
		InviteEarnPOM POM=new InviteEarnPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Search" + "\").instance(0))")).click();
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonMobileSearchField));

		POM.ClickonMobileSearchField.click();
		Thread.sleep(4000);

	}
	
	@Test(priority = 124)
	public void Enter_Invite_Mobile_Number() throws InterruptedException 
	{		
		InviteEarnPOM POM=new InviteEarnPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		POM.ClickonMobileSearchField.sendKeys("03365154559");
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	}
	
	
	//********************************************<Education>**************************//

	@Test(priority= 125)
	
	public void Clicked_On_College() throws InterruptedException 
	{		

		Education POM=new Education(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.EducationAppdrawer));
		POM.EducationAppdrawer.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Colleges" + "\").instance(0))")).click();
		Thread.sleep(1000);
	}
	
@Test(priority= 126)
	
	public void Search_College() throws InterruptedException 
	{		

		Education POM=new Education(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.SearchBox));
		POM.SearchBox.click();
		POM.SearchBox.sendKeys("Fazaia Colleges");
		wait.until(ExpectedConditions.visibilityOf(POM.SearchClick));
		POM.SearchClick.click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);

	}
	


@Test(priority= 127)

public void Clicked_On_Coaching_Center() throws InterruptedException 
{		

	Education POM=new Education(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.EducationAppdrawer));
	POM.EducationAppdrawer.click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Coaching Centers" + "\").instance(0))")).click();
	Thread.sleep(1000);
}

@Test(priority= 128)

public void Search_Coaching_Centers() throws InterruptedException 
{		

	Education POM=new Education(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.SearchBox));
	POM.SearchBox.click();
	POM.SearchBox.sendKeys("Dhaka Coaching Center");
	wait.until(ExpectedConditions.visibilityOf(POM.SearchClick));
	POM.SearchClick.click();
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);

}
	
@Test(priority=129)

public void Clicked_On_Universities() throws InterruptedException 
{		

	Education POM=new Education(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.EducationAppdrawer));
	POM.EducationAppdrawer.click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Universities" + "\").instance(0))")).click();
	Thread.sleep(1000);
}

@Test(priority= 130)

public void Search_University() throws InterruptedException 
{		

	Education POM=new Education(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.SearchBox));
	POM.SearchBox.click();
	POM.SearchBox.sendKeys("IBA Sukkur");
	wait.until(ExpectedConditions.visibilityOf(POM.SearchClick));
	POM.SearchClick.click();
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);

}


@Test(priority= 131)

public void Clicked_On_School() throws InterruptedException 
{		

	Education POM=new Education(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.EducationAppdrawer));
	POM.EducationAppdrawer.click();
	Thread.sleep(3000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "School" + "\").instance(0))")).click();
	Thread.sleep(1000);
}

@Test(priority= 132)
public void Search_School() throws InterruptedException 
{		

	Education POM=new Education(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.SearchBox));
	POM.SearchBox.click();
	POM.SearchBox.sendKeys("Karachi Public School");
	wait.until(ExpectedConditions.visibilityOf(POM.SearchClick));
	POM.SearchClick.click();
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);

}



//
//@Test(priority= 133)
//
//public void Clicked_On_Entry_Test() throws InterruptedException 
//{		
//
//	Education POM=new Education(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.EducationAppdrawer));
//	POM.EducationAppdrawer.click();
//	Thread.sleep(3000);
//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Entry Tests" + "\").instance(0))")).click();
//	Thread.sleep(1000);
//}
//
//@Test(priority= 134)
//
//public void Search_Entry_Test() throws InterruptedException 
//{		
//
//	Education POM=new Education(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.SearchBox));
//	POM.SearchBox.click();
//	POM.SearchBox.sendKeys("Balochistan Testing Service");
//	wait.until(ExpectedConditions.visibilityOf(POM.SearchClick));
//	POM.SearchClick.click();
//	Thread.sleep(2000);
//	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//	Thread.sleep(2000);
//	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//	Thread.sleep(2000);
//
//}
//
//















//@Test(priority= 135)
//
//public void Fazaia_College_ID() throws InterruptedException 
//{		
//
//	Education POM=new Education(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	
//	//wait.until(ExpectedConditions.visibilityOf(POM.One));
//	
//	//POM.ReferanceNumberField.click();
//
//	
//	//POM.ReferanceNumberField.sendKeys("12345");
//	
//	
//	
//	
//	
//	wait.until(ExpectedConditions.visibilityOf(POM.Three));
//	
//	POM.Three.click();
//	POM.Seven.click();
//	POM.Four.click();
//	POM.Zero.click();
//	POM.Five.click();
//	Thread.sleep(2000);
//	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//	Thread.sleep(2000);
//	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//	Thread.sleep(2000);
//	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//	Thread.sleep(2000);
//	
//	
//}


//------------------------------------------Cash2Good--------------------------------------------------

@Test(priority=136)
public void Clicked_On_Cash2Good_icon() throws InterruptedException 
{		

	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.Appdrawer));
//	POM.Appdrawer.click();
//	//Thread.sleep(1000);
//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "JazzCash Transfer" + "\").instance(0))")).click();
//	Thread.sleep(3000);


//	driver.findElementById("com.techlogix.mobilinkcustomer:id/search_bottom_nav").click(); //Search Click
//	POM.clickontheHomeSearch.sendKeys("Cash2Good Transfer"); // search MT
//	wait.until(ExpectedConditions.visibilityOf(POM.clickontheHomeSearch)); // wait and click MT
//	driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
//	POM.ClickMT.click();
//	Thread.sleep(3000);

	
	wait.until(ExpectedConditions.visibilityOf(POM.Appdrawer));
	POM.Appdrawer.click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOf(POM.C2G_Click));
	POM.C2G_Click.click();
	Thread.sleep(2000);



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
	POM.ClickonMobileSearchField.sendKeys("03365154559");

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
	wait.until(ExpectedConditions.visibilityOf(POM.C2G_Click_on_Categories));
	POM.C2G_Click_on_Categories.click();
	Thread.sleep(2000);
	
//	driver.findElement(MobileBy.AndroidUIAutomator(
//	        "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
//	         ".scrollIntoView(new UiSelector().textContains(\"Computers and Computer Peripheral Equipment and Software\"))")).click();

	
	
	
	
	
	
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




	

	//********************************************<MY Account>**************************//

	@Test(priority= 155)
	public void Clicked_On_My_Acccount() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(POM.MyAccount));

		POM.MyAccount.click();
		Thread.sleep(3000);

	}

	@Test(priority = 156)
	public void Clicked_On_Account_Update_Coach_Mark() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(POM.CoachMark1));

		POM.CoachMark1.click();
		Thread.sleep(3000);

	}


	@Test(priority=157)
	public void Clicked_On_Change_MPIN_Coach_Mark() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(POM.CoachMark2));

		POM.CoachMark2.click();
		Thread.sleep(3000);

	}

	@Test(priority=158)
	public void Account_Title_Verified() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ProfileName));

		POM.ProfileName.isDisplayed();
		POM.AccountNumber.isDisplayed();
		
		Thread.sleep(3000);
	}

	
	@Test(priority=159)
	public void Account_Upgrade_Linking() throws InterruptedException
	{
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_upgrade").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(3000);
			
	}
	
	
	
	
	

	@Test(priority=160)
	public void Clicked_On_Account_Limits() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Accountlimits));

		POM.Accountlimits.click();
		
		Thread.sleep(3000);
	}


	@Test(priority=161)
	public void Account_Limits_Verified() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.DailyLimitTitle));

		POM.DailyLimitTitle.isDisplayed();
		POM.MonthlyLimitTitle.isDisplayed();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(3000);
	}


	@Test(priority=162)
	public void Clicked_On_Transaction_History() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.TransactionHistory));

		POM.TransactionHistory.click();
		
		Thread.sleep(3000);
	}

	
		@Test(priority=163)
		public void Clicked_To_Review_Transaction() throws InterruptedException
		{
		
			MyAccountsPO POM=new MyAccountsPO(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);	
		driver.findElementById("com.techlogix.mobilinkcustomer:id/ivTransaction").click();
		Thread.sleep(3000);
		}
		
		
		@Test(priority=164)
		public void Transaction_Review_Successful() throws InterruptedException
		{
			MyAccountsPO POM=new MyAccountsPO(driver);
			WebDriverWait wait = new WebDriverWait(driver,40);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			Thread.sleep(3000);
		}
			
	

	@Test(priority=165)
	public void Transaction_History_Verified() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ThisMonth));

		POM.ThisMonth.isEnabled();
		POM.ReceivedTab.click();

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(3000);
	}


	@Test(priority=167)
	public void Clicked_On_Account_Statement() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Statements));

		POM.Statements.click();	
		
		Thread.sleep(3000);

	}

	@Test(priority=168)
	public void Account_Statement_Visible() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.AccountStatementTitle));

		POM.AccountStatementTitle.isDisplayed();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(3000);
	}

	
	@Test(priority=169)
	public void Clicked_On_My_Approvals() throws InterruptedException
	{
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
	driver.findElementById("com.techlogix.mobilinkcustomer:id/tvMyApprovalsButton").click();
	Thread.sleep(3000);
	}
	
	@Test(priority=170)
	public void My_Approvals_Visible() throws InterruptedException
	{
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		Thread.sleep(3000);

	}
	
	
	@Test(priority=171)
	public void Clicked_Linked_Debit_Cards() throws InterruptedException 
	{		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Linked Debit Cards" + "\").instance(0))")).click();

	}

	@Test(priority=172)
	public void Linked_Debit_Cards_Verified() throws InterruptedException 
	{		
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.LinkedCardsTitle));
		POM.LinkedCardsTitle.isDisplayed();
		POM.LinkedCardsDescription.isDisplayed();

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	@Test(priority=173)
	public void Clicked_On_Change_MPIN() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Change MPIN" + "\").instance(0))")).click();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}

	
	@Test(priority=174)
	public void Clicked_On_Delink_Device() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Delink Device" + "\").instance(0))")).click();
		Thread.sleep(2000);

	}

	@Test(priority=175)
	public void Cancelled_Delink_Device() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.NoGoBack));

		POM.NoGoBack.click();
		
		Thread.sleep(3000);

	}

	
//	@Test(priority=176)
//	public void Check_Notifications() throws InterruptedException 
//	{
//		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Notifications" + "\").instance(0))")).click();
//		Thread.sleep(2000);
//	}
//	
//	
	
	
	@Test(priority=177)
	public void Clicked_On_Help_And_Support() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Help & Support" + "\").instance(0))")).click();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=178)
	public void Search_In_Help() throws InterruptedException 
	
	{
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElementById("com.techlogix.mobilinkcustomer:id/searchRecipientET").sendKeys("Daraz Wallet");
		//Thread.sleep(2000);
		driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_title").click();
		//Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));	
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));	
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test(priority=179)
	public void Clicked_On_Terms_And_Conditions() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Terms & Conditions" + "\").instance(0))")).click();
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);


	}

	@Test(priority=179)
	public void Clicked_On_Logout() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Logout" + "\").instance(0))")).click();
		Thread.sleep(2000);

	}

	@Test(priority=180)
	public void Logout_From_App_Successfully() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.YesLogout));

		POM.YesLogout.click();
		Thread.sleep(3000);

	}

	@Test(priority=181)
	public void Verified_Logout_From_App_Successfully() throws InterruptedException 
	{	
		MyAccountsPO POM=new MyAccountsPO(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.LoginLable));
		POM.LoginLable.isDisplayed();
		
		Thread.sleep(3000);

	}
		
}



