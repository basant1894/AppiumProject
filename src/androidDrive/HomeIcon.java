package androidDrive;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HomeIcon {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() {
//driver.findElementByAndroidUIAutomator("UiSelector().text(\"App drawer\")").click();
  driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").instance(3)").click();	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "198d6aec0104");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.android.launcher3");
	  dc.setCapability("appActivity", "com.google.android.apps.chrome.document.DocumentActivity");
  driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}





