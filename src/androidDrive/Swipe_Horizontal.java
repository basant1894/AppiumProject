package androidDrive;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Swipe_Horizontal {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
	//driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").instance(3)").click();
	driver.findElement(By.xpath("//android.view.View[@content-desc='Apps list']")).click();
	
	/*Thread.sleep(2000);
	driver.swipe(540, 720, 2, 482, 698);
	Thread.sleep(2000);
	driver.swipe(540, 482, 1, 482, 1000);
	Thread.sleep(2000);
	driver.swipe(1, 482, 540, 482, 1000);
	Thread.sleep(2000);
	driver.swipe(2, 720, 540, 482, 698);*/
	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	    dc=new DesiredCapabilities();
		dc.setCapability("deviceName","198d6aec0104");
		dc.setCapability("platformVersion","9");
		dc.setCapability("platformName","Android");
		dc.setCapability("appPackage","com.android.launcher3");
		dc.setCapability("appActivity","com.android.searchlauncher.searchlauncher");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
