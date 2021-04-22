package com.amazon.testPages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

import io.appium.java_client.android.AndroidElement;

public class AmazonSearch extends AmazonBase
    {
        @Test(priority = 2)
        public void search() throws InterruptedException, MalformedURLException
            {
                click(paths.getString("searchBar_xpath"));

                type(paths.getString("searchBar_xpath"), paths.getString("searchParameter"));

                    log.info("Search paramerter entered: " + paths.getString("searchParameter"));

                click(paths.getString("enterKey"));

                List<AndroidElement> list = androidDriver.findElements(By.className(paths.getString("listClassName")));
                int index = RandomNumber(list.size());

                System.out.println("index: " + index + " listSize: " + list.size());

                find(paths.getString("listWidget_xpath"));
                androidDriver
                        .findElementByAndroidUIAutomator(paths.getString("scroll1") + index + paths.getString("scroll2"))
                        .click();

                    log.debug("Search successful");
            }
    }
