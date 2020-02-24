package androidDrive;

import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class WhatsAppMsg {
	DesiredCapabilities dc;
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.id("com.whatsapp:id/conversations_row_contact_name")).click();
	  
	  driver.findElement(By.id("com.whatsapp:id/entry")).click();
	  driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("Good Night");
	  driver.findElement(By.id("com.whatsapp:id/send")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
		dc.setCapability("deviceName","0123456789ABCDEF");
		dc.setCapability("platformVersion","5.1");
		dc.setCapability("platformName","Android");
		dc.setCapability("appPackage","com.android.launcher3");
		dc.setCapability("appActivity","com.whatsapp.Main");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
