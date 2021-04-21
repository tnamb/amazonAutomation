package com.amazon.Support;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;

import com.amazon.testBase.AmazonBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollAction extends AmazonBase
    {
        public ScrollAction(AppiumDriver<MobileElement> driver) {}

        @SuppressWarnings("rawtypes")
        public AndroidElement ScrollToElement(String elementToLocate)
            {
                AndroidElement element = null;
                int numberOfTimes = 10;
                Dimension size = driver.manage().window().getSize();
                                
                int anchor = (int) (size.width / 2);
                int startPoint = (int) (size.height-100); // size.height-10: originally
                int endPoint = (int) (size.height/10); //originally 10

                for (int i = 0; i < numberOfTimes; i++)
                    {
                        try
                            {
                                new TouchAction(driver).longPress(PointOption.point(anchor, startPoint))
                                        .moveTo(PointOption.point(anchor, endPoint)).release().perform();
                                
                                element = (AndroidElement) driver.findElementById(elementToLocate);
                                i = numberOfTimes;
                            } 
                        
                        catch (NoSuchElementException e)
                            {
                                System.out.println(String.format("Scrolling (%s) times...", i + 1));
                                e.printStackTrace();
                            }
                    }
                return element;
            }
    }