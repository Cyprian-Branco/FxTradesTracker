package com.moringaschool.fxtradetracker.network;


import com.moringaschool.fxtradetracker.models.ForexBusiness;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IntrinioApi {
    @GET("forex/prices/EURUSD/H1")
    Call<ForexBusiness> getLiveQuotes(
            @Query("ap_key") String api_key
    );

}
