package com.moringaschool.fxtradetracker.network;

import com.moringaschool.fxtradetracker.ui.LiveQuotes;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.moringaschool.fxtradetracker.util.Constants.FCSAPI_API_KEY;
import static com.moringaschool.fxtradetracker.util.Constants.FCSAPI_BASE_URL;

public class fcsapiClient {
    private static Retrofit retrofit = null;

    public static LiveQuotesApi getClient(){
        if(retrofit == null){
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request newRequest = chain.request().newBuilder()
                                    .addHeader("Authorization", FCSAPI_API_KEY)
                                    .build();
                            return chain.proceed(newRequest);
                        }
                    })
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(FCSAPI_BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(LiveQuotesApi.class);
    }
}
