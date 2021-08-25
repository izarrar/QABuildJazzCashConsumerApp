package Tests;
import org.testng.annotations.Test;
import Pages.MoneyTransferPOM;
import io.appium.java_client.MobileElement;


public class MoneyTransferToJazzCash extends AppSetup {
	@Test  (priority = 2)

	public void ClickOnMoneyTransfer() throws InterruptedException 
	{
		


		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();


		POM.TMobile.click();

		POM.SearchNO.click();
		Thread.sleep(3000);
		POM.SearchNO.sendKeys("03435598382");


		POM.Send.click();

		MobileElement el3 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_1");
		el3.click();


		POM.Continue.click();

		POM.AuthoriseTransfer.click(); //Click on Authorize Transfer Button to Continue 

		POM.UseMPIM.click();    //Select Use MPIN

		//Entering MPIN
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();

		POM.Done.click();
		Thread.sleep(2000);

	}

}
