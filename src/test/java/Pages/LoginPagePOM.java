package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPagePOM {
	public LoginPagePOM(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/et_phone_number"))
	public AndroidElement MSISDNField;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_forgot_pin"))
	public AndroidElement ForgotMPIN;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/title"))
	public AndroidElement LowBalance;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_title"))
	public AndroidElement KeyBoardSetup;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_mobile"))
	public AndroidElement MSISDN;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_send_otp"))
	public AndroidElement Next;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"))
	public AndroidElement Next1;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
	public AndroidElement Next2;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
	public AndroidElement Next3;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/alert_bottomtext"))
	public AndroidElement BalanceCoachMark;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/alert_bottomtext"))
	public AndroidElement MyAccountCoachMark;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/alert_bottomtext"))
	public AndroidElement PersonalizeJazzCashCoachMark;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/alert_bottomtext"))
	public AndroidElement ExploreAllServicesCoachMark;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/alert_bottomtext"))
	public AndroidElement NotificationAndPromotionCoachMark;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/next"))
	public AndroidElement Next4;
	
	@AndroidFindBy(id=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]"))
	public AndroidElement Explore_All_Services;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_jazzcash"))
	public AndroidElement JazzCashLogoMainScreen;
	
	
	



	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView"))
	public AndroidElement Next5;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView"))
	public AndroidElement Gotit;


	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/got_it"))
	public AndroidElement Gotit1;

	


	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_remark_text"))
	public AndroidElement DailyDebitLimits;
	
	
	//KeyBoard Objects
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
	
	 ///////////////////////AlaCart////////////////////////////////////////////////////////////////
	 
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup"))
		public AndroidElement AlaCart;
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"))
		public AndroidElement SkipReadMore;
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.FrameLayout/android.widget.ImageView"))
		public AndroidElement HealthandSports;
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup"))
		public AndroidElement ClickOnProduct;
	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/add_to_cart_product"))
		public AndroidElement AddToCart;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_buy_now"))
		public AndroidElement BuyNow;
	 
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/cart_ic"))
		public AndroidElement ClickonCart;
	 
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"))
		public AndroidElement ClickonCheckout;
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"))
		public AndroidElement ClickonStandardDelivery;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/track_order_btn"))
		public AndroidElement PayNow;
	 
	 
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.view.ViewGroup/android.widget.RadioButton"))
		public AndroidElement POD;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/yesButton"))
		public AndroidElement ConfirmTransaction;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_use_mpin"))
		public AndroidElement UseMpin;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_close_receipt"))
		public AndroidElement ClickonCross;

}