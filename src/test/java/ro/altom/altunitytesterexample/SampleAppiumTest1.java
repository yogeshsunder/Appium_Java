package ro.altom.altunitytesterexample;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import ro.altom.altunitytester.AltUnityDriver;
import ro.altom.altunitytester.AltUnityObject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SampleAppiumTest1 {

    public static AltUnityDriver altUnityDriver;
    private static AndroidDriver<MobileElement> appiumDriver;

    @BeforeClass
    public static void setUp() throws Exception {
        //AltUnityDriver.setupPortForwarding("android", "", 13000, 13000);
        File app = new File("E:\\develop-324.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "Redmi");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        ///appiumDriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(15000);
        
        System.out.println("App started.");
        
        altUnityDriver = new AltUnityDriver("127.0.0.1", 13000);
   	 	System.out.println("App is running fine on AltUnity Tester.");
        
        System.out.println("App Forwarded to AltUnity Tester.");
        
    }

    @AfterClass
    public static void tearDown() throws Exception {
        //altUnityDriver.stop();
        //appiumDriver.quit();
    }

    @Before
    public void loadLevel() throws Exception {
    	System.out.println("App started on AltUnity Tester.");
    }

    @Test
    public void testTapOnButton() throws Exception {
    	
    	System.out.println("App is entered in Test.");
    	Thread.sleep(5000);
    	
    	//AltUnityDriver.setupPortForwarding("android","", 13000, 13000);
    	
    	//System.out.println("App got set up on 13000.");
    	
        //AltUnityDriver.setupPortForwarding("android","", 13000, 13000);
        
       //Thread.sleep(10000);
        
        altUnityDriver = new AltUnityDriver("127.0.0.1", 13000);
    	 System.out.println("App is running fine on AltUnity Tester.");
    }
}
