package ro.altom.altunitytesterexample;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import ro.altom.altunitytester.AltUnityDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SampleAppiumTest2 {

	public static AndroidDriver<MobileElement> appiumDriver;
	public static AltUnityDriver altUnityDriver;
    
	@Test
    public static void main() throws Exception {
        //AltUnityDriver.setupPortForwarding("android", "", 13000, 13000);
        File app = new File("E:\\alt-unity-tester-252.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "Pixel 2 API 28");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        
        Thread.sleep(5000);
       
       AltUnityDriver.setupPortForwarding("android","", 13000, 13000);       
        
       System.out.println("Port Forwarded.");
       
       Thread.sleep(25000);
       //Thread.sleep(5000);
       
        //altUnityDriver = new AltUnityDriver("127.0.0.1", 13000);
        altUnityDriver = new AltUnityDriver("127.0.0.1", 13000, ";", "&", true);
        
        System.out.println("App Forwarded to AltUnity Tester.");
        
    }
}
