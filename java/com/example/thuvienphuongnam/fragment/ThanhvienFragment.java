package com.example.thuvienphuongnam.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thuvienphuongnam.R;


public class ThanhvienFragment extends Fragment {



    public ThanhvienFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ThanhvienFragment newInstance() {
        ThanhvienFragment fragment = new ThanhvienFragment();


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
        return inflater.inflate(R.layout.fragment_thanhvien, container, false);
    }
}