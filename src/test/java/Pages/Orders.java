package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Orders {public Orders(AppiumDriver<AndroidElement> driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

//	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"AlaCart\"));")
//	public AndroidElement Click_on_AlaCart;

//	@AndroidFindBy(uiAutomator="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
//	public AndroidElement Click_on_AlaCart;
	

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup"))
	public AndroidElement AlaCart;


	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"))
	public AndroidElement SkipReadMore;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_user_profile"))
	public AndroidElement ClickonProfile;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/orders_select"))
	public AndroidElement ClickonMenu;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
	public AndroidElement ClickonOrder;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/track_order"))
	public AndroidElement ClickonTrackOrder;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/order_btn"))
	public AndroidElement ClickonCancleOrder;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/cancel"))
	public AndroidElement Close;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"))
	public AndroidElement ClickonSureCancle;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
	public AndroidElement Home_Search_Screen;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchField"))
	public AndroidElement Search_Product_Screen;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/filter_data"))
	public AndroidElement Click_on_1Rs_Product;
	

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/container"))
	public AndroidElement Open_1Rs_Product_Details;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/filterTv"))
	public AndroidElement SortByPrice;

	
	
	///////////////////////AlaCart////////////////////////////////////////////////////////////////
	 
	 

	 

	 
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
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/cart_ic"))
		public AndroidElement Cart_Icon;
	 
	 
	 
	 
	 @AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.view.ViewGroup/android.widget.RadioButton"))
		public AndroidElement POD;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/yesButton"))
		public AndroidElement ConfirmTransaction;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_use_mpin"))
		public AndroidElement UseMpin;
	 
	 @AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_close_receipt"))
		public AndroidElement ClickonCross;
	
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
