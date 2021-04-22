package com.amazon.testPages;


import org.apache.log4j.Logger;

import com.amazon.testBase.AmazonBase;

public class Practice extends AmazonBase
    {
        static Logger log = Logger.getLogger(Practice.class);
        
        public static void main(String[] args)
        {
            productName = "amazon.in buy vodafone tv 64 inch aksjdlajdad asdlasdk";
            productName2 = "vodafone tv 64 inch aksjdlajdad asdlasdk: amazon.in: amazon.in";
            
                
                /*
                 * if (productName.startsWith("amazon.in")) productName =
                 * productName.substring(10);
                 * 
                 * if (productName.startsWith("buy")) productName = productName.substring(4);
                 */
                 
            String abc = "?1,10,990.00";
            abc = abc.substring(1, abc.length()-3);
           
            
            System.out.println(abc);

            
        }
    }
