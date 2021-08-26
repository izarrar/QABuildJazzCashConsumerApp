package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.Profile_Feature;
import Pages.Orders;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AlaCart  extends AppSetup{

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
	public void Clicked_On_Personalize_JazzCash_CoachMark() throws InterruptedException {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Personalize JazzCash
		Thread.sleep(3000);

	}

	@Test(priority=9)
	public void Clicked_On_ExploreServices() throws InterruptedException {
		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Next4.click();   //Personalize JazzCash
		Thread.sleep(2000);

	}

	@Test(priority=10)
	public void Clicked_On_Notification_And_Promotions_CoachMark() {

		LoginPagePOM POM=new LoginPagePOM(driver);
		//Clicking on Guided Tour after Login
		POM.Gotit1.click();   //Notification and promotions
		
	}


	//********************Ala Cart*************************////

	@Test(priority=11)
	public void Click_on_Alacart_Icon() throws InterruptedException
	{
		Orders POM=new Orders(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "AlaCart" + "\").instance(0))")).click();
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		POM.AlaCart.click();

	

	}
	
	
	@Test(priority=12)
	public void Skip_Readmore_PopUp() throws InterruptedException
	{
		Orders POM=new Orders(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOf(POM.SkipReadMore));
		
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(3000);

	}


//	@Test(priority=13)
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
//	@Test(priority=14)
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

	
	
	
	@Test(priority=15)
	public void Search_For_Rs1_Product_1() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Others\"))")).click();
//		wait.until(ExpectedConditions.visibilityOf(POM.HealthandSports));
//		POM.HealthandSports.click();	
		Thread.sleep(3000);
	
	}

	
	
	@Test(priority = 16)
	public void Change_View() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(POM.ChangeView));
		POM.ChangeView.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	@Test(priority=17)
	public void Sorting_by_Name() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Name" + "\").instance(0))")).click();;
	}
	
	@Test(priority=18)
	public void Sorting_by_Date() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Date" + "\").instance(0))")).click();;
	}
	
	@Test(priority=19)
	public void Sorting_by_Price() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.SortByPrice));
		POM.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Price" + "\").instance(0))")).click();;
	}
	
	
	
	@Test(priority=20)
	public void Identify_Rs1_Product() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "General Zakat" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//	
//	
//	@Test(priority=21)
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
	

//	@Test(priority=22)
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
	

	
	@Test(priority=23)
	public void Add_To_Cart() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.BuyNow));
		POM.BuyNow.click();

	}

	@Test(priority=24)
	public void Cart_View() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCart));
		POM.ClickonCart.click();

	}
//
	@Test(priority=25)
	public void Check_Out_Product() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCheckout));
		Thread.sleep(3000);
		POM.ClickonCheckout.click();

}
//
	@Test(priority=26)
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
	@Test(priority=27)
	public void Open_Payment_Screen() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.PayNow));
		POM.PayNow.click();
		
		Thread.sleep(3000);

	}
////
	@Test(priority=28)
	public void Selected_Payment_Method() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		LoginPagePOM POM=new LoginPagePOM(driver);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Pay On Delivery (POD)" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//
	@Test(priority=29)
	public void Confirmed_Transaction() throws InterruptedException

	{			

		WebDriverWait wait = new WebDriverWait(driver,30);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfirmTransaction));
		POM.ConfirmTransaction.click();

	}
//
//
	@Test(priority=30)
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
	@Test(priority=31)
	public void Close_Receipt () throws InterruptedException

	{	

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCross));
		POM.ClickonCross.click();
		Thread.sleep(3000);
	}

//
	@Test(priority=32)
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
	@Test(priority=33)
	public void Open_Menu() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonMenu));
		POM.ClickonMenu.click();

	}

//
	@Test(priority=34)
	public void Order_Selection() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonOrder));
		POM.ClickonOrder.click();


	}

	@Test(priority=35)
	public void Track_Order() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonTrackOrder));
		POM.ClickonTrackOrder.click();

	}

	@Test(priority=36)
	public void Cancle_Order() throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders(driver);
		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCancleOrder));
		POM.ClickonCancleOrder.click();
		Thread.sleep(3000);

	}

	@Test(priority=37)
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
//		@Test(priority=38)
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

	
	@Test(priority=39)
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
	

	

	
	@Test(priority=41)
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
	
	
	@Test(priority=42)
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
	
	
	@Test(priority=43)
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
	
	
	@Test(priority= 44)
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
	
	
	
	@Test(priority= 45)
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
	
	
	
	
	@Test(priority= 46)
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
	
	
	
	
	@Test(priority= 47)
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
	
		
	
	@Test(priority= 48)
	public void Open_All_Categories() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Open All Categories" + "\").instance(0))")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	
	}
	
	
	@Test(priority= 49)
	public void Click_on_Expand_Categories() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);

		wait.until(ExpectedConditions.visibilityOf(POM.ClickonExpand));
		POM.ClickonExpand.click();
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority= 50)
	public void Close_All_Catergories() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Profile_Feature POM=new Profile_Feature(driver);

		wait.until(ExpectedConditions.visibilityOf(POM.ClickonCloseAllCategories));
		POM.ClickonCloseAllCategories.click();
		Thread.sleep(2000);
	}
		
	
	
	@Test(priority= 51)
	public void View_Cart() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		Orders POM=new Orders (driver);

		wait.until(ExpectedConditions.visibilityOf(POM.Cart_Icon));
		POM.Cart_Icon.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		
	}
		
	
}



