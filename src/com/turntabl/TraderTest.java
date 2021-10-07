package com.turntabl;

import org.junit.Assert;
import org.junit.Test;


public class TraderTest{

    @Test
    public void addTrade(){
        Trade t1 = new Trade("101","IBM",10000,1000.00);

        Account newAccount = new Account(0);

        Trader newTrader = new Trader("MacNoble",newAccount);

        newTrader.addTrade(t1.getPrice(),t1.getQuantity());
        Assert.assertEquals(10_000_000,newTrader.getTraderAccount().getAccountValue(),0);

    }

}