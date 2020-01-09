package com.moringaschool.fxtradetracker.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.moringaschool.fxtradetracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorFragment extends Fragment {


    public CalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.calculator, container, false);
    }

}
