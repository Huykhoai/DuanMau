package com.example.thuvienphuongnam.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thuvienphuongnam.R;


public class DoanhthuFragment extends Fragment {



    public DoanhthuFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static DoanhthuFragment newInstance() {
        DoanhthuFragment fragment = new DoanhthuFragment();
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
        return inflater.inflate(R.layout.fragment_doanhthu, container, false);
    }
}