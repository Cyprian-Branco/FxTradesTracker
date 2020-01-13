package com.moringaschool.fxtradetracker.ui;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.adapters.LiveQuotesAdapter;
import com.moringaschool.fxtradetracker.models.ForexBusiness;
import com.moringaschool.fxtradetracker.models.Price;
import com.moringaschool.fxtradetracker.network.IntrinioApi;
import com.moringaschool.fxtradetracker.network.IntrinioClient;
import com.moringaschool.fxtradetracker.util.Constants;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveQuotesActivity extends Fragment {
    private static final String TAG = LiveQuotesActivity.class.getSimpleName();

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView)
    TextView mErrorTextView;
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;

    private LiveQuotesAdapter mAdapter;

    public List<Price> liveQuotes = new ArrayList<>();


    public LiveQuotesActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live_quotes, container, false);

        ButterKnife.bind(this, view);

        IntrinioApi client = IntrinioClient.getClient().create(IntrinioApi.class);

        Call<ForexBusiness> call = client.getLiveQuotes(Constants.pair, Constants.timeframe, Constants.INTRINIIO_API_KEY);

        call.enqueue(new Callback<ForexBusiness>() {
            @Override
            public void onResponse(Call<ForexBusiness> call, Response<ForexBusiness> response) {
                hideProgressBar();
                Log.i(TAG,Integer.toString(response.code()));
                if (response.isSuccessful()) {
                    liveQuotes= response.body().getPrices();
                    Log.i(TAG,liveQuotes.get(0).getHighAsk());
                    mAdapter = new LiveQuotesAdapter(getActivity(), liveQuotes);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setAdapter(mAdapter);

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
        return view;
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



