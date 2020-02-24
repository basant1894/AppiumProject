package appiumTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class CallFunctionality {
	DesiredCapabilities dc;
	WebDriver driver;
  @Test
  public void f() throws Exception {
	 Thread.sleep(2000);
 driver.findElement(By.xpath("\\android.widget.TextView[@text='Phone']")).click();
 driver.findElement(By.id("com.android.dialer:id/floatinf_action_button")).click();
 driver.findElement(By.id("com.android.dialer:id/one")).click();
 driver.findElement(By.id("com.android.dialer:id/two")).click();
 driver.findElement(By.id("com.android.dialer:id/three")).click();
 driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "198d6aec");
	  dc.setCapability("platformVersion", "5.0.0");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.anddoes.launcher3");
	  dc.setCapability("appActivity", "com.android.server.telecom.CallActivity");
	  driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

  }

  @AfterTest
  public void afterTest() {
  }

}
