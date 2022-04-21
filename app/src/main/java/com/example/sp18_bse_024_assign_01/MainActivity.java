package com.example.sp18_bse_024_assign_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MessageFragment message;
    private ClaculateFragment cal;
    private ActionFragment ac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation=getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ac= ActionFragment.newInstance();
            message=MessageFragment.newInstance();
            ft.replace(R.id.F1, ac);
            ft.addToBackStack(null);
            ft.commit();
            FragmentTransaction fe = getSupportFragmentManager().beginTransaction();
            fe.replace(R.id.F2, message);
            fe.addToBackStack(null);
            fe.commit();
        }
    }
}