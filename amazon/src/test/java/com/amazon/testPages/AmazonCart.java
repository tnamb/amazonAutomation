package com.amazon.testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.testBase.AmazonBase;

public class AmazonCart extends AmazonBase
    {
        @Test(priority = 4)
        public void Cart()
            {   
                productPrice = productPrice.substring(7, productPrice.length());
                
                System.out.println(
                        "CartPage Name: " + androidDriver.findElement(By.className("android.widget.Image")).getText());
                
                productName2 = androidDriver.findElement(By.className(paths.getString("productName2"))).getText();

                productPriceToCompare.append(paths.getString("rupeeSymbol") + productPrice + paths.getString("suffix"));
                
                System.out.println("CartPage Price: " + androidDriver.findElement(By.xpath(
                        "//android.view.View[@text='"+ productPriceToCompare +"']")).getText());
                
                productPrice2 = androidDriver.findElement(By.xpath(
                        paths.getString("productPrice2-one")+ productPriceToCompare + paths.getString("productPrice2-two"))).getText();
                

                //Perform Assertions...
            }
    }
