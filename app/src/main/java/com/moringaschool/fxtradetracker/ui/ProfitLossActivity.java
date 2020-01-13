package com.moringaschool.fxtradetracker.ui;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.moringaschool.fxtradetracker.models.TradeData;


import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.moringaschool.fxtradetracker.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfitLossActivity extends Fragment {
    @BindView(R.id.currencyEditText) EditText mCurrencyEditText;
    @BindView(R.id.amountEditText) EditText mAmountEditText;
    @BindView(R.id.buyingEditText) EditText mBuyingEditText;
    @BindView(R.id.priceEditText) EditText mPriceEditText;
    @BindView(R.id.volumeEditText) EditText mVolumeEditText;
    @BindView(R.id.profitLossEditText) EditText mProfitLossEditText;
    @BindView(R.id.calculateTradeData) Button mCalculateTradeData;

    FirebaseAuth mAuth;
    DatabaseReference mDatabase;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profit_loss, container, false);
        ButterKnife.bind(this, view);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser mUser = mAuth.getCurrentUser();
        String uid = mUser.getUid();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("TRADEDATA");



        mCalculateTradeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTradeData();
            }
        });
        return view;

    }
    private void addTradeData(){
        String currency = mCurrencyEditText.getText().toString().trim();
        String amount = mAmountEditText.getText().toString().trim();
        String buyingSellingPrice = mBuyingEditText.getText().toString().trim();
        String takeProfiLossPrice = mPriceEditText.getText().toString().trim();
        String volume = mVolumeEditText.getText().toString().trim();
        String profitLossAmount = mProfitLossEditText.getText().toString().trim();

        if(!TextUtils.isEmpty(currency)){
            String id = mDatabase.push().getKey();
            TradeData tradeData = new TradeData("currency","amount","buyingSellingPrice", "stopTakePrice",
            "volume","profitLoss");

            mDatabase.child(id).setValue(tradeData);

            Toast.makeText(getActivity(), "Data Saved", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getActivity(), "Enter Currency", Toast.LENGTH_SHORT).show();
        }
    }
}
