package appiumTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
	WebDriver driver;
	DesiredCapabilities dc;

	
	@BeforeTest
	public void beforeTest() throws Exception{
		dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Mi A1");
		dc.setCapability("udid", "198d6aec0104");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.google.android.dialer");
		dc.setCapability("appActivity", "com.android.dialer.app.calllog.CallLogActivity");
		driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	  @Test
	  public void test(){
		  
		  
	  }
	    

}
