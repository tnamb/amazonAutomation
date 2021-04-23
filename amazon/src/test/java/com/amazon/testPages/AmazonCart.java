package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.testBase.AmazonBase;

public class AmazonCart extends AmazonBase
    {
        @Test(priority = 4)
        public void Cart()
            {   
                productPrice = productPrice.substring(7, productPrice.length());
                
                    log.info(
                        "CartPage Name: " + androidDriver.findElement(By.className(paths.getString("productName2"))).getText());
                
                productName2 = androidDriver.findElement(By.className(paths.getString("productName2"))).getText();

                productPriceToCompare.append(paths.getString("rupeeSymbol") + productPrice + paths.getString("suffix"));
                
                    log.info("CartPage Price: " + androidDriver.
                        findElement(By.xpath(paths.getString("productPrice2-one")+ productPriceToCompare + 
                                paths.getString("productPrice2-two"))).getText());
                
                productPrice2 = androidDriver.findElement(By.xpath(
                        paths.getString("productPrice2-one")+ productPriceToCompare + paths.getString("productPrice2-two"))).getText();
                              
                makeEqualInLength(productName, productName2);
                trimPrice();
                
                Assert.assertEquals(productName, productName2);
                Assert.assertEquals(productPrice, productPrice2);
            }
    }
