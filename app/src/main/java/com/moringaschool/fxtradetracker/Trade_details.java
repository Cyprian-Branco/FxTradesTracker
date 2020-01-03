package com.moringaschool.fxtradetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.fxtradetracker.models.Amount;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Trade_details extends AppCompatActivity implements View.OnClickListener  {
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.calculateFormButton) Button mCalculateFormButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_details);
        ButterKnife.bind(this);

        mCalculateFormButton.setOnClickListener(this);

    }
    @Override
    public void onClick (View v){
        if (v == mCalculateFormButton){
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent (Trade_details.this, Amount.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }

    }

}
