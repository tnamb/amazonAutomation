package com.amazon.testPages;

import com.amazon.testBase.AmazonBase;

public class Practice extends AmazonBase
    {
        public static void main(String[] args)
        {
            String price = "2,150";
            
            //System.out.println(price.substring(7, price.length()));
            
            if (price.contains("2"))
                price = price.substring(1);
            
            StringBuilder str = new StringBuilder();
            
            System.out.println(price);
            

        }
    }
