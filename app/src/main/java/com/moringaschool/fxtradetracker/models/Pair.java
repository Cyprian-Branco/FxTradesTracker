
package com.moringaschool.fxtradetracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pair {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("base_currency")
    @Expose
    private String baseCurrency;
    @SerializedName("quote_currency")
    @Expose
    private String quoteCurrency;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pair() {
    }

    /**
     * 
     * @param quoteCurrency
     * @param code
     * @param baseCurrency
     */
    public Pair(String code, String baseCurrency, String quoteCurrency) {
        super();
        this.code = code;
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Pair withCode(String code) {
        this.code = code;
        return this;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Pair withBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public Pair withQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
        return this;
    }

}
