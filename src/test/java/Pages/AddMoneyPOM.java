package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddMoneyPOM {

		public AddMoneyPOM(AppiumDriver<AndroidElement> driver) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}


		//Click on add money button
		@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/bg_add_money_duplicate"))
		public AndroidElement ClickOnAddMoneyButton;
		
		//Click on add money button
				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/et_mobileNumber"))
				public AndroidElement SearchField;

				//Click on add money button
				@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/capital"))
				public AndroidElement NumberClick;
				
				
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
		
		
}