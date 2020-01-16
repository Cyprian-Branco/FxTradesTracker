package com.moringaschool.fxtradetracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.models.TradeData;

import java.util.ArrayList;
import java.util.Currency;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TradeDataListAdapter extends RecyclerView.Adapter<TradeDataListAdapter.TradeDataHolder> {
    Context mContext;
    ArrayList<TradeData> dataList = new ArrayList<>();

    public TradeDataListAdapter(Context context, ArrayList<TradeData> list) {
        mContext = context;
        dataList = list;
    }

    @NonNull
    @Override
    public TradeDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.fragment_history, parent, false);
        TradeDataHolder tradeDataHolder = new TradeDataHolder(view);
        return tradeDataHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TradeDataListAdapter.TradeDataHolder holder, int position) {
        TradeData tradeData = dataList.get(position);
        String currency = tradeData.getCurrency();
        String amount = tradeData.getAmount();
        String buySellPrice = tradeData.getBuyingSellingPrice();
        String takeStopLoss = tradeData.getStopTakePrice();
        String volume = tradeData.getVolume();
        String profitLoss = tradeData.getProfitLoss();

        holder.mCurrencyTextView.setText("Currency:" + " " + currency);
        holder.mAmountTextView.setText("Amount:" + " " +amount);
        holder.mBuySellTextView.setText("Buy/Sell:" + " " + buySellPrice);
        holder.mTakeStopTextView.setText("Take/Stop:" + " " + takeStopLoss);
        holder.mVolumeTextView.setText("Volume:" + " " + volume);
        holder.mProfitTextView.setText("Prof/Loss:" + " " + profitLoss);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class TradeDataHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.currencyTextView)
        TextView mCurrencyTextView;
        @BindView(R.id.amountTextView)
        TextView mAmountTextView;
        @BindView(R.id.buySellTextView)
        TextView mBuySellTextView;
        @BindView(R.id.takeStopTextView)
        TextView mTakeStopTextView;
        @BindView(R.id.volumeTextView)
        TextView mVolumeTextView;
        @BindView(R.id.profitLossTextView)
        TextView mProfitTextView;

        public TradeDataHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

