package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;

public class AmazonProductPage extends AmazonBase
    {
        @Test(priority = 3)
        public void ProductPage() throws InterruptedException
            {
                Thread.sleep(2000);
                
                System.out.println(findTextFromList(paths.getString("productName"), 1));

                System.out.println("productPrice1: "
                        + androidDriver.findElement(By.xpath(paths.getString("productPrice"))).getText());

                productName = findTextFromList(paths.getString("productName"), 1);

                trimName();
                
                productPrice = androidDriver.findElement(By.xpath(paths.getString("productPrice"))).getText();

                findByScrolling(paths.getString("scroll"));
                    log.info("Item added to cart");

                click(paths.getString("goToCart"));    
                
                    log.info("Entered cart");
            }
    }
