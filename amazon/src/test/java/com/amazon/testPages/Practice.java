package com.amazon.testPages;


import org.apache.log4j.Logger;

import com.amazon.testBase.AmazonBase;

public class Practice extends AmazonBase
    {
        static Logger log = Logger.getLogger(Practice.class);
        
        public static void main(String[] args)
        {
            productName = "buy vodafone tv 64 inch aksjdlajdad asdlasdk";
            
            if (productName.startsWith("buy"))
                System.out.println(productName = productName.substring(4));
            
        }
    }
