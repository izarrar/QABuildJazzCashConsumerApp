package Tests;
import org.testng.annotations.Test;
import Pages.MoneyTransferPOM;

@Test(priority=3)

public class MoneyTransferIBFT extends AppSetup {

	public void MoneyTransferToBank() throws InterruptedException 
	{		


		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();

		POM.IBFT.click();

		POM.SearchNO.click();
		Thread.sleep(2000);
		POM.SearchNO.sendKeys("Habib Bank Limited");

		POM.ClickBankName.click();
		Thread.sleep(3000);

		POM.One.click();
		POM.Two.click();
		POM.Three.click();
		POM.Four.click();
		POM.Five.click();
		POM.Six.click();
		POM.Seven.click();
		POM.Eight.click();
		POM.Nine.click();
		POM.One.click();
		POM.One.click();
		POM.One.click();
		POM.One.click();
		POM.Two.click();

		POM.Continue1.click();
		Thread.sleep(3000);
		POM.One.click();		
		POM.Continue.click();

		POM.SearchNO.click();
		POM.SearchNO.sendKeys("Family Support");
		POM.TransferPurpose.click();

		POM.Skip.click();
		Thread.sleep(12000);




		POM.AuthoriseTransfer.click();
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
