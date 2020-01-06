
package com.moringaschool.fxtradetracker.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("server_time")
    @Expose
    private String serverTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Info() {
    }

    /**
     * 
     * @param serverTime
     */
    public Info(String serverTime) {
        super();
        this.serverTime = serverTime;
    }

    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public Info withServerTime(String serverTime) {
        this.serverTime = serverTime;
        return this;
    }

}
