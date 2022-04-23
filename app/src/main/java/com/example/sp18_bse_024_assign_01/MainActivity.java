package com.example.sp18_bse_024_assign_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionFragment.Todo{
    private MessageFragment message;
    private ClaculateFragment calculate;
    private InputFragment input;
    private ActionFragment ac;
    private Data d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=new ViewModelProvider(this).get(Data.class);
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

    @Override
    public void startInput(int i) {
        if(i==1){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            input=InputFragment.newInstance();
            ft.replace(R.id.F2, input);
            ft.addToBackStack(null);
            ft.commit();

        }else if(i==2){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            calculate=ClaculateFragment.newInstance();
            ft.replace(R.id.F2, calculate);
            ft.addToBackStack(null);
            ft.commit();


        }

    }
}