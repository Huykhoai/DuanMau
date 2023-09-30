package com.example.thuvienphuongnam.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thuvienphuongnam.R;
import com.example.thuvienphuongnam.model.PhieuMuon;

import java.util.ArrayList;

public class PhieuMuonAdapter extends RecyclerView.Adapter<PhieuMuonAdapter.ViewHolder> {
    ArrayList<PhieuMuon> arrayList;
    Context context;

    public PhieuMuonAdapter(ArrayList<PhieuMuon> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvmapm.setText("Mã PM: "+arrayList.get(position).getMaPM());
        holder.tvtentv.setText("Huy");
        holder.tvtensach.setText("Doraemon");
        holder.tvngay.setText("12131");
        holder.tvtrasach.setText("1");
        holder.tvtienthue.setText("2000");


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
         TextView tvmapm,tvtentv,tvtensach,tvtienthue,tvngay,tvtrasach;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvmapm = itemView.findViewById(R.id.item_phieumuon_ma);
            tvtentv = itemView.findViewById(R.id.item_phieumuon_tentv);
            tvtensach = itemView.findViewById(R.id.item_phieumuon_tensach);
            tvtienthue = itemView.findViewById(R.id.item_phieumuon_tienthue);
            tvngay = itemView.findViewById(R.id.item_phieumuon_ngaymuon);
            tvtrasach = itemView.findViewById(R.id.item_phieumuon_trangthai);
        }
    }
}
