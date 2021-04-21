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

                System.out.println("text1: " + androidDriver
                        .findElements(By.xpath("//*[@class='android.webkit.WebView']")).get(1).getText());

                System.out.println("text2: "
                        + androidDriver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getText());

                productName = androidDriver.findElements(By.xpath("//*[@class='android.webkit.WebView']")).get(1)
                        .getText();
                
                if (productName.startsWith("buy"))
                    productName = productName.substring(4);
                
                productPrice = androidDriver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getText();

                androidDriver.findElementByAndroidUIAutomator(paths.getString("scroll")).click();
                log.info("Item added to cart");

                click(paths.getString("goToCart"));
                log.info("Entered cart");
            }
    }
