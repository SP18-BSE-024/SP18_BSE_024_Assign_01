package com.example.sp18_bse_024_assign_01;

import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Data extends ViewModel {

    String m1="";
    String m2="";
    String m3="";

    public void get_data(String s,String se,String sr){
            m1=s;
            m2=se;
            m3=sr;

    }

    public String ist(){
        return m1;
    }
    public String second(){
        return m2;
    }
    public String third(){
        return m3;
    }



}
