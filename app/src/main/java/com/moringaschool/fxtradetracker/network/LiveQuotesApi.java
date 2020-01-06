package com.moringaschool.fxtradetracker.network;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LiveQuotesApi {
    @GET("forex/latest")
    Call<Response> getLiveQuotes(
            @Query("symbol") String symbol
    );

}
