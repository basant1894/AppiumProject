package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CallMiA1 {
	
	DesiredCapabilities dc;
	WebDriver driver;
	
	@Test
	public void a1() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.xpath("\\android.widget.TextView[@text='Phone'")).click();
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='Call Prabhakar Delhi'])[2")).click();
		
		/*driver.findElement(By.id("com.google.android.dialer:id/floating_action_button")).click();
		driver.findElement(By.id("com.google.android.dialer:id/one")).click();
		driver.findElement(By.id("com.google.android.dialer:id/two")).click();
		driver.findElement(By.id("com.google.android.dialer:id/three")).click();
		driver.findElement(By.id("com.google.android.dialer:id/dialpad_floating_action_button")).click();*/
	}
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
	@AfterTest
	public void afterTest(){
	
		
	}

}

