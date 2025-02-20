package firstapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Apptest {
    
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.accessibilityId("Account\nTab 4 of 4")).click();
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.accessibilityId("Signup")).click();
        Thread.sleep(2000);
        
        WebElement er = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
        er.click();
        er.sendKeys("John");
        
        WebElement eq = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
        eq.click();
        eq.sendKeys("Marston");
        
        WebElement ec = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
        ec.click();
        ec.sendKeys("9021598876");
        
        driver.findElement(AppiumBy.androidUIAutomator(
        	    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
        Thread.sleep(2000);

        
        WebElement eb = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
        eb.click();
        Thread.sleep(1000);
        eb.sendKeys("abusufiyan.akkalkotkar03@gmail.com");
        
        WebElement em = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
        em.click();
        em.sendKeys("Abu@9021");
        
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(0)")).click();
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(1)")).click();
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(2)")).click();
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.androidUIAutomator(
        	    "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(5).scrollForward();"));
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Create Account\")")).click();
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
