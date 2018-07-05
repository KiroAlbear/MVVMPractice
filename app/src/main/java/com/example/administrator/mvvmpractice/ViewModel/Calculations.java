package com.example.administrator.mvvmpractice.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;


import com.example.administrator.mvvmpractice.Model.NumbersStorage;


public class Calculations  extends ViewModel {

    public  String num1="5";
    private String num2;
    private String sum;
    public ObservableField<String> num1TextViewListner= new ObservableField<>();
    public ObservableField<String> num2TextViewListner= new ObservableField<>();
    public ObservableField<String> sumTextViewListner= new ObservableField<>();


    public void onSumClick(View view){



        try{
            sumTextViewListner.set(num1);
        }
        catch (Exception e){

        }



//
    }

}
