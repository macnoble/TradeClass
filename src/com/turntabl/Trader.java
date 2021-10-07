package com.turntabl;


public class Trader {
    private String traderName;
    private Account traderAccount;


    public Trader(String traderName, Account traderAccount) {
        this.traderName = traderName;
        this.traderAccount = traderAccount;
    }


    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public Account getTraderAccount() {
        return traderAccount;
    }

    public void setTraderAccount(Account traderAccount) {
        this.traderAccount = traderAccount;
    }

    public void addTrade(double price, int quantity){
        double value = price * quantity;
        double currentValue = this.getTraderAccount().getAccountValue();
        double totalValue = value + currentValue;

        this.getTraderAccount().setAccountValue(totalValue);


    }
}
