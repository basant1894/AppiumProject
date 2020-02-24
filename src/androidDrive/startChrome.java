package androidDrive;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class startChrome {
	
	@Test
	public void testchrome() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "198d6aec0104");
		
		capabilities.setCapability(MobileCapabilityType.VERSION, "9");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		WebDriver driver= new AndroidDriver(url, capabilities);
		
		driver.get("http://www.facebook.com");
		
		System.out.println("Title "+driver.getTitle());
		
		//enter username
		driver.findElement(By.name("email")).sendKeys("8598812224");
		
		driver.findElement(By.name("pass")).sendKeys("*******");
		
		driver.findElement(By.id("u_0_6")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
