package com.moringaschool.fxtradetracker.ui;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.adapters.TradeDataListAdapter;
import com.moringaschool.fxtradetracker.models.TradeData;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryActivity extends Fragment {
    @BindView(R.id.fireBaseRecyclerView)
    RecyclerView mRecyclerView;

    ArrayList<TradeData> allTradeData = new ArrayList<>();

    DatabaseReference databaseTradeData;
    ProgressDialog progressDialog;

    LinearLayoutManager linearLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_history, container, false);
        ButterKnife.bind(this, view);

        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading History....");
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String uid = user.getUid();

        databaseTradeData = FirebaseDatabase.getInstance().getReference("TRADEDATA").child(uid);

        linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(linearLayoutManager);

        readTradeData();

        return view;
    }

    public void readTradeData() {
        allTradeData.clear();
        progressDialog.show();

        databaseTradeData.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    TradeData tradeData = snapshot.getValue(TradeData.class);
                    allTradeData.add(tradeData);
                }
                progressDialog.dismiss();

                TradeDataListAdapter tradeDataListAdapter = new TradeDataListAdapter(getActivity(), allTradeData);
                mRecyclerView.setAdapter(tradeDataListAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}


