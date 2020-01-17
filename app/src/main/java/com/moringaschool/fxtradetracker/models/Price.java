
package com.moringaschool.fxtradetracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("occurred_at")
    @Expose
    private String occurredAt;
    @SerializedName("open_bid")
    @Expose
    private String openBid;
    @SerializedName("high_bid")
    @Expose
    private String highBid;
    @SerializedName("low_bid")
    @Expose
    private String lowBid;
    @SerializedName("close_bid")
    @Expose
    private String closeBid;
    @SerializedName("open_ask")
    @Expose
    private String openAsk;
    @SerializedName("high_ask")
    @Expose
    private String highAsk;
    @SerializedName("low_ask")
    @Expose
    private String lowAsk;
    @SerializedName("close_ask")
    @Expose
    private String closeAsk;
    @SerializedName("total_ticks")
    @Expose
    private Integer totalTicks;

    /**
     * No args constructor for use in serialization
     */
    public Price() {
    }

    /**
     * @param occurredAt
     * @param closeAsk
     * @param totalTicks
     * @param openBid
     * @param lowBid
     * @param closeBid
     * @param highAsk
     * @param highBid
     * @param openAsk
     * @param lowAsk
     */
    public Price(String occurredAt, String openBid, String highBid, String lowBid, String closeBid, String openAsk, String highAsk, String lowAsk, String closeAsk, Integer totalTicks) {
        super();
        this.occurredAt = occurredAt;
        this.openBid = openBid;
        this.highBid = highBid;
        this.lowBid = lowBid;
        this.closeBid = closeBid;
        this.openAsk = openAsk;
        this.highAsk = highAsk;
        this.lowAsk = lowAsk;
        this.closeAsk = closeAsk;
        this.totalTicks = totalTicks;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
    }

    public Price withOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    public String getOpenBid() {
        return openBid;
    }

    public void setOpenBid(String openBid) {
        this.openBid = openBid;
    }

    public Price withOpenBid(String openBid) {
        this.openBid = openBid;
        return this;
    }

    public String getHighBid() {
        return highBid;
    }

    public void setHighBid(String highBid) {
        this.highBid = highBid;
    }

    public Price withHighBid(String highBid) {
        this.highBid = highBid;
        return this;
    }

    public String getLowBid() {
        return lowBid;
    }

    public void setLowBid(String lowBid) {
        this.lowBid = lowBid;
    }

    public Price withLowBid(String lowBid) {
        this.lowBid = lowBid;
        return this;
    }

    public String getCloseBid() {
        return closeBid;
    }

    public void setCloseBid(String closeBid) {
        this.closeBid = closeBid;
    }

    public Price withCloseBid(String closeBid) {
        this.closeBid = closeBid;
        return this;
    }

    public String getOpenAsk() {
        return openAsk;
    }

    public void setOpenAsk(String openAsk) {
        this.openAsk = openAsk;
    }

    public Price withOpenAsk(String openAsk) {
        this.openAsk = openAsk;
        return this;
    }

    public String getHighAsk() {
        return highAsk;
    }

    public void setHighAsk(String highAsk) {
        this.highAsk = highAsk;
    }

    public Price withHighAsk(String highAsk) {
        this.highAsk = highAsk;
        return this;
    }

    public String getLowAsk() {
        return lowAsk;
    }

    public void setLowAsk(String lowAsk) {
        this.lowAsk = lowAsk;
    }

    public Price withLowAsk(String lowAsk) {
        this.lowAsk = lowAsk;
        return this;
    }

    public String getCloseAsk() {
        return closeAsk;
    }

    public void setCloseAsk(String closeAsk) {
        this.closeAsk = closeAsk;
    }

    public Price withCloseAsk(String closeAsk) {
        this.closeAsk = closeAsk;
        return this;
    }

    public Integer getTotalTicks() {
        return totalTicks;
    }

    public void setTotalTicks(Integer totalTicks) {
        this.totalTicks = totalTicks;
    }

    public Price withTotalTicks(Integer totalTicks) {
        this.totalTicks = totalTicks;
        return this;
    }

}
