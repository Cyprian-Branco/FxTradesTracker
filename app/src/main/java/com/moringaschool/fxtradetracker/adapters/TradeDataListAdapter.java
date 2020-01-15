package com.moringaschool.fxtradetracker.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.moringaschool.fxtradetracker.R;
import com.moringaschool.fxtradetracker.models.TradeData;
import com.moringaschool.fxtradetracker.ui.ProfitLossActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

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

        holder.mCurrencyTextView.setText(currency);
        holder.mAmountTextView.setText(amount);
        holder.mBuySellTextView.setText(buySellPrice);
        holder.mTakeStopTextView.setText(takeStopLoss);
        holder.mVolumeTextView.setText(volume);
        holder.mProfitTextView.setText(profitLoss);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class TradeDataHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.currecyTextView)
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

    /*public void bindView(TradeData tradeData){
        TextView currencyTextView = (TextView) tradeDataView.findViewById(R.id.currecyTextView);
        TextView amountTextView = (TextView) tradeDataView.findViewById(R.id.amountTextView);
        TextView buySellTextView = (TextView) tradeDataView.findViewById(R.id.buySellTextView);
        TextView takeStopTextView = (TextView) tradeDataView.findViewById(R.id.takeStopTextView);
        TextView volumeTextView = (TextView) tradeDataView.findViewById(R.id.volumeTextView);
        TextView profitLossTextView = (TextView) tradeDataView.findViewById(R.id.profitLossTextView);

        currencyTextView.setText(tradeData.getCurrency());
        amountTextView.setText(tradeData.getAmount());
        buySellTextView.setText(tradeData.getBuyingSellingPrice());
        takeStopTextView.setText(tradeData.getStopTakePrice());
        volumeTextView.setText(tradeData.getVolume());
        profitLossTextView.setText(tradeData.getProfitLoss());*/
    /*@Override
    public void onClick(View v){
        final ArrayList<TradeData> tradeData = new ArrayList<>();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String uid = user.getUid();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child(uid);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot: dataSnapshot.getChildren()) {
                    tradeData.add(dataSnapshot.getValue(TradeData.class));
                }
                int position = getLayoutPosition();
                Intent intent = new Intent(mContext, ProfitLossActivity.class);
                intent.putExtra("position", position);
                mContext.startActivity(intent);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)

            }*/
    /*    });
    }
}
*/