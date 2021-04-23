package com.amazon.testCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

import io.appium.java_client.android.AndroidElement;

public class TestAmazonSearch extends AmazonBase
    {     
        @Test(priority = 2)
        public void search() throws InterruptedException, MalformedURLException
            {
                takeScreenshot();

                    log.info("AmazonSearch: ");
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("searchBar_xpath"))), "Search bar is not visible");
                click(paths.getString("searchBar_xpath"));

                type(paths.getString("searchBar_xpath"), paths.getString("searchParameter"));
                    log.info("AmazonSearch: Search paramerter entered: " + paths.getString("searchParameter"));
                    
                takeScreenshot();

                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("enterKey"))), "Keyboard is not visible");
                click(paths.getString("enterKey"));

                //list = androidDriver.findElements(By.className(paths.getString("listClassName")));
                
                list = findListUsingClassName(paths.getString("listClassName"));
                searchIndex = RandomNumber(list.size());

                System.out.println("index: " + searchIndex + " listSize: " + list.size());
                    log.info("AmazonSearch: Search index generated");

                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("searchBar_xpath"))), "Search bar is not visible");
                find(paths.getString("listWidget_xpath"));
                androidDriver
                        .findElementByAndroidUIAutomator(paths.getString("scroll1") + 4 + paths.getString("scroll2"))
                        .click();
                
                takeScreenshot();
                
                    log.info("AmazonSearch: Search successful");
                    log.info("----------------");
            }
    }
