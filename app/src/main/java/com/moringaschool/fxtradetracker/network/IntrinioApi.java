package com.moringaschool.fxtradetracker.network;


import com.moringaschool.fxtradetracker.models.ForexBusiness;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IntrinioApi {
    @GET("forex/prices/{pair}/{timeframe}")
    Call<ForexBusiness> getLiveQuotes(
            @Path("pair") String pair,
            @Path("timeframe") String timeframe,
            @Query("api_key") String api_key
    );

}
