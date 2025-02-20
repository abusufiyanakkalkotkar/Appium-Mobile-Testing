package firstapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CarterationHistory {
    
    private AppiumDriver driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        HashMap<String, Object> appiumOptions = new HashMap<>();
        appiumOptions.put("deviceName", "Galaxy A31");
        appiumOptions.put("udid", "RZ8R12A64GP");
        appiumOptions.put("platformVersion", "12");
        appiumOptions.put("automationName", "UiAutomator2");
        appiumOptions.put("appPackage", "com.evdrive.android");
        appiumOptions.put("appActivity", "com.eflux.ev.MainActivity");
        
        cap.setCapability("appium:options", appiumOptions);
        cap.setCapability("platformName", "Android");
        
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, cap);
    }
    
    @Test
    public void UserLoginandSignup() throws InterruptedException {
       
        
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.accessibilityId("Account\nTab 4 of 4")).click();
        Thread.sleep(2000);
        
        
        
        
        System.out.println("Application started successfully.");
    }
    
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}














//driver.findElement(AppiumBy.accessibilityId("Login")).click();
//Thread.sleep(2000);
//
//WebElement eb = wait.until(ExpectedConditions.elementToBeClickable(
//        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
//eb.click();
//Thread.sleep(1000);
//eb.sendKeys("abusufiyan.akkalkotkar03@gmail.com");
//
//WebElement em = wait.until(ExpectedConditions.elementToBeClickable(
//        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
//em.click();
//em.sendKeys("Abu@9021");
//
//driver.findElement(AppiumBy.accessibilityId("Login")).click();
//Thread.sleep(2000);

