package androidDrive;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WhatsApp_advanced1 {
	DesiredCapabilities  dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "198d6aec");
	  dc.setCapability("platformVersion", "8.0");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
//driver.findElement(By.xpath("//android.widget.TextView[@text='Prabhakar Manjeera']")).click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Bikram New\")").click();
driver.findElement(By.id("com.whatsapp:id/entry")).click();
driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("Gud Evng..");
driver.findElement(By.id("com.whatsapp:id/send")).click();

  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
