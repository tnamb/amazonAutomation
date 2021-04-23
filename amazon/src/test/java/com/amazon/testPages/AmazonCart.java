package com.amazon.testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.testBase.AmazonBase;

public class AmazonCart extends AmazonBase
    {
        public void Cart()
            {   
                    log.info("AmazonCart:");
                productPrice = productPrice.substring(7, productPrice.length());
                
                    log.info("AmazonCart: ProductName2:" + findTextUsingClassName(paths.getString("productName2")));
                    
                productName2 = findTextUsingClassName(paths.getString("productName2"));
                
                productPriceToCompare.append(paths.getString("rupeeSymbol") + productPrice + paths.getString("suffix"));
                              
                productPrice2 = findTextUsingXpath(paths.getString("productPrice2-one"), paths.getString("productPrice2-two"), productPriceToCompare);
                              
                makeEqualInLength(productName, productName2);
                trimPrice();
                takeScreenshot();
                
                    log.info("**********************");
                        log.info("AmazonCart: ProductName: " + productName);
                        log.info("AmazonCart: ProductPrice: " + productPrice);
                    log.info("");
                        log.info("AmazonCart: ProductName2: " + productName2);
                        log.info("AmazonCart: ProductPrice2: " + productPrice2);
                    log.info("**********************");
                
                
                Assert.assertEquals(productName, productName2);
                Assert.assertEquals(productPrice, productPrice2);
                
                
                    log.info("AmazonCart: Cart exited successfully");
                    log.info("----------------");
            }
    }
