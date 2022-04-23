package com.example.sp18_bse_024_assign_01;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class InputFragment extends Fragment {

    private EditText ed1,ed2,ed3;
    private Button save;
    private Data d;

    public InputFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        d=new ViewModelProvider(getActivity()).get(Data.class);
    }

    public static InputFragment newInstance() {
        InputFragment fragment = new InputFragment();
        Bundle args = new Bundle();
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
        View v = inflater.inflate(R.layout.fragment_input, container, false);
        d=new ViewModelProvider(getActivity()).get(Data.class);
        ed1=v.findViewById(R.id.etext1);
        ed2=v.findViewById(R.id.etext2);
        ed3=v.findViewById(R.id.etext3);
        save=v.findViewById(R.id.save);





        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        d=new ViewModelProvider(getActivity()).get(Data.class);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Data Has Been Stored ", Toast.LENGTH_SHORT).show();
                d.get_data(ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString());

            }
        });

    }
}