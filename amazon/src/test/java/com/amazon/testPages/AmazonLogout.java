package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

public class AmazonLogout extends AmazonBase
    {
        @Test(priority = 5)
        public void logout()
            {
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("hamburgerMenuButtton"))), "hamburgerMenuButtton is not visible");
                click(paths.getString("hamburgerMenuButtton"));
                
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("SettingsButton"))), "SettingsButton is not visible");
                click(paths.getString("SettingsButton"));
                
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("SignOutButton"))), "SignOutButton is not visible");
                click(paths.getString("SignOutButton"));
                
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("SignOutButton2"))), "SignOutButton2 is not visible");
                click(paths.getString("SignOutButton2"));
                
                    log.info("Logout successful");
            }
    }
