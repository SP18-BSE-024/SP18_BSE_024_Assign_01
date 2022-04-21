package com.example.sp18_bse_024_assign_01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ClaculateFragment extends Fragment {
    private TextView tv;

    public ClaculateFragment() {

    }


    public static ClaculateFragment newInstance(String param1, String param2) {
        ClaculateFragment fragment = new ClaculateFragment();
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
        View v= inflater.inflate(R.layout.fragment_claculate, container, false);
        tv=v.findViewById(R.id.cal_tex);
        return v;
    }
}