
package com.moringaschool.fxtradetracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForexBusiness {

    @SerializedName("prices")
    @Expose
    private List<Price> prices = null;
    @SerializedName("pair")
    @Expose
    private Pair pair;
    @SerializedName("next_page")
    @Expose
    private String nextPage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForexBusiness() {
    }

    /**
     * 
     * @param nextPage
     * @param prices
     * @param pair
     */
    public ForexBusiness(List<Price> prices, Pair pair, String nextPage) {
        super();
        this.prices = prices;
        this.pair = pair;
        this.nextPage = nextPage;
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

    public Pair getPair() {
        return pair;
    }

    public void setPair(Pair pair) {
        this.pair = pair;
    }

    public ForexBusiness withPair(Pair pair) {
        this.pair = pair;
        return this;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public ForexBusiness withNextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
    }

}
