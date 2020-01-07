package com.moringaschool.fxtradetracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.models.Price;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LiveQuotesAdapter extends RecyclerView.Adapter<LiveQuotesAdapter.LiveQuotesViewHolder> {
    private List<Price> mLiveQuotes;
    private Context mContext;

    public LiveQuotesAdapter(Context context, List<Price> liveQuotes){
        mContext = context;
        mLiveQuotes = liveQuotes;
    }
    @Override
    public LiveQuotesAdapter.LiveQuotesViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_live_quotes, parent, false);
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
        @BindView(R.id.askTextView) TextView mAskTextView;
        @BindView(R.id.bidTextView) TextView mBidTextView;
        @BindView(R.id.dateTextView) TextView mDateTextView;

        public LiveQuotesViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
        public void bindLiveQuotes(Price liveQuotes){
            mAskTextView.setText(liveQuotes.getHighAsk());
            mBidTextView.setText(liveQuotes.getHighBid());
            mDateTextView.setText(liveQuotes.getOccurredAt());


        }
    }



}
