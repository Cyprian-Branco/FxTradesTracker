
package com.moringaschool.fxtradetracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForexBusiness {

    @SerializedName("prices")
    @Expose
    private List<Price> prices = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForexBusiness() {
    }

    /**
     * 
     * @param prices
     */
    public ForexBusiness(List<Price> prices) {
        super();
        this.prices = prices;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public ForexBusiness withPrices(List<Price> prices) {
        this.prices = prices;
        return this;
    }

}
