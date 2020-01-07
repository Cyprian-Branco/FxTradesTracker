package com.moringaschool.fxtradetracker.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moringaschool.fxtradetracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiveQuotesFragment extends Fragment {


    public LiveQuotesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live_quotes, container, false);
    }

}
