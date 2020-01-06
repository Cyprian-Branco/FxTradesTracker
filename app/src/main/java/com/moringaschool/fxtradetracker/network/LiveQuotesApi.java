package com.moringaschool.fxtradetracker.network;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LiveQuotesApi {
    @GET("forex/latest")
    Call<fcsapiResponse> getLiveQuotes(
            @Query("symbol") String symbol
    );

}
