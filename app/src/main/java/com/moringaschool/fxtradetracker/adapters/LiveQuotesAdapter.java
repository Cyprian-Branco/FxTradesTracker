package com.moringaschool.fxtradetracker.adapters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.ui.LiveQuotes;
import com.moringaschool.fxtradetracker.models.Response;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LiveQuotesAdapter extends RecyclerView.Adapter<LiveQuotesAdapter.LiveQuotesViewHolder> {
    private List<Response> mLiveQuotes;
    private Context mContext;

    public LiveQuotesAdapter(Context context, List<Response> liveQuotes){
        mContext = context;
        mLiveQuotes = liveQuotes;
    }
    @Override
    public LiveQuotesAdapter.LiveQuotesViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.live_quotes_list, parent, false);
        LiveQuotesViewHolder viewHolder = new LiveQuotesViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(LiveQuotesAdapter.LiveQuotesViewHolder holder, int position){
        holder.bindLiveQuotes(mLiveQuotes.get(position));
    }
    @Override
    public int getItemCount(){
        return mLiveQuotes.size();
    }

    public class LiveQuotesViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.symbolTextView) TextView mSymbolTextView;
        @BindView(R.id.priceTextView) TextView mPriceTextView;
        @BindView(R.id.changeTextView) TextView mChangeTextView;
        @BindView(R.id.percentageTextView) TextView mPercentageTextView;
        @BindView(R.id.dateTextView) TextView mDateTextView;

        public LiveQuotesViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
        public void bindLiveQuotes(Response liveQuotes){
            mSymbolTextView.setText(liveQuotes.getSymbol());
            mPriceTextView.setText(liveQuotes.getPrice());
            mChangeTextView.setText(liveQuotes.getChange());
            mPercentageTextView.setText(liveQuotes.getChgPer());
            mDateTextView.setText(liveQuotes.getLastChanged());


        }
    }



}
