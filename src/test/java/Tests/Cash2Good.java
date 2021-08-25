package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.TestListener;
import Pages.Cash2GoodPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

 


@Listeners({ TestListener.class })
public class Cash2Good  extends AppSetup{
	
	LoginPagePOM loginpagepom;
	Cash2GoodPOM cash2goodpom;
	WebDriverWait wait;
	
	

	@Parameters({"MSISDN"})
	@Test (priority=1, description="Verify that MPIN is successfully added")
	@Story("Cash2Good")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Verify that MPIN is successfully added")
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
	

	@Test(priority=2)
	@Story("Cash2Good")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify that MPIN is successfully added")
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
	

	@Test(priority=3)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Customer_Logged_In_Successfully() throws InterruptedException {

		
		//Clicking on Guided Tour after Login
		
		
		Thread.sleep(5000);

		Assert.assertTrue(loginpagepom.Next4.isDisplayed(),"Customer is not being logged in successfully");  
		Thread.sleep(2000);
	}



	@Test(priority=4)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Add_Money_CoachMark() throws InterruptedException {

	
		//Clicking on Guided Tour after Login
		wait.until(ExpectedConditions.visibilityOf(loginpagepom.Next4));

		Assert.assertTrue(loginpagepom.BalanceCoachMark.isDisplayed(),"Add money coach mark is not being clicked successfully");
		   //Add Money
		

	}
	

	@Test(priority=5)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Balance_And_Transaction_History_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.MyAccountCoachMark.isDisplayed(),"Balance & Transaction history coach mark is not being clicked successfully");
		//Clicking on Guided Tour after Login
		
        
	}
	

	@Test(priority=6)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Ready_Cash_CoachMark() throws InterruptedException {

		
		//Clicking on Guided Tour after Login
		loginpagepom.Next4.click();   //Balance & Transaction History
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.PersonalizeJazzCashCoachMark.isDisplayed(),"Personalize Jazz Cash coach markis being clicked successfully");
		

	}
	

	@Test(priority=7)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_My_Account_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();   //Balance & Transaction History
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.MyAccountCoachMark.isDisplayed(),"My Account coach mark is not being clicked successfully");
		//Clicking on Guided Tour after Login
		

	}


	@Test(priority=8)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Personalize_JazzCash_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();   //My Account
		Thread.sleep(2000); 
		Assert.assertTrue(loginpagepom.ExploreAllServicesCoachMark.isDisplayed(),"Personalize Jazz Cash coach mark is not being clicked successfully");
		//Clicking on Guided Tour after Login
		
	}
	

	@Test(priority=9)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Explore_All_Services_CoachMark() throws InterruptedException {

		
		//Clicking on Guided Tour after Login
		loginpagepom.Next4.click();   //Personalize JazzCash
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.NotificationAndPromotionCoachMark.isDisplayed(),"Explore All Services coach mark is not being clicked successfully");
		
		

	}
	

	@Test(priority=10)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Notification_And_Promotions_CoachMark() throws InterruptedException {

		loginpagepom.Next4.click();   //Explore All Services
		Thread.sleep(2000);
		//Clicking on Guided Tour after Login
		loginpagepom.Gotit1.click();   //Notification and promotions
		Thread.sleep(2000);
		Assert.assertTrue(loginpagepom.JazzCashLogoMainScreen.isDisplayed(),"Notification And Promotions coach mark is not being clicked");
	}

	



//------------------------------------------Cash2Good--------------------------------------------------

	
	@Test(priority=11)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_Cash2Good_icon() throws InterruptedException 
	{		
	
		cash2goodpom=new Cash2GoodPOM(driver);
	
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
	
		
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.Appdrawer));
		cash2goodpom.Appdrawer.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.C2G_Click));
		cash2goodpom.C2G_Click.click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.ClickonMobileSearchField.isDisplayed(),"Cash 2 Good icon is not being clicked successfully");
	
	
	
	}

//@Test(priority=12)
//public void Click_On_Cash2Good() throws InterruptedException 
//{		
//	Cash2GoodPOM POM=new Cash2GoodPOM(driver);
//	WebDriverWait wait = new WebDriverWait(driver,40);
//	wait.until(ExpectedConditions.visibilityOf(POM.ClickonCash2Good));
//	POM.ClickonCash2Good.click();
//	Thread.sleep(3000);
//
//}




	@Test(priority = 13)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Clicked_On_C2GMobile_Number_Search() throws InterruptedException 
	{		
		
		
		
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.ClickonMobileSearchField));
	
		cash2goodpom.ClickonMobileSearchField.click();
		Thread.sleep(4000);
	
	}


	@Test(priority = 14)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Enter_C2G_Mobile_Number() throws InterruptedException 
	{		
	
		cash2goodpom.ClickonMobileSearchField.sendKeys("03365154559");
	
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.ClickonC2GMobileNumberCheckbox.isDisplayed(),"C2G mobile number is not being added");
	}


	@Test(priority = 15)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Click_on_Mobile_Number_CheckBox() throws InterruptedException 
	{		
	
		cash2goodpom.ClickonC2GMobileNumberCheckbox.click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.ClickonC2GMobileNumberCheckbox.isSelected(),"Mobile Number checkbox is not being selected");
	}


	@Test(priority = 16)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Click_on_C2G_Send_Button() throws InterruptedException 
	{		
	
		cash2goodpom.ClickonC2GSendButton.click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.ClickonC2GAmountContinue.isDisplayed(),"C2G send button is not being clicked");
	}



	@Test(priority = 17)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Select_City_Dropdown() throws InterruptedException 
	{		
	
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.C2GSelectCityDropDown));
		cash2goodpom.C2GSelectCityDropDown.click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.C2GSelectCitySearchfield.isDisplayed(),"Select City Dropodown is not being clicked");
	}



	@Test(priority = 18)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void C2G_Click_on_search_field() throws InterruptedException 
	{		
	
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.C2GSelectCitySearchfield));
		cash2goodpom.C2GSelectCitySearchfield.click();
		Thread.sleep(2000);
	}


	@Test(priority = 19)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void C2G_Enter_City_Name() throws InterruptedException 
	{		
	
		//wait.until(ExpectedConditions.visibilityOf(POM.C2GSelectCityDropDown));
		cash2goodpom.C2GSelectCitySearchfield.sendKeys("Rawalpindi");;
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.C2GClickonCity.isDisplayed(),"City is not being displayed on searching city");
	}


	@Test(priority = 20)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void C2G_Select_City() throws InterruptedException 
	{		
	
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.C2GClickonCity));
		cash2goodpom.C2GClickonCity.click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.ClickonC2GAmountContinue.isDisplayed(),"City is not being selected on clicking searched city");
	}


	@Test(priority = 21)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Select_Category() throws InterruptedException 
	{		
	
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.C2G_Click_on_Categories));
		cash2goodpom.C2G_Click_on_Categories.click();
		Thread.sleep(2000);
		
	//	driver.findElement(MobileBy.AndroidUIAutomator(
	//	        "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
	//	         ".scrollIntoView(new UiSelector().textContains(\"Computers and Computer Peripheral Equipment and Software\"))")).click();
	
	
		Thread.sleep(2000);
	}


	@Test(priority = 22)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Click_on_amount() throws InterruptedException 
	{		
	
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Rs." + "\").instance(0))")).click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.One.isDisplayed(),"Amount field is not being clicked");
	}




	@Test(priority = 23)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Enter_C2G_Amount() throws InterruptedException 
	{		
	
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.Three));
		cash2goodpom.One.click();
		Thread.sleep(2000);
		Assert.assertTrue(cash2goodpom.ClickonC2GAmountContinue.isEnabled(),"C2G amount is not being added in as amount field");
	}


	@Test(priority = 24)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Enter_C2G_Amount_Continue() throws InterruptedException 
	{		
		
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.ClickonC2GAmountContinue));
		cash2goodpom.ClickonC2GAmountContinue.click();
		Assert.assertTrue(cash2goodpom.ClickOnSendC2GButton.isEnabled(),"Continue button is not being clicked on adding amount in amount field");
		Thread.sleep(2000);
	}


	@Test(priority = 25)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Send_C2G_Button() throws InterruptedException 
	{		
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Send Rs. 1 Cash2Goods" + "\").instance(0))"));
		cash2goodpom.ClickOnSendC2GButton.click();
	    Thread.sleep(2000);
	    Assert.assertTrue(cash2goodpom.ClickonC2GSubmitButton.isDisplayed(),"C2G submit button is not being clicked");
	
	
	
	}


	@Test(priority = 26)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Click_On_C2G_Confirm_Button() throws InterruptedException 
	{		
		
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.ClickonC2GSubmitButton));
		cash2goodpom.ClickonC2GSubmitButton.click();
	    Thread.sleep(2000);
	    Assert.assertTrue(cash2goodpom.One.isDisplayed(),"C2G Confirm button is not being clicked");
	
	
	
	}



	@Test(priority = 27)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void Enter_C2G_MPIN() throws InterruptedException 
	{		
	
	//	wait.until(ExpectedConditions.visibilityOf(POM.ClickonC2GUseMPIN));
	//	POM.ClickonC2GUseMPIN.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.Zero));
	
		cash2goodpom.One.click();
		cash2goodpom.One.click();
		cash2goodpom.Two.click();
		cash2goodpom.Two.click();
		Assert.assertTrue(cash2goodpom.C2GReceiptVisibility.isDisplayed(),"MPIN on C2G is not being added");
	
	
	}


	@Test(priority = 28)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void C2G_Receipt() throws InterruptedException 
	{		
		Thread.sleep(3000);
		Assert.assertTrue(cash2goodpom.C2GReceiptVisibility.isDisplayed(),"C2G receipt is not being generated");
		Thread.sleep(2000);
	
	}


	@Test(priority = 29)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	public void C2G_Receipt_Back() throws InterruptedException 
	{		
		
		Thread.sleep(4000);
		Assert.assertTrue(cash2goodpom.C2GClickonReceiptBackButton.isDisplayed(),"C2G Receipt Back Button is not being clicked");
		cash2goodpom.C2GClickonReceiptBackButton.click();
	}


	@Test(priority = 30)
	@Story("ABC")
	@Severity(SeverityLevel.NORMAL)
	@Description("ABC")
	
	public void Clicked_Help_and_Support() throws InterruptedException 
	{		
	
		wait.until(ExpectedConditions.visibilityOf(cash2goodpom.C2GHelpandSupport));
		cash2goodpom.C2GHelpandSupport.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);	
		
	}

		
}



