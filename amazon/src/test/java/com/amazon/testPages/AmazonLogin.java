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
                type(paths.getString("usernamePath_xpath"), credentials.getString("username"));

                new WebDriverWait(driver, 10).until(
                        ExpectedConditions.presenceOfElementLocated(By.xpath(paths.getString("buttonContinue_xpath"))));

                click(paths.getString("buttonContinue_xpath"));
                type(paths.getString("passwordPath_xpath"), credentials.getString("password"));

                click(paths.getString("submit_xpath"));
                
                log.info("Login successful");
            }
    }