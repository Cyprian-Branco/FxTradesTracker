package com.moringaschool.fxtradetracker.models;

import java.io.Serializable;

public class TradeData implements Serializable {


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBuyingSellingPrice() {
        return buyingSellingPrice;
    }

    public void setBuyingSellingPrice(String buyingSellingPrice) {
        this.buyingSellingPrice = buyingSellingPrice;
    }

    public String getStopTakePrice() {
        return stopTakePrice;
    }

    public void setStopTakePrice(String stopTakePrice) {
        this.stopTakePrice = stopTakePrice;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(String profitLoss) {
        this.profitLoss = profitLoss;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;

    }
    String currency;
    String amount;
    String buyingSellingPrice;
    String stopTakePrice;
    String volume;
    String profitLoss;



    public TradeData(String currency, String amount, String buyingSellingPrice, String stopTakePrice, String volume, String profitLoss) {
        this.currency = currency;
        this.amount = amount;
        this.buyingSellingPrice = buyingSellingPrice;
        this.stopTakePrice = stopTakePrice;
        this.volume = volume;
        this.profitLoss = profitLoss;
    }

    public  TradeData(){

    }
}
