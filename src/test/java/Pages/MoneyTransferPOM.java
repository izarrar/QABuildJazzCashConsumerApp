package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MoneyTransferPOM {
	public MoneyTransferPOM(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Transfer to JazzCashAccout
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/etSearchApp"))
	public AndroidElement SearchApp;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/txtSendMobile"))
	public AndroidElement ClickMT;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
	public AndroidElement SendMoney;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
	public AndroidElement TransferMAcc;

	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"JazzCash Transfer\"));")
	public AndroidElement TMobile;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
	public AndroidElement SearchNO;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/sendButton"))
	public AndroidElement Send;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/continueButton"))
	public AndroidElement Continue;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/send_image_view"))
	public AndroidElement AuthoriseTransfer;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/send_text"))
	public AndroidElement ConfrimTransaction;


	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_use_mpin"))
	public AndroidElement UseMPIM;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_remark_text"))
	public AndroidElement DailyDebitLimits;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tvTransStatus"))
	public AndroidElement TrasactionRecipt;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tryAgainButton"))
	public AndroidElement JCTranferFailed;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tryAgainButton"))
	public AndroidElement JCTranferFailedTryAgainButton;
	


	

	// IBFT Objects

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tvSendBank"))
	public AndroidElement ClickBT;
	
	 @AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bank Transfer\"));")
	 public AndroidElement IBFT;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView"))
	public AndroidElement ClickBankName;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_continue"))
	public AndroidElement Continue1;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
	public AndroidElement TransferPurpose;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/skipButton"))
	public AndroidElement Skip;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/doneTV"))
	public AndroidElement Done;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/continueButton"))
	public AndroidElement SendButton;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/cancelButton"))
	public AndroidElement GotoHome;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/my_account"))
	public AndroidElement JazzCashWallet;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tvTransStatus"))
	public AndroidElement TransactionStatus;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tvAmount"))
	public AndroidElement Rupees;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/send_text"))
	public AndroidElement Authorise_Transaction;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Search Purpose of Payment\"));")
	public AndroidElement PurposePaymentSearchBox;
	

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/name"))
	public AndroidElement SelectPurposeofPayment;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_forgot_pin"))
	public AndroidElement MPINScreenVerification;
	

	

	//Transfer to CNIC Objects

	
	 @AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Transfer to CNIC\"));")
	 public AndroidElement CNIC;
	
//	@AndroidFindBy(uiAutomator="com.techlogix.mobilinkcustomer:id/tvSendCNIC")
//	 public AndroidElement CNIC;
	
	

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/send_text"))
	public AndroidElement AuthoriseTransfer1;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tvSecureVia"))
	public AndroidElement Reciept_Found;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_close"))
	public AndroidElement Closereciept;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/doneTV"))
	public AndroidElement DoneReciept;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_enterAmount_Subtitle"))
	public AndroidElement EnterCNICVisibility;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/continueButton"))
	public AndroidElement ContinueButton;
	

	

	
	
	
	//Keyboard Object 
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_0"))
	public AndroidElement Zero;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_1"))
	public AndroidElement One;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_2"))
	public AndroidElement Two;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_3"))
	public AndroidElement Three;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_4"))
	public AndroidElement Four;

	@AndroidFindBy(id=("ccom.techlogix.mobilinkcustomer:id/t9_key_5"))
	public AndroidElement Five;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_6"))
	public AndroidElement Six;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_7"))
	public AndroidElement Seven;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_8"))
	public AndroidElement Eight;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_9"))
	public AndroidElement Nine;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_backspace"))
	public AndroidElement BackArrow;
	
	
	
}
