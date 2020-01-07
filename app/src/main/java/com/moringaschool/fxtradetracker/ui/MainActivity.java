package com.moringaschool.fxtradetracker.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.fxtradetracker.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_fragments);
    }

    public void goToTrade_details(View v){
        Intent intent = new Intent(this, Trade_details.class);
        startActivity(intent);
    }
}
