package com.simplilearn.Ph4SeleniumDocker;

     import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
	 import junit.framework.TestCase;
	
	 import java.net.MalformedURLException;
	 import java.net.URL;
     import java.util.concurrent.TimeUnit;

     import org.openqa.selenium.remote.DesiredCapabilities;
     import org.testng.annotations.BeforeClass;
     import org.testng.annotations.Test;

public class FlipKartApp {

	  private AndroidDriver driver;

	  @BeforeClass
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "11");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:appPackage", "com.flipkart.android");
	    desiredCapabilities.setCapability("appium:appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities); 
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  

	  }

	  @Test
	  public void testFlipkart() throws InterruptedException { 
		  
		  driver.findElementByXPath("//android.widget.RelativeLayout[4]//android.widget.ImageView[1]").click();
		driver.findElementById("com.flipkart.android:id/select_btn").click();
	   driver.findElementById("com.flipkart.android:id/custom_back_icon").click();
	   driver.findElementById("com.flipkart.android:id/search_widget_textbox").click();
	   driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView").sendKeys("Laptop Bag");
	   driver.findElementByXPath("//android.widget.LinearLayout//android.widget.TextView ").click();
       driver.findElementById("com.flipkart.android:id/not_now_button").click();
	   
	 //  driver.findElementByXPath("//android.view.ViewGroup[1]//android.widget.ImageView[1]").click();
	   
	   
	   
	   Thread.sleep(10000);
	   driver.quit();
	    		
	    	
	  }

	 /* @After
	 public void tearDown() {
	    driver.quit();
	  }*/
	}






