package com.moringaschool.fxtradetracker.ui.main;

import java.io.Serializable;

public class TradeData implements Serializable {
    int amount;
    Double buyingSellingPrice;
    Double stopTakePrice;
    Double volume;
    Double profitLoss;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getBuyingSellingPrice() {
        return buyingSellingPrice;
    }

    public void setBuyingSellingPrice(Double buyingSellingPrice) {
        this.buyingSellingPrice = buyingSellingPrice;
    }

    public Double getStopTakePrice() {
        return stopTakePrice;
    }

    public void setStopTakePrice(Double stopTakePrice) {
        this.stopTakePrice = stopTakePrice;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(Double profitLoss) {
        this.profitLoss = profitLoss;
    }

    public TradeData(int amount, Double buyingSellingPrice, Double stopTakePrice, Double volume, Double profitLoss) {
        this.amount = amount;
        this.buyingSellingPrice = buyingSellingPrice;
        this.stopTakePrice = stopTakePrice;
        this.volume = volume;
        this.profitLoss = profitLoss;
    }
}
