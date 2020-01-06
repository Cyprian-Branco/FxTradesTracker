
package com.moringaschool.fxtradetracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("change")
    @Expose
    private String change;
    @SerializedName("chg_per")
    @Expose
    private String chgPer;
    @SerializedName("last_changed")
    @Expose
    private String lastChanged;
    @SerializedName("symbol")
    @Expose
    private String symbol;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param symbol
     * @param chgPer
     * @param price
     * @param change
     * @param lastChanged
     * @param id
     */
    public Response(String id, String price, String change, String chgPer, String lastChanged, String symbol) {
        super();
        this.id = id;
        this.price = price;
        this.change = change;
        this.chgPer = chgPer;
        this.lastChanged = lastChanged;
        this.symbol = symbol;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Response withId(String id) {
        this.id = id;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Response withPrice(String price) {
        this.price = price;
        return this;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public Response withChange(String change) {
        this.change = change;
        return this;
    }

    public String getChgPer() {
        return chgPer;
    }

    public void setChgPer(String chgPer) {
        this.chgPer = chgPer;
    }

    public Response withChgPer(String chgPer) {
        this.chgPer = chgPer;
        return this;
    }

    public String getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(String lastChanged) {
        this.lastChanged = lastChanged;
    }

    public Response withLastChanged(String lastChanged) {
        this.lastChanged = lastChanged;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Response withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

}
