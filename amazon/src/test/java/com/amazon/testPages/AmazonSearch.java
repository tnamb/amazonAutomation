package com.amazon.testPages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

import io.appium.java_client.android.AndroidElement;

public class AmazonSearch extends AmazonBase
    {     
        @Test(priority = 2)
        public void search() throws InterruptedException, MalformedURLException
            {
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("searchBar_xpath"))), "Search bar is not visible");
                click(paths.getString("searchBar_xpath"));

                type(paths.getString("searchBar_xpath"), paths.getString("searchParameter"));
                    log.info("Search paramerter entered: " + paths.getString("searchParameter"));

                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("enterKey"))), "Keyboard is not visible");
                click(paths.getString("enterKey"));

                List<AndroidElement> list = androidDriver.findElements(By.className(paths.getString("listClassName")));
                searchIndex = RandomNumber(list.size());

                System.out.println("index: " + searchIndex + " listSize: " + list.size());
                    log.info("Search index generated");

                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("searchBar_xpath"))), "Search bar is not visible");
                find(paths.getString("listWidget_xpath"));
                androidDriver
                        .findElementByAndroidUIAutomator(paths.getString("scroll1") + searchIndex + paths.getString("scroll2"))
                        .click();
                
                    log.info("Search successful");
            }
    }
