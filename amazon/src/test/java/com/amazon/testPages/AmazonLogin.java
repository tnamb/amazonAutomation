package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

public class AmazonLogin extends AmazonBase
    {
        @Test(priority=1)
        public void Login() throws InterruptedException
            {                              
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("alreadyCustomer_xpath"))), "Already a customer button not visible!");   
                click(paths.getString("alreadyCustomer_xpath"));
                                      
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("usernamePath_xpath"))), "Username text field is not visible");
                type(paths.getString("usernamePath_xpath"), credentials.getString("username"));                              
                    log.info("Entered username");
                
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("buttonContinue_xpath"))), "Continue button is not visible");
                click(paths.getString("buttonContinue_xpath"));
                                    
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("passwordPath_xpath"))), "Password textfield is not visible");
                type(paths.getString("passwordPath_xpath"), credentials.getString("password"));
                    log.info("Entered password");
                
                    Assert.assertTrue(isElementPresent(By.xpath(paths.getString("submit_xpath"))), "Submit button is not visible");
                click(paths.getString("submit_xpath"));
                
                    log.info("Login successful");
            }
    }