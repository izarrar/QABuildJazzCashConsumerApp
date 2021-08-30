package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAccountsPO {

		public MyAccountsPO(AppiumDriver<AndroidElement> driver) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"))
		public AndroidElement MyAccount;
		
		//Profile OBjects
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_person_name"))
		public AndroidElement ProfileName;

		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_points"))
		public AndroidElement AccountNumber;
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"))
		public AndroidElement CoachMark1;
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"))
		public AndroidElement CoachMark2;


		//Accounts Limits
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout"))
		public AndroidElement Accountlimits;
		
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/daily_limit_title"))
		public AndroidElement DailyLimitTitle;
		
		
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/monthly_limit_title"))
		public AndroidElement MonthlyLimitTitle;
		
		//Transaction history
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout"))
		public AndroidElement TransactionHistory;
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"))
		public AndroidElement ThisMonth;

		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView"))
		public AndroidElement ReceivedTab;
		
		//************Statements
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.LinearLayout"))
		public AndroidElement Statements;
		
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/heading_statement"))
		public AndroidElement AccountStatementTitle;
		
		
		//*******Linked Debit Cards************
		
		
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/title"))
		public AndroidElement LinkedCardsTitle;
		
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/description"))
		public AndroidElement LinkedCardsDescription;
		
		
		//Delink Device
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/cancelButton"))
		public AndroidElement NoGoBack;
		
		//Logout
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/yesButton"))
		public AndroidElement YesLogout;
		
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/loggedin_log_in_label"))
		public AndroidElement LoginLable;
		
		
		
		
		
		
		
		
		
		
		

	}
