package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Profile_Feature {

	public Profile_Feature(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_user_profile"))
	public AndroidElement ClickonProfileofAlaCart;
	
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/address_select"))
	public AndroidElement ClickonAddressBook;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/add_address_icon"))
	public AndroidElement ClickonPlusButton;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/findOnMapBtn"))
	public AndroidElement ClickonFindonMap;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_positive"))
	public AndroidElement ClickonAllowLocation;
	
	@AndroidFindBy(id=("com.android.permissioncontroller:id/permission_allow_foreground_only_button"))
	public AndroidElement ClickonAllowTheApp;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
	public AndroidElement ClickonSearchLocationOnMap;
	
	
	
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"))
	public AndroidElement ClickonConfirmLocation;


	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/address"))
	public AndroidElement ClickonSearchSugguestions;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/payment_select"))
	public AndroidElement ClickonPaymentMethod;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/help_select"))
	public AndroidElement ClickonHelpandSupport;
	
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/contact_label"))
	public AndroidElement WaitforContact;
	
	@AndroidFindBy(id = ("com.techlogix.mobilinkcustomer:id/postalCodeEdt"))
	public AndroidElement ZipCode;
	
	@AndroidFindBy(id = ("com.techlogix.mobilinkcustomer:id/landmarkEdt"))
	public AndroidElement NearestLandMark;
	
	@AndroidFindBy(id = ("com.techlogix.mobilinkcustomer:id/add_address_btn"))
	public AndroidElement ClickonSave;
	
	@AndroidFindBy(id = ("com.techlogix.mobilinkcustomer:id/text2"))
	public AndroidElement Close_Text_Wait;
	
	@AndroidFindBy(id = ("com.techlogix.mobilinkcustomer:id/tv_jazzcash"))
	public AndroidElement Draw_Close;


	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_close"))
	public AndroidElement Close;
	
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup"))
	public AndroidElement AlaCart;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
	public AndroidElement ClickonSearchBox;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchField"))
	public AndroidElement ClickonSearchForQuery;


	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView"))
	public AndroidElement SelectSuggestion;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/img"))
	public AndroidElement ClickOnSort;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView"))
	public AndroidElement DateSort;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"))
	public AndroidElement NameSort;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/gridButton"))
	public AndroidElement ChangeView;

	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/about_layout"))
	public AndroidElement ClickonAboutAlaCart;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/terms_of_use"))
	public AndroidElement ClickonTermsAndCondition;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/terms_of_use"))
	public AndroidElement ClickonWishList;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/jvo_select"))
	public AndroidElement ClickonAlaCartCredits;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_points"))
	public AndroidElement ClickonJazzCashProfile;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/expand"))
	public AndroidElement ClickonExpand;
	
	
	

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/clear_product_categories"))
	public AndroidElement ClickonCloseAllCategories;
}
