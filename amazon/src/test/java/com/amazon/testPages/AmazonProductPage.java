package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.amazon.testBase.AmazonBase;
import com.amazon.Support.*;

public class AmazonProductPage extends AmazonBase
    {
        @Test(priority = 3)
        public void ProductPage() throws InterruptedException
            {
                Thread.sleep(2000);

                System.out.println("productName1: "
                        + androidDriver.findElements(By.xpath(paths.getString("productName"))).get(1).getText());

                System.out.println("productPrice1: "
                        + androidDriver.findElement(By.xpath(paths.getString("productPrice"))).getText());

                productName = androidDriver.findElements(By.xpath(paths.getString("productName"))).get(1).getText();

                if (productName.startsWith("buy"))
                    productName = productName.substring(4);

                productPrice = androidDriver.findElement(By.xpath(paths.getString("productPrice"))).getText();

                findByScrolling(paths.getString("scroll"));
                    log.info("Item added to cart");

                click(paths.getString("goToCart"));
                    log.info("Entered cart");
            }
    }
