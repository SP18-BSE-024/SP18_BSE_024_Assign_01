package com.example.sp18_bse_024_assign_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionFragment ac= new ActionFragment();
        MessageFragment message=new MessageFragment();
        ClaculateFragment cf=new ClaculateFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.F1,ac);
        ft.addToBackStack(null);
        ft.commit();
        FragmentTransaction fe = getSupportFragmentManager().beginTransaction();
        fe.replace(R.id.F2,message);
        fe.addToBackStack(null);
        fe.commit();
    }
}