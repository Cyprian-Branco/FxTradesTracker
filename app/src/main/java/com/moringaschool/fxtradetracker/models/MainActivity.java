package com.moringaschool.fxtradetracker.models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.Trade_details;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void goTotrade_details(View v){
        Intent intent = new Intent(this, Trade_details.class);
        startActivity(intent);
    }

}
