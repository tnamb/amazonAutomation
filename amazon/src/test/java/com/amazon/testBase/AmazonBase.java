package com.amazon.testBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.amazon.Support.ScrollAction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AmazonBase
    {
        public static AppiumDriver<MobileElement> driver;
        public static AndroidDriver<AndroidElement> androidDriver;
        public static WebDriverWait wait;
        public static Logger log = Logger.getLogger("DEBUG");
        public static ScrollAction mbAct;
        public static AndroidElement webViewElement;
        public static URL url;
        static DesiredCapabilities caps = new DesiredCapabilities();
        public static StringBuilder productPriceToCompare = new StringBuilder();
        
        public static String productName;
        public static String productPrice;
        
        public static String productName2;
        public static String productPrice2;
        

        public static ResourceBundle credentials = ResourceBundle.getBundle("credentials");
        public static ResourceBundle paths = ResourceBundle.getBundle("paths");

        @BeforeSuite
        public void setup() throws MalformedURLException
            {

                caps.setCapability("deviceName", credentials.getString("deviceName"));
                caps.setCapability("udid", credentials.getString("udid"));

                caps.setCapability("platformName", credentials.getString("platformName"));
                caps.setCapability("platformVersion", credentials.getString("platformVersion"));

                caps.setCapability("appPackage", credentials.getString("appPackage"));
                caps.setCapability("appActivity", credentials.getString("appActivity"));

                caps.setCapability("unicodeKeyboard", credentials.getString("unicodeKeyboard"));
                caps.setCapability("resetKeyboard", credentials.getString("resetKeyboard"));

                url = new URL(credentials.getString("URL"));
                //driver = new AppiumDriver<MobileElement>(url, caps);
                androidDriver = new AndroidDriver<AndroidElement>(url, caps);
                
                androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }

        public void find(String locator)
            {
                androidDriver.findElement(By.xpath(locator));
            }

        public void click(String locator)
            {
                androidDriver.findElement(By.xpath(locator)).click();
            }

        public void clickById(String locator)
            {
                androidDriver.findElement(By.id(locator)).click();
            }

        public void type(String locator, String value)
            {
                androidDriver.findElement(By.xpath(locator)).sendKeys(value);
            }

        public static int RandomNumber(int randomNumber)

            {
                randomNumber = randomNumber / 10;
                int number = 2;
                int minimum = 2;
                int range = randomNumber - minimum + 1;

                for (int i = 2; i < randomNumber; i++)
                    {
                        number = (int) (Math.random() * range) + minimum;
                    }

                return number;
            }
    }