package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.MoneyTransferPOM;

@Test  (priority = 4)

public class MoneyTransferToCNIC extends AppSetup {
	@Parameters({"device"})

	public void TransferToCNIC(String device) throws InterruptedException 
	{		


		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();

		POM.TCNIC.click();

		//Entering CNIC Number(3740570625545)
		POM.Three.click();
		POM.Seven.click();
		POM.Four.click();
		POM.Zero.click();
		POM.Five.click();
		POM.Seven.click();
		POM.Zero.click();
		POM.Six.click();
		POM.Two.click();
		POM.Five.click();
		POM.Five.click();
		POM.Four.click();
		POM.Five.click();
		POM.Continue1.click();
		Thread.sleep(7000);

		//Entering Amount and Clicking on Send
		POM.One.click();
		POM.Continue1.click();

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

		Thread.sleep(13000);


		//Clicking on Authorize transfer after entering amount
		POM.AuthoriseTransfer1.click();

		
		//Entering User MPIN
		POM.UseMPIM.click();
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();
		Thread.sleep(15000);
	

		POM.Done.click();
		Thread.sleep(2000);

	}
}
