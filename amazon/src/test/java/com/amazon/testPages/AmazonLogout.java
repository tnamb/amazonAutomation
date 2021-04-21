package com.amazon.testPages;

import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

public class AmazonLogout extends AmazonBase
    {
        @Test(priority = 5)
        public void logout()
            {
                click(paths.getString("hamburgerMenuButtton"));
                click(paths.getString("SettingsButton"));
                click(paths.getString("SignOutButton"));
                click(paths.getString("SignOutButton2"));
                
                log.info("Logout successful");
            }
    }
