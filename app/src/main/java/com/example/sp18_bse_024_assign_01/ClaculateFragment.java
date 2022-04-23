package com.example.sp18_bse_024_assign_01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ClaculateFragment extends Fragment {
    private TextView tv1,add_view,subtract_view,multiply_view,divide_view;
    private Data d;
    private String i1,i2,i3;
    private int first,second,third;
    private Button add,subtact,divide,multiply;


    public ClaculateFragment() {

    }


    public static ClaculateFragment newInstance() {
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
        d=new ViewModelProvider(getActivity()).get(Data.class);
        tv1=v.findViewById(R.id.num1);
        add=v.findViewById(R.id.add);
        subtact=v.findViewById(R.id.subtract);
        multiply=v.findViewById(R.id.multiply);
        divide=v.findViewById(R.id.divide);
        add_view=v.findViewById(R.id.addres);
        subtract_view=v.findViewById(R.id.subres);
        multiply_view=v.findViewById(R.id.multires);
        divide_view=v.findViewById(R.id.divres);
        if(d.ist().equals("")){

        }else {

            i1 = d.ist();
            i2 = d.second();
            i3 = d.third();
            first = Integer.parseInt(i1);
            second = Integer.parseInt(i2);
            third = Integer.parseInt(i3);


            tv1.setText("Numbers are " + i1 + "," + i2 + "," + i3);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    add_view.setText("Add Result is " + (first + second + third));
                }
            });
            subtact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    subtract_view.setText("Subtract Result is " + (first - second - third));
                }
            });
            multiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    multiply_view.setText("Multiply Result is " + (first * second * third));
                }
            });
            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    divide_view.setText("Divide Result is " + (first / second / third));
                }
            });
        }
        return v;

    }

}