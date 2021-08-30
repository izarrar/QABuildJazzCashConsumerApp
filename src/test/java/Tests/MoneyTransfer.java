package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.MoneyTransferPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MoneyTransfer  extends AppSetup{

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

	
	

	//***************************Send money to JazzCash Account Flows//////////////////////////////////////////////

	@Test(priority=11)
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

//	@Test(priority=12)
//	public void Clicked_On_Money_Transfer_To_Mobile_Account() throws InterruptedException 
//	{		
//
//		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
//		WebDriverWait wait = new WebDriverWait(driver,40);
//		wait.until(ExpectedConditions.visibilityOf(POM.TransferMAcc));
//
//		POM.TransferMAcc.click();
//	}

	@Test(priority=13)
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

	@Test(priority=14)
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

	@Test(priority=15)
	public void Amount_Entered_To_Transfer_Successfully() throws InterruptedException {
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Continue1));
		Thread.sleep(1000);
		POM.Continue1.click();

	}

	@Test(priority=16)
	public void Authorize_Transfer_To_JC() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.ConfrimTransaction));
		Thread.sleep(2000);

		POM.ConfrimTransaction.click();
	}	

	@Test(priority=17)
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

	@Test(priority=18)
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

	@Test(priority=19)
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

	@Test(priority=20)
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

	@Test(priority=21)
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

	@Test(priority=22)
	public void Entered_Bank_Account_Number() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Continue1));
		Thread.sleep(2000);

		POM.Continue1.click();
		
		Thread.sleep(3000);
	}


	@Test(priority=23)
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
	
	
	@Test(priority=24)
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
	
	


	@Test(priority=25)
	public void Skipped_Recipient_Mobile_Number() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.Skip));

		POM.Skip.click();
		
		Thread.sleep(3000);

	}

	@Test(priority=26)
	public void Confirmed_Transfer_To_Bank_Account()  
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.JazzCashWallet));

		POM.Authorise_Transaction.click();
		
		

	}

	@Test(priority=27)
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

		@Test(priority=28)
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

	@Test(priority=29)
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
	
	@Test(priority=30)
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

	@Test(priority=31)
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

	@Test(priority=32)
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

	@Test(priority=33)
	public void Athorize_Send_Money_To_CNIC() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.AuthoriseTransfer1));

		POM.AuthoriseTransfer1.click();
	}

	@Test(priority=34)
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

	@Test(priority=35)
	public void Transfered_To_CNIC_Reciept() throws InterruptedException 
	{		

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(POM.DoneReciept));

		POM.DoneReciept.isDisplayed();
		POM.DoneReciept.click();

	}
	
	

	
	
	
	
	
	
	
	
		
}



