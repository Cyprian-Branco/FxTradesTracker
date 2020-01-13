package com.moringaschool.fxtradetracker.ui.main;

import java.io.Serializable;

public class TradeData implements Serializable {
    String amount;
    String buyingSellingPrice;
    String  stopTakePrice;
    String volume;
    String profitLoss;

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

    public TradeData(String amount, String buyingSellingPrice, String stopTakePrice, String volume, String profitLoss) {
        this.amount = amount;
        this.buyingSellingPrice = buyingSellingPrice;
        this.stopTakePrice = stopTakePrice;
        this.volume = volume;
        this.profitLoss = profitLoss;
    }
}
