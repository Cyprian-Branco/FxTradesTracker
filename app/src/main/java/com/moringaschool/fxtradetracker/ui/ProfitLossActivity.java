package com.moringaschool.fxtradetracker.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.moringaschool.fxtradetracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfitLossActivity extends Fragment {
    @BindView(R.id.currencyEditText)
    EditText mCurrencyEditText;
    @BindView(R.id.amountEditText) EditText mAmountEditText;
    @BindView(R.id.buyingEditText) EditText mBuyingEditText;
    @BindView(R.id.priceEditText) EditText mPriceEditText;
    @BindView(R.id.volumeEditText) EditText mVolumeEditText;
    @BindView(R.id.profitLossEditText) EditText mProfitLossEditText;


    public ProfitLossActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profit_loss, container, false);
        ButterKnife.bind(this, view);

return view;
}

}
