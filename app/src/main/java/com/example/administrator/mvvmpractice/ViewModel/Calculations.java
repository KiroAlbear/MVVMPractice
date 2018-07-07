package com.example.administrator.mvvmpractice.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.databinding.ObservableMap;
import android.support.design.widget.Snackbar;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;


import com.example.administrator.mvvmpractice.Model.NumbersStorage;


public class Calculations extends ViewModel{

    private String sum;
    public ObservableField<String> SumObservable = new ObservableField<>("");
    public ObservableField<String> Num1Observable = new ObservableField<>("");
    public ObservableField<String> Num2Observable = new ObservableField<>("");


    public void onSumClick(View view) {
        if (IsSpaceOnly(Num1Observable.get()) || IsSpaceOnly(Num2Observable.get()))
            Snackbar.make(view,"Space Not Allowed ",Snackbar.LENGTH_SHORT).show();
        else {

            try {
                sum =String.valueOf(Float.parseFloat(Num1Observable.get())+Float.parseFloat(Num2Observable.get()));

            } catch (Exception e) {

            }
        }
        SumObservable.set(sum);

    }

    private Boolean IsSpaceOnly(String Str) {
        int count = 0;
        char StrtoChar[] = Str.toCharArray();

        for (int i = 0; i < StrtoChar.length; i++) {
            if (StrtoChar[i] == ' ')
                count++;
        }

        if (count == StrtoChar.length)
            return true;
        else
            return false;

    }



}
