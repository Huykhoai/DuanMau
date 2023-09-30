package com.example.thuvienphuongnam.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.thuvienphuongnam.Adapter.PhieuMuonAdapter;
import com.example.thuvienphuongnam.R;
import com.example.thuvienphuongnam.dao.PhieuMuonDao;
import com.example.thuvienphuongnam.model.PhieuMuon;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class PhieuMuonFragment extends Fragment {




    public PhieuMuonFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static PhieuMuonFragment newInstance() {
        PhieuMuonFragment fragment = new PhieuMuonFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phieu_muon,container,false);
        RecyclerView  recyclerView = view.findViewById(R.id.recycler);
        FloatingActionButton  floatBtn = view.findViewById(R.id.floattingbtn);
        PhieuMuonDao phieuMuonDao = new PhieuMuonDao(getContext());
        ArrayList<PhieuMuon> list = phieuMuonDao.getDanhsachPhieumuon();
        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false );
        recyclerView.setLayoutManager(manager);
        PhieuMuonAdapter adapter = new PhieuMuonAdapter(list,getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}