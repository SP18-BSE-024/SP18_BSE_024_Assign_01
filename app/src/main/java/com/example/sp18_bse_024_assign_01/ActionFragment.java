package com.example.sp18_bse_024_assign_01;

import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ActionFragment extends Fragment {

    private Button input1,calculate;
    private Todo listener;
    private Data d;

    public ActionFragment() {
        // Required empty public constructor
    }


    public static ActionFragment newInstance() {
        ActionFragment fragment = new ActionFragment();
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
        View v= inflater.inflate(R.layout.fragment_action, container, false);
        input1=v.findViewById(R.id.input);
        input1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input(1);
            }
        });
        calculate=v.findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    input(2);

            }
        });



        return v;
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Todo) {
            listener = (Todo) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implemenet MyListFragment.OnItemSelectedListener");
        }
    }
    public interface Todo{
        public void startInput(int i);


    }
    public void input(int i){
        listener.startInput(i);
    }
}