package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MayaPOM {public MayaPOM(AppiumDriver<AndroidElement> driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}


	

	
	
	
	///////////////////////Maya////////////////////////////////////////////////////////////////
	 


@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/ic_con tainerM"))
public AndroidElement ClickOnMayaHelath;
	 

	
	
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/mTitle"))
	public AndroidElement ReadMoreText;
	
		
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/constraint_my_questions"))
	public AndroidElement ClickontheMyQuestion;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_add_new_question"))
		public AndroidElement ClickonAskQuestions;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/but_pack"))
		public AndroidElement ClickonBrowsePackage;
	
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/inputQuestion"))
		public AndroidElement ClickonTypeQuestion;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/floatingActionButton"))
		public AndroidElement ClickonSendButton;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_number"))
		public AndroidElement ClickonConfirmMobileNumber;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_continue"))
		public AndroidElement MobileCountinueButton;
	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_free_health_chat"))
		public AndroidElement ClickonFreeHealthChatIcon;
	 
	
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.ImageView"))
		public AndroidElement ClickonKeepinEnglishButton;

	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/input_edittext"))
		public AndroidElement ClickonStartTypingHere;
	 
		
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/ivRightEnd"))
		public AndroidElement ClickOnSearchIcon;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/etSearchApp"))
		public AndroidElement ClickOnSearchfield;
	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/amount"))
		public AndroidElement ClickOnTopSearch;
	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/enter_btn"))
		public AndroidElement ClickOnFreeHelathSEndButton;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/ivRightStart"))
		public AndroidElement ClickOnHelpandSupport;
	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/et_ask_your_own_question"))
		public AndroidElement ClickOnSeekHelpFromExpert;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_premium_all_Package"))
		public AndroidElement ClickOnAllPackagesButton;
	 
	
	 
	 
	 
	
	//keyboard objects
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

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_5"))
	public AndroidElement Five;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_6"))
	public AndroidElement Six;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_7"))
	public AndroidElement Seven;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_8"))
	public AndroidElement Eight;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_9"))
	public AndroidElement Nine;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btnEditJazzCash"))
	public AndroidElement Visibility;
	
	
	
	
	
	
}
