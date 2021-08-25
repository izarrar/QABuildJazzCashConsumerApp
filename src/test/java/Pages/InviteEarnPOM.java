package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InviteEarnPOM {

		public InviteEarnPOM(AppiumDriver<AndroidElement> driver) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}


		
		//Click on Invite and Earn button on home Screen
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/rewards_bottom_nav"))
		public AndroidElement InviteEarnClick;

	
		//Click on add contact button
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/invite_btn"))
		public AndroidElement ClickAddContact;
		
		
		//Click on Invite friends button
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/invite_btn"))
		public AndroidElement ClickonInviteFriends;
		
		
		//Click on Invite friends button
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
		public AndroidElement ClickonMobileSearchField;

				
				//Keyboard Object 
				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_0"))
				public AndroidElement Zero;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_1"))
				public AndroidElement One;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_2"))
				public AndroidElement Two;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_3"))
				public AndroidElement Three;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_4"))
				public AndroidElement Four;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_5"))
				public AndroidElement Five;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_6"))
				public AndroidElement Six;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_7"))
				public AndroidElement Seven;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_8"))
				public AndroidElement Eight;

				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_9"))
				public AndroidElement Nine;

	}