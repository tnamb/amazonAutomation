package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

public class AmazonProductPage extends AmazonBase
    {
        public void ProductPage() throws InterruptedException
            {
                Thread.sleep(2000);
                
                takeScreenshot();
                
                    log.info("AmazonProductPage: ");

                    log.info("AmazonProductPage: PRODUCT NAME: " + findTextFromList(paths.getString("productName"), 1));

                    log.info("AmazonProductPage: PRODUCT PRICE: "
                        + androidDriver.findElement(By.xpath(paths.getString("productPrice"))).getText());

                productName = findTextFromList(paths.getString("productName"), 1);

                trimName();

                productPrice = androidDriver.findElement(By.xpath(paths.getString("productPrice"))).getText();

                findByScrolling(paths.getString("scroll"));
                log.info("AmazonProductPage: Item added to cart");

                click(paths.getString("goToCart"));

                log.info("AmazonProductPage: Product page exited successfully");
                log.info("----------------");
            }
    }
