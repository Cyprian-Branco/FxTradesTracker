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

import butterknife.BindView;
import butterknife.ButterKnife;

public class LiveQuotesAdapter extends RecyclerView.Adapter<LiveQuotesAdapter.LiveQuotesViewHolder> {
    private List<Business> mLiveQuotes;
    private Context mContext;

    public LiveQuotesAdapter(Context context, List<Business> liveQuotes){
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
        @BindView(R.id.fxNameTextView) TextView mFxNameTextView;
        @BindView(R.id.fxTextView) TextView mFxTextView;

        public LiveQuotesViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
    }



}
