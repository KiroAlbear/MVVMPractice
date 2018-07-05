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

    private String num1;
    private String num2;
    private String sum;
    public ObservableField<String> num1TextViewListner= new ObservableField<>();
    public ObservableField<String> num2TextViewListner= new ObservableField<>();
    public ObservableField<String> sumTextViewListner= new ObservableField<>();


    public Calculations() {
        this.num1 = num1;
        this.num2 = num2;

    }

    public void onSumClick(View view){



        try{

            sumTextViewListner.set(num1TextViewListner.get());
        }
        catch (Exception e){

        }



//
    }

}
