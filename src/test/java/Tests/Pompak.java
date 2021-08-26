package Tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPagePOM;
import Pages.pompak;
import Pages.MoneyTransferPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Pompak  extends AppSetup{

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

	

/////////////////////////////////////////////////////////POMPACK//////////////////////////////////////

@Test(priority=11)

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



//@Test(priority=12)
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


@Test(priority=13)
public void Clicked_On_play_video() throws InterruptedException 
{		


	pompak POM=new pompak(driver);
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(POM.play_Video)); // wait and click MT
	POM.play_Video.click();
	Thread.sleep(5000);
	POM.play_Video.click();

}

@Test(priority=14)
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



