package com.moringaschool.fxtradetracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moringaschool.fxtradetracker.network.LiveQuotesApi;
import com.moringaschool.fxtradetracker.network.fcsapiClient;

public class LiveQuotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LiveQuotesApi client = fcsapiClient.getClient();
        Call<fcsapiResponse> call = client.get
    }
}
