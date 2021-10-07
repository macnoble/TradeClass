package com.turntabl;

import org.junit.Assert;
import org.junit.Test;


public class TradeTest {

   @Test
   public void setPrice() {

        Trade t1 = new Trade("101","IBM",10000,1000.00);
        t1.setPrice(-500.00);
       Assert.assertEquals(1000.00, t1.getPrice(), 0);
    }
}