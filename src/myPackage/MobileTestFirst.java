package myPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTestFirst {
	


	// this is what we do for the appium for mobile testing

	DesiredCapabilities caps = new DesiredCapabilities();
	AndroidDriver driver;

    @BeforeTest
    public void TheSetUp() {
    	
    	// we will use them always 
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelZiad");
        
        // we use them only when we need to interact with browsers 
        caps.setCapability("chromedriverExecutable", "C:\\ChromeWebDriver\\chromedriver.exe");
       caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//        

    }

	@Test()
	public void TestTheBrowser() throws MalformedURLException {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("XSqSsc")).sendKeys("Linkedin"+Keys.ENTER); 

	}
	

	@AfterTest
	public void PostTesting() {
	}

}
