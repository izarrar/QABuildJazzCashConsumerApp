package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Cash2GoodPOM;
import Pages.LoginPagePOM;
import Pages.Profile_Feature;
import Pages.TestListener;
import Pages.Orders;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({ TestListener.class })
public class AlaCart  extends AppSetup{

	LoginPagePOM loginpagepom;
	WebDriverWait wait;
	Orders orderspagepom;
	Profile_Feature profilefeaturepagepom;
	
	@Parameters({"MSISDN"})
	@Test (priority=1, description="Verify that MSISDN is successfully added")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Verify that MSISDN is successfully added")
	public void MSISDN_Entered_Successfully(String MSISDN) throws InterruptedException {

		wait = new WebDriverWait(driver,40);
		loginpagepom=new LoginPagePOM(driver);

		

		wait.until(ExpectedConditions.visibilityOf(loginpagepom.MSISDNField));
		loginpagepom.MSISDNField.click();
		
		wait.until(ExpectedConditions.visibilityOf(loginpagepom.MSISDN));


		loginpagepom.MSISDN.sendKeys(MSISDN);
		Thread.sleep(3000);
		loginpagepom.Next.click();
		Thread.sleep(3000);
		Assert.assertTrue(loginpagepom.One.isDisplayed(),"MSISDN has not been entered successfully");

	}
	

	@Test (priority=2, description="Verify that MPIN is successfully added")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that MPIN is successfully added")
	public void Entered_MPIN_Successfully() throws InterruptedException {

	

//		wait.until(ExpectedConditions.visibilityOf(POM.ForgotMPIN));

		//Entering MPIN
		loginpagepom.One.click();
		loginpagepom.One.click();
		loginpagepom.Two.click();
		loginpagepom.Two.click();
		Thread.sleep(5000);
		
		
		if (loginpagepom.KeyBoardSetup.isDisplayed()) {
			
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		}
		
		else {
			
			Thread.sleep(2000);
		}
		
		Assert.assertTrue(loginpagepom.Next4.isDisplayed(),"MPIN is not being entered successfully");
		

	}
		
//		wait.until(ExpectedConditions.visibilityOf(POM.LowBalance));
//		POM.LowBalance.isDisplayed();
		

//
//	}
	

	@Test (priority=3, description="Verify that customer is logged in successfully")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that customer is logged in successfully")
	public void Customer_Logged_In_Successfully() throws InterruptedException {

		
		//Clicking on Guided Tour after Login
		
		
		Thread.sleep(5000);

		Assert.assertTrue(loginpagepom.Next4.isDisplayed(),"Customer is not being logged in successfully");  
		Thread.sleep(2000);
	}



	@Test (priority=4, description="Verify that add money coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that add money coach mark is being clicked")
	public void Clicked_On_Add_Money_CoachMark() throws InterruptedException {

	
		//Clicking on Guided Tour after Login
		wait.until(ExpectedConditions.visibilityOf(loginpagepom.Next4));

		Assert.assertTrue(loginpagepom.BalanceCoachMark.isDisplayed(),"Add money coach mark is not being clicked successfully");
		   //Add Money
		

	}
	

	@Test (priority=5, description="Verify that balance & transaction history coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that balance & transaction history coach mark is being clicked")
	public void Clicked_On_Balance_And_Transaction_History_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.MyAccountCoachMark.isDisplayed(),"Balance & Transaction history coach mark is not being clicked successfully");
		//Clicking on Guided Tour after Login
		
        
	}
	

	@Test (priority=6, description="Verify that ready cash coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that ready cash coach mark is being clicked")
	public void Clicked_On_Ready_Cash_CoachMark() throws InterruptedException {

		
		//Clicking on Guided Tour after Login
		loginpagepom.Next4.click();   //Balance & Transaction History
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.PersonalizeJazzCashCoachMark.isDisplayed(),"Personalize Jazz Cash coach markis being clicked successfully");
		

	}
	

	@Test (priority=7, description="Verify that my account coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that my account coach mark is being clicked")
	public void Clicked_On_My_Account_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();   //Balance & Transaction History
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.MyAccountCoachMark.isDisplayed(),"My Account coach mark is not being clicked successfully");
		//Clicking on Guided Tour after Login
		

	}


	@Test (priority=8, description="Verify that personalized jazz cash coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that personalize jazz cash coach mark is being clicked")
	public void Clicked_On_Personalize_JazzCash_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();   //My Account
		Thread.sleep(2000); 
		Assert.assertTrue(loginpagepom.ExploreAllServicesCoachMark.isDisplayed(),"Personalize Jazz Cash coach mark is not being clicked successfully");
		//Clicking on Guided Tour after Login
		
	}
	

	@Test (priority=9, description="Verify that explore all services coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that explore all services coach mark is being clicked")
	public void Clicked_On_Explore_All_Services_CoachMark() throws InterruptedException {

		
		//Clicking on Guided Tour after Login
		loginpagepom.Next4.click();   //Personalize JazzCash
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.NotificationAndPromotionCoachMark.isDisplayed(),"Explore All Services coach mark is not being clicked successfully");
		
		

	}
	

	@Test (priority=10, description="Verify that notification & promotion coach mark is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that notification & promotion coach mark is being clicked")
	public void Clicked_On_Notification_And_Promotions_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();   //Explore All Services
		Thread.sleep(2000);
		//Clicking on Guided Tour after Login
		loginpagepom.Gotit1.click();   //Notification and promotions
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.JazzCashLogoMainScreen.isDisplayed(),"Notification And Promotions coach mark is not being clicked");
	}


	//********************Ala Cart*************************////

	@Test (priority=11, description="Verify that Ala Cart icon is being clicked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that Ala Cart icon is being clicked")
	public void Click_on_Alacart_Icon() throws InterruptedException
	{
		orderspagepom=new Orders(driver);
	
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "AlaCart" + "\").instance(0))")).click();
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		orderspagepom.AlaCart.click();

	

	}
	
	
	@Test (priority=12, description="Verify that skip read more pop up is being displayed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that skip read more pop up is being displayed")
	public void Skip_Readmore_PopUp() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.SkipReadMore));
		Thread.sleep(3000);
		Assert.assertTrue(orderspagepom.SkipReadMore.isDisplayed(),"Skip read more popup is not being displayed");
		
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

	
	
	
	@Test (priority=15, description="Verify that Rs 1 Product 1 is being searched")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that Rs 1 Product 1 is being searched")
	public void Search_For_Rs1_Product_1() throws InterruptedException

	{			
		
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		Thread.sleep(3000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Others\"))")).click();
//		wait.until(ExpectedConditions.visibilityOf(POM.HealthandSports));
//		POM.HealthandSports.click();	
		Thread.sleep(3000);
	
	}

	
	
	@Test (priority=16, description="Verify the change of view in Al Cart")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify the change of view in Al Cart")
	public void Change_View() throws InterruptedException
	{
		
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(profilefeaturepagepom.ChangeView));
		profilefeaturepagepom.ChangeView.click();
		Thread.sleep(3000);
		Assert.assertTrue(orderspagepom.SortByPrice.isDisplayed(),"Change view is not being clicked");
	}
	
	
	
	
	
	
	@Test (priority=17, description="Verify that sorting by name is working properly")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that sorting by name is working properly")
	public void Sorting_by_Name() throws InterruptedException

	{			

	
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.SortByPrice));
		orderspagepom.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Name" + "\").instance(0))")).click();;
		Assert.assertTrue(orderspagepom.SortByPrice.isDisplayed(),"View is not being sorted by Name");
	
	}
	
	@Test (priority=18, description="Verify that sorting by date is working properly")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that sorting by date is working properly")
	public void Sorting_by_Date() throws InterruptedException

	{			

		wait.until(ExpectedConditions.visibilityOf(orderspagepom.SortByPrice));
		orderspagepom.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Date" + "\").instance(0))")).click();;
		Assert.assertTrue(orderspagepom.SortByPrice.isDisplayed(),"View is not being sorted by Date");
	}
	
	@Test (priority=19, description="Verify that sorting by price is working properly")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that sorting by price is working properly")
	public void Sorting_by_Price() throws InterruptedException

	{			

		
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.SortByPrice));
		orderspagepom.SortByPrice.click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Price" + "\").instance(0))")).click();;
		Assert.assertTrue(orderspagepom.SortByPrice.isDisplayed(),"View is not being sorted by price");
	}
	
	
	
	@Test (priority=20, description="Verify that Rs1 Product is being identified")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that Rs1 Product is being identified")
	public void Identify_Rs1_Product() throws InterruptedException

	{			

	
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
	

	
	@Test (priority=23, description="Verify that things are being added in cart")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that things are being added in cart")
	public void Add_To_Cart() throws InterruptedException

	{			

	
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.BuyNow));
		orderspagepom.BuyNow.click();
		Assert.assertTrue(orderspagepom.ClickonCart.isDisplayed(),"Cart is not being opened on clicking Buy Now button");

	}

	@Test (priority=24, description="Verify that cart view is being displayed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that cart view is being displayed")
	public void Cart_View() throws InterruptedException

	{			

		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ClickonCart));
		orderspagepom.ClickonCart.click();
		Assert.assertTrue(orderspagepom.ClickonCheckout.isDisplayed(),"Checkout button is not being opened in Cart menu");
	}
//
	@Test (priority=25, description="Verify that product is being checked out")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that product is being checked out")
	public void Check_Out_Product() throws InterruptedException

	{			

		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ClickonCheckout));
		Thread.sleep(3000);
		orderspagepom.ClickonCheckout.click();
		Assert.assertTrue(orderspagepom.ClickonStandardDelivery.isDisplayed(),"Standard Delivery button is not being displayed on clicking checkout");
}
//
	@Test (priority=26, description="Verify that standard delivery is being selected")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that standard delivery is being selected")
	public void Select_Standard_Delivery() throws InterruptedException

	{			

		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ClickonStandardDelivery));
		orderspagepom.ClickonStandardDelivery.click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +".scrollIntoView(new UiSelector().text(\"Standard Delivery\"))")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Standard Delivery" + "\").instance(0))")).click();
		//Thread.sleep(2000);
		Assert.assertTrue(orderspagepom.PayNow.isDisplayed(),"Pay Now button is not being displayed on clicking standard delivery button");
	
	}
//
//
	@Test (priority=27, description="Verify that payment screen is being opened")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that payment screen is being opened")
	public void Open_Payment_Screen() throws InterruptedException

	{			
		
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.PayNow));
		orderspagepom.PayNow.click();
		
		Thread.sleep(3000);

	}
////
	@Test (priority=28, description="Verify that payment method is being selected")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that payment method is being selected")
	public void Selected_Payment_Method() throws InterruptedException

	{			


		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Pay On Delivery (POD)" + "\").instance(0))")).click();
		Thread.sleep(2000);
	}
//
	@Test (priority=29, description="Verify that transaction is being confirmed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that transaction is being confirmed")
	public void Confirmed_Transaction() throws InterruptedException

	{			

		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ConfirmTransaction));
		orderspagepom.ConfirmTransaction.click();
		Assert.assertTrue(orderspagepom.Two.isDisplayed(),"Confirm Transaction button is not being displayed");
	}
//
//
	@Test (priority=30, description="Verify that MPIN is being confirmed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that MPIN is being confirmed")
	public void Confirmed_MPIN () throws InterruptedException

	{		

		
	//	wait.until(ExpectedConditions.visibilityOf(POM.UseMpin));
	//	POM.UseMpin.click();
		//wait.until(ExpectedConditions.visibilityOf(POM.One));
		orderspagepom.One.click();
		orderspagepom.One.click();
		orderspagepom.Two.click();
		orderspagepom.Two.click();
		Assert.assertTrue(orderspagepom.Two.isDisplayed(),"");

	}
//
	@Test (priority=31, description="Verify that receipt is being closed on clicking cross icon")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that receipt is being closed on clicking cross icon")
	public void Close_Receipt () throws InterruptedException

	{	

		Thread.sleep(3000);
		
		Assert.assertTrue(orderspagepom.ClickonCross.isDisplayed(),"Receipt is not being displayed");
	}

//
	@Test (priority=32, description="Verify that profile view is being displayed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that profile view is being displayed")
	public void Profile_View() throws InterruptedException
	{
		orderspagepom.ClickonCross.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ClickonProfile));
		Assert.assertTrue(orderspagepom.ClickonProfile.isDisplayed(),"Profile view is not being displayed");


	}
//
	@Test (priority=33, description="Verify that menu is being opened")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that menu is being opened")
	public void Open_Menu() throws InterruptedException
	{

		Thread.sleep(3000);
		//POM.AlaCart.click();
		orderspagepom.ClickonProfile.click();
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ClickonMenu));
		orderspagepom.ClickonMenu.click();
		Assert.assertTrue(orderspagepom.ClickonOrder.isDisplayed(),"Profile view is not being displayed");
	}

//
	@Test (priority=34, description="Verify that orders are being selected")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that orders are being selected")
	public void Order_Selection() throws InterruptedException
	{

		Thread.sleep(2000);
		
		Assert.assertTrue(orderspagepom.ClickonOrder.isDisplayed(),"Order selection is not being displayed");

	}

	@Test (priority=35, description="Verify that orders are being tracked")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that orders are being tracked")
	public void Track_Order() throws InterruptedException
	{
		orderspagepom.ClickonOrder.click();
		Assert.assertTrue(orderspagepom.ClickonTrackOrder.isDisplayed(),"Track Order is not being displayed");

	}

	@Test (priority=36, description="Verify that orders are being canceled")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that orders are being canceled")
	public void Cancle_Order() throws InterruptedException
	{

		
		orderspagepom.ClickonTrackOrder.click();
		Assert.assertTrue(orderspagepom.ClickonCancleOrder.isDisplayed(),"Cancel order is not being displayed");
		
		

	}

	@Test (priority=37, description="Verify that order cancellation is being confirmed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that order cancellation is being confirmed")
	public void Confirm_Cancellation() throws InterruptedException
	{

		orderspagepom.ClickonCancleOrder.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.ClickonSureCancle));
		orderspagepom.ClickonSureCancle.click();
		wait.until(ExpectedConditions.visibilityOf(orderspagepom.Close));
		Assert.assertTrue(orderspagepom.Close.isDisplayed(),"Confirm cancellation button is not appearing");
		
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

	
	@Test (priority=39, description="Verify that product is being searched")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that product is being searched")
	public void Search_Product() throws InterruptedException
	{
		orderspagepom.Close.click();
		Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.visibilityOf(POM.AlaCart));
		//POM.AlaCart.click();
		wait.until(ExpectedConditions.visibilityOf(profilefeaturepagepom.ClickonSearchBox));
		profilefeaturepagepom.ClickonSearchBox.click();
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
		Assert.assertTrue(profilefeaturepagepom.ClickonProfileofAlaCart.isDisplayed(),"Product is not being searched");
	}
	

	

	
	@Test (priority=41, description="Verify Profile payment method")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify Profile payment method")
	public void Profile_Payment_Method() throws InterruptedException
	{
		
		
		wait.until(ExpectedConditions.visibilityOf(profilefeaturepagepom.ClickonProfileofAlaCart));
		profilefeaturepagepom.ClickonProfileofAlaCart.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(profilefeaturepagepom.ClickonPaymentMethod ));
		profilefeaturepagepom.ClickonPaymentMethod.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Assert.assertTrue(profilefeaturepagepom.ClickonHelpandSupport.isDisplayed(),"Profile payment method is not functioning properly");

		
	}
	
	
	@Test (priority=42, description="Verify profile help and support")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify profile help and support")
	public void Profile_Help_And_Support() throws InterruptedException
	{
		
	
		Thread.sleep(3000);
		
		Assert.assertTrue(profilefeaturepagepom.ClickonHelpandSupport.isDisplayed(),"Profile help and support page is not visible");
		
		
	}
	
	
	@Test (priority=43, description="Verify profile about ala cart")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify profile about ala cart")
	public void Profile_About_AlaCart() throws InterruptedException
	{
		
		profilefeaturepagepom.ClickonHelpandSupport.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		
		Assert.assertTrue(profilefeaturepagepom.ClickonAboutAlaCart.isDisplayed(),"Profile About Ala Cart page is not visible");
		
	}
	
	
	@Test (priority=44, description="Verify profile terms & conditions")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify profile terms & conditions")
	public void Profile_Terms_And_Conditions() throws InterruptedException
	{
		
	
		profilefeaturepagepom.ClickonAboutAlaCart.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(3000);
		
		Assert.assertTrue(profilefeaturepagepom.ClickonTermsAndCondition.isDisplayed(),"Profile Terms & Conditions page is not visible");
		
	}
	
	
	
	@Test (priority=45, description="Verify profile wish list")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify profile wish list")
	public void Profile_Wish_List() throws InterruptedException
	{
		profilefeaturepagepom.ClickonTermsAndCondition.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(3000);
		
		Assert.assertTrue(profilefeaturepagepom.ClickonWishList.isDisplayed(),"Profile Wish List page is not visible");
		
	}
	
	
	
	
	@Test (priority=46, description="Verify profile ala cart credits")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify profile ala cart credits")
	public void Profile_AlaCartCradits() throws InterruptedException
	{
		
		profilefeaturepagepom.ClickonWishList.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(3000);

		Assert.assertTrue(profilefeaturepagepom.ClickonAlaCartCredits.isDisplayed(),"Profile Ala Cart Credits page is not visible");
		
	}
	
	
	
	
	@Test (priority=47, description="Verify profile view jazz cash profile")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify profile view jazz cash profile")
	public void Profile_View_JazzCash_Profile() throws InterruptedException
	{
		profilefeaturepagepom.ClickonAlaCartCredits.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		Thread.sleep(3000);
		
		Assert.assertTrue(profilefeaturepagepom.ClickonJazzCashProfile.isDisplayed(),"Profile view jazz cash profile page is not visible");
		
	}
	
		
	
	@Test (priority=48, description="Verify that all categories page is being opened")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that all categories page is being opened")
	public void Open_All_Categories() throws InterruptedException
	{
		
		profilefeaturepagepom.ClickonJazzCashProfile.click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Open All Categories" + "\").instance(0))")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	
	}
	
	
	@Test (priority=49, description="Verify that categories are being expended")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that categories are being expended")
	public void Click_on_Expand_Categories() throws InterruptedException
	{
		
	

		wait.until(ExpectedConditions.visibilityOf(profilefeaturepagepom.ClickonExpand));
		profilefeaturepagepom.ClickonExpand.click();
		Thread.sleep(2000);
		Assert.assertTrue(profilefeaturepagepom.ClickonCloseAllCategories.isDisplayed(),"Expand Categories section is not being displayed");
	}
	
	
	
	@Test (priority=50, description="Verify all categories are being clsoed on clicking cross icon ")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify all categories are being clsoed on clicking cross icon")
	public void Close_All_Catergories() throws InterruptedException
	{
	

		wait.until(ExpectedConditions.visibilityOf(profilefeaturepagepom.ClickonCloseAllCategories));
		profilefeaturepagepom.ClickonCloseAllCategories.click();
		Thread.sleep(2000);
		Assert.assertTrue(orderspagepom.Cart_Icon.isDisplayed(),"Close All Categories icon is not being displayed");
	}
		
	
	
	@Test (priority=51, description="Verify that cart is being viewed")
	@Story("AlaCart")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:Verify that cart is being viewed")
	public void View_Cart() throws InterruptedException
	{
		
		

		wait.until(ExpectedConditions.visibilityOf(orderspagepom.Cart_Icon));
		orderspagepom.Cart_Icon.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		
	}
		
	
}



