package com.moringaschool.fxtradetracker.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.adapters.LiveQuotesAdapter;
import com.moringaschool.fxtradetracker.models.ForexBusiness;
import com.moringaschool.fxtradetracker.models.Price;
import com.moringaschool.fxtradetracker.network.IntrinioApi;
import com.moringaschool.fxtradetracker.network.IntrinioClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveQuotes extends AppCompatActivity {
    private static final String TAG = LiveQuotes.class.getSimpleName();

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    private LiveQuotesAdapter mAdapter;

    public List<Price> liveQuotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_fragments);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String symbol = intent.getStringExtra("symbol");

        IntrinioApi client = IntrinioClient.getClient();

        Call<ForexBusiness> call = client.getLiveQuotes(symbol);

        call.enqueue(new Callback<ForexBusiness>() {
            @Override
            public void onResponse(Call<ForexBusiness> call, Response<ForexBusiness> response) {
                 hideProgressBar();
                if (response.isSuccessful()) {
                    liveQuotes = response.body().getPrices();
                    mAdapter = new LiveQuotesAdapter(LiveQuotes.this, liveQuotes);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(LiveQuotes.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);

                    showLiveQuotes();
                }else{
                    showUnsuccessfulMessage();
                }

            }

            @Override
            public void onFailure(Call<ForexBusiness> call, Throwable t) {
                showFailureMessage();
                hideProgressBar();
            }

        });

    }
    private void showFailureMessage(){
        mErrorTextView.setText("Something went wrong. Pleas check your internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }
    private void showUnsuccessfulMessage(){
        mErrorTextView.setText("Something wnr wrong.Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }
    private void showLiveQuotes(){
        mRecyclerView.setVisibility(View.VISIBLE);
    }
    private void hideProgressBar(){
        mProgressBar.setVisibility(View.GONE);
    }
}
