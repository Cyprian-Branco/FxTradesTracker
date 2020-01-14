package com.moringaschool.fxtradetracker.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.models.TradeData;

import java.util.List;

public class TradeDataListAdapter extends ArrayAdapter<TradeData> {
    private Activity context;
    private List<TradeData> tradeDataList;

    public TradeDataListAdapter(Activity context, List<TradeData> tradeDataList ){
        super(context, R.layout.fragment_history, tradeDataList);
        this.context = context;
        this.tradeDataList = tradeDataList;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.fragment_history, null, true);
        //textview ids
        TextView currencyTextView = (TextView) listViewItem.findViewById(R.id.currecyTextView);
        TextView amountTextView = (TextView) listViewItem.findViewById(R.id.amountTextView);
        TextView buySellTextView = (TextView) listViewItem.findViewById(R.id.buySellTextView);
        TextView takeStopTextView = (TextView) listViewItem.findViewById(R.id.takeStopTextView);
        TextView volumeTextView = (TextView) listViewItem.findViewById(R.id.volumeTextView);
        TextView profitLossTextView = (TextView) listViewItem.findViewById(R.id.profitLossTextView);

        TradeData tradeData = tradeDataList.get(position);

        currencyTextView.setText(tradeData.getCurrency());
        amountTextView.setText(tradeData.getAmount());
        buySellTextView.setText(tradeData.getBuyingSellingPrice());
        takeStopTextView.setText(tradeData.getStopTakePrice());
        volumeTextView.setText(tradeData.getVolume());
        profitLossTextView.setText(tradeData.getProfitLoss());

        return listViewItem;
    }
}
