package com.amazon.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;
import java.util.concurrent.TimeUnit;

public class AmazonLogin extends AmazonBase
    {
        @Test(priority=1)
        public void Login() throws InterruptedException
            {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
                //click(paths.getString("SignInButton_xpath"));

                click(paths.getString("alreadyCustomer_xpath"));
                    log.debug("Clicked on already a customer? sign in button");
                    
                type(paths.getString("usernamePath_xpath"), credentials.getString("username"));
                    log.info("Entered username");

                new WebDriverWait(driver, 10).until(
                        ExpectedConditions.presenceOfElementLocated(By.xpath(paths.getString("buttonContinue_xpath"))));
                    log.info("WebDriver wait initiated for 'Continue' button");

                click(paths.getString("buttonContinue_xpath"));
                    log.info("Clicked on 'Continue' button");
                    
                type(paths.getString("passwordPath_xpath"), credentials.getString("password"));
                    log.info("Entered password");

                click(paths.getString("submit_xpath"));
                
                log.info("Login successful");
            }
    }