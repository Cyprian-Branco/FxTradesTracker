
package com.moringaschool.fxtradetracker.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForexBusiness {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;
    @SerializedName("info")
    @Expose
    private Info info;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForexBusiness() {
    }

    /**
     * 
     * @param msg
     * @param response
     * @param status
     * @param info
     */
    public ForexBusiness(Boolean status, String msg, List<Response> response, Info info) {
        super();
        this.status = status;
        this.msg = msg;
        this.response = response;
        this.info = info;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ForexBusiness withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ForexBusiness withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public ForexBusiness withResponse(List<Response> response) {
        this.response = response;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public ForexBusiness withInfo(Info info) {
        this.info = info;
        return this;
    }

}
