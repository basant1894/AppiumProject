package androidDrive;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class WhatsApp_advanced2 {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Nishu Hyderabad\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/conversation_row_name\")").click();

Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().back();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/conversation_row_name\").instance(6)click()").click();

  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
		dc.setCapability("deviceName","0123456789ABCDEF");
		dc.setCapability("platformVersion","5.1");
		dc.setCapability("platformName","Android");
		dc.setCapability("appPackage","com.whatsapp");
		dc.setCapability("appActivity","com.whatsapp.Main");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(4000);
	  driver.quit();
	  
  }

}
